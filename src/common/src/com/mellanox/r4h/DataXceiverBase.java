/*
 ** Copyright (C) 2014 Mellanox Technologies
 **
 ** Licensed under the Apache License, Version 2.0 (the "License");
 ** you may not use this file except in compliance with the License.
 ** You may obtain a copy of the License at:
 **
 ** http://www.apache.org/licenses/LICENSE-2.0
 **
 ** Unless required by applicable law or agreed to in writing, software
 ** distributed under the License is distributed on an "AS IS" BASIS,
 ** WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 ** either express or implied. See the License for the specific language
 ** governing permissions and  limitations under the License.
 **
 */

package com.mellanox.r4h;

import static org.apache.hadoop.hdfs.protocol.datatransfer.DataTransferProtoUtil.fromProto;
import static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status.ERROR;
import static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status.ERROR_ACCESS_TOKEN;
import static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status.SUCCESS;
import static org.apache.hadoop.hdfs.protocolPB.PBHelper.vintPrefixed;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.hdfs.StorageType;
import org.apache.hadoop.hdfs.protocol.DatanodeInfo;
import org.apache.hadoop.hdfs.protocol.ExtendedBlock;
import org.apache.hadoop.hdfs.protocol.datatransfer.BlockConstructionStage;
import org.apache.hadoop.hdfs.protocol.datatransfer.DataTransferProtoUtil;
import org.apache.hadoop.hdfs.protocol.datatransfer.DataTransferProtocol;
import org.apache.hadoop.hdfs.protocol.datatransfer.Op;
import org.apache.hadoop.hdfs.protocol.datatransfer.PacketHeader;
import org.apache.hadoop.hdfs.protocol.datatransfer.PipelineAck;
import org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BlockOpResponseProto;
import org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto;
import org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto;
import org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status;
import org.apache.hadoop.hdfs.protocolPB.PBHelper;
import org.accelio.jxio.ClientSession;
import org.accelio.jxio.EventName;
import org.accelio.jxio.EventQueueHandler;
import org.accelio.jxio.EventReason;
import org.accelio.jxio.Msg;
import org.accelio.jxio.ServerSession;
import org.accelio.jxio.ServerSession.SessionKey;

import org.apache.hadoop.hdfs.server.datanode.BlockReceiverBridge;
import org.apache.hadoop.hdfs.server.datanode.CachingStrategy;
import org.apache.hadoop.hdfs.server.datanode.DataNodeBridge;
import org.apache.hadoop.hdfs.server.protocol.DatanodeRegistration;
import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.record.Utils;
import org.apache.hadoop.security.token.SecretManager.InvalidToken;
import org.apache.hadoop.security.token.Token;
import org.apache.hadoop.util.DataChecksum;
import org.apache.hadoop.util.StringUtils;
import org.apache.hadoop.hdfs.security.token.block.BlockTokenIdentifier;
import org.apache.hadoop.hdfs.security.token.block.BlockTokenSecretManager;

/**
 * R4H's parallel class to the original
 * org.apache.hadoop.hdfs.server.datanode.DataXceiver
 * 
 * @see org.apache.hadoop.hdfs.server.datanode.DataXceiver It breaks the
 *      original serial flow of processing HDFS operation into an async flow
 *      with JXIO RDMA library CURRENTLY: only HDFS WRITE operation is supported
 */
abstract class DataXceiverBase {
	private final static Log LOG = LogFactory.getLog(DataXceiverBase.class);
	private ClientSession clientSession;
	private boolean isFirstRequest = true;
	private boolean isFirstReply = true;
	private DataNodeBridge dnBridge;
	protected WriteOprHeader oprHeader;
	public BlockReceiverBridge blockReceiver;
	private DataXceiverServer dxcs;
	private ServerSession serverSession;
	private Msg currMsg = null;
	private ExecutorService packetAsyncIOExecutor;
	private String uri;
	private ServerPortalWorker serverPortalWorker;
	private List<Msg> onFlightMsgs = new LinkedList<Msg>();
	private long clientOnFlightNumMsgs = 0;
	private boolean serverSessionClosed = false;
	private boolean clientSessionClosed = false;
	private ServerPortalWorker worker;
	boolean clientSessionCloseEventExpected = true;
	boolean returnedWorkerToPool = false;

