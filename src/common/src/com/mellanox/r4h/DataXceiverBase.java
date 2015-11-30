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

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.hdfs.protocol.ExtendedBlock;
import org.apache.hadoop.hdfs.protocol.datatransfer.BlockConstructionStage;
import org.apache.hadoop.hdfs.protocol.datatransfer.DataTransferProtocol;
import org.apache.hadoop.hdfs.protocol.datatransfer.Op;
import org.apache.hadoop.hdfs.protocol.datatransfer.PacketHeader;
import org.apache.hadoop.hdfs.protocol.datatransfer.PipelineAck;
import org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BlockOpResponseProto;
import org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto;
import org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status;
import org.apache.hadoop.hdfs.protocolPB.PBHelper;
import org.accelio.jxio.ClientSession;
import org.accelio.jxio.EventName;
import org.accelio.jxio.EventReason;
import org.accelio.jxio.Msg;
import org.accelio.jxio.ServerSession;
import org.accelio.jxio.ServerSession.SessionKey;
import org.apache.hadoop.hdfs.server.datanode.R4HBlockReceiver;
import org.apache.hadoop.hdfs.server.datanode.CachingStrategy;
import org.apache.hadoop.hdfs.server.datanode.DataNodeBridge;
import org.apache.hadoop.hdfs.server.protocol.DatanodeRegistration;
import org.apache.hadoop.security.token.SecretManager.InvalidToken;
import org.apache.hadoop.security.token.Token;
import org.apache.hadoop.util.StringUtils;
import org.apache.hadoop.hdfs.security.token.block.BlockTokenIdentifier;
import org.apache.hadoop.hdfs.security.token.block.BlockTokenSecretManager;

/**
 * R4H's parallel class to the original
 * org.apache.hadoop.hdfs.server.datanode.DataXceiver
 * 
 * @see org.DataXceiver.hadoop.hdfs.server.datanode.DataXceiver It breaks the
 *      original serial flow of processing HDFS operation into an async flow
 *      with JXIO RDMA library CURRENTLY: only HDFS WRITE operation is supported
 */
abstract class DataXceiverBase {
	private final static Log LOG = LogFactory.getLog(DataXceiverBase.class);
	private static final int NUM_OF_BLOCK_RECEIVER_CREATION_ATTEMPTS = 3;
	private final DataXceiverServer dxcs;
	ClientSession clientSession;
	private final DataNodeBridge dnBridge;
	protected WriteOprHeader oprHeader;
	private R4HBlockReceiver blockReceiver;
	private final ServerPortalWorker spw;
	private final ServerSession serverSession;
	private final String uri;
	private final List<Msg> onFlightMsgs = new LinkedList<Msg>();
	long clientOnFlightNumMsgs = 0;
	private boolean serverSessionClosed = false;
	private boolean clientSessionClosed = false;
	private boolean isFirstRequest = true;
	private boolean isFirstReply = true;
	boolean clientSessionCloseEventExpected = true;
	boolean returnedAuxillaryExecutorToPool = false;
	private final R4HExecutor ioExecutor;
	private final R4HExecutor auxExecutor;
	private final MessageAction msgCallbacks;

	class SSCallbacks implements ServerSession.Callbacks {

		@Override
		public void onRequest(final Msg msg) {
			spw.processReplies();
			try {
				onFlightMsgs.add(msg);

				if (isFirstRequest) {
					asyncProcessOPRHeaderRequest(msg);
					isFirstRequest = false;
				} else {
					asyncProcessPacketRequest(msg);
				}
			} catch (Throwable t) {
				LOG.error("DataXceiver exception during execution of new async request", t);
				if ((DataXceiverBase.this.serverSession != null) && (!DataXceiverBase.this.serverSession.getIsClosing())) {
					DataXceiverBase.this.serverSession.close();
				}
			}
		}

