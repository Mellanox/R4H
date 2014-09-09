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

import static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status.ERROR;
import static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status.ERROR_ACCESS_TOKEN;
import static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status.SUCCESS;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.hdfs.protocol.DatanodeInfo;
import org.apache.hadoop.hdfs.protocol.ExtendedBlock;
import org.apache.hadoop.hdfs.protocol.HdfsProtoUtil;
import org.apache.hadoop.hdfs.protocol.datatransfer.BlockConstructionStage;
import org.apache.hadoop.hdfs.protocol.datatransfer.Op;
import org.apache.hadoop.hdfs.protocol.datatransfer.PacketHeader;
import org.apache.hadoop.hdfs.protocol.datatransfer.PipelineAck;
import org.apache.hadoop.hdfs.protocol.datatransfer.Receiver;
import org.apache.hadoop.hdfs.protocol.datatransfer.Sender;
import org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BlockOpResponseProto;
import org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status;

import com.mellanox.jxio.ClientSession;
import com.mellanox.jxio.EventName;
import com.mellanox.jxio.EventQueueHandler;
import com.mellanox.jxio.EventReason;
import com.mellanox.jxio.Msg;
import com.mellanox.jxio.ServerSession;
import com.mellanox.jxio.ServerSession.SessionKey;

import org.apache.hadoop.hdfs.server.datanode.BlockReceiverBridge;
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
class DataXceiver extends Receiver {
	private final static Log LOG = LogFactory.getLog(DataXceiver.class);
	private ClientSession clientSession;
	private boolean isFirstRequest = true;
	private boolean isFirstReply = true;
	private DataNodeBridge dnBridge;
	private WriteOprHeader oprHeader;
	public BlockReceiverBridge blockReceiver;
	private Msg firstMsg;
	private DataXceiverServer dxcs;
	private EventQueueHandler eqh;
	private ServerSession serverSession;
	private Msg currMsg = null;
	private ExecutorService packetAsyncIOExecutor;
	private String uri;
	private ServerPortalWorker serverPortalWorker;
	public boolean clientSessionCloseEventExpected = true;

	class SSCallbacks implements ServerSession.Callbacks {
		@Override
		public void onRequest(Msg msg) {
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
				if (DataXceiver.this.serverSession != null) {
					DataXceiver.this.serverSession.close();
				}
			}
		}

		@Override
		public boolean onMsgError(Msg msg, EventReason reason) {
			boolean releaseMsg = true; // Always return the message to server's bound pool
			LOG.error(String.format("Msg error: reason=%s ss=%s ss.isClosing=%s cs.isClosing=%s", reason, serverSession,
			        serverSession.getIsClosing(), (clientSession != null) ? clientSession.getIsClosing() : null));
			// TODO: sendReply(NACK) ? or ss.close() ?
			return releaseMsg;
		}

