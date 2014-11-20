/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mellanox.r4h;

import static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status.SUCCESS;

import java.io.BufferedOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.fs.CreateFlag;
import org.apache.hadoop.fs.FSOutputSummer;
import org.apache.hadoop.fs.FileAlreadyExistsException;
import org.apache.hadoop.fs.ParentNotDirectoryException;
import org.apache.hadoop.fs.Syncable;
import org.apache.hadoop.fs.UnresolvedLinkException;
import org.apache.hadoop.fs.permission.FsPermission;
import org.apache.hadoop.hdfs.DFSConfigKeys;
import org.apache.hadoop.hdfs.client.HdfsDataOutputStream;
import org.apache.hadoop.hdfs.protocol.DSQuotaExceededException;
import org.apache.hadoop.hdfs.protocol.DatanodeInfo;
import org.apache.hadoop.hdfs.protocol.ExtendedBlock;
import org.apache.hadoop.hdfs.protocol.HdfsConstants;
import org.apache.hadoop.hdfs.protocol.HdfsFileStatus;
import org.apache.hadoop.hdfs.protocol.HdfsProtoUtil;
import org.apache.hadoop.hdfs.protocol.LocatedBlock;
import org.apache.hadoop.hdfs.protocol.NSQuotaExceededException;
import org.apache.hadoop.hdfs.protocol.UnresolvedPathException;
import org.apache.hadoop.hdfs.protocol.datatransfer.BlockConstructionStage;
import org.apache.hadoop.hdfs.protocol.datatransfer.DataTransferEncryptor;
import org.apache.hadoop.hdfs.protocol.datatransfer.DataTransferProtocol;
import org.apache.hadoop.hdfs.protocol.datatransfer.IOStreamPair;
import org.apache.hadoop.hdfs.protocol.datatransfer.InvalidEncryptionKeyException;
import org.apache.hadoop.hdfs.protocol.datatransfer.PacketHeader;
import org.apache.hadoop.hdfs.protocol.datatransfer.PipelineAck;
import org.apache.hadoop.hdfs.protocol.datatransfer.Sender;
import org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BlockOpResponseProto;
import org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status;
import org.apache.hadoop.hdfs.security.token.block.BlockTokenIdentifier;
import org.apache.hadoop.hdfs.security.token.block.InvalidBlockTokenException;
import org.apache.hadoop.hdfs.server.namenode.NotReplicatedYetException;
import org.apache.hadoop.hdfs.server.namenode.SafeModeException;
import org.apache.hadoop.hdfs.server.namenode.UnsupportedActionException;
import org.apache.hadoop.io.EnumSetWritable;
import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.ipc.RemoteException;
import org.apache.hadoop.net.NetUtils;
import org.apache.hadoop.record.Utils;
import org.apache.hadoop.security.AccessControlException;
import org.apache.hadoop.security.token.Token;
import org.apache.hadoop.util.Daemon;
import org.apache.hadoop.util.DataChecksum;
import org.apache.hadoop.util.Progressable;
import org.apache.hadoop.util.StringUtils;
import org.apache.hadoop.util.Time;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.cache.RemovalListener;
import com.google.common.cache.RemovalNotification;
import org.accelio.jxio.ClientSession;
import org.accelio.jxio.EventName;
import org.accelio.jxio.EventReason;
import org.accelio.jxio.Msg;
import org.accelio.jxio.MsgPool;

/****************************************************************
 * DFSOutputStream creates files from a stream of bytes.
 * 
 * The client application writes data that is cached internally by
 * this stream. Data is broken up into packets, each packet is
 * typically 64K in size. A packet comprises of chunks. Each chunk
 * is typically 512 bytes and has an associated checksum with it.
 * 
 * When a client application fills up the currentPacket, it is
 * enqueued into dataQueue. The DataStreamer thread picks up
 * packets from the dataQueue, sends it to the first datanode in
 * the pipeline and moves it from the dataQueue to the ackQueue.
 * The ResponseProcessor receives acks from the datanodes. When an
 * successful ack for a packet is received from all datanodes, the
 * ResponseProcessor removes the corresponding packet from the
 * ackQueue.
 * 
 * In case of error, all outstanding packets and moved from
 * ackQueue. A new pipeline is setup by eliminating the bad
 * datanode from the original pipeline. The DataStreamer now
 * starts sending packets from the dataQueue.
 ****************************************************************/
@InterfaceAudience.Private
public class DFSOutputStream extends FSOutputSummer implements Syncable {
	// RDFS stuff from here.
	private static final Log LOG = LogFactory.getLog(DFSOutputStream.class);
	private static boolean toPrintBreakdown = false;
	private static long lastOperationTS = 0;
	private Object lastOperationTSLock = new Object();

	private boolean toEnablePcktHist = false;
	private Hashtable<Long, Long> insertTimes = new Hashtable<Long, Long>();
	private Hashtable<Long, Long> fetchTimes = new Hashtable<Long, Long>();

	// Packet-resolution profiling
	private boolean toProfilePacketsRT = false;
	private Hashtable<Long, Long> packetsStats = new Hashtable<Long, Long>();
	public Hashtable<Long, Long> packetsArrivedStats = new Hashtable<Long, Long>();
	private Hashtable<Long, Long> packetsStreamerProcessTimeMicro = new Hashtable<Long, Long>();

	// The client session. A new client session is created per block.
	private ClientSession clientSession;
	// The event queue handler. We have only one such, and reuse it for all blocks.
	private R4HEventHandler eventQHandler = new R4HEventHandler(null, true);
	// The name of next DN node we're talking to (we hold it here for logging purposes only).
	private String nextDnName;
	// The message pool that is used for connection to data nodes.
	private MsgPool msgPool = null;
	// First reply comes always from the header. Later replies come from messages. So this is a one-way flag.
	private boolean isHeaderAck = true;
	// *R4H* The pipe status, moved here following other changes.
	private Status pipelineStatus = SUCCESS;
	// Current status of reply from next DN.
	private boolean currResult = false;
	// Was there block header failure?
	private boolean didHeaderFail = true;
	// The sequence number of the current message being SENT (excluding the header).
	private long sentSeqenceNum = -1;
	// Whether got ack for last packet in block.
	private boolean wasLastPacketAcked = false;
	// How many times we would like to try the given pipeline before starting excluding datanodes one by one.
	private final int NUM_OF_RETRIES_BEFORE_ABANDON = 3;
	// Is used to ensure we get session close event in the end of last block.
	private boolean wasLastSessionClosed = false;

	private ConcurrentLinkedQueue<Packet> dataQueue = new ConcurrentLinkedQueue<Packet>();
	private ConcurrentLinkedQueue<Packet> ackQueue = new ConcurrentLinkedQueue<Packet>();

	private String name; // used as the toString value
	private final DFSClient dfsClient;
	private static final int MAX_PACKETS = 80; // each packet 64K, total 5MB
	private Socket s;
	// closed is accessed by different threads under different locks.
	private volatile boolean closed = false;

	private String src;
	private final long blockSize;
	private final DataChecksum checksum;

	private Packet currentPacket = null;
	private DataStreamer streamer;
	private long currentSeqno = 0;
	private long lastQueuedSeqno = -1;
	private long lastAckedSeqno = -1;
	private long bytesCurBlock = 0; // bytes writen in current block
	private int packetSize = 0; // write packet size, not including the header.
	private int chunksPerPacket = 0;
	private volatile IOException lastException = null;
	private long artificialSlowdown = 0;
	private long lastFlushOffset = 0; // offset when flush was invoked
	// persist blocks on namenode
	private final AtomicBoolean persistBlocks = new AtomicBoolean(false);
	private volatile boolean appendChunk = false; // appending to existing partial block
	private long initialFileSize = 0; // at time of file open
	private Progressable progress;
	private final short blockReplication; // replication factor of file
	private boolean shouldSyncBlock = false; // force blocks to disk upon close

	private class Packet {
		long seqno; // sequencenumber of buffer in block
		long offsetInBlock; // offset in block
		private boolean lastPacketInBlock; // is this the last packet in block?
		boolean syncBlock; // this packet forces the current block to disk
		int numChunks; // number of chunks currently in packet
		int maxChunks; // max chunks in packet

		// byte[] buf;

		/**
		 * buf is pointed into like follows:
		 * (C is checksum data, D is payload data)
		 * 
		 * [_________CCCCCCCCC________________DDDDDDDDDDDDDDDD___]
		 * ^ ^ ^ ^
		 * | checksumPos dataStart dataPos
		 * checksumStart
		 * 
		 * Right before sending, we move the checksum data to immediately precede
		 * the actual data, and then insert the header into the buffer immediately
		 * preceding the checksum data, so we make sure to keep enough space in
		 * front of the checksum data to support the largest conceivable header.
		 */
		int checksumStart;
		int checksumPos;
		int dataStart;
		int dataPos;
		private Msg msg;
		private ByteBuffer byteBuff;

		private static final long HEART_BEAT_SEQNO = -1L;

		/**
		 * Create a heartbeat packet.
		 */
		Packet() {
			this.lastPacketInBlock = false;
			this.numChunks = 0;
			this.offsetInBlock = 0;
			this.seqno = HEART_BEAT_SEQNO;

			// buf = new byte[PacketHeader.PKT_MAX_HEADER_LEN];
			msg = DFSOutputStream.this.getMsg();

			checksumStart = checksumPos = dataPos = dataStart = PacketHeader.PKT_MAX_HEADER_LEN;
			maxChunks = 0;
		}

		/**
		 * Create a new packet.
		 * 
		 * @param pktSize
		 *            maximum size of the packet, including checksum data and actual data.
		 * @param chunksPerPkt
		 *            maximum number of chunks per packet.
		 * @param offsetInBlock
		 *            offset in bytes into the HDFS block.
		 */
		Packet(int pktSize, int chunksPerPkt, long offsetInBlock) {
			this.lastPacketInBlock = false;
			this.numChunks = 0;
			this.offsetInBlock = offsetInBlock;
			this.seqno = currentSeqno;
			currentSeqno++;

			// buf = new byte[PacketHeader.PKT_MAX_HEADER_LEN + pktSize];
			msg = DFSOutputStream.this.getMsg();
			byteBuff = msg.getOut();
			byteBuff.clear();
			checksumStart = PacketHeader.PKT_MAX_HEADER_LEN;
			checksumPos = checksumStart;
			dataStart = checksumStart + (chunksPerPkt * checksum.getChecksumSize());
			dataPos = dataStart;
			maxChunks = chunksPerPkt;
		}

		void writeData(byte[] inarray, int off, int len) {
			if (dataPos + len > byteBuff.capacity()) {
				throw new BufferOverflowException();
			}
			// System.arraycopy(inarray, off, buf, dataPos, len);
			byteBuff.position(dataPos);
			byteBuff.put(inarray, off, len);
			dataPos += len;
		}

		void writeChecksum(byte[] inarray, int off, int len) {
			if (checksumPos + len > dataStart) {
				throw new BufferOverflowException();
			}
			// System.arraycopy(inarray, off, buf, checksumPos, len);
			byteBuff.position(checksumPos);
			byteBuff.put(inarray, off, len);
			checksumPos += len;
		}