		@Override
		public boolean onMsgError(Msg msg, EventReason reason) {
			boolean releaseMsg = true; // Always return the message to server's bound pool
			try {
				if (hasPipeline()) {
					LOG.error(String.format("Server Msg error: MSG=%s reason=%s ss=%s ss.isClosing=%s cs=%s cs.isClosing=%s", msg, reason,
					        serverSession, serverSession.getIsClosing(), clientSession, clientSession.getIsClosing()));
				} else {
					LOG.error(String.format("Server Msg error: MSG=%s reason=%s ss=%s ss.isClosing=%s", msg, reason, serverSession,
					        serverSession.getIsClosing()));
				}
			} catch (Throwable t) {
				LOG.error("Got exception during processing of Msg error", t);
				if ((DataXceiverBase.this.serverSession != null) && (!DataXceiverBase.this.serverSession.getIsClosing())) {
					DataXceiverBase.this.serverSession.close();
				}
			}
			onFlightMsgs.remove(msg);
			DataXceiverBase.this.close();
			return releaseMsg;
		}

		@Override
		public void onSessionEvent(EventName session_event, EventReason reason) {
			String logmsg = String.format("Server Session event: event=%s reason=%s ss=%s uri=%s", session_event, reason, serverSession, uri);
			boolean needAuxThreadInit = false;
			switch (session_event) {
				case SESSION_CLOSED:
					if (onFlightMsgs.size() == 0) {
						LOG.info(logmsg);
					} else {
						LOG.error(logmsg);
						needAuxThreadInit = true;
					}
					break;
				case SESSION_ERROR:
				case SESSION_REJECT:
					LOG.error(logmsg);
					needAuxThreadInit = true;
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
				if (!returnedAuxillaryExecutorToPool) {
					returnAuxillaryExecutortoPool(needAuxThreadInit);
				}

			} else if (onFlightMsgs.size() > 0) {
				LOG.warn("Server session closed but there are still messages on flight for proxy client - waiting for client close event to discard messages and return ServerWorker to pool");
			}

		}

	}

	class CSCallbacks implements ClientSession.Callbacks {

		private void asyncOnResponse(final Msg msg) throws IOException {
			if (isFirstReply) {
				LOG.info("Going to process pipeline reply for OPR header. uri=" + DataXceiverBase.this.uri);
				processOPRHeaderReply(msg);
				isFirstReply = false;
			} else {
				if (LOG.isTraceEnabled()) {
					LOG.trace("Going to process pipeline reply for packet");
				}
				processPacketReply(msg);
			}
		}

		@Override
		public void onResponse(final Msg msg) {
			spw.processReplies();
			clientOnFlightNumMsgs--;
			if (LOG.isTraceEnabled()) {
				LOG.trace("Got reply from pipeline client - " + clientSession);
			}
			auxExecutor.execute(new Runnable() {

				@Override
				public void run() {
					try {
						if (!clientSession.getIsClosing()) {
							asyncOnResponse(msg);
						}
					} catch (Throwable t) {
						LOG.error("Failed to process async reply", t);
						asyncCloseServerSession();
					}
				}
			});
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
			boolean needAuxThreadInit = false;
			switch (session_event) {
				case SESSION_CLOSED:
					if ((DataXceiverBase.this.clientSessionCloseEventExpected) && (clientOnFlightNumMsgs == 0)) {
						LOG.info(logmsg);
					} else {
						LOG.error(logmsg);
						needAuxThreadInit = true;
					}
					break;
				case SESSION_ERROR:
				case SESSION_REJECT:
					LOG.error(logmsg);
					LOG.error("Closing server session due to error event: ss=" + serverSession);
					if ((serverSession != null) && (!serverSession.getIsClosing())) {
						serverSession.close();
					}
					needAuxThreadInit = true;
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

				if (!returnedAuxillaryExecutorToPool) {
					returnAuxillaryExecutortoPool(needAuxThreadInit);
				}
			}

		}

	}

	DataXceiverBase(DataXceiverServer dxcs, ServerPortalWorker spw, SessionKey sKey, R4HExecutor ioExec, R4HExecutor auxExecutor) {
		this.dxcs = dxcs;
		this.spw = spw;
		this.dnBridge = dxcs.dnBridge;
		this.ioExecutor = ioExec;
		this.auxExecutor = auxExecutor;
		this.uri = sKey.getUri();
		DataXceiverBase.SSCallbacks ssCbs = this.new SSCallbacks();
		serverSession = new ServerSession(sKey, ssCbs);
		this.msgCallbacks = new MessageAction() {

			@Override
			public void onMessageAction(Msg msg) {
				completePacket(msg);
			}

		};
	}