	class SSCallbacks implements ServerSession.Callbacks {
		@Override
		public void onRequest(Msg msg) {
			onFlightMsgs.add(msg);
			currMsg = msg;
			if (LOG.isTraceEnabled()) {
				LOG.trace("got request message");
			}
			try {

				if (isFirstRequest) {
					processOPRHeaderRequest(msg);
				} else {
					if (LOG.isTraceEnabled()) {
						LOG.trace("Going to process packet message");
					}
					processPacketRequest(msg);
				}

			} catch (Throwable t) {
				LOG.error("DataXceiver exception during processing request.", t);

				if ((DataXceiverBase.this.serverSession != null) && (!DataXceiverBase.this.serverSession.getIsClosing())) {
					DataXceiverBase.this.serverSession.close();
				}
			}
		}

		@Override
		public boolean onMsgError(Msg msg, EventReason reason) {
			boolean releaseMsg = true; // Always return the message to server's bound pool
			if (hasPipeline()) {
				LOG.error(String.format("Server Msg error: MSG=%s reason=%s ss=%s ss.isClosing=%s cs=%s cs.isClosing=%s", msg, reason, serverSession,
				        serverSession.getIsClosing(), clientSession, clientSession.getIsClosing()));
			} else {
				LOG.error(String.format("Server Msg error: MSG=%s reason=%s ss=%s ss.isClosing=%s", msg, reason, serverSession,
				        serverSession.getIsClosing()));
			}
			onFlightMsgs.remove(msg);
			DataXceiverBase.this.close();
			return releaseMsg;
		}

		@Override
		public void onSessionEvent(EventName session_event, EventReason reason) {
			String logmsg = String.format("Server Session event: event=%s reason=%s ss=%s uri=%s", session_event, reason, serverSession, uri);
			boolean needIOThreadInit = false;
			switch (session_event) {
				case SESSION_CLOSED:
					if (onFlightMsgs.size() == 0) {
						LOG.info(logmsg);
					} else {
						LOG.error(logmsg);
						needIOThreadInit = true;
					}
					break;
				case SESSION_ERROR:
				case SESSION_REJECT:
					LOG.error(logmsg);
					needIOThreadInit = true;
					break;
				default:
					break;
			}

			// Assuming no other kinds of event for SS except CLOSED,ERROR and REJECT
			serverSessionClosed = true;
			if ((clientSession != null) && (!clientSession.getIsClosing())) {
				clientSessionCloseEventExpected = true;
				clientSession.close();
			}

			if ((clientSessionClosed) || (!hasPipeline())) {
				if (onFlightMsgs.size() > 0) {
					LOG.warn(String.format("Discarding %d messages for server seesion %s", onFlightMsgs.size(), serverSession));
					for (Msg m : onFlightMsgs) {
						serverSession.discardRequest(m);
						if (LOG.isDebugEnabled()) {
							LOG.debug("Discarding MSG: " + m);
						}
					}
					onFlightMsgs.clear();
					clientOnFlightNumMsgs = 0;
				}
				if (!returnedWorkerToPool) {
					returnedWorkerToPool = true;
					dxcs.returnServerWorkerToPool(serverSession, needIOThreadInit);
				}

			} else if (onFlightMsgs.size() > 0) {
				LOG.warn("Server session closed but there are still messages on flight for proxy client - waiting for client close event to discard messages and return ServerWorker to pool");
			}

		}
	}

	class CSCallbacks implements ClientSession.Callbacks {
		@Override
		public void onResponse(Msg msg) {
			clientOnFlightNumMsgs--;
			if (LOG.isTraceEnabled()) {
				LOG.trace("Got reply from pipeline client - " + clientSession);
			}
			try {
				if (isFirstReply) {
					LOG.info("Going to process pipeline reply for OPR header. uri=" + DataXceiverBase.this.uri);
					processOPRHeaderReply(msg);
				} else {
					final Msg fmsg = msg;
					packetAsyncIOExecutor.execute(new Runnable() {

						@Override
						public void run() {
							try {
								if (LOG.isTraceEnabled()) {
									LOG.trace("Going to process pipeline reply for packet");
								}
								processPacketReply(fmsg);
							} catch (Throwable t) {
								LOG.error("Failed to process async packet reply. ", t);
								asyncCloseServerSession();
							}
						}
					});
				}
			} catch (Throwable t) {
				LOG.error("Failed to process reply. ", t);
				close();
			}
		}

		@Override
		public void onSessionEstablished() {
			LOG.info("Client session established: " + clientSession + ", uri=" + uri);
		}