		void prepareBeforeSend() throws IOException {
			final int dataLen = dataPos - dataStart;
			final int checksumLen = checksumPos - checksumStart;
			final int pktLen = HdfsConstants.BYTES_IN_INTEGER + dataLen + checksumLen;

			PacketHeader header = new PacketHeader(pktLen, offsetInBlock, seqno, lastPacketInBlock, dataLen, syncBlock);

			if (checksumPos != dataStart) {
				// Move the checksum to cover the gap. This can happen for the last
				// packet or during an hflush/hsync call.

				// System.arraycopy(buf, checksumStart, buf, dataStart - checksumLen, checksumLen);

				byte[] csBuff = new byte[checksumLen];
				byteBuff.position(checksumStart);
				byteBuff.get(csBuff);
				byteBuff.position(dataStart - checksumLen);
				byteBuff.put(csBuff);

				checksumPos = dataStart;
				checksumStart = checksumPos - checksumLen;

			}

			final int headerStart = checksumStart - header.getSerializedSize();
			assert checksumStart + 1 >= header.getSerializedSize();
			assert checksumPos == dataStart;
			assert headerStart >= 0;
			assert headerStart + header.getSerializedSize() == checksumStart;

			// Copy the header data into the buffer immediately preceding the checksum
			// data.
			// System.arraycopy(header.getBytes(), 0, buf, headerStart, header.getSerializedSize());
			byteBuff.position(headerStart);
			byteBuff.put(header.getBytes(), 0, header.getSerializedSize());
			if (headerStart > 0) {
				byteBuff.position(0);
				DataOutput out = new DataOutputStream(new ByteBufferOutputStream(byteBuff));
				Utils.writeVInt(out, headerStart);
			}

			int sendLen = header.getSerializedSize() + checksumLen + dataLen + headerStart;

			// //############
			// byte[] tmp = new byte[sendLen];
			// byteBuff.clear();
			// byteBuff.position(headerStart);
			// byteBuff.get(tmp);
			// byteBuff.position(0);
			// byteBuff.put(tmp);
			// //##########

			byteBuff.position(sendLen);
		}

		// get the packet's last byte's offset in the block
		long getLastByteOffsetBlock() {
			return offsetInBlock + dataPos - dataStart;
		}

		/**
		 * Check if this packet is a heart beat packet
		 * 
		 * @return true if the sequence number is HEART_BEAT_SEQNO
		 */
		private boolean isHeartbeatPacket() {
			return seqno == HEART_BEAT_SEQNO;
		}

		@Override
		public String toString() {
			return "packet seqno:" + this.seqno + " offsetInBlock:" + this.offsetInBlock + " lastPacketInBlock:" + this.lastPacketInBlock
			        + " lastByteOffsetInBlock: " + this.getLastByteOffsetBlock();
		}
	}

	class CSCallbacks implements org.accelio.jxio.ClientSession.Callbacks {

		private long lastPacketArrived = 0;
		private long countPacketArrived = 0;
		private boolean wasSessionEstablished;
		private boolean closeEventExpected = false;

		@Override
		/**
		 * The callback upon receiving a reply for message sent previously.
		 * @param message
		 * 		The ack message. Contains also the originally sent message.
		 * @todo
		 * 		To make sure we catch all exceptions here inside. Alternatively, do this in all places where we do 
		 * 		eqh.runeventloop().
		 */
		public void onResponse(Msg message) {
			boolean wasMessageReturned = false;
			if (DFSOutputStream.LOG.isTraceEnabled()) {
				DFSOutputStream.LOG.trace("DFSClient got a reply message.");
			}

			message.getIn().clear();
			message.getOut().clear();

			do {
				if (isHeaderAck) {
					// Handle header ack:
					String firstBadLink = "";
					ByteBuffer msgBuf = message.getIn();

					// receive ack for connect
					BlockOpResponseProto resp = null;
					try {
						resp = BlockOpResponseProto.parseFrom(HdfsProtoUtil.vintPrefixed(new ByteBufferInputStream(msgBuf)));
					} catch (IOException e) {
						didHeaderFail = true;
						currResult = false;
						streamer.setLastException((IOException) e);
						DFSOutputStream.LOG.error(DFSOutputStream.this.toString() + "Got exception while parsing header: " + e);
						break;
					}
					pipelineStatus = resp.getStatus();
					firstBadLink = resp.getFirstBadLink();

					if (pipelineStatus != SUCCESS) {
						didHeaderFail = true;
						currResult = false;
						if (pipelineStatus == Status.ERROR_ACCESS_TOKEN) {
							streamer.setLastException(new InvalidBlockTokenException("Got access token error for connect ack with firstBadLink as "
							        + firstBadLink));
							DFSOutputStream.LOG.error(DFSOutputStream.this.toString() + "Got access token error for connect ack with firstBadLink as " + firstBadLink);
						} else {
							streamer.setLastException(new IOException("Bad connect ack with firstBadLink as " + firstBadLink));
							DFSOutputStream.LOG.error(DFSOutputStream.this.toString() + "Bad connect ack with firstBadLink as " + firstBadLink);
						}

					} else {
						if (DFSOutputStream.LOG.isDebugEnabled()) {
							DFSOutputStream.LOG.debug(DFSOutputStream.this.toString() + String.format("Got header ack and parsed it successfully"));
						}
						currResult = true;
						isHeaderAck = false;
						didHeaderFail = false;

						if (toPrintBreakdown) {
							long now = System.nanoTime();
							DFSOutputStream.LOG.info(DFSOutputStream.this.toString() + String.format("%.3f", (float) now / 1000000000.) + ", " + (now - lastOperationTS) / 1000000000.
							        + " : header ack was parsed successfully.");
							synchronized (lastOperationTSLock) {
								lastOperationTS = now;
							}
						}
					}
				} else {
					long now = System.nanoTime();
					long lastPacketDiff = (now - lastPacketArrived) / 1000;
					lastPacketArrived = now;

					if (DFSOutputStream.LOG.isTraceEnabled()) {
						DFSOutputStream.LOG.trace("Handling message ack...");
					}

					// Handle regular message ack:
					PipelineAck ack = new PipelineAck();

					try {
						// read an ack from the pipeline
						InputStream ackInputStream = new DataInputStream(new ByteBufferInputStream(message.getIn()));
						ack.readFields(ackInputStream);
						// // DEBUG
						// DFSOutputStream.LOG.info("DFSClient for block " + DFSOutputStream.this.streamer.block + " " + ack);
						// // DEBUG

						if (toProfilePacketsRT) {
							packetsArrivedStats.put(ack.getSeqno(), lastPacketDiff);
							Long key = new Long(ack.getSeqno());
							if (packetsStats.containsKey(key)) {
								long sentTime = packetsStats.get(key);
								long diff = (now - sentTime) / 1000;
								packetsStats.put(ack.getSeqno(), new Long(diff));
							}
						}

						if (DFSOutputStream.LOG.isDebugEnabled()) {
							DFSOutputStream.LOG.debug(DFSOutputStream.this.toString() + " - DFSClient for block " + DFSOutputStream.this.streamer.block + " " + ack);
						}
						// processes response status from all datanodes.
						for (int i = ack.getNumOfReplies() - 1; i >= 0 && dfsClient.clientRunning; i--) {
							Status reply = ack.getReply(i);
							if (reply != SUCCESS) {
								// Set first bad datanode
								String errorMsg = "Bad response " + reply + " for block " + DFSOutputStream.this.streamer.block + " from datanode ";
								if (i < DFSOutputStream.this.streamer.nodes.length) { // the usual and expected case
									streamer.errorIndex = i;
									errorMsg += DFSOutputStream.this.streamer.nodes[streamer.errorIndex].getName();
								} // the unexpected case
								else {
									// It's a lie, but this is the best lie we can think of ;)
									streamer.errorIndex = DFSOutputStream.this.streamer.nodes.length - 1;
									errorMsg += DFSOutputStream.this.streamer.nodes[streamer.errorIndex].getName() + ". Actually it was " + i
									        + "'s datanode.";
								}

								streamer.setLastException(new IOException(errorMsg));
								currResult = false;
								break;
							}
						}

						if (!currResult) {
							break;
						}

						long seqno = ack.getSeqno();

						if (seqno == Packet.HEART_BEAT_SEQNO) { // a heartbeat ack
							break;
						}

						PacketHeader sentPcktHeader = new PacketHeader();
						DataInput in = new DataInputStream(new ByteBufferInputStream(message.getOut()));
						int headerStart = Utils.readVInt(in);
						message.getOut().position(headerStart);
						sentPcktHeader.readFields(message.getOut());

						if (DFSOutputStream.LOG.isTraceEnabled()) {
							DFSOutputStream.LOG.trace(String.format("Received ack with seq #%d, last pckt in block:%b. Sent seq #%d", seqno,
							        sentPcktHeader.isLastPacketInBlock(), sentSeqenceNum));
						}

						Packet one = ackQueue.peek();

						if (one.seqno != seqno) {
							throw new IOException("PacketReply: Expecting seqno " + " for block " + DFSOutputStream.this.streamer.block + " "
							        + one.seqno + " but received " + seqno);
						}

						assert ack.getSeqno() == lastAckedSeqno + 1;
						lastAckedSeqno = ack.getSeqno();

						// update bytesAcked
						streamer.block.setNumBytes(one.getLastByteOffsetBlock());

						// Return used message to pool
						synchronized (DFSOutputStream.this.msgPool) {
							message.returnToParentPool();
						}
						wasMessageReturned = true;
						ackQueue.poll();

						// Check if this is ack for last message in block:
						if (sentPcktHeader.isLastPacketInBlock() && (seqno == sentSeqenceNum)) {
							// Got ack for last packet in block.
							wasLastPacketAcked = true;
							isHeaderAck = true;
							currResult = false; 
							if (toPrintBreakdown) {
								long now5 = System.nanoTime();
								DFSOutputStream.LOG.info(String.format("%.3f", (float) now5 / 1000000000.) + ", " + (now5 - lastOperationTS)
								        / 1000000000. + " : last packet in block ack was parsed successfully.");
								synchronized (lastOperationTSLock) {
									lastOperationTS = now5;
								}
							}
							closeEventExpected = true;
							clientSession.close();
							clientSession = null;
						}

						if (LOG.isDebugEnabled()) {
							if (wasLastPacketAcked) {
								LOG.debug("Got message ack and parsed it successfully. This was the last message in the block.");
							} else {
								LOG.debug("Got message ack and parsed it successfully.");
							}
						}

					} catch (Exception e) {
						DFSOutputStream.LOG.error(DFSOutputStream.this.toString() + "Got exception during processing of reply message: " + StringUtils.stringifyException(e));

						if (!closed) {
							DFSOutputStream.this.streamer.hasError = true;
							if (e instanceof IOException) {
								streamer.setLastException((IOException) e);
							}
							DFSOutputStream.LOG.error(DFSOutputStream.this.toString() + "DFSOutputStream onMsg exception " + " for block " + DFSOutputStream.this.streamer.block + e);
							closed = true;
						}
					}
				}
			} while (false);

			if (!wasMessageReturned) {
				synchronized (DFSOutputStream.this.msgPool) {
					message.returnToParentPool();
				}
			}
			synchronized (ackQueue) {
				ackQueue.notify();
			}
		}