	private void asyncProcessOPRHeaderRequest(final Msg msg) {
		final Runnable oprHeaderRequestTask = new Runnable() {

			@Override
			public void run() {
				try {
					processOPRHeaderRequest(msg);
				} catch (Exception e) {
					LOG.error("Got exception during processing packet request", e);
					DataXceiverBase.this.close(true);
				}
			}
		};

		auxExecutor.execute(oprHeaderRequestTask);
	}

	private void processOPRHeaderRequest(Msg msg) throws IOException, NoSuchFieldException, NoSuchMethodException, IllegalArgumentException,
	        IllegalAccessException {
		if (serverSession.getIsClosing()) {
			LOG.warn("Process OPRHeaderRequest for a closed session, discarding...");
			return;
		}

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

		// check single target for transfer-RBW/Finalized
		if (oprHeader.isTransfer() && oprHeader.getTargets().length > 0) {
			throw new IOException(oprHeader.getStage() + " does not support multiple targets " + Arrays.asList(oprHeader.getTargets()));
		}

		if (LOG.isDebugEnabled()) {
			LOG.debug("uri= " + DataXceiverBase.this.uri + "\nopWriteBlock: stage=" + oprHeader.getStage() + ", clientname="
			        + oprHeader.getClientName() + "\n  block  =" + oprHeader.getBlock() + ", newGs=" + oprHeader.getLatestGenerationStamp()
			        + ", bytesRcvd=[" + oprHeader.getMinBytesRcvd() + ", " + oprHeader.getMaxBytesRcvd() + "]" + "\n  targets="
			        + Arrays.asList(oprHeader.getTargets()) + "; pipelineSize=" + oprHeader.getPipelineSize() + ", srcDataNode="
			        + oprHeader.getSrcDataNode() + ", isDatanode=" + oprHeader.isDatanode() + ", isClient=" + oprHeader.isClient() + ", isTransfer="
			        + oprHeader.isTransfer() + ", writeBlock receive buf size " + msg.getIn().limit());
		}

		// We later mutate block's generation stamp and length, but we need to
		// forward the original version of the block to downstream mirrors, so
		// make a copy here.
		final ExtendedBlock originalBlock = new ExtendedBlock(oprHeader.getBlock());
		oprHeader.getBlock().setNumBytes(dnBridge.getEstimateBlockSize());
		LOG.info("Receiving " + oprHeader.getBlock() + " src: " + uri);

		boolean isTokenAccessOk = checkAccess(oprHeader.isClient(), oprHeader.getBlock(), oprHeader.getBlockToken(), Op.WRITE_BLOCK,
		        BlockTokenSecretManager.AccessMode.WRITE, msg);

		if (isTokenAccessOk) {

			if (oprHeader.isDatanode() || oprHeader.getStage() != BlockConstructionStage.PIPELINE_CLOSE_RECOVERY) {
				// open a block receiver
				createBlockReciver(in, NUM_OF_BLOCK_RECEIVER_CREATION_ATTEMPTS);

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
					blockReceiver.setMirrorOut(new DummyDataOutputStream()); // we send to pipeline with RDMA and then keep using vanila's
					                                                         // original
					                                                         // receivePacket function by modifying mirror stream with dummy
					                                                         // stream to
					                                                         // avoid sending to pipeline from vanila's flow
					// openPipelineConnection();
					// sendOprHeaderToPipeline(msg, originalBlock);
					ClientSession.Callbacks csCBs = DataXceiverBase.this.new CSCallbacks();
					String clientURI = DataXceiverBase.this.uri.toString();
					spw.queueAsyncPipelineConnection(csCBs, clientURI, oprHeader, DataXceiverBase.this);
					/* queue request to send OPR Header to pipeline */
					Msg mirror = msg.getMirror(false);
					mirror.getOut().clear();
					DataOutputStream mirrorOut = new DataOutputStream(new ByteBufferOutputStream(mirror.getOut()));
					senderWriteBlock(mirrorOut, originalBlock);
					mirrorOut.flush();
					spw.queueAsyncRequest(mirror, this);
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
				replyHeaderAck(msg); // async
			}
		}
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
	}