		@Override
		public void onMsgError(Msg msg, EventReason reason) {
			LOG.error(String.format("Client Msg error: MSG=%s reason=%s ss=%s ss.isClosing=%s cs=%s cs.isClosing=%s", msg, reason, serverSession,
			        serverSession.getIsClosing(), clientSession, clientSession.getIsClosing()));
			DataXceiverBase.this.close();
		}

		@Override
		public void onSessionEvent(EventName session_event, EventReason reason) {
			String logmsg = String.format("Client Session event: event=%s reason=%s ss=%s clientOnFlight=%d", session_event, reason, serverSession,
			        clientOnFlightNumMsgs);
			boolean needIOThreadInit = false;
			switch (session_event) {
				case SESSION_CLOSED:
					if ((DataXceiverBase.this.clientSessionCloseEventExpected) && (clientOnFlightNumMsgs == 0)) {
						LOG.info(logmsg);
					} else {
						LOG.error(logmsg);
						needIOThreadInit = true;
					}
					break;
				case SESSION_ERROR:
				case SESSION_REJECT:
					LOG.error(logmsg);
					LOG.error("Closing server session due to error event: ss=" + serverSession);
					if ((serverSession != null) && (!serverSession.getIsClosing())) {
						serverSession.close();
					}
					needIOThreadInit = true;
					break;
				default:
					break;
			}

			clientSessionCloseEventExpected = false; // refers to close/error/reject
			clientSessionClosed = true;

			if (serverSessionClosed) {
				LOG.debug("Client session closed after server session was closed");
				if (clientOnFlightNumMsgs > 0) {
					LOG.warn(String.format("Clinet session closed while still mirror messages on flight. Discarding %d messages ...",
					        onFlightMsgs.size()));
				}
				for (Msg m : onFlightMsgs) {
					serverSession.discardRequest(m);
				}
				onFlightMsgs.clear();
				clientOnFlightNumMsgs = 0;

				if (!returnedWorkerToPool) {
					returnedWorkerToPool = true;
					dxcs.returnServerWorkerToPool(serverSession, needIOThreadInit);
				}
			}

		}

	}

	DataXceiverBase(DataXceiverServer dxcs, ServerPortalWorker spw, SessionKey sKey) {
		this.dxcs = dxcs;
		this.worker = spw;
		this.dnBridge = dxcs.dnBridge;
		this.packetAsyncIOExecutor = spw.getPacketAsyncIOExecutor();
		this.uri = sKey.getUri();
		DataXceiverBase.SSCallbacks ssCbs = this.new SSCallbacks();
		serverSession = new ServerSession(sKey, ssCbs);
	}