		@Override
		/**
		 * @todo
		 * To make sure we catch all exceptions here inside. Alternatively, do this in all places where we do 
		 * eqh.runeventloop().
		 */
		public void onSessionEstablished() {
			wasSessionEstablished = true;
			if (toPrintBreakdown) {
				long now = System.nanoTime();
				DFSOutputStream.LOG.info(DFSOutputStream.this.toString() + String.format("%.3f", (float) now / 1000000000.) + ", " + (now - lastOperationTS) / 1000000000.
				        + " : Successfully established client session.");
				synchronized (lastOperationTSLock) {
					lastOperationTS = now;
				}
			} else {
				LOG.debug(DFSOutputStream.this.toString() + String.format("Successfully established client session on %s", DFSOutputStream.this.nextDnName));
			}
		}

		@Override
		/**
		 * @todo
		 * To make sure we catch all exceptions here inside. Alternatively, do this in all places where we do
		 * eqh.runeventloop().
		 */
		public void onSessionEvent(EventName session_event, EventReason reason) {
			switch (session_event) {
				case SESSION_CLOSED:
					wasLastSessionClosed = true;
					String logmsg = String.format("Client Session event=%s, reason=%s", session_event, reason);
					if (closeEventExpected) {
						if (DFSOutputStream.LOG.isDebugEnabled()) {
							DFSOutputStream.LOG.debug(DFSOutputStream.this.toString() + logmsg);
						}
					} else {
						DFSOutputStream.LOG.error(DFSOutputStream.this.toString() + logmsg);
					}
					break;
				case SESSION_ERROR:
				case SESSION_REJECT:
					if (isHeaderAck) {
						didHeaderFail = true;
						DFSOutputStream.LOG.error(DFSOutputStream.this.toString() + String.format(
						        "Session error occurred before header ack was received: session=%s, event=%s, reason=%s",
						        DFSOutputStream.this.clientSession, session_event, reason));
					} else {
						DFSOutputStream.LOG.error(DFSOutputStream.this.toString() + String.format("Session error occurred in the middle of the block: session=%s, event=%s, reason=%s",
						        DFSOutputStream.this.clientSession, session_event, reason));
					}
					// Break the event loop, returning the context to where the event loop was run originally
					DFSOutputStream.this.eventQHandler.breakEventLoop();
					// TODO: handle error!
					break;
				default:
					break;
			}
		}

		/**
		 * @param msg
		 * @param reason
		 */
		@Override
		public void onMsgError(Msg msg, EventReason reason) {
			msg.returnToParentPool();
			// TODO: this.close() ? - recover ?
			// TODO: set clientSession to null after closing it and check if null everywhere.
			// This will solve the bug when more than one message has error and so the client session is closed more than once.
			if (clientSession != null) {
				DFSOutputStream.LOG.error(DFSOutputStream.this.toString() + String.format("Msg error occurred: reason=%s, countPacketArrived=%d", reason, countPacketArrived));
				clientSession.close();
				clientSession = null;
				closeEventExpected = true;
			} else if (LOG.isDebugEnabled()) {
				DFSOutputStream.LOG.debug(DFSOutputStream.this.toString() + String.format("Msg error occurred: reason=%s, countPacketArrived=%d", reason, countPacketArrived));
			}
		}
	}

	//
	// The DataStreamer class is responsible for sending data packets to the
	// datanodes in the pipeline. It retrieves a new blockid and block locations
	// from the namenode, and starts streaming packets to the pipeline of
	// Datanodes. Every packet has a sequence number associated with
	// it. When all the packets for a block are sent out and acks for each
	// if them are received, the DataStreamer closes the current block.
	//
	class DataStreamer extends Daemon {
		private volatile boolean streamerClosed = false;
		private ExtendedBlock block; // its length is number of bytes acked
		private Token<BlockTokenIdentifier> accessToken;
		private DataOutputStream blockStream;
		private DataInputStream blockReplyStream;
		private volatile DatanodeInfo[] nodes = null; // list of targets for current block
		private LoadingCache<DatanodeInfo, DatanodeInfo> excludedNodes = CacheBuilder.newBuilder()
		        .expireAfterWrite(dfsClient.getConf().excludedNodesCacheExpiry, TimeUnit.MILLISECONDS)
		        .removalListener(new RemovalListener<DatanodeInfo, DatanodeInfo>() {
			        @Override
			        public void onRemoval(RemovalNotification<DatanodeInfo, DatanodeInfo> notification) {
				        DFSOutputStream.LOG.info("Removing node " + notification.getKey() + " from the excluded nodes list");
			        }
		        }).build(new CacheLoader<DatanodeInfo, DatanodeInfo>() {
			        @Override
			        public DatanodeInfo load(DatanodeInfo key) throws Exception {
				        return key;
			        }
		        });
		volatile boolean hasError = false;
		volatile int errorIndex = -1;
		private BlockConstructionStage stage; // block construction stage
		private long bytesSent = 0; // number of bytes that've been sent
		// The running index of how many times we tries to connect to existing pipe.
		private int triedBeforeAbandon = 0;

		/** Nodes have been used in the pipeline before and have failed. */
		private final List<DatanodeInfo> failed = new ArrayList<DatanodeInfo>();
		/** Has the current block been hflushed? */
		private boolean isHflushed = false;
		/** Append on an existing block? */
		private final boolean isAppend;

		/**
		 * Default construction for file create
		 */
		private DataStreamer() {
			isAppend = false;
			stage = BlockConstructionStage.PIPELINE_SETUP_CREATE;
		}

		/**
		 * Construct a data streamer for append
		 * 
		 * @param lastBlock
		 *            last block of the file to be appended
		 * @param stat
		 *            status of the file to be appended
		 * @param bytesPerChecksum
		 *            number of bytes per checksum
		 * @throws IOException
		 *             if error occurs
		 */
		private DataStreamer(LocatedBlock lastBlock, HdfsFileStatus stat, int bytesPerChecksum) throws IOException {
			isAppend = true;
			stage = BlockConstructionStage.PIPELINE_SETUP_APPEND;
			block = lastBlock.getBlock();
			bytesSent = block.getNumBytes();
			accessToken = lastBlock.getBlockToken();
			long usedInLastBlock = stat.getLen() % blockSize;
			int freeInLastBlock = (int) (blockSize - usedInLastBlock);

			// calculate the amount of free space in the pre-existing
			// last crc chunk
			int usedInCksum = (int) (stat.getLen() % bytesPerChecksum);
			int freeInCksum = bytesPerChecksum - usedInCksum;

			// if there is space in the last block, then we have to
			// append to that block
			if (freeInLastBlock == blockSize) {
				throw new IOException("The last block for file " + src + " is full.");
			}

			if (usedInCksum > 0 && freeInCksum > 0) {
				// if there is space in the last partial chunk, then
				// setup in such a way that the next packet will have only
				// one chunk that fills up the partial chunk.
				//
				computePacketChunkSize(0, freeInCksum);
				resetChecksumChunk(freeInCksum);
				appendChunk = true;
			} else {
				// if the remaining space in the block is smaller than
				// that expected size of of a packet, then create
				// smaller size packet.
				//
				computePacketChunkSize(Math.min(dfsClient.getConf().writePacketSize, freeInLastBlock), bytesPerChecksum);
			}

			// setup pipeline to append to the last block XXX retries??
			nodes = lastBlock.getLocations();
			errorIndex = -1; // no errors yet.
			if (nodes.length < 1) {
				throw new IOException("Unable to retrieve blocks locations " + " for last block " + block + "of file " + src);

			}
		}

		/**
		 * Initialize for data streaming
		 */
		private void initDataStreaming() {
			this.setName("DataStreamer for file " + src + " block " + block);
			stage = BlockConstructionStage.DATA_STREAMING;
		}

		private void endBlock() {
			if (DFSOutputStream.LOG.isDebugEnabled()) {
				DFSOutputStream.LOG.debug("Closing old block " + block);
			}
			this.setName("DataStreamer for file " + src);
			closeStream();
			nodes = null;
			stage = BlockConstructionStage.PIPELINE_SETUP_CREATE;
			// LOG.info("Successfully finished writing block " + block);
		}