	private void asyncProcessPacketRequest(final Msg msg) {

		final Runnable requestTask = new Runnable() {

			@Override
			public void run() {
				processPacketRequest(msg);
			}
		};

		PacketMessageContext context = new PacketMessageContext();
		msg.setUserContext(context);

		msg.getIn().position(0);
		msg.getIn().clear();

		Msg mirror = msg.getMirror(false);

		if (hasPipeline()) {
			// increment counter for pipeline
			context.incrementReferenceCounter();
		}
		auxExecutor.execute(msg, msgCallbacks, requestTask);

		if (hasPipeline()) {
			sendPktToPipeline(mirror);
		}
	}

	private void processPacketRequest(Msg msg) {
		if (LOG.isTraceEnabled()) {
			LOG.trace("Processing packet request. uri=" + DataXceiverBase.this.uri);
		}
		try {

			blockReceiver.processPacket(msg);

			PacketHeader pkt = blockReceiver.getPacketHeader();
			ByteBuffer curCopyBuff = blockReceiver.getCurCopyBuff();

			if (pkt == null) {
				throw new IOException("Unexpected null packet header after processing the packet");
			}

			if (LOG.isDebugEnabled()) {
				LOG.debug("After processing packet: " + pkt + "\nuri=" + DataXceiverBase.this.uri);
			}

			PacketMessageContext pmc = PacketMessageContext.getPacketMessageContext(msg);
			pmc.setPacketData(pkt, curCopyBuff);

			boolean isLastPkt = pmc.isLastPacketInBlock();
			long seqNo = pmc.getSeqno();

			if (!hasPipeline()) {

				if (isLastPkt) {
					Status status = ERROR;
					try {
						blockReceiver.finalizeBlock();
						status = SUCCESS;
					} catch (IOException e) {
						LOG.error("failed on async packet processing (last execution for packet): " + StringUtils.stringifyException(e));
					} finally {
						PipelineAck replyAck = new R4HPipelineAck(seqNo, new Status[] { status });
						pmc.setMessageAck(replyAck);
					}
				} else {
					PipelineAck replyAck = new R4HPipelineAck(seqNo, new Status[] { SUCCESS });
					pmc.setMessageAck(replyAck);
				}
			}

		} catch (Exception e) {
			LOG.error("Got error during packet procesing", e);
			close(true);
		}
	}

	private void processPacketReply(Msg msg) throws IOException {
		boolean readAckfields = false;
		Msg origMsg = msg.getMirror(false);
		PacketMessageContext pmc = PacketMessageContext.getPacketMessageContext(origMsg);
		if (LOG.isTraceEnabled()) {
			LOG.trace("origMsg isMirror=" + origMsg.getIsMirror());
		}
		long expected = PipelineAck.UNKOWN_SEQNO;
		long seqno = PipelineAck.UNKOWN_SEQNO;
		R4HPipelineAck ack = new R4HPipelineAck();
		try {
			msg.getIn().position(0);
			ack.readFields(new DataInputStream(new ByteBufferInputStream(msg.getIn())));
			readAckfields = true;

			if (LOG.isDebugEnabled()) {
				LOG.debug("PacketResponder " + oprHeader.getNumTargets() + " for block " + blockReceiver.getBlock() + " got " + ack);
			}
			msg.getOut().position(0);
			seqno = ack.getSeqno();
			expected = pmc.getSeqno();
			boolean isLastPkt = pmc.isLastPacketInBlock();

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
			if (isLastPkt) {
				blockReceiver.finalizeBlock();
				asyncCloseClientSession();
			}

			PipelineAck ackReadyForReply = preparePipelineAck(origMsg, expected, ack, SUCCESS);
			pmc.setMessageAck(ackReadyForReply);

		} catch (Throwable e) {
			LOG.error("Failed during processing packet reply: " + blockReceiver.getBlock() + " " + oprHeader.getNumTargets() + " Exception "
			        + StringUtils.stringifyException(e));
			if ((clientSession != null) && (!clientSession.getIsClosing())) {
				asyncCloseClientSession();
			}
		} finally {
			if (serverSession != null) {
				if (!readAckfields) {
					PipelineAck brokenPipelineError = prepareBrokenPipelineAck(origMsg, expected);
					pmc.setMessageAck(brokenPipelineError);
				} else if ((clientSession == null) && (!pmc.isLastPacketInBlock())) {
					PipelineAck errorAck = preparePipelineAck(origMsg, expected, ack, ERROR);
					pmc.setMessageAck(errorAck);
				}
			}

			int refCount = pmc.decrementReferenceCounter();
			if (refCount == 0) {
				msgCallbacks.onMessageAction(origMsg);
			}
		}
	}