	private void processOPRHeaderRequest(Msg msg) throws IOException, SecurityException, NoSuchFieldException, IllegalArgumentException,
	        IllegalAccessException, NoSuchMethodException, URISyntaxException {
		if (LOG.isTraceEnabled()) {
			LOG.trace("Processing block header request. uri=" + DataXceiverBase.this.uri);
		}

		msg.getIn().position(0);
		DataInputStream in = new DataInputStream(new ByteBufferInputStream(msg.getIn()));
		final short version = in.readShort();
		if (version != DataTransferProtocol.DATA_TRANSFER_VERSION) {
			in.close();
			throw new IOException("Version Mismatch (Expected: " + DataTransferProtocol.DATA_TRANSFER_VERSION + ", Received: " + version + " )");
		}
		Op op = Op.read(in);
		if (op != Op.WRITE_BLOCK) {
			throw new IOException("Unknown op " + op + " in data stream");			
		} 
		
		parseOpWriteBlock(in);

		// updateCurrentThreadName("Receiving block " + blk); TODO:Need to copy method - is that really necessary ?

		// check single target for transfer-RBW/Finalized
		if (oprHeader.isTransfer() && oprHeader.getTargets().length > 0) {
			throw new IOException(oprHeader.getStage() + " does not support multiple targets " + Arrays.asList(oprHeader.getTargets()));
		}

		if (LOG.isDebugEnabled()) {
			LOG.debug("uri= " + DataXceiverBase.this.uri + "\nopWriteBlock: stage=" + oprHeader.getStage() + ", clientname=" + oprHeader.getClientName()
			        + "\n  block  =" + oprHeader.getBlock() + ", newGs=" + oprHeader.getLatestGenerationStamp() + ", bytesRcvd=["
			        + oprHeader.getMinBytesRcvd() + ", " + oprHeader.getMaxBytesRcvd() + "]" + "\n  targets=" + Arrays.asList(oprHeader.getTargets())
			        + "; pipelineSize=" + oprHeader.getPipelineSize() + ", srcDataNode=" + oprHeader.getSrcDataNode() + ", isDatanode="
			        + oprHeader.isDatanode() + ", isClient=" + oprHeader.isClient() + ", isTransfer=" + oprHeader.isTransfer()
			        + ", writeBlock receive buf size " + currMsg.getIn().limit());
		}

		// We later mutate block's generation stamp and length, but we need to
		// forward the original version of the block to downstream mirrors, so
		// make a copy here.
		final ExtendedBlock originalBlock = new ExtendedBlock(oprHeader.getBlock());
		oprHeader.getBlock().setNumBytes(dnBridge.getEstimateBlockSize());
		LOG.info("Receiving " + oprHeader.getBlock() + " src: " + uri);

		boolean isTokenAccessOk = checkAccess(oprHeader.isClient(), oprHeader.getBlock(), oprHeader.getBlockToken(), Op.WRITE_BLOCK,
		        BlockTokenSecretManager.AccessMode.WRITE);

		if (isTokenAccessOk) {

			if (oprHeader.isDatanode() || oprHeader.getStage() != BlockConstructionStage.PIPELINE_CLOSE_RECOVERY) {
				// open a block receiver
				try {
					blockReceiver = new BlockReceiverBridge(serverPortalWorker, oprHeader, in, serverSession.toString(), dnBridge,
					        packetAsyncIOExecutor);
					blockReceiver.setAsyncFileOutputStreams();
				} catch (SecurityException | NoSuchFieldException | IllegalArgumentException | IllegalAccessException | NoSuchMethodException e) {
					throw new IOException("Failed on BlockReceiver creation", e);
				}

				if (LOG.isTraceEnabled()) {
					LOG.trace("After BlockReceiver creation: " + blockReceiver);
				}

			} else {
				dnBridge.recoverClose(oprHeader.getBlock(), oprHeader.getLatestGenerationStamp(), oprHeader.getMinBytesRcvd());
			}

			//
			// Connect to downstream machine, if appropriate
			//
			if (hasPipeline()) {
				try {
					blockReceiver.setMirrorOut(new DummyDataOutputStream()); // we send to pipeline with RDMA and then keep using vanila's original
					                                                         // receivePacket function by modifying mirror stream with dummy stream to
					                                                         // avoid sending to pipeline from vanila's flow
					openPipelineConnection();
					sendOprHeaderToPipeline(msg, originalBlock);
				} catch (Exception e) {
					if (oprHeader.isClient()) {
						replyHeaderAck(msg, ERROR, oprHeader.getTargetByIndex(0).getXferAddr());
						// NB: Unconditionally using the xfer addr w/o hostname
						LOG.error(dnBridge.getDN() + ":Exception transfering block " + oprHeader.getBlock() + " to mirror "
						        + oprHeader.getTargetByIndex(0).getInfoAddr() + ": " + StringUtils.stringifyException(e));
					} else {
						LOG.info(dnBridge.getDN() + ":Exception transfering " + oprHeader.getBlock() + " to mirror "
						        + oprHeader.getTargetByIndex(0).getInfoAddr() + "- continuing without the mirror", e);
					}
				}
			} else if (oprHeader.isClient() && !oprHeader.isTransfer()) {
				replyHeaderAck(msg);
			}
		}
		isFirstRequest = false;
	}

	private void processOPRHeaderReply(Msg msg) throws IOException {
		// read connect ack (only for clients, not for replication req)
		if (oprHeader.isClient()) {
			msg.getIn().position(0);
			BlockOpResponseProto connectAck = BlockOpResponseProto.parseFrom(PBHelper.vintPrefixed(new ByteBufferInputStream(msg.getIn())));
			Status mirrorInStatus = connectAck.getStatus();
			String firstBadLink = connectAck.getFirstBadLink();
			if (LOG.isDebugEnabled() || mirrorInStatus != SUCCESS) {
				LOG.info("Datanode " + oprHeader.getTargets().length + " got response for connect ack "
				        + " from downstream datanode with firstbadlink as " + firstBadLink);
			}

			// send connect-ack to source for clients and not transfer-RBW/Finalized
			if (!oprHeader.isTransfer()) {
				Msg origMsg = msg.getMirror(false);
				replyHeaderPipelineAck(origMsg, mirrorInStatus, firstBadLink);
			}
		}

		isFirstReply = false;
	}