		/*
		 * streamer thread is the only thread that opens streams to datanode,
		 * and closes them. Any error recovery is also done by this thread.
		 */
		@Override
		public void run() {
			boolean waslpib = false;
			if (LOG.isTraceEnabled()) {
				LOG.trace("Started running streamer.");
			}

			if (toPrintBreakdown) {
				long now2 = System.nanoTime();
				LOG.info(String.format("%.3f", (float) now2 / 1000000000.) + ", " + (now2 - lastOperationTS) / 1000000000. + " : Started streamer.");
				synchronized (lastOperationTSLock) {
					lastOperationTS = now2;
				}
			}

			long lastPacket = Time.now();
			final int ACK_Q_THRESHOLD_HIGH = R4HProtocol.MAX_SEND_PACKETS / 2;
			// TODO: probably bug of jxio/accelio jxclient got reply and therefor sends imidietly more requests while server didn;t got
			// message completion yet
			final int ACK_Q_THRESHOLD_LOW = ACK_Q_THRESHOLD_HIGH / 2;

			while (!streamerClosed && dfsClient.clientRunning) {

				Packet one = null;

				try {
					if (LOG.isTraceEnabled()) {
						LOG.trace("Entering streamer main loop...");
					}
					// process datanode IO errors if any
					boolean doSleep = false;
					if (hasError && errorIndex >= 0) {
						doSleep = processDatanodeError();
					}
					// wait for a packet to be sent.
					long now = System.nanoTime();

					if (LOG.isTraceEnabled()) {
						LOG.trace("Before streamer's inner while loop: |dataQ|=" + dataQueue.size() + ", |ackQ|=" + ackQueue.size());
						LOG.trace("streamerClosed:" + streamerClosed + ", hasError:" + hasError + ", dfsClient.clientRunning:"
						        + dfsClient.clientRunning + ", doSleep:" + doSleep);
					}

					DFSOutputStream.this.eventQHandler.setIgnoreBreak(true);
					while ((!streamerClosed && !hasError && dfsClient.clientRunning && ((dataQueue.isEmpty()) || (ackQueue.size() >= ACK_Q_THRESHOLD_HIGH)))
					        || doSleep) {

						now = System.nanoTime();
						int ackQSize = ackQueue.size();
						int eventsToProcess = ackQSize - ACK_Q_THRESHOLD_LOW;
						if ((eventsToProcess <= 0) && dataQueue.isEmpty()) {
							eventsToProcess = ackQSize;
						}

						if (eventsToProcess <= 0) {
							// dataQ&ackQ are empty - going to wait on 'runEventLoop' for user to insert new packet to dataQ and break the loop
							// eventsToProcess = 1;
							// DFSOutputStream.this.eventQHandler.setIgnoreBreak(false);
							synchronized (dataQueue) {
								if (dataQueue.isEmpty() && !streamerClosed && !hasError && dfsClient.clientRunning) {
									dataQueue.wait();
								}
							}
						} else {
							DFSOutputStream.this.eventQHandler.setIgnoreBreak(true);

							if (LOG.isTraceEnabled()) {
								LOG.trace("Going to run event loop indefinitely with " + eventsToProcess + " events to process.");
							}

							DFSOutputStream.this.eventQHandler.runEventLoop(eventsToProcess, 10 * 1000);
							// DFSOutputStream.this.eventQHandler.runEventLoop(eventsToProcess, -1); worked
							DFSOutputStream.this.eventQHandler.setIgnoreBreak(true);
							doSleep = false;
						}
					}

					if (streamerClosed || hasError || !dfsClient.clientRunning) {
						continue;
					}
					// get packet to be sent.
					if (!(dataQueue.isEmpty())) {
						one = dataQueue.peek(); // regular data packet
						if (toEnablePcktHist) {
							fetchTimes.put(one.seqno, System.nanoTime() / 1000);
						}

						if (LOG.isTraceEnabled()) {
							LOG.trace("Fetched a packet from dataQ.");
						}
					} else {
						// Do not send hb packt
						// one = new Packet(); // heartbeat packet
						continue;
					}

					assert one != null;

					if (LOG.isTraceEnabled()) {
						LOG.trace("Inside our streamer.run(), get new block");
					}
					// get new block from namenode.
					if (stage == BlockConstructionStage.PIPELINE_SETUP_CREATE) {
						if (LOG.isDebugEnabled()) {
							LOG.debug("Allocating new block");
						}

						if (toPrintBreakdown) {
							long now2 = System.nanoTime();
							LOG.info(String.format("%.3f", (float) now2 / 1000000000.) + ", " + (now2 - lastOperationTS) / 1000000000.
							        + " : Before call to nextBlockOutputStream.");
							synchronized (lastOperationTSLock) {
								lastOperationTS = now2;
							}
						}

						nodes = nextBlockOutputStream(src);
						initDataStreaming();
					} else if (stage == BlockConstructionStage.PIPELINE_SETUP_APPEND) {
						if (LOG.isDebugEnabled()) {
							LOG.debug("Append to block " + block);
						}
						setupPipelineForAppendOrRecovery();
						initDataStreaming();
					}

					long lastByteOffsetInBlock = one.getLastByteOffsetBlock();
					if (lastByteOffsetInBlock > blockSize) {
						throw new IOException("BlockSize " + blockSize + " is smaller than data size. " + " Offset of packet in block "
						        + lastByteOffsetInBlock + " Aborting file " + src);
					}

					// if (one.lastPacketInBlock) {
					// LOG.trace("Inside our streamer.run(), last packet in block");
					// // wait for all data packets have been successfully acked
					// while (!streamerClosed && !hasError && ackQueue.size() != 0 && dfsClient.clientRunning) {
					// try {
					// // wait for acks to arrive from datanodes
					// synchronized (dataQueue) {
					// dataQueue.wait(1000);
					// }
					// LOG.trace("Waited on dataQ for 1 sec, |dataQ|=" + dataQueue.size() + ", |ackQ|=" + ackQueue.size());
					// } catch (InterruptedException e) {
					// }
					// }
					//
					// if (streamerClosed || hasError || !dfsClient.clientRunning) {
					// continue;
					// }
					// stage = BlockConstructionStage.PIPELINE_CLOSE;
					// }

					if (LOG.isDebugEnabled()) {
						LOG.debug(DFSOutputStream.this.toString() + " - DataStreamer block " + block + " sending packet " + one);
					}

					// write out data to remote datanode
					// try {
					if (LOG.isTraceEnabled()) {
						LOG.trace("Inside our streamer.run(), send packt to DN");
					}

					long now0 = System.nanoTime();
					// Msg message = DFSOutputStream.this.msgPool.getMsg();
					// blockStream = new DataOutputStream(new BufferedOutputStream(new ByteBufferOutputStream(message.getOut()), 512));
					// one.writeTo(blockStream);

					// send the request
					// new Sender(blockStream).writeBlock(block, accessToken, dfsClient.clientName, nodes, null,
					// stage, nodes.length, block.getNumBytes(), bytesSent, 0L, checksum);
					// blockStream.flush();
					long now1 = System.nanoTime();
					one.prepareBeforeSend();
					DFSOutputStream.this.clientSession.sendRequest(one.msg);
					long now2 = System.nanoTime();
					sentSeqenceNum++;

					if (toProfilePacketsRT) {
						// Calc stats for packets wait time:
						packetsStats.put(new Long(one.seqno), now2);
						packetsStreamerProcessTimeMicro.put(new Long(one.seqno), (now1 - now0) / 1000);
					}

					// sent the packet, handle the queues:
					if (LOG.isTraceEnabled()) {
						LOG.trace("Inside our streamer.run(), move packt from dataQ to ackQ");
						LOG.trace("Before move: |dataQ|=" + dataQueue.size() + ", |ackQ|=" + ackQueue.size());
					}
					// move packet from dataQueue to ackQueue
					if (!one.isHeartbeatPacket()) {
						dataQueue.poll();
						ackQueue.add(one);
						synchronized (dataQueue) {
							dataQueue.notifyAll();
						}
					}

					// } catch (IOException e) {
					// // HDFS-3398 treat primary DN is down since client is unable to
					// // write to primary DN
					// errorIndex = 0;
					// throw e;
					// }
					lastPacket = Time.now();

					if (one.isHeartbeatPacket()) { // heartbeat packet
						LOG.warn(DFSOutputStream.this.toString() + "Unexpectedly bumped into heartbeat packet.");
					}

					// update bytesSent
					long tmpBytesSent = one.getLastByteOffsetBlock();
					if (bytesSent < tmpBytesSent) {
						bytesSent = tmpBytesSent;
					}

					if (streamerClosed || hasError || !dfsClient.clientRunning) {
						continue;
					}

					// Is this block full?
					if (one.lastPacketInBlock) {
						// wait for the close packet has been acked

						while (!hasError && !wasLastPacketAcked && dfsClient.clientRunning) {
							// DFSOutputStream.this.eventQHandler.runEventLoop(1, 100 * 1000);
							DFSOutputStream.this.eventQHandler.runEventLoop(1, 1);
						}
						waslpib = wasLastPacketAcked;
						wasLastPacketAcked = false; // reset for next block
						stage = BlockConstructionStage.PIPELINE_CLOSE;
						// Prev orig code
						// while (!streamerClosed && !hasError && ackQueue.size() != 0 && dfsClient.clientRunning) {
						// synchronized (dataQueue) {
						// dataQueue.wait(1000);// wait for acks to arrive from datanodes
						// }
						// }

						if (streamerClosed || hasError || !dfsClient.clientRunning) {
							continue;
						}

						endBlock();
					}

				} catch (Throwable e) {
					LOG.fatal("DataStreamer Exception: " + StringUtils.stringifyException(e));
					if (e instanceof IOException) {
						setLastException((IOException) e);
					}
					hasError = true;
					if (errorIndex == -1) { // not a datanode error
						streamerClosed = true;
					}
				}
			}
			closeInternal();
		}

		private void closeInternal() {
			if (!wasLastSessionClosed) {
				DFSOutputStream.this.eventQHandler.runEventLoop(1, 1000000);
				if (!wasLastSessionClosed) {
					LOG.error("Did not receive client session closed event. Closing EQH anyway and then continuing close sequence.");
				}
			}
			DFSOutputStream.this.eventQHandler.close();
			closeStream();
			streamerClosed = true;
			closed = true;
			synchronized (dataQueue) {
				dataQueue.notifyAll();
			}
		}

		/*
		 * close both streamer and DFSOutputStream, should be called only
		 * by an external thread and only after all data to be sent has
		 * been flushed to datanode.
		 * 
		 * Interrupt this data streamer if force is true
		 * 
		 * @param force if this data stream is forced to be closed
		 */
		void close(boolean force) {
			streamerClosed = true;
			synchronized (dataQueue) {
				dataQueue.notifyAll();
			}
			if (force) {
				this.interrupt();
			}
		}

		private void closeStream() {
			if (blockStream != null) {
				try {
					blockStream.close();
				} catch (IOException e) {
					setLastException(e);
				} finally {
					blockStream = null;
				}
			}
			if (blockReplyStream != null) {
				try {
					blockReplyStream.close();
				} catch (IOException e) {
					setLastException(e);
				} finally {
					blockReplyStream = null;
				}
			}
			if (null != s) {
				try {
					s.close();
				} catch (IOException e) {
					setLastException(e);
				} finally {
					s = null;
				}
			}
		}

		// If this stream has encountered any errors so far, shutdown
		// threads and mark stream as closed. Returns true if we should
		// sleep for a while after returning from this call.
		//
		private boolean processDatanodeError() throws IOException {
			closeStream();

			// move packets from ack queue to front of the data queue
			dataQueue.addAll(ackQueue);
			ackQueue.clear();

			boolean doSleep = setupPipelineForAppendOrRecovery();

			if (!streamerClosed && dfsClient.clientRunning) {
				if (stage == BlockConstructionStage.PIPELINE_CLOSE) {

					// If we had an error while closing the pipeline, we go through a fast-path
					// where the BlockReceiver does not run. Instead, the DataNode just finalizes
					// the block immediately during the 'connect ack' process. So, we want to pull
					// the end-of-block packet from the dataQueue, since we don't actually have
					// a true pipeline to send it over.
					//
					// We also need to set lastAckedSeqno to the end-of-block Packet's seqno, so that
					// a client waiting on close() will be aware that the flush finished.
					// assert dataQueue.size() == 1;
					Packet endOfBlockPacket = dataQueue.remove(); // remove the end of block packet
					assert endOfBlockPacket.lastPacketInBlock;
					assert lastAckedSeqno == endOfBlockPacket.seqno - 1;
					lastAckedSeqno = endOfBlockPacket.seqno;
					synchronized (dataQueue) {
						dataQueue.notifyAll();
					}
					endBlock();
				} else {
					initDataStreaming();
				}
			}

			return doSleep;
		}

		private void setHflush() {
			isHflushed = true;
		}

		private int findNewDatanode(final DatanodeInfo[] original) throws IOException {
			if (nodes.length != original.length + 1) {
				throw new IOException("Failed to add a datanode.  " + "User may turn off this feature by setting "
				        + DFSConfigKeys.DFS_CLIENT_WRITE_REPLACE_DATANODE_ON_FAILURE_POLICY_KEY + " in configuration, where the current policy is "
				        + dfsClient.dtpReplaceDatanodeOnFailure + ".  (Nodes: current=" + Arrays.asList(nodes) + ", original="
				        + Arrays.asList(original) + ")");
			}
			for (int i = 0; i < nodes.length; i++) {
				int j = 0;
				for (; j < original.length && !nodes[i].equals(original[j]); j++)
					;
				if (j == original.length) {
					return i;
				}
			}
			throw new IOException("Failed: new datanode not found: nodes=" + Arrays.asList(nodes) + ", original=" + Arrays.asList(original));
		}