	private PipelineAck preparePipelineAck(Msg origMsg, long expectedSeqno, R4HPipelineAck ack, Status s) {
		// construct my ack message
		Status[] replies = null;
		short ackLen = oprHeader.getNumTargets() == 0 ? 0 : ack.getNumOfReplies();
		replies = new Status[1 + ackLen];
		replies[0] = s;
		for (int i = 0; i < ackLen; i++) {
			replies[i + 1] = ack.getReply(i);
		}
		return new R4HPipelineAck(expectedSeqno, replies, 0/* TODO: update totalAckTimeNanos for specific packet */);
	}

	private PipelineAck prepareBrokenPipelineAck(Msg origMsg, long expectedSeqno) {
		// construct error ack message: when pipeline ack status isn't known then we send back SUCCESS,ERROR as marker
		Status[] replies = null;
		replies = new Status[2];
		replies[0] = SUCCESS;
		replies[1] = ERROR;
		return new R4HPipelineAck(expectedSeqno, replies);
	}

	private void sendPktToPipeline(Msg mirror) {
		mirror.getOut().position(mirror.getOut().limit());
		R4HProtocol.wrappedSendRequest(clientSession, mirror, LOG);
		clientOnFlightNumMsgs++;
	}

	// queue async reply
	private void replyHeaderAck(Msg msg) throws IOException {
		replyHeaderAck(msg, SUCCESS, "");
	}