	private void processPacketRequest(final Msg msg) {
		if (LOG.isTraceEnabled()) {
			LOG.trace("Processing packet request. uri=" + DataXceiverBase.this.uri);
		}

		msg.getIn().position(0);

		try {
			msg.getIn().clear();

			final PipelinePacketContext pipelineContext;
			if (hasPipeline()) {
				pipelineContext = new PipelinePacketContext(msg);
				sendPktToPipeline(pipelineContext);
			} else {
				pipelineContext = null;
			}

			// VerifyChecksum
			// WriterPktToDisk
			msg.getIn().clear();
			DataInputStream in = new DataInputStream(new ByteBufferInputStream(msg.getIn()));
			int headerStart = Utils.readVInt(in);
			msg.getIn().position(headerStart);
			in = new DataInputStream(new BufferedInputStream(new ByteBufferInputStream(msg.getIn()), 512));

			blockReceiver.processPacket(in);

			final ByteBuffer curCopyBuff = blockReceiver.getCurCopyBuff();
			final PacketHeader pkt = blockReceiver.getPacketReceiver().getHeader();
			if (pkt == null) {
				throw new IOException("Unexpected null packet header after processing the packet");
			}
			final boolean isLastPkt = pkt.isLastPacketInBlock();
			final long seqNo = pkt.getSeqno();
			final long offsetInBlock = pkt.getOffsetInBlock();

			if (LOG.isDebugEnabled()) {
				LOG.debug("After processing packet: " + pkt + "\nuri=" + DataXceiverBase.this.uri);
			}

			if (!hasPipeline()) {
				packetAsyncIOExecutor.execute(new Runnable() {

					@Override
					public void run() {
						Status status = ERROR;
						try {
							serverPortalWorker.returnCurrAsyncIOBuffer(curCopyBuff);

							if (LOG.isTraceEnabled()) {
								LOG.trace("In last async IO opr for packet");
							}

							if (isLastPkt) {
								// If this is the last packet in block, then close block
								// file and finalize the block before responding success
								blockReceiver.finalizeBlock();
							}
							status = SUCCESS;
						} catch (IllegalArgumentException e) {
							LOG.fatal("failed on reflection: " + StringUtils.stringifyException(e));
						} catch (Throwable t) {
							LOG.error("failed on async packet processing (last execution for packet): " + StringUtils.stringifyException(t));
						} finally {
							try {
								PipelineAck replyAck = new PipelineAck(seqNo, new Status[] { status });
								if (replyAck.isSuccess() && offsetInBlock > blockReceiver.getReplicaInfo().getBytesAcked()) {
									blockReceiver.getReplicaInfo().setBytesAcked(offsetInBlock);
								}
								// if (LOG.isTraceEnabled()) {
								// LOG.trace("Going to queue reply ack:\npkt=" + pkt + "\nack=" + replyAck);
								// }
								replyPacketAck(msg, replyAck, true);
								if (isLastPkt && !returnedWorkerToPool) { // returnedWorkerToPool will be double-checked inside
									                                      // asyncReturnWorkerToPool()
									asyncReturnWorkerToPool();
								}
							} catch (Throwable t) {
								LOG.error("Failed on submiting a reply ack: " + StringUtils.stringifyException(t));
							}
						}
					}
				});
			} else {
				// synchronized (pipelineContext) {
				pipelineContext.setPktDetails(seqNo, isLastPkt);
				// pipelineContext.notifyAll();
				// }
				packetAsyncIOExecutor.execute(new Runnable() {

					@Override
					public void run() {
						try {
							serverPortalWorker.returnCurrAsyncIOBuffer(curCopyBuff);
						} catch (Throwable t) {
							LOG.error("Failed on last async processing for pipeline request while trying to set msg context seqno", t);
						}

					}
				});
			}

		} catch (Exception e) {
			handlePacketProcessingException(msg, e);
		}
	}