		private void addDatanode2ExistingPipeline() throws IOException {
			if (DataTransferProtocol.LOG.isDebugEnabled()) {
				DataTransferProtocol.LOG.debug("lastAckedSeqno = " + lastAckedSeqno);
			}
			/*
			 * Is data transfer necessary? We have the following cases.
			 * 
			 * Case 1: Failure in Pipeline Setup
			 * - Append
			 * + Transfer the stored replica, which may be a RBW or a finalized.
			 * - Create
			 * + If no data, then no transfer is required.
			 * + If there are data written, transfer RBW. This case may happens
			 * when there are streaming failure earlier in this pipeline.
			 * 
			 * Case 2: Failure in Streaming
			 * - Append/Create:
			 * + transfer RBW
			 * 
			 * Case 3: Failure in Close
			 * - Append/Create:
			 * + no transfer, let NameNode replicates the block.
			 */
			if (!isAppend && lastAckedSeqno < 0 && stage == BlockConstructionStage.PIPELINE_SETUP_CREATE) {
				// no data have been written
				return;
			} else if (stage == BlockConstructionStage.PIPELINE_CLOSE || stage == BlockConstructionStage.PIPELINE_CLOSE_RECOVERY) {
				// pipeline is closing
				return;
			}

			// get a new datanode
			final DatanodeInfo[] original = nodes;
			final LocatedBlock lb = dfsClient.namenode.getAdditionalDatanode(src, block, nodes, failed.toArray(new DatanodeInfo[failed.size()]), 1,
			        dfsClient.clientName);
			nodes = lb.getLocations();

			// find the new datanode
			final int d = findNewDatanode(original);

			// transfer replica
			final DatanodeInfo src = d == 0 ? nodes[1] : nodes[d - 1];
			final DatanodeInfo[] targets = { nodes[d] };
			transfer(src, targets, lb.getBlockToken());
		}

		private void transfer(final DatanodeInfo src, final DatanodeInfo[] targets, final Token<BlockTokenIdentifier> blockToken) throws IOException {
			// transfer replica to the new datanode
			Socket sock = null;
			DataOutputStream out = null;
			DataInputStream in = null;
			try {
				final long writeTimeout = dfsClient.getDatanodeWriteTimeout(2);

				OutputStream unbufOut = NetUtils.getOutputStream(sock, writeTimeout);
				InputStream unbufIn = NetUtils.getInputStream(sock);
				if (dfsClient.shouldEncryptData()) {
					IOStreamPair encryptedStreams = DataTransferEncryptor.getEncryptedStreams(unbufOut, unbufIn, dfsClient.getDataEncryptionKey());
					unbufOut = encryptedStreams.out;
					unbufIn = encryptedStreams.in;
				}
				out = new DataOutputStream(new BufferedOutputStream(unbufOut, HdfsConstants.SMALL_BUFFER_SIZE));
				in = new DataInputStream(unbufIn);

				// send the TRANSFER_BLOCK request
				new Sender(out).transferBlock(block, blockToken, dfsClient.clientName, targets);
				out.flush();

				// ack
				BlockOpResponseProto response = BlockOpResponseProto.parseFrom(HdfsProtoUtil.vintPrefixed(in));
				if (SUCCESS != response.getStatus()) {
					throw new IOException("Failed to add a datanode");
				}
			} finally {
				IOUtils.closeStream(in);
				IOUtils.closeStream(out);
				IOUtils.closeSocket(sock);
			}
		}

		/**
		 * Open a DataOutputStream to a DataNode pipeline so that
		 * it can be written to.
		 * This happens when a file is appended or data streaming fails
		 * It keeps on trying until a pipeline is setup
		 */
		private boolean setupPipelineForAppendOrRecovery() throws IOException {
			// check number of datanodes
			if (nodes == null || nodes.length == 0) {
				String msg = "Could not get block locations. " + "Source file \"" + src + "\" - Aborting...";
				DFSOutputStream.LOG.warn(DFSOutputStream.this.toString() + msg);
				setLastException(new IOException(msg));
				streamerClosed = true;
				return false;
			}

			boolean success = false;
			long newGS = 0L;
			while (!success && !streamerClosed && dfsClient.clientRunning) {
				boolean isRecovery = hasError;
				// remove bad datanode from list of datanodes.
				// If errorIndex was not set (i.e. appends), then do not remove
				// any datanodes
				//
				if (errorIndex >= 0) {
					StringBuilder pipelineMsg = new StringBuilder();
					for (int j = 0; j < nodes.length; j++) {
						pipelineMsg.append(nodes[j]);
						if (j < nodes.length - 1) {
							pipelineMsg.append(", ");
						}
					}
					if (nodes.length <= 1) {
						lastException = new IOException("All datanodes " + pipelineMsg + " are bad. Aborting...");
						streamerClosed = true;
						return false;
					}
					DFSOutputStream.LOG.warn(DFSOutputStream.this.toString() + "Error Recovery for block " + block + " in pipeline " + pipelineMsg + ": bad datanode "
					        + nodes[errorIndex]);
					failed.add(nodes[errorIndex]);

					DatanodeInfo[] newnodes = new DatanodeInfo[nodes.length - 1];
					System.arraycopy(nodes, 0, newnodes, 0, errorIndex);
					System.arraycopy(nodes, errorIndex + 1, newnodes, errorIndex, newnodes.length - errorIndex);
					nodes = newnodes;
					hasError = false;
					lastException = null;
					errorIndex = -1;
				}

				// Check if replace-datanode policy is satisfied.
				if (dfsClient.dtpReplaceDatanodeOnFailure.satisfy(blockReplication, nodes, isAppend, isHflushed)) {
					addDatanode2ExistingPipeline();
				}

				// get a new generation stamp and an access token
				LocatedBlock lb = dfsClient.namenode.updateBlockForPipeline(block, dfsClient.clientName);
				newGS = lb.getBlock().getGenerationStamp();
				accessToken = lb.getBlockToken();

				// set up the pipeline again with the remaining nodes
				success = createBlockOutputStream(nodes, newGS, isRecovery);
			}

			if (success) {
				// update pipeline at the namenode
				ExtendedBlock newBlock = new ExtendedBlock(block.getBlockPoolId(), block.getBlockId(), block.getNumBytes(), newGS);
				dfsClient.namenode.updatePipeline(dfsClient.clientName, block, newBlock, nodes);
				// update client side generation stamp
				block = newBlock;
			}
			return false; // do not sleep, continue processing
		}

		/**
		 * Open a DataOutputStream to a DataNode so that it can be written to.
		 * This happens when a file is created and each time a new block is allocated.
		 * Must get block ID and the IDs of the destinations from the namenode.
		 * Returns the list of target datanodes.
		 */
		private DatanodeInfo[] nextBlockOutputStream(String client) throws IOException {

			if (LOG.isTraceEnabled()) {
				LOG.trace("Entered nextBlockOutputStream");
			}

			LocatedBlock lb = null;
			DatanodeInfo[] nodes = null;
			int count = dfsClient.getConf().nBlockWriteRetry;
			boolean success = false;
			ExtendedBlock oldBlock = block;
			do {
				hasError = false;
				lastException = null;
				errorIndex = -1;
				success = false;

				long startTime = Time.now();
				DatanodeInfo[] excluded = excludedNodes.getAllPresent(excludedNodes.asMap().keySet()).keySet().toArray(new DatanodeInfo[0]);
				block = oldBlock;
				lb = locateFollowingBlock(startTime, excluded.length > 0 ? excluded : null);
				block = lb.getBlock();
				block.setNumBytes(0);
				accessToken = lb.getBlockToken();
				nodes = lb.getLocations();

				//
				// Connect to first DataNode in the list.
				//
				if (toPrintBreakdown) {
					long now2 = System.nanoTime();
					LOG.info(String.format("%.3f", (float) now2 / 1000000000.) + ", " + (now2 - lastOperationTS) / 1000000000.
					        + " : Before call to createBlockOutputStream.");
					synchronized (lastOperationTSLock) {
						lastOperationTS = now2;
					}
				}
				success = createBlockOutputStream(nodes, 0L, false);

				if (!success) {
					if (++triedBeforeAbandon >= NUM_OF_RETRIES_BEFORE_ABANDON) {
						DFSOutputStream.LOG.info(DFSOutputStream.this.toString() + " Abandoning " + block);
						dfsClient.namenode.abandonBlock(block, src, dfsClient.clientName);
						block = null;
						DFSOutputStream.LOG.info(DFSOutputStream.this.toString() + "Excluding datanode " + nodes[errorIndex]);
						excludedNodes.put(nodes[errorIndex], nodes[errorIndex]);
						triedBeforeAbandon = 0;
						--count;
					} else {
						DFSOutputStream.LOG.warn(DFSOutputStream.this.toString() + " Failed connecting to next DN in pipe ("
						        + nodes[0] + "), retry " + triedBeforeAbandon + " out of " + NUM_OF_RETRIES_BEFORE_ABANDON);
					}
				}
			} while (!success && count >= 0);

			if (!success) {
				throw new IOException("Unable to create new block.");
			}
			return nodes;
		}