		@Override
		public void onSessionEvent(EventName session_event, EventReason reason) {

			String logmsg = String.format("Server Session event: event=%s reason=%s ss=%s uri=%s", session_event, reason, serverSession, uri);
			switch (session_event) {
				case SESSION_CLOSED:
					// TODO: if last packet received then info , else error
					LOG.info(logmsg);
					dxcs.returnServerWorkerToPool(serverSession);
					break;
				case SESSION_ERROR:
				case SESSION_REJECT:
					LOG.error(logmsg);
					dxcs.returnServerWorkerToPool(serverSession);
					break;
				default:
					break;
			}
		}

	}

	class CSCallbacks implements ClientSession.Callbacks {
		@Override
		public void onResponse(Msg msg) {
			if (LOG.isTraceEnabled()) {
				LOG.trace("Got reply from pipeline client - " + clientSession);
			}
			try {
				if (isFirstReply) {
					firstMsg = msg;
					LOG.info("Going to process pipeline reply for OPR header. uri=" + DataXceiver.this.uri);
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
				asyncCloseServerSession();
			}
		}

		@Override
		public void onSessionEstablished() {
			LOG.info("Client session established: " + clientSession + ", uri=" + uri);
		}

		@Override
		public void onMsgError(Msg msg, EventReason reason) {
			LOG.error(String.format("Mirror client got msg error:  reason=%s ss=%s sc=%s", reason, serverSession, clientSession));

			if (serverSession != null) {
				serverSession.close();
			}

		}

		@Override
		public void onSessionEvent(EventName session_event, EventReason reason) {
			String logmsg = String.format("Client Session event: event=%s reason=%s ss=%s", session_event, reason, serverSession);
			switch (session_event) {
				case SESSION_CLOSED:
					if (DataXceiver.this.clientSessionCloseEventExpected) {
						LOG.info(logmsg);
						clientSessionCloseEventExpected = false;
					} else {
						LOG.error(logmsg);
					}
					break;
				case SESSION_ERROR:
				case SESSION_REJECT:
					LOG.error(logmsg);
					LOG.error("Closing server session due to error event: ss=" + serverSession);
					serverSession.close();
					break;
				default:
					break;

			}
		}

	}

	DataXceiver(DataXceiverServer dxcs, SessionKey sKey) {
		this.dxcs = dxcs;
		this.dnBridge = dxcs.dnBridge;
		this.eqh = dxcs.eqh;
		this.packetAsyncIOExecutor = Executors.newSingleThreadExecutor(); // TODO: get from pool ?
		this.uri = sKey.getUri();
		DataXceiver.SSCallbacks ssCbs = this.new SSCallbacks();
		serverSession = new ServerSession(sKey, ssCbs);
	}

	private void processOPRHeaderRequest(Msg msg) throws IOException, SecurityException, NoSuchFieldException, IllegalArgumentException,
	        IllegalAccessException, NoSuchMethodException, URISyntaxException {
		if (LOG.isTraceEnabled()) {
			LOG.trace("Processing block header request. uri=" + DataXceiver.this.uri);
		}

		msg.getIn().position(0);
		in = new DataInputStream(new ByteBufferInputStream(msg.getIn()));
		Op op = readOp();
		processOp(op);

		// updateCurrentThreadName("Receiving block " + blk); TODO:Need to copy method - is that really necessary ?

		// check single target for transfer-RBW/Finalized
		if (oprHeader.isTransfer() && oprHeader.getTargets().length > 0) {
			throw new IOException(oprHeader.getStage() + " does not support multiple targets " + Arrays.asList(oprHeader.getTargets()));
		}

		if (LOG.isDebugEnabled()) {
			LOG.debug("uri= " + DataXceiver.this.uri + "\nopWriteBlock: stage=" + oprHeader.getStage() + ", clientname=" + oprHeader.getClientName()
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

		// reply to upstream datanode or client
		final OutputStream replyOut = new ByteBufferOutputStream(currMsg.getOut());
		checkAccess(replyOut, oprHeader.isClient(), oprHeader.getBlock(), oprHeader.getBlockToken(), Op.WRITE_BLOCK,
		        BlockTokenSecretManager.AccessMode.WRITE);

		if (oprHeader.isDatanode() || oprHeader.getStage() != BlockConstructionStage.PIPELINE_CLOSE_RECOVERY) {
			// open a block receiver
			try {
				blockReceiver = new BlockReceiverBridge(serverPortalWorker, oprHeader, in, serverSession.toString(), dnBridge, packetAsyncIOExecutor);
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

		isFirstRequest = false;
	}

	private void processOPRHeaderReply(Msg msg) throws IOException {
		// read connect ack (only for clients, not for replication req)
		if (oprHeader.isClient()) {
			msg.getIn().position(0);
			BlockOpResponseProto connectAck = BlockOpResponseProto.parseFrom(HdfsProtoUtil.vintPrefixed(new ByteBufferInputStream(msg.getIn())));
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
			LOG.trace("Processing packet request. uri=" + DataXceiver.this.uri);
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
				LOG.debug("After processing packet: " + pkt + "\nuri=" + DataXceiver.this.uri);
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

		if (DataXceiver.this.clientSession != null) {
			clientSessionCloseEventExpected = true;
			DataXceiver.this.clientSession.close();
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
			}
			replyPipelineAck(origMsg, expected, ack, SUCCESS, true);
		} catch (Throwable e) {
			LOG.error("Failed during processing packet reply: " + blockReceiver.getBlock() + " " + oprHeader.getNumTargets() + " Exception "
			        + StringUtils.stringifyException(e));
			if (clientSession != null) {
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
		clientSession.sendRequest(mirror);
	}

	private void openPipelineConnection() throws URISyntaxException {
		CSCallbacks csCBs = DataXceiver.this.new CSCallbacks();

		String clientURI = DataXceiver.this.uri.toString();
		int index = clientURI.indexOf("&clientHash=");
		URI uri = R4HProtocol.createPipelineURI(oprHeader.getTargets(), clientURI.substring(index));
		LOG.info("Open a proxy client session: " + uri);
		clientSession = new ClientSession(eqh, uri, csCBs);
	}

	private void sendOprHeaderToPipeline(Msg msg, ExtendedBlock origBlk) throws IOException {
		Msg mirror = msg.getMirror(false);
		mirror.getOut().clear();
		DataOutputStream mirrorOut = new DataOutputStream(new ByteBufferOutputStream(mirror.getOut()));
		new Sender(mirrorOut).writeBlock(origBlk, oprHeader.getBlockToken(), oprHeader.getClientName(), oprHeader.getTargets(),
		        oprHeader.getSrcDataNode(), oprHeader.getStage(), oprHeader.getPipelineSize(), oprHeader.getMinBytesRcvd(),
		        oprHeader.getMaxBytesRcvd(), oprHeader.getLatestGenerationStamp(), oprHeader.getRequestedChecksum());
		mirrorOut.flush();
		clientSession.sendRequest(mirror);
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
		serverSession.sendResponse(msg);
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
			this.serverPortalWorker.queueAsyncReply(serverSession, msg, null);
		} else {
			if (LOG.isDebugEnabled()) {
				LOG.debug("send ack response  : " + replyAck + "\nuri=" + uri);
			}

			serverSession.sendResponse(msg);
			// // if (LOG.isDebugEnabled()) {
			// // LOG.debug("replyAck=" + replyAck);
			// // }
		}
	}

	private void replyHeaderPipelineAck(Msg msg, Status mirrorInStatus, String firstBadLink) throws IOException {
		if (LOG.isDebugEnabled() || mirrorInStatus != SUCCESS) {
			LOG.info("Datanode " + oprHeader.getTargets().length + " forwarding connect ack to upstream firstbadlink is " + firstBadLink + "\nuri=" + uri);
		}
		msg.getOut().clear();
		BlockOpResponseProto protobuff = BlockOpResponseProto.newBuilder().setStatus(mirrorInStatus).setFirstBadLink(firstBadLink).build();
		protobuff.writeDelimitedTo(new ByteBufferOutputStream(msg.getOut()));
		serverSession.sendResponse(msg);
		
	}

	ServerSession getSessionServer() {
		return this.serverSession;
	}

	void close() {
		if (DataXceiver.this.clientSession != null) {
			clientSessionCloseEventExpected = true;
			DataXceiver.this.clientSession.close();
		}

		if (DataXceiver.this.serverSession != null) {
			DataXceiver.this.serverSession.close();
		}
		// TODO: remove it from DXCServer's dxcList!
	}

	@Override
	public String toString() {
		return String.format("DataXceiver{EQH='%s', SS='%s', SC='%s'}", eqh.toString(), serverSession.toString(), (clientSession == null) ? "-"
		        : clientSession.toString());
	}

	void setEqh(EventQueueHandler eqh) {
		this.eqh = eqh;
	}

	@Override
	public void readBlock(ExtendedBlock blk, Token<BlockTokenIdentifier> blockToken, String clientName, long blockOffset, long length,
	        boolean sendChecksum) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeBlock(ExtendedBlock block, Token<BlockTokenIdentifier> blockToken, String clientName, DatanodeInfo[] targets,
	        DatanodeInfo source, BlockConstructionStage stage, int pipelineSize, long minBytesRcvd, long maxBytesRcvd, long latestGenerationStamp,
	        DataChecksum requestedChecksum) throws IOException {
		oprHeader = new WriteOprHeader(block, blockToken, clientName, targets, source, stage, pipelineSize, minBytesRcvd, maxBytesRcvd,
		        latestGenerationStamp, requestedChecksum);

	}

	// TODO: this method is copied from original DXC. Need to consider reuse instead, maybe by inheritance+reflection
	private void checkAccess(OutputStream out, final boolean reply, final ExtendedBlock blk, final Token<BlockTokenIdentifier> t, final Op op,
	        final BlockTokenSecretManager.AccessMode mode) throws IOException {
		if (dnBridge.isBlockTokenEnabled()) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("Checking block access token for block '" + blk.getBlockId() + "' with mode '" + mode + "'");
			}
			try {
				dnBridge.getBlockPoolTokenSecretManager().checkAccess(t, null, blk, mode);
			} catch (InvalidToken e) {
				try {
					if (reply) {
						BlockOpResponseProto.Builder resp = BlockOpResponseProto.newBuilder().setStatus(ERROR_ACCESS_TOKEN);
						if (mode == BlockTokenSecretManager.AccessMode.WRITE) {
							DatanodeRegistration dnR = dnBridge.getDNRegistrationForBP(blk.getBlockPoolId());
							// NB: Unconditionally using the xfer addr w/o hostname
							resp.setFirstBadLink(dnR.getXferAddr());
						}
						resp.build().writeDelimitedTo(out);
						out.flush();
					}
					LOG.warn("Block token verification failed: op=" + op + ", serverSession=" + serverSession + ", message="
					        + e.getLocalizedMessage());
					throw e;

				} finally {
					IOUtils.closeStream(out);
				}
			}
		}
	}

	@Override
	public void transferBlock(ExtendedBlock blk, Token<BlockTokenIdentifier> blockToken, String clientName, DatanodeInfo[] targets)
	        throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void requestShortCircuitFds(ExtendedBlock blk, Token<BlockTokenIdentifier> blockToken, int maxVersion) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void replaceBlock(ExtendedBlock blk, Token<BlockTokenIdentifier> blockToken, String delHint, DatanodeInfo source) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void copyBlock(ExtendedBlock blk, Token<BlockTokenIdentifier> blockToken) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void blockChecksum(ExtendedBlock blk, Token<BlockTokenIdentifier> blockToken) throws IOException {
		// TODO Auto-generated method stub

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

	private void asyncCloseServerSession() {
		serverPortalWorker.queueAsyncRunnable(new Runnable() {

			@Override
			public void run() {
				if (DataXceiver.this.serverSession != null) {
					DataXceiver.this.serverSession.close();
				}
			}
		});
	}

	private void asyncCloseClientSession() {
		final ClientSession cs = DataXceiver.this.clientSession;
		if (cs != null) {
			serverPortalWorker.queueAsyncRunnable(new Runnable() {

				@Override
				public void run() {
					clientSessionCloseEventExpected = true;
					cs.close();
				}
			});
		}
	}

	public String getUri() {
		return this.uri;
    }

}