	private void handlePacketProcessingException(Msg msg, Exception e) {
		LOG.error("Exception during processing" + blockReceiver.getBlock() + StringUtils.stringifyException(e));
		PacketHeader pkt = null;
		try {
			pkt = blockReceiver.getPacketReceiver().getHeader();
		} catch (IllegalArgumentException | IllegalAccessException e2) {
		}
		if (pkt != null) {
			try {
				// construct my ack message
				Status[] replies = new Status[2];
				replies[0] = SUCCESS;
				replies[1] = ERROR;
				PipelineAck replyAck = new PipelineAck(pkt.getSeqno(), replies);
				replyPacketAck(msg, replyAck, false);
			} catch (IOException e1) {
				LOG.error("Failed to replyNack: " + StringUtils.stringifyException(e1));
			}

		} else {
			LOG.warn("Cannot reply response while handling packet processing exception because pkt header is NULL");
		}

		if ((DataXceiverBase.this.clientSession != null) && (!DataXceiverBase.this.clientSession.getIsClosing())) {
			clientSessionCloseEventExpected = true;
			DataXceiverBase.this.clientSession.close();
		}
	}

	private void processPacketReply(Msg msg) throws IOException {
		PipelinePacketContext pipelinePktContext = (PipelinePacketContext) msg.getUserContext(); // TODO: dynamic cast and
		boolean readAckfields = false;
		Msg origMsg = msg.getMirror(false);
		if (LOG.isTraceEnabled()) {
			LOG.trace("origMsg isMirror=" + origMsg.getIsMirror());
		}
		long expected = PipelineAck.UNKOWN_SEQNO;
		long seqno = PipelineAck.UNKOWN_SEQNO;
		PipelineAck ack = new PipelineAck();
		try {
			msg.getIn().position(0);
			ack.readFields(new DataInputStream(new ByteBufferInputStream(msg.getIn())));
			readAckfields = true;

			if (LOG.isDebugEnabled()) {
				LOG.debug("PacketResponder " + oprHeader.getNumTargets() + " for block " + blockReceiver.getBlock() + " got " + ack);
			}
			msg.getOut().position(0);
			seqno = ack.getSeqno();
			expected = pipelinePktContext.getSeqno();

			// verify seqno
			if (seqno != expected) {
				if (LOG.isTraceEnabled()) {
					LOG.trace(String.format("MSG user context: msg ref=%s , context ref=%s", Integer.toHexString(System.identityHashCode(msg)),
					        Integer.toHexString(System.identityHashCode(msg.getUserContext()))));
				}
				throw new IOException("PacketResponder " + oprHeader.getNumTargets() + " for block " + oprHeader.getBlock() + " expected seqno:"
				        + expected + " received:" + seqno);
			}

			// If this is the last packet in block, then close block
			// file and finalize the block before responding success
			if (pipelinePktContext.isLastPacketInBlock()) {
				blockReceiver.finalizeBlock();
				asyncCloseClientSession();
				replyPipelineAck(origMsg, expected, ack, SUCCESS, true);
				if (!returnedWorkerToPool) { // returnedWorkerToPool will be double checked inside asyncReturnWorkerToPool()
					asyncReturnWorkerToPool();
				}
			} else {
				replyPipelineAck(origMsg, expected, ack, SUCCESS, true);
			}
		} catch (Throwable e) {
			LOG.error("Failed during processing packet reply: " + blockReceiver.getBlock() + " " + oprHeader.getNumTargets() + " Exception "
			        + StringUtils.stringifyException(e));
			if ((clientSession != null) && (!clientSession.getIsClosing())) {
				asyncCloseClientSession();
			}
		} finally {
			if (serverSession != null) {
				if (!readAckfields) {
					replyBrokenPipelineAck(origMsg, expected);
				} else if ((clientSession == null) && (!pipelinePktContext.isLastPacketInBlock())) {
					replyPipelineAck(origMsg, expected, ack, ERROR, true);
				}
			}
		}
	}

	private void replyPipelineAck(Msg origMsg, long expectedSeqno, PipelineAck ack, Status s, boolean async) throws IOException {
		replyPacketAck(origMsg, preparePipelineAck(expectedSeqno, ack, s), async);
	}

	private PipelineAck preparePipelineAck(long expectedSeqno, PipelineAck ack, Status s) {
		// construct my ack message
		Status[] replies = null;
		short ackLen = oprHeader.getNumTargets() == 0 ? 0 : ack.getNumOfReplies();
		replies = new Status[1 + ackLen];
		replies[0] = s;
		for (int i = 0; i < ackLen; i++) {
			replies[i + 1] = ack.getReply(i);
		}
		PipelineAck replyAck = new PipelineAck(expectedSeqno, replies, 0/* TODO: update totalAckTimeNanos for specific packet */);
		return replyAck;
	}