		// connects to the first datanode in the pipeline
		// Returns true if success, otherwise return failure.
		//
		private boolean createBlockOutputStream(DatanodeInfo[] nodes, long newGS, boolean recoveryFlag) {

			if (LOG.isTraceEnabled()) {
				LOG.trace("Inside our createBlockOutputStream()");
			}

			Status pipelineStatus = SUCCESS;
			String firstBadLink = "";
			if (LOG.isDebugEnabled()) {
				for (int i = 0; i < nodes.length; i++) {
					LOG.debug("pipeline = " + nodes[i]);
				}
			}

			// persist blocks on namenode on next flush
			persistBlocks.set(true);

			int refetchEncryptionKey = 1;
			while (true) {
				boolean result = false;
				DataOutputStream out = null;
				try {
					assert null == blockReplyStream : "Previous blockReplyStream unclosed";
					long writeTimeout = dfsClient.getDatanodeWriteTimeout(nodes.length);

					DFSOutputStream.this.nextDnName = nodes[0].getName();
					CSCallbacks clientSessionCallbacks = new CSCallbacks();
					String hash = R4HProtocol.createSessionHash();
					DFSOutputStream.this.name = String.format("[hash=%s] ", hash);
					
					URI uri;
					try {
						uri = R4HProtocol.createInitialURI(nodes, hash);
					} catch (URISyntaxException e) {
						LOG.error(DFSOutputStream.this.toString() + "Failed on uri creation:" + e);
						return false;
					}

					if (toPrintBreakdown) {
						long now = System.nanoTime();
						LOG.info(DFSOutputStream.this.toString() + String.format("%.3f", (float) now / 1000000000.) + ", " + (now - lastOperationTS) / 1000000000.
						        + " : Going to establish client session.");
						synchronized (lastOperationTSLock) {
							lastOperationTS = now;
						}
					}

					// Close/Clean old session
					clientSessionCallbacks.wasSessionEstablished = false;
					clientSessionCallbacks.countPacketArrived = 0;
					if (DFSOutputStream.this.clientSession != null) {
    					clientSession.close();
    					clientSession = null;
					}
					
					if (LOG.isDebugEnabled()) {
						LOG.debug(DFSOutputStream.this.toString() + String.format("Connecting to %s", uri));
					}

					wasLastSessionClosed = false;
					DFSOutputStream.this.clientSession = new ClientSession(eventQHandler, uri, clientSessionCallbacks);
					// ****
					if (!clientSessionCallbacks.wasSessionEstablished) {
						DFSOutputStream.this.eventQHandler.runEventLoop(1, 1000);
					}
					// ****
					//
					// Xmit header info to datanode
					//
					Msg message = getMsg();
					out = new DataOutputStream(new BufferedOutputStream(new ByteBufferOutputStream(message.getOut()), 512));
					// ****
					if (!clientSessionCallbacks.wasSessionEstablished) {
						DFSOutputStream.this.eventQHandler.runEventLoop(1, 1000);
					}
					// ****

					if (toPrintBreakdown) {
						long now = System.nanoTime();
						LOG.info(String.format("%.3f", (float) now / 1000000000.) + ", " + (now - lastOperationTS) / 1000000000.
						        + " : After get msg from pool + new DOS.");
						synchronized (lastOperationTSLock) {
							lastOperationTS = now;
						}
					}

					if (dfsClient.shouldEncryptData()) {
						throw new UnsupportedActionException("Encryption is not supported yet in RDFS. Please disable it in conf.");
					}
					if (toPrintBreakdown) {
						long now = System.nanoTime();
						LOG.info(String.format("%.3f", (float) now / 1000000000.) + ", " + (now - lastOperationTS) / 1000000000.
						        + " : Going to write block with protoBuff.");
						synchronized (lastOperationTSLock) {
							lastOperationTS = now;
						}
					}

					// send the request
					new Sender(out).writeBlock(block, accessToken, dfsClient.clientName, nodes, null,
					        recoveryFlag ? stage.getRecoveryStage() : stage, nodes.length, block.getNumBytes(), bytesSent, newGS, checksum);

					if (toPrintBreakdown) {
						long now = System.nanoTime();
						LOG.info(String.format("%.3f", (float) now / 1000000000.) + ", " + (now - lastOperationTS) / 1000000000.
						        + " : After write block protobuf.");
						synchronized (lastOperationTSLock) {
							lastOperationTS = now;
						}
					}

					out.flush();
					// ****
					if (!clientSessionCallbacks.wasSessionEstablished) {
						DFSOutputStream.this.eventQHandler.runEventLoop(1, 1000);
					}
					// ****

					if (toPrintBreakdown) {
						long now = System.nanoTime();
						LOG.info(String.format("%.3f", (float) now / 1000000000.) + ", " + (now - lastOperationTS) / 1000000000.
						        + " : After protoBuff.flush , before sendMessage.");
						synchronized (lastOperationTSLock) {
							lastOperationTS = now;
						}
					}

					long now1 = System.nanoTime();
					DFSOutputStream.this.clientSession.sendRequest(message);
					long now2 = System.nanoTime();

					// if (toProfilePacketsRT) {
					// packetsStreamerProcessTimeMicro.put(new Long(-1), (now2 - now1) / 1000);
					// }
					// ****
					if (!clientSessionCallbacks.wasSessionEstablished) {
						DFSOutputStream.this.eventQHandler.runEventLoop(1, 1000);
					}
					// ****

					if (toPrintBreakdown) {
						long now = System.nanoTime();
						LOG.info(String.format("%.3f", (float) now / 1000000000.) + ", " + (now - lastOperationTS) / 1000000000.
						        + " : Sent header to datanode.");
						synchronized (lastOperationTSLock) {
							lastOperationTS = now;
						}
					}

					// Now we run the event queue handler. Ack/nack will be handled in the respective callbacks of the client
					// session. There we also will break the eqh, and then this function will return.
					// Do this in the end of this function, after sending out the header.
					// TODO To think whether use timeouts for error handling.
					final long startWaitingForAckTSMicro = System.nanoTime() / 1000;

					long loops = 0;
					long events = 0;
					while (isHeaderAck) {
						loops++;
						events += DFSOutputStream.this.eventQHandler.runEventLoop(1, -1);
					}

					if (DFSOutputStream.LOG.isDebugEnabled()) {
						final long headerAckTimeMicro = System.nanoTime() / 1000 - startWaitingForAckTSMicro;
						DFSOutputStream.LOG.debug(DFSOutputStream.this.toString()
						        + String.format("Header ACK duration=%d  (packets arrived=%d, nodes.len=%d, errorIndex=%d, events=%d, loops=%d)",
						                headerAckTimeMicro, clientSessionCallbacks.countPacketArrived, nodes.length, errorIndex, events, loops));
					}

					if (didHeaderFail) {
						DFSOutputStream.LOG.warn(DFSOutputStream.this.toString()
						        + String.format("Header failed (packets arrived=%d, nodes.len=%d, errorIndex=%d, lastRunEvLoopWait=%d)",
						                clientSessionCallbacks.countPacketArrived, nodes.length, errorIndex));
						currResult = false;
						// find the datanode that matches
						if (firstBadLink.length() != 0) {
							for (int i = 0; i < nodes.length; i++) {
								// NB: Unconditionally using the xfer addr w/o hostname
								if (firstBadLink.equals(nodes[i].getXferAddr())) {
									errorIndex = i;
									break;
								}
							}
						} else {
							errorIndex = 0;
						}
					}
					if (LOG.isDebugEnabled()) {
						LOG.debug(String.format("After waiting for header ACK: didHeaderFail=%S, currResult=%s, isHeaderAck=%s",
						        didHeaderFail ? "TRUE" : "FALSE", currResult ? "TRUE" : "FALSE", isHeaderAck ? "TRUE" : "FASLE"));
					}

					DFSOutputStream.LOG.debug(DFSOutputStream.this.toString() + String.format("createBlockOutputStream retunrs with: currResult=%b, isHeaderAck=%b", currResult, isHeaderAck));
					return currResult && !isHeaderAck; // TODO: clearify varibales names to be readable

				} catch (IOException ie) {
					LOG.info(DFSOutputStream.this.toString() + "Exception in createBlockOutputStream", ie);
					if (ie instanceof InvalidEncryptionKeyException && refetchEncryptionKey > 0) {
						LOG.info(DFSOutputStream.this.toString() + "Will fetch a new encryption key and retry, " + "encryption key was invalid when connecting to " + nodes[0] + " : "
						        + ie);
						// The encryption key used is invalid.
						refetchEncryptionKey--;
						dfsClient.clearDataEncryptionKey();
						// Don't close the socket/exclude this node just yet. Try again with
						// a new encryption key.
						continue;
					}

					// find the datanode that matches
					if (firstBadLink.length() != 0) {
						for (int i = 0; i < nodes.length; i++) {
							// NB: Unconditionally using the xfer addr w/o hostname
							if (firstBadLink.equals(nodes[i].getXferAddr())) {
								errorIndex = i;
								break;
							}
						}
					} else {
						errorIndex = 0;
					}
					hasError = true;
					setLastException(ie);
					result = false; // error
				} finally {
					if (!result) {
						IOUtils.closeStream(out);
						out = null;
						IOUtils.closeStream(blockReplyStream);
						blockReplyStream = null;
					}
				}
				if (DFSOutputStream.LOG.isDebugEnabled()) 
					DFSOutputStream.LOG.debug(DFSOutputStream.this.toString() + String.format("createBlockOutputStream returns with: result=%b)", result));
				return result;
			}
		}

		private LocatedBlock locateFollowingBlock(long start, DatanodeInfo[] excludedNodes) throws IOException, UnresolvedLinkException {
			int retries = dfsClient.getConf().nBlockWriteLocateFollowingRetry;
			long sleeptime = 400;
			while (true) {
				long localstart = Time.now();
				while (true) {
					try {
						return dfsClient.namenode.addBlock(src, dfsClient.clientName, block, excludedNodes);
					} catch (RemoteException e) {
						IOException ue = e.unwrapRemoteException(FileNotFoundException.class, AccessControlException.class,
						        NSQuotaExceededException.class, DSQuotaExceededException.class, UnresolvedPathException.class);
						if (ue != e) {
							throw ue; // no need to retry these exceptions
						}

						if (NotReplicatedYetException.class.getName().equals(e.getClassName())) {
							if (retries == 0) {
								throw e;
							} else {
								--retries;
								DFSOutputStream.LOG.info(DFSOutputStream.this.toString() + "Exception while adding a block", e);
								if (Time.now() - localstart > 5000) {
									DFSOutputStream.LOG.info(DFSOutputStream.this.toString() + "Waiting for replication for " + (Time.now() - localstart) / 1000 + " seconds");
								}
								try {
									DFSOutputStream.LOG.warn(DFSOutputStream.this.toString() + "NotReplicatedYetException sleeping " + src + " retries left " + retries);
									Thread.sleep(sleeptime);
									sleeptime *= 2;
								} catch (InterruptedException ie) {
								}
							}
						} else {
							throw e;
						}

					}
				}
			}
		}

		ExtendedBlock getBlock() {
			return block;
		}

		DatanodeInfo[] getNodes() {
			return nodes;
		}

		Token<BlockTokenIdentifier> getBlockToken() {
			return accessToken;
		}

		private void setLastException(IOException e) {
			if (lastException == null) {
				lastException = e;
			}
		}
	}

	protected void checkClosed() throws IOException {
		if (closed) {
			IOException e = lastException;
			throw e != null ? e : new ClosedChannelException();
		}
	}

	//
	// returns the list of targets, if any, that is being currently used.
	//
	@VisibleForTesting
	public synchronized DatanodeInfo[] getPipeline() {
		if (streamer == null) {
			return null;
		}
		DatanodeInfo[] currentNodes = streamer.getNodes();
		if (currentNodes == null) {
			return null;
		}
		DatanodeInfo[] value = new DatanodeInfo[currentNodes.length];
		for (int i = 0; i < currentNodes.length; i++) {
			value[i] = currentNodes[i];
		}
		return value;
	}
	
	public String toString() {
		return this.name;
	}

	protected DFSOutputStream(DFSClient dfsClient, String src, long blockSize, Progressable progress, DataChecksum checksum, short replication)
	        throws IOException {
		super(checksum, checksum.getBytesPerChecksum(), checksum.getChecksumSize());
		int bytesPerChecksum = checksum.getBytesPerChecksum();
		this.name = String.format("[hash=%X] ", DFSOutputStream.this.hashCode());
		this.dfsClient = dfsClient;
		this.src = src;
		this.blockSize = blockSize;
		this.blockReplication = replication;
		this.progress = progress;
		if ((progress != null) && DFSOutputStream.LOG.isDebugEnabled()) {
			DFSOutputStream.LOG.debug("Set non-null progress callback on DFSOutputStream " + src);
		}

		if (bytesPerChecksum < 1 || blockSize % bytesPerChecksum != 0) {
			throw new IOException("io.bytes.per.checksum(" + bytesPerChecksum + ") and blockSize(" + blockSize + ") do not match. "
			        + "blockSize should be a " + "multiple of io.bytes.per.checksum");

		}
		this.checksum = checksum;

		if (this.msgPool == null) {
			int poolNumOfMsgs = R4HProtocol.MAX_DATA_QUEUE_PACKETS + R4HProtocol.CLIENT_MSGPOOL_SPARE;
			int poolInSize = R4HProtocol.ACK_SIZE;
			int poolOutSize = dfsClient.getConf().getWritePacketSize() + R4HProtocol.JX_BUF_SPARE;

			if (LOG.isTraceEnabled()) {
				LOG.trace("Creating JXIO message pool with " + poolNumOfMsgs + " packets, in size " + poolInSize + ", out size " + poolOutSize);
			}

			this.msgPool = new MsgPool(poolNumOfMsgs, poolInSize, poolOutSize);

			if (LOG.isTraceEnabled()) {
				LOG.trace(DFSOutputStream.this.toString() + "Created msg pool: " + this.msgPool.toString());
			}
		}

		if (toPrintBreakdown) {
			long now = System.nanoTime();
			DFSOutputStream.LOG.info(String.format("%.3f", (float) now / 1000000000.) + ", " + (now - lastOperationTS) / 1000000000.
			        + " : DFSOutputStream constructed successfully.");
			synchronized (lastOperationTSLock) {
				lastOperationTS = now;
			}
			// } else {
			// LOG.info("Mellanox RDMA-accelerated DFSOutputStream constructed successfully.");
		}
	}