	// queue async reply
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
		spw.queueAsyncReply(DataXceiverBase.this, msg, onFlightMsgs, true);
	}

	private void replyPacketAck(Msg msg, PipelineAck replyAck, boolean breakEventLoop, boolean lastPacketInBlock) throws IOException {
		msg.getOut().clear();
		OutputStream replyOut = new ByteBufferOutputStream(msg.getOut());
		replyAck.write(replyOut);
		replyOut.flush();

		if (LOG.isDebugEnabled()) {
			LOG.debug("queue ack reply for async response : " + replyAck + "\nuri=" + uri);
		}
		spw.queueAsyncReply(DataXceiverBase.this, msg, onFlightMsgs, breakEventLoop);
	}

	private boolean hasPipeline() {
		return (oprHeader != null && oprHeader.getNumTargets() > 0);
	}

	private void completePacket(Msg msg) {
		PacketMessageContext pmc = PacketMessageContext.getPacketMessageContext(msg);
		spw.getIOBufferSupplier().returnBuffer(pmc.getIOBuffer());

		if (pmc.getMessageAck().isSuccess() && pmc.getUpdatedOffsetInBlock() > blockReceiver.getReplicaInfo().getBytesAcked()) {
			blockReceiver.getReplicaInfo().setBytesAcked(pmc.getUpdatedOffsetInBlock());
		}

		try {
			replyPacketAck(msg, pmc.getMessageAck(), pmc.isLastPacketInBlock() || pmc.getSyncBlock(), pmc.isLastPacketInBlock());
		} catch (IOException e) {
			LOG.error("Failed on submiting a reply ack: " + StringUtils.stringifyException(e));
			if ((clientSession != null) && (!clientSession.getIsClosing())) {
				asyncCloseClientSession();
			}
		}

		if (pmc.isLastPacketInBlock()) {
			asyncReturnAuxillaryExecutortoPool();
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
		spw.queueAsyncReply(DataXceiverBase.this, msg, onFlightMsgs, true);
	}

	ServerSession getSessionServer() {
		return this.serverSession;
	}

	void close() {
		close(false);
	}

	void close(boolean async) {
		Runnable closeRunnable = new Runnable() {

			@Override
			public void run() {
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
		};

		if (async) {
			spw.queueAsyncRunnable(closeRunnable);
		} else {
			closeRunnable.run();
		}
	}

	@Override
	public String toString() {
		return String.format("DataXceiver{SS='%s', SC='%s'}", serverSession, (clientSession == null) ? "-" : clientSession);
	}

	// TODO: this method is copied from original DXC. Need to consider reuse instead, maybe by inheritance+reflection
	private boolean checkAccess(final boolean reply, final ExtendedBlock blk, final Token<BlockTokenIdentifier> t, final Op op,
	        final BlockTokenSecretManager.AccessMode mode, final Msg msg) throws IOException {
		if (dnBridge.isBlockTokenEnabled()) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("Checking block access token for block '" + blk.getBlockId() + "' with mode '" + mode + "'");
			}
			try {
				dnBridge.getBlockPoolTokenSecretManager().checkAccess(t, null, blk, mode);
			} catch (InvalidToken e) {
				if (reply) {
					final OutputStream replyOut = new ByteBufferOutputStream(msg.getOut());
					BlockOpResponseProto.Builder resp = BlockOpResponseProto.newBuilder().setStatus(ERROR_ACCESS_TOKEN);
					if (mode == BlockTokenSecretManager.AccessMode.WRITE) {
						DatanodeRegistration dnR = dnBridge.getDNRegistrationForBP(blk.getBlockPoolId());
						// NB: Unconditionally using the xfer addr w/o hostname
						resp.setFirstBadLink(dnR.getXferAddr());
					}
					resp.build().writeDelimitedTo(replyOut);
					replyOut.flush();
					spw.queueAsyncReply(DataXceiverBase.this, msg, onFlightMsgs, true);
				}
				LOG.error("Block token verification failed: op=" + op + ", serverSession=" + serverSession + ", message=" + e.getLocalizedMessage());
				return false;// FAILED
			}
		}
		return true; // SUCCESS
	}

	private void asyncCloseServerSession() {
		spw.queueAsyncRunnable(new Runnable() {

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
			spw.queueAsyncRunnable(new Runnable() {

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

	private void asyncReturnAuxillaryExecutortoPool() {
		spw.queueAsyncRunnable(new Runnable() {

			@Override
			public void run() {
				if (!returnedAuxillaryExecutorToPool) {
					returnAuxillaryExecutortoPool(false);
				}
			}

		});
	}

	private void returnAuxillaryExecutortoPool(boolean needAuxThreadInit) {
		returnedAuxillaryExecutorToPool = true;
		spw.decermentSessionsCounter();
		dxcs.returnAuxillaryExecutortoPool(auxExecutor, needAuxThreadInit);
	}

	static protected CachingStrategy getCachingStrategy(CachingStrategyProto strategy) {
		Boolean dropBehind = strategy.hasDropBehind() ? strategy.getDropBehind() : null;
		Long readahead = strategy.hasReadahead() ? strategy.getReadahead() : null;
		return new CachingStrategy(dropBehind, readahead);
	}

	// Sometimes, creating a BlockReciver is accompanied by a failure of the DURefreshThread (du: cannot access error)
	// which lead to expected shutdown of the connection. another attempt to create the BlockRevicer should prevent this shutdown.
	// For more info see HADOOP-8640.
	private void createBlockReciver(DataInputStream in, int attempts) throws NoSuchFieldException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, IOException {
		try {
			blockReceiver = new R4HBlockReceiver(spw.getIOBufferSupplier(), oprHeader, in, serverSession.toString(), dnBridge, ioExecutor,
			        msgCallbacks);
		} catch (IOException e) {
			attempts--;
			LOG.warn(String.format("Got exception in BlockReceiver constructor - %d attempts remaining", attempts), e);
			if (attempts <= 0) {
				LOG.error("Failed on BlockReceiver creation, no attempts remaining");
				throw e;
			} else {
				createBlockReciver(in, attempts);
			}
		}
	}

	abstract void parseOpWriteBlock(DataInputStream in) throws IOException;

	abstract void senderWriteBlock(DataOutputStream out, ExtendedBlock origBlk) throws IOException;
}