	private void replyBrokenPipelineAck(Msg origMsg, long expectedSeqno) throws IOException {
		// construct error ack message: when pipeline ack status isn't known then we send back SUCCESS,ERROR as marker
		Status[] replies = null;
		replies = new Status[2];
		replies[0] = SUCCESS;
		replies[1] = ERROR;
		PipelineAck replyAck = new PipelineAck(expectedSeqno, replies);
		replyPacketAck(origMsg, replyAck, true);
	}

	private void sendPktToPipeline(PipelinePacketContext context) throws IOException {
		Msg mirror = context.getMsg().getMirror(false);
		mirror.getOut().position(mirror.getOut().limit());
		mirror.setUserContext(context);
		R4HProtocol.wrappedSendRequest(clientSession, mirror, LOG);
		clientOnFlightNumMsgs++;
	}

	private void openPipelineConnection() throws URISyntaxException {
		CSCallbacks csCBs = DataXceiverBase.this.new CSCallbacks();

		String clientURI = DataXceiverBase.this.uri.toString();
		int index = clientURI.indexOf("&clientHash=");
		URI uri = R4HProtocol.createPipelineURI(oprHeader.getTargets(), clientURI.substring(index));
		LOG.info("Open a proxy client session: " + uri);
		clientSession = new ClientSession(worker.eqh, uri, csCBs);
	}

	private void sendOprHeaderToPipeline(Msg msg, ExtendedBlock origBlk) throws IOException {
		Msg mirror = msg.getMirror(false);
		mirror.getOut().clear();
		DataOutputStream mirrorOut = new DataOutputStream(new ByteBufferOutputStream(mirror.getOut()));
		senderWriteBlock(mirrorOut, origBlk);
		mirrorOut.flush();
		clientOnFlightNumMsgs++;
		R4HProtocol.wrappedSendRequest(clientSession, mirror, LOG);
	}

	private boolean hasPipeline() {
		return (oprHeader.getNumTargets() > 0);
	}

	private void replyHeaderAck(Msg msg) throws IOException {
		replyHeaderAck(msg, SUCCESS, "");
	}

	private void replyHeaderAck(Msg msg, Status status, String firstBadNode) throws IOException {
		msg.getOut().position(0);
		OutputStream replyOut = new ByteBufferOutputStream(msg.getOut());
		// send connect-ack to source for clients and not transfer-RBW/Finalized
		if (LOG.isDebugEnabled()) {
			LOG.debug("Datanode " + oprHeader.getTargets().length + " forwarding connect ack to upstream");
		}
		BlockOpResponseProto.newBuilder().setStatus(status).setFirstBadLink(firstBadNode).build().writeDelimitedTo(replyOut);
		replyOut.flush();
		LOG.info("sending response for src: " + uri);
		R4HProtocol.wrappedSendResponse(serverSession, msg, LOG);
		onFlightMsgs.remove(msg);
	}