	/** Construct a new output stream for creating a file. */
	public DFSOutputStream(DFSClient dfsClient, String src, FsPermission masked, EnumSet<CreateFlag> flag, boolean createParent, short replication,
	        long blockSize, Progressable progress, int buffersize, DataChecksum checksum) throws IOException {
		this(dfsClient, src, blockSize, progress, checksum, replication);
		this.shouldSyncBlock = flag.contains(CreateFlag.SYNC_BLOCK);

		computePacketChunkSize(dfsClient.getConf().writePacketSize, checksum.getBytesPerChecksum());

		try {
			dfsClient.namenode.create(src, masked, dfsClient.clientName, new EnumSetWritable<CreateFlag>(flag), createParent, replication, blockSize);
		} catch (RemoteException re) {
			throw re.unwrapRemoteException(AccessControlException.class, DSQuotaExceededException.class, FileAlreadyExistsException.class,
			        FileNotFoundException.class, ParentNotDirectoryException.class, NSQuotaExceededException.class, SafeModeException.class,
			        UnresolvedPathException.class);
		}
		streamer = new DataStreamer();
	}

	static DFSOutputStream newStreamForCreate(DFSClient dfsClient, String src, FsPermission masked, EnumSet<CreateFlag> flag, boolean createParent,
	        short replication, long blockSize, Progressable progress, int buffersize, DataChecksum checksum) throws IOException {
		final DFSOutputStream out = new DFSOutputStream(dfsClient, src, masked, flag, createParent, replication, blockSize, progress, buffersize,
		        checksum);
		out.streamer.start();
		return out;
	}

	/** Construct a new output stream for append. */
	protected DFSOutputStream(DFSClient dfsClient, String src, int buffersize, Progressable progress, LocatedBlock lastBlock, HdfsFileStatus stat,
	        DataChecksum checksum) throws IOException {
		this(dfsClient, src, stat.getBlockSize(), progress, checksum, stat.getReplication());
		initialFileSize = stat.getLen(); // length of file when opened

		//
		// The last partial block of the file has to be filled.
		//
		if (lastBlock != null) {
			// indicate that we are appending to an existing block
			bytesCurBlock = lastBlock.getBlockSize();
			streamer = new DataStreamer(lastBlock, stat, checksum.getBytesPerChecksum());
		} else {
			computePacketChunkSize(dfsClient.getConf().writePacketSize, checksum.getBytesPerChecksum());
			streamer = new DataStreamer();
		}
	}

	static DFSOutputStream newStreamForAppend(DFSClient dfsClient, String src, int buffersize, Progressable progress, LocatedBlock lastBlock,
	        HdfsFileStatus stat, DataChecksum checksum) throws IOException {
		final DFSOutputStream out = new DFSOutputStream(dfsClient, src, buffersize, progress, lastBlock, stat, checksum);
		out.streamer.start();
		return out;
	}

	private void computePacketChunkSize(int psize, int csize) {
		int chunkSize = csize + checksum.getChecksumSize();
		chunksPerPacket = Math.max(psize / chunkSize, 1);
		packetSize = chunkSize * chunksPerPacket;
		if (DFSOutputStream.LOG.isDebugEnabled()) {
			DFSOutputStream.LOG.debug("computePacketChunkSize: src=" + src + ", chunkSize=" + chunkSize + ", chunksPerPacket=" + chunksPerPacket
			        + ", packetSize=" + packetSize);
		}
	}

	private void queueCurrentPacket() {
		if (currentPacket == null)
			return;

		dataQueue.add(currentPacket);

		if (toEnablePcktHist) {
			insertTimes.put(currentPacket.seqno, System.nanoTime() / 1000);
		}

		lastQueuedSeqno = currentPacket.seqno;
		if (DFSOutputStream.LOG.isDebugEnabled()) {
			DFSOutputStream.LOG.debug("Queued packet " + currentPacket.seqno);
		}
		currentPacket = null;
		synchronized (dataQueue) {
			dataQueue.notifyAll();
		}
		// this.eventQHandler.breakEventLoop();
	}

	private void waitAndQueueCurrentPacket() throws IOException {
		// If queue is full, then wait till we have enough space
		while (!closed && ((dataQueue.size() + ackQueue.size()) >= R4HProtocol.MAX_DATA_QUEUE_PACKETS)) {
			try {
				if (LOG.isTraceEnabled()) {
					LOG.trace("Going to wait on dataQ indefinitely...");
				}
				synchronized (dataQueue) {
					dataQueue.wait(10);
				}
			} catch (InterruptedException e) {
				// If we get interrupted while waiting to queue data, we still need to get rid
				// of the current packet. This is because we have an invariant that if
				// currentPacket gets full, it will get queued before the next writeChunk.
				//
				// Rather than wait around for space in the queue, we should instead try to
				// return to the caller as soon as possible, even though we slightly overrun
				// the MAX_PACKETS iength.
				LOG.info("DEBUG waitAndQueueCurrentPacket interuppted");
				Thread.currentThread().interrupt();
				break;
			}
		}
		checkClosed();
		queueCurrentPacket();
	}

	// @see FSOutputSummer#writeChunk()
	@Override
	protected synchronized void writeChunk(byte[] b, int offset, int len, byte[] checksum) throws IOException {
		dfsClient.checkOpen();
		checkClosed();

		int cklen = checksum.length;
		int bytesPerChecksum = this.checksum.getBytesPerChecksum();
		if (len > bytesPerChecksum) {
			throw new IOException("writeChunk() buffer size is " + len + " is larger than supported  bytesPerChecksum " + bytesPerChecksum);
		}
		if (checksum.length != this.checksum.getChecksumSize()) {
			throw new IOException("writeChunk() checksum size is supposed to be " + this.checksum.getChecksumSize() + " but found to be "
			        + checksum.length);
		}

		if (currentPacket == null) {
			currentPacket = new Packet(packetSize, chunksPerPacket, bytesCurBlock);
			if (DFSOutputStream.LOG.isDebugEnabled()) {
				DFSOutputStream.LOG.debug("DFSClient writeChunk allocating new packet seqno=" + currentPacket.seqno + ", src=" + src
				        + ", packetSize=" + packetSize + ", chunksPerPacket=" + chunksPerPacket + ", bytesCurBlock=" + bytesCurBlock);
			}
		}

		currentPacket.writeChecksum(checksum, 0, cklen);
		currentPacket.writeData(b, offset, len);
		currentPacket.numChunks++;
		bytesCurBlock += len;

		// If packet is full, enqueue it for transmission
		//
		if (currentPacket.numChunks == currentPacket.maxChunks || bytesCurBlock == blockSize) {
			if (DFSOutputStream.LOG.isDebugEnabled()) {
				DFSOutputStream.LOG.debug("DFSClient writeChunk packet full seqno=" + currentPacket.seqno + ", src=" + src + ", bytesCurBlock="
				        + bytesCurBlock + ", blockSize=" + blockSize + ", appendChunk=" + appendChunk);
			}
			waitAndQueueCurrentPacket();

			// If the reopened file did not end at chunk boundary and the above
			// write filled up its partial chunk. Tell the summer to generate full
			// crc chunks from now on.
			if (appendChunk && bytesCurBlock % bytesPerChecksum == 0) {
				appendChunk = false;
				resetChecksumChunk(bytesPerChecksum);
			}

			if (!appendChunk) {
				int psize = Math.min((int) (blockSize - bytesCurBlock), dfsClient.getConf().writePacketSize);
				computePacketChunkSize(psize, bytesPerChecksum);
			}
			//
			// if encountering a block boundary, send an empty packet to
			// indicate the end of block and reset bytesCurBlock.
			//
			if (bytesCurBlock == blockSize) {
				currentPacket = new Packet(0, 0, bytesCurBlock);
				currentPacket.lastPacketInBlock = true;
				currentPacket.syncBlock = shouldSyncBlock;
				waitAndQueueCurrentPacket();
				bytesCurBlock = 0;
				lastFlushOffset = 0;
			}
		}
	}

	@Override
	@Deprecated
	public void sync() throws IOException {
		hflush();
	}

	/**
	 * Flushes out to all replicas of the block. The data is in the buffers
	 * of the DNs but not necessarily in the DN's OS buffers.
	 * 
	 * It is a synchronous operation. When it returns,
	 * it guarantees that flushed data become visible to new readers.
	 * It is not guaranteed that data has been flushed to
	 * persistent store on the datanode.
	 * Block allocations are persisted on namenode.
	 */
	@Override
	public void hflush() throws IOException {
		flushOrSync(false);
	}

	/**
	 * The expected semantics is all data have flushed out to all replicas
	 * and all replicas have done posix fsync equivalent - ie the OS has
	 * flushed it to the disk device (but the disk may have it in its cache).
	 * 
	 * Note that only the current block is flushed to the disk device.
	 * To guarantee durable sync across block boundaries the stream should
	 * be created with {@link CreateFlag#SYNC_BLOCK}.
	 */
	@Override
	public void hsync() throws IOException {
		flushOrSync(true);
	}

	private void flushOrSync(boolean isSync) throws IOException {
		dfsClient.checkOpen();
		checkClosed();
		try {
			long toWaitFor;
			synchronized (this) {
				/*
				 * Record current blockOffset. This might be changed inside
				 * flushBuffer() where a partial checksum chunk might be flushed.
				 * After the flush, reset the bytesCurBlock back to its previous value,
				 * any partial checksum chunk will be sent now and in next packet.
				 */
				long saveOffset = bytesCurBlock;
				Packet oldCurrentPacket = currentPacket;
				// flush checksum buffer, but keep checksum buffer intact
				flushBuffer(true);
				// bytesCurBlock potentially incremented if there was buffered data

				if (DFSOutputStream.LOG.isDebugEnabled()) {
					DFSOutputStream.LOG.debug("DFSClient flush() : saveOffset " + saveOffset + " bytesCurBlock " + bytesCurBlock
					        + " lastFlushOffset " + lastFlushOffset);
				}
				// Flush only if we haven't already flushed till this offset.
				if (lastFlushOffset != bytesCurBlock) {
					assert bytesCurBlock > lastFlushOffset;
					// record the valid offset of this flush
					lastFlushOffset = bytesCurBlock;
					if (isSync && currentPacket == null) {
						// Nothing to send right now,
						// but sync was requested.
						// Send an empty packet
						currentPacket = new Packet(packetSize, chunksPerPacket, bytesCurBlock);
					}
				} else {
					// We already flushed up to this offset.
					// This means that we haven't written anything since the last flush
					// (or the beginning of the file). Hence, we should not have any
					// packet queued prior to this call, since the last flush set
					// currentPacket = null.
					assert oldCurrentPacket == null : "Empty flush should not occur with a currentPacket";

					if (isSync && bytesCurBlock > 0) {
						// Nothing to send right now,
						// and the block was partially written,
						// and sync was requested.
						// So send an empty sync packet.
						currentPacket = new Packet(packetSize, chunksPerPacket, bytesCurBlock);
					} else {
						// just discard the current packet since it is already been sent.
						currentPacket = null;
					}
				}
				if (currentPacket != null) {
					currentPacket.syncBlock = isSync;
					waitAndQueueCurrentPacket();
				}
				// Restore state of stream. Record the last flush offset
				// of the last full chunk that was flushed.
				//
				bytesCurBlock = saveOffset;
				toWaitFor = lastQueuedSeqno;
			} // end synchronized

			waitForAckedSeqno(toWaitFor);

			// If any new blocks were allocated since the last flush,
			// then persist block locations on namenode.
			//
			if (persistBlocks.getAndSet(false)) {
				try {
					dfsClient.namenode.fsync(src, dfsClient.clientName);
				} catch (IOException ioe) {
					LOG.warn(toString() + "Unable to persist blocks in hflush for " + src, ioe);
					// If we got an error here, it might be because some other thread called
					// close before our hflush completed. In that case, we should throw an
					// exception that the stream is closed.
					checkClosed();
					// If we aren't closed but failed to sync, we should expose that to the
					// caller.
					throw ioe;
				}
			}

			synchronized (this) {
				if (streamer != null) {
					streamer.setHflush();
				}
			}
		} catch (InterruptedIOException interrupt) {
			// This kind of error doesn't mean that the stream itself is broken - just the
			// flushing thread got interrupted. So, we shouldn't close down the writer,
			// but instead just propagate the error
			throw interrupt;
		} catch (IOException e) {
			LOG.warn(toString() + "Error while syncing", e);
			synchronized (this) {
				if (!closed) {
					lastException = new IOException("IOException flush:" + e);
					closeThreads(true);
				}
			}
			throw e;
		}
	}

	/**
	 * @deprecated use {@link HdfsDataOutputStream#getCurrentBlockReplication()}.
	 */
	@Deprecated
	public synchronized int getNumCurrentReplicas() throws IOException {
		return getCurrentBlockReplication();
	}

	/**
	 * Note that this is not a public API;
	 * use {@link HdfsDataOutputStream#getCurrentBlockReplication()} instead.
	 * 
	 * @return the number of valid replicas of the current block
	 */
	public synchronized int getCurrentBlockReplication() throws IOException {
		dfsClient.checkOpen();
		checkClosed();
		if (streamer == null) {
			return blockReplication; // no pipeline, return repl factor of file
		}
		DatanodeInfo[] currentNodes = streamer.getNodes();
		if (currentNodes == null) {
			return blockReplication; // no pipeline, return repl factor of file
		}
		return currentNodes.length;
	}

	/**
	 * Waits till all existing data is flushed and confirmations
	 * received from datanodes.
	 */
	private void flushInternal() throws IOException {
		long toWaitFor;
		synchronized (this) {
			dfsClient.checkOpen();
			checkClosed();
			//
			// If there is data in the current buffer, send it across
			//
			queueCurrentPacket();
			toWaitFor = lastQueuedSeqno;
		}

		waitForAckedSeqno(toWaitFor);
	}

	private void waitForAckedSeqno(long seqno) throws IOException {
		if (DFSOutputStream.LOG.isDebugEnabled()) {
			DFSOutputStream.LOG.debug("Waiting for ack for: " + seqno);
		}

		while (!closed) {
			checkClosed();
			if (lastAckedSeqno >= seqno) {
				if (LOG.isTraceEnabled()) {
					LOG.trace("going to break loop for waiting to lastAckedSeqno(=" + lastAckedSeqno + ", seqnumToWaitFor=" + seqno + ")");
				}
				break;
			}
			try {
				if (LOG.isTraceEnabled()) {
					LOG.trace("going to wait on ackQueue.wait() for lastAckedSeqno(=" + lastAckedSeqno + ", seqnumToWaitFor=" + seqno + ")");
				}
				synchronized (ackQueue) { // in orig cdh wait on dataQ
					if (lastAckedSeqno < seqno) {
						ackQueue.wait();
					}
				}
				if (LOG.isTraceEnabled()) {
					LOG.trace("After waiting on ackQueue.wait() for lastAckedSeqno(=" + lastAckedSeqno + ", seqnumToWaitFor=" + seqno + ")");
				}
			} catch (InterruptedException ie) {
				throw new InterruptedIOException("Interrupted while waiting for data to be acknowledged by pipeline");
			}
		}

		checkClosed();
	}

	/**
	 * Aborts this output stream and releases any system
	 * resources associated with this stream.
	 */
	synchronized void abort() throws IOException {
		if (closed) {
			return;
		}
		streamer.setLastException(new IOException("Lease timeout of " + (dfsClient.hdfsTimeout / 1000) + " seconds expired."));
		closeThreads(true);
		dfsClient.endFileLease(src);
	}

	// shutdown datastreamer and responseprocessor threads.
	// interrupt datastreamer if force is true
	private void closeThreads(boolean force) throws IOException {
		try {
			streamer.close(force);
			streamer.join();
			if (s != null) {
				s.close();
			}
		} catch (InterruptedException e) {
			throw new IOException("Failed to shutdown streamer");
		} finally {
			streamer = null;
			s = null;
			closed = true;
		}
	}

	/**
	 * Closes this output stream and releases any system
	 * resources associated with this stream.
	 */
	@Override
	public synchronized void close() throws IOException {
		if (closed) {
			IOException e = lastException;
			if (e == null)
				return;
			else
				throw e;
		}

		try {
			flushBuffer(); // flush from all upper layers

			if (currentPacket != null) {
				waitAndQueueCurrentPacket();
			}

			if (bytesCurBlock != 0) {
				// send an empty packet to mark the end of the block
				currentPacket = new Packet(0, 0, bytesCurBlock);
				currentPacket.lastPacketInBlock = true;
				currentPacket.syncBlock = shouldSyncBlock;
			}

			flushInternal(); // flush all data to Datanodes
			// get last block before destroying the streamer
			ExtendedBlock lastBlock = streamer.getBlock();
			closeThreads(false);
			completeFile(lastBlock);
			dfsClient.endFileLease(src);

			if (toProfilePacketsRT) {
				// LOG.info("Packets wait stats START (uSec)");
				// Enumeration<Long> enumKey = packetsStats.keys();
				// while (enumKey.hasMoreElements()) {
				// Long seqno = enumKey.nextElement();
				// Long waitTime = packetsStats.get(seqno);
				// LOG.info(String.format("%d,%d", seqno, waitTime));
				// }
				// LOG.info("Packets wait stats END\n");
				//
				// LOG.info("Packets arrived stats START (uSec)");
				// enumKey = packetsArrivedStats.keys();
				// while (enumKey.hasMoreElements()) {
				// Long seqno = enumKey.nextElement();
				// Long waitTime = packetsArrivedStats.get(seqno);
				// LOG.info(String.format("%d,%d", seqno, waitTime));
				// }
				// LOG.info("Packets arrived stats END\n");

				long sentTimeMin = 100000;
				long sentTimeMax = 0;
				double sentTimeAvg = 0;
				long packetsNum = packetsStreamerProcessTimeMicro.size();
				LOG.info("Packets streamer process time START (uSec)");
				Enumeration<Long> enumKey = packetsStreamerProcessTimeMicro.keys();
				while (enumKey.hasMoreElements()) {
					Long seqno = enumKey.nextElement();
					Long waitTime = packetsStreamerProcessTimeMicro.get(seqno);
					sentTimeMin = (waitTime < sentTimeMin) ? waitTime : sentTimeMin;
					sentTimeMax = (waitTime > sentTimeMin) ? waitTime : sentTimeMax;
					sentTimeAvg += (double) waitTime / (double) packetsNum;
					LOG.info(String.format("%d,%d", seqno, waitTime));
				}
				LOG.info("Packets streamer process time stats END\n");
				LOG.info(String.format("Packets streamer process time stats: min: %d, max: %d, avg: %f\n", sentTimeMin, sentTimeMax, sentTimeAvg));
			}
			if (toEnablePcktHist) {
				LOG.info("Packets insert times START (uSec)");
				Enumeration<Long> enumKey2 = insertTimes.keys();
				while (enumKey2.hasMoreElements()) {
					Long seqno = enumKey2.nextElement();
					Long insertTime = insertTimes.get(seqno);
					LOG.info(String.format("%d,%d,insert", seqno, insertTime));
				}
				LOG.info("Packets insert times END\n");

				LOG.info("Packets fetch ** times START (uSec)");
				Enumeration<Long> enumKey3 = fetchTimes.keys();
				while (enumKey3.hasMoreElements()) {
					Long seqno = enumKey3.nextElement();
					Long fetchTime = fetchTimes.get(seqno);
					LOG.info(String.format("%d,%d,fetch", seqno, fetchTime));
				}
				LOG.info("Packets fetch ** times END\n");

				LOG.info("Packets merged START\n");
				LinkedList<Long> mergedVals = new LinkedList<>();
				mergedVals.addAll(insertTimes.values());
				mergedVals.addAll(fetchTimes.values());
				Collections.sort(mergedVals);

				for (Long v : mergedVals) {
					if (insertTimes.containsValue(v)) {
						LOG.info(String.format("%d,INSERT", v));
					}
					if (fetchTimes.containsValue(v)) {
						LOG.info(String.format("%d,FETCH", v));
					}

				}
				LOG.info("Packets merged END\n");
			}
			this.eventQHandler.close();
		} finally {
			closed = true;
		}
	}

	// should be called holding (this) lock since setTestFilename() may
	// be called during unit tests
	private void completeFile(ExtendedBlock last) throws IOException {
		long localstart = Time.now();
		boolean fileComplete = false;
		while (!fileComplete) {
			fileComplete = dfsClient.namenode.complete(src, dfsClient.clientName, last);
			if (!fileComplete) {
				if (!dfsClient.clientRunning || (dfsClient.hdfsTimeout > 0 && localstart + dfsClient.hdfsTimeout < Time.now())) {
					String msg = "Unable to close file because dfsclient " + " was unable to contact the HDFS servers." + " clientRunning "
					        + dfsClient.clientRunning + " hdfsTimeout " + dfsClient.hdfsTimeout;
					DFSOutputStream.LOG.info(msg);
					throw new IOException(msg);
				}
				try {
					Thread.sleep(400);
					if (Time.now() - localstart > 5000) {
						DFSOutputStream.LOG.info("Could not complete " + src + " retrying...");
					}
				} catch (InterruptedException ie) {
				}
			}
		}
	}

	@VisibleForTesting
	public void setArtificialSlowdown(long period) {
		artificialSlowdown = period;
	}

	@VisibleForTesting
	public synchronized void setChunksPerPacket(int value) {
		chunksPerPacket = Math.min(chunksPerPacket, value);
		packetSize = (checksum.getBytesPerChecksum() + checksum.getChecksumSize()) * chunksPerPacket;
	}

	synchronized void setTestFilename(String newname) {
		src = newname;
	}

	/**
	 * Returns the size of a file as it was when this stream was opened
	 */
	long getInitialLen() {
		return initialFileSize;
	}

	/**
	 * Returns the access token currently used by streamer, for testing only
	 */
	synchronized Token<BlockTokenIdentifier> getBlockToken() {
		return streamer.getBlockToken();
	}

	Msg getMsg() {
		Msg msg = null;
		synchronized (DFSOutputStream.this.msgPool) {
			msg = DFSOutputStream.this.msgPool.getMsg();
		}
		if (msg == null) {
			LOG.error(toString() + "MsgPool is empty. failed to get msg");
		}
		return msg;
	}

}