	private void replyPacketAck(Msg msg, PipelineAck replyAck, boolean async) throws IOException {
		msg.getOut().clear();
		OutputStream replyOut = new ByteBufferOutputStream(msg.getOut());
		replyAck.write(replyOut);
		replyOut.flush();
		if (async) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("queue ack reply for async response : " + replyAck + "\nuri=" + uri);
			}
			this.serverPortalWorker.queueAsyncReply(serverSession, msg, onFlightMsgs);
		} else {
			if (LOG.isDebugEnabled()) {
				LOG.debug("send ack response  : " + replyAck + "\nuri=" + uri);
			}

			R4HProtocol.wrappedSendResponse(serverSession, msg, LOG);
			onFlightMsgs.remove(msg);
		}
	}

	private void replyHeaderPipelineAck(Msg msg, Status mirrorInStatus, String firstBadLink) throws IOException {
		if (LOG.isDebugEnabled() || mirrorInStatus != SUCCESS) {
			LOG.info("Datanode " + oprHeader.getTargets().length + " forwarding connect ack to upstream firstbadlink is " + firstBadLink + "\nuri="
			        + uri);
		}
		msg.getOut().clear();
		BlockOpResponseProto protobuff = BlockOpResponseProto.newBuilder().setStatus(mirrorInStatus).setFirstBadLink(firstBadLink).build();
		protobuff.writeDelimitedTo(new ByteBufferOutputStream(msg.getOut()));
		R4HProtocol.wrappedSendResponse(serverSession, msg, LOG);
		onFlightMsgs.remove(msg);
	}

	ServerSession getSessionServer() {
		return this.serverSession;
	}

	void close() {
		if (!this.returnedWorkerToPool) {
			this.serverPortalWorker.clearAsyncOprQueue();
		}
		if ((DataXceiverBase.this.clientSession != null) && (!DataXceiverBase.this.clientSession.getIsClosing())) {
			LOG.info("Closing mirror client session: " + DataXceiverBase.this.clientSession);
			clientSessionCloseEventExpected = true;
			DataXceiverBase.this.clientSession.close();
		}

		if ((serverSession != null) && (!serverSession.getIsClosing())) {
			LOG.info("Closing server session: " + DataXceiverBase.this.serverSession);
			serverSession.close();
		}
	}

	@Override
	public String toString() {
		return String.format("DataXceiver{EQH='%s', SS='%s', SC='%s'}", worker.eqh, serverSession, (clientSession == null) ? "-" : clientSession);
	}

	// TODO: this method is copied from original DXC. Need to consider reuse instead, maybe by inheritance+reflection
	private boolean checkAccess(final boolean reply, final ExtendedBlock blk, final Token<BlockTokenIdentifier> t, final Op op,
	        final BlockTokenSecretManager.AccessMode mode) throws IOException {
		if (dnBridge.isBlockTokenEnabled()) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("Checking block access token for block '" + blk.getBlockId() + "' with mode '" + mode + "'");
			}
			try {
				dnBridge.getBlockPoolTokenSecretManager().checkAccess(t, null, blk, mode);
			} catch (InvalidToken e) {
				if (reply) {
					final OutputStream replyOut = new ByteBufferOutputStream(currMsg.getOut());
					BlockOpResponseProto.Builder resp = BlockOpResponseProto.newBuilder().setStatus(ERROR_ACCESS_TOKEN);
					if (mode == BlockTokenSecretManager.AccessMode.WRITE) {
						DatanodeRegistration dnR = dnBridge.getDNRegistrationForBP(blk.getBlockPoolId());
						// NB: Unconditionally using the xfer addr w/o hostname
						resp.setFirstBadLink(dnR.getXferAddr());
					}
					resp.build().writeDelimitedTo(replyOut);
					replyOut.flush();
					serverSession.sendResponse(currMsg);
				}
				LOG.error("Block token verification failed: op=" + op + ", serverSession=" + serverSession + ", message=" + e.getLocalizedMessage());
				return false;// FAILED
			}
		}
		return true; // SUCCESS
	}

	public void setClientSession(ClientSession clientSession) {
		this.clientSession = clientSession;
	}

	public ClientSession getClientSession() {
		return this.clientSession;
	}

	void setServerPortalWorker(ServerPortalWorker spw) {
		this.serverPortalWorker = spw;
	}

	private void asyncReturnWorkerToPool() {
		serverPortalWorker.queueAsyncRunnable(new Runnable() {
			@Override
			public void run() {
				if (!DataXceiverBase.this.returnedWorkerToPool) {
					DataXceiverBase.this.returnedWorkerToPool = true;
					DataXceiverBase.this.dxcs.returnServerWorkerToPool(serverSession, false /* needIOThreadInit */);
				}
			}
		});
	}

	private void asyncCloseServerSession() {
		serverPortalWorker.queueAsyncRunnable(new Runnable() {

			@Override
			public void run() {
				if ((DataXceiverBase.this.serverSession != null) && (!DataXceiverBase.this.serverSession.getIsClosing())) {
					DataXceiverBase.this.serverSession.close();
				}
			}
		});
	}

	private void asyncCloseClientSession() {
		final ClientSession cs = DataXceiverBase.this.clientSession;
		if (cs != null) {
			serverPortalWorker.queueAsyncRunnable(new Runnable() {

				@Override
				public void run() {
					if (!cs.getIsClosing()) {
						clientSessionCloseEventExpected = true;
						cs.close();
					}
				}
			});
		}
	}

	public String getUri() {
		return this.uri;
	}

	ServerPortalWorker getServerPortalWorker() {
		return worker;
	}

	static protected CachingStrategy getCachingStrategy(CachingStrategyProto strategy) {
		Boolean dropBehind = strategy.hasDropBehind() ? strategy.getDropBehind() : null;
		Long readahead = strategy.hasReadahead() ? strategy.getReadahead() : null;
		return new CachingStrategy(dropBehind, readahead);
	}

	abstract void parseOpWriteBlock(DataInputStream in) throws IOException;
	
	abstract void senderWriteBlock(DataOutputStream out, ExtendedBlock origBlk) throws IOException;
}
