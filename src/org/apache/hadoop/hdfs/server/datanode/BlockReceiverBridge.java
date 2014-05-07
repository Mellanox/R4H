package org.apache.hadoop.hdfs.server.datanode;

import static org.apache.hadoop.hdfs.DFSConfigKeys.DFS_CLIENT_WRITE_PACKET_SIZE_DEFAULT;
import static org.apache.hadoop.hdfs.DFSConfigKeys.DFS_CLIENT_WRITE_PACKET_SIZE_KEY;
import static org.apache.hadoop.hdfs.server.datanode.DataNode.DN_CLIENTTRACE_FORMAT;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.hdfs.HdfsConfiguration;
import org.apache.hadoop.hdfs.protocol.ExtendedBlock;
import org.apache.hadoop.hdfs.protocol.HdfsConstants;
import org.apache.hadoop.hdfs.protocol.datatransfer.PacketHeader;
import org.apache.hadoop.hdfs.protocol.datatransfer.PacketReceiver;
import org.apache.hadoop.hdfs.server.datanode.fsdataset.ReplicaOutputStreams;
import org.apache.hadoop.hdfs.server.protocol.DatanodeRegistration;
import org.apache.hadoop.util.DataChecksum;
import org.apache.hadoop.util.StringUtils;

import com.mellanox.r4h.AsyncFileOutputStream;
import com.mellanox.r4h.R4HProtocol;
import com.mellanox.r4h.WriteOprHeader;
import com.mellanox.r4h.AsyncFileOutputStream.AsyncWriteCompletion;

/**
 * Package bridge to the original class org.apache.hadoop.hdfs.server.datanode.DataNode
 * 
 * @see org.apache.hadoop.hdfs.server.datanode.DataNode It exposes the neccessary package access fields of DataNode to
 *      R4H
 */
public class BlockReceiverBridge extends BlockReceiver {
	private final static int NUM_OF_PREALLOC_PACKET_COPY_BUFFERS = R4HProtocol.MSG_POOLS_GROWTH_FACTOR * R4HProtocol.SERVER_MSG_POOL_SIZE;
	private final static Log LOG = LogFactory.getLog(BlockReceiverBridge.class);
	private Field inputStreamField;
	private Method receivePacketMethod;
	private DataNodeBridge exposedDN;
	private Field outField;
	private Field checksumOutField;
	private Field mirrorOutField;
	private WriteOprHeader oprHeader;
	private ReplicaInPipelineInterface replicaInfo;
	// private PacketReceiver packetReceiver;
	private String ssInfo;
	private final long startTime;
	private final Field packetReceiverField;
	private final ExecutorService singleThreadExecutor;
	private ByteBuffer curCopyBuff;
	private AsyncFileOutputStream asyncOut;
	private AsyncFileOutputStream asyncCout;
	private Field currPacketBufField;
	private static final ConcurrentLinkedQueue<ByteBuffer> packetBufferPool = new ConcurrentLinkedQueue<>();
	private static final int copyBufferSize;

	static {
		int writePacketSize = new HdfsConfiguration().getInt(DFS_CLIENT_WRITE_PACKET_SIZE_KEY, DFS_CLIENT_WRITE_PACKET_SIZE_DEFAULT);
		copyBufferSize = writePacketSize + R4HProtocol.JX_BUF_SPARE;
		allocatePacketCopyBuffers(NUM_OF_PREALLOC_PACKET_COPY_BUFFERS);
	}

	public static void loadStatic() {
		int x = 0;
	} // for letting DXCS preload static block

	private static void allocatePacketCopyBuffers(int amount) {
		LOG.info(String.format("Allocating packet buffers for async disk write: %d * %d KB", amount, copyBufferSize / 1024));
		for (int j = 0; j < amount; j++) {
			packetBufferPool.add(ByteBuffer.allocate(copyBufferSize));
			// TODO: allocate one big ByteBuffer and slice it.
		}
	}

	private synchronized static ByteBuffer getCopyBuffer() {
		ByteBuffer buff = packetBufferPool.poll();
		if (buff == null) {
			LOG.info("No enough packet buffers - allocating more...");
			allocatePacketCopyBuffers(NUM_OF_PREALLOC_PACKET_COPY_BUFFERS);
			buff = packetBufferPool.poll();
		}
		buff.clear();
		return buff;
	}

	public static void returnCurrPacketCopyBuffer(ByteBuffer buff) {
		if (buff != null) {
			buff.clear();
			packetBufferPool.add(buff);
		} else {
			LOG.warn("Tried to return a NULL packet buffer to pool");
		}
	}

	public BlockReceiverBridge(WriteOprHeader oprHeader, DataInputStream inForHeaderOnly, String sessionInfo, DataNodeBridge dnEx,
	        ExecutorService diskIOexecutorService) throws IOException, SecurityException, NoSuchFieldException, IllegalArgumentException,
	        IllegalAccessException, NoSuchMethodException {
		super(oprHeader.getBlock(), inForHeaderOnly, sessionInfo, sessionInfo, oprHeader.getStage(), oprHeader.getLatestGenerationStamp(), oprHeader
		        .getMinBytesRcvd(), oprHeader.getMaxBytesRcvd(), oprHeader.getClientName(), oprHeader.getSrcDataNode(), dnEx.getDN(), oprHeader
		        .getRequestedChecksum());
		singleThreadExecutor = diskIOexecutorService;
		// TODO: check if it is really a newSingleThreadExecutor
		ssInfo = sessionInfo;
		exposedDN = dnEx;
		inputStreamField = BlockReceiver.class.getDeclaredField("in");
		inputStreamField.setAccessible(true);
		mirrorOutField = BlockReceiver.class.getDeclaredField("mirrorOut");
		mirrorOutField.setAccessible(true);

		receivePacketMethod = BlockReceiver.class.getDeclaredMethod("receivePacket");
		receivePacketMethod.setAccessible(true);
		Field tmpField = BlockReceiver.class.getDeclaredField("replicaInfo");
		tmpField.setAccessible(true);
		replicaInfo = (ReplicaInPipelineInterface) tmpField.get(this);
		packetReceiverField = BlockReceiver.class.getDeclaredField("packetReceiver");
		packetReceiverField.setAccessible(true);

		currPacketBufField = PacketReceiver.class.getDeclaredField("curPacketBuf");
		currPacketBufField.setAccessible(true);

		this.oprHeader = oprHeader;

		startTime = ClientTraceLog.isInfoEnabled() ? System.nanoTime() : 0;
	}

	public PacketReceiver getPacketReceiver() throws IllegalArgumentException, IllegalAccessException {
		return (PacketReceiver) packetReceiverField.get(this);
	}

	private void updatePacketCopyBuffer() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		curCopyBuff = getCopyBuffer();
		PacketReceiver receiver = getPacketReceiver();
		currPacketBufField.set(receiver, curCopyBuff);
	}

	public ByteBuffer getCurCopyBuff() {
		return curCopyBuff;
	}

	public void setMirrorOut(DataOutputStream dos) throws IllegalArgumentException, IllegalAccessException {
		mirrorOutField.set(this, dos);
	}

	public ReplicaInPipelineInterface getReplicaInfo() {
		return replicaInfo;
	}

	public void processPacket(DataInputStream in) {
		try {
			updatePacketCopyBuffer();
			inputStreamField.set(this, in);
			receivePacketMethod.invoke(this);
			// // TODO: for meantime before running really async
			// returnCopyBuffer(curCopyBuff);
			// //
		} catch (Exception e) {
			if ((e instanceof IllegalAccessException) || (e instanceof IllegalArgumentException) || (e instanceof InvocationTargetException)) {
				LOG.fatal("failed during reflection invokation: " + StringUtils.stringifyException(e));
			}

			throw new RuntimeException(e);

		}
	}

	public void finalizeBlock() throws IOException {
		long offset = 0;
		this.close();
		final long endTime = ClientTraceLog.isInfoEnabled() ? System.nanoTime() : 0;
		oprHeader.getBlock().setNumBytes(replicaInfo.getNumBytes());
		getDataNode().data.finalizeBlock(oprHeader.getBlock());
		getDataNode().closeBlock(oprHeader.getBlock(), DataNode.EMPTY_DEL_HINT);
		if (ClientTraceLog.isInfoEnabled() && oprHeader.isClient()) {
			DatanodeRegistration dnR = getDataNode().getDNRegistrationForBP(oprHeader.getBlock().getBlockPoolId());
			LOG.info(String.format(DN_CLIENTTRACE_FORMAT, ssInfo, getDataNode().getXferAddress(), oprHeader.getBlock().getNumBytes(), "HDFS_WRITE",
			        oprHeader.getClientName(), offset, dnR.getStorageID(), oprHeader.getBlock(), endTime - startTime));
		} else {
			LOG.info("Received " + oprHeader.getBlock() + " size " + oprHeader.getBlock().getNumBytes() + " from " + inAddr);
		}

		if (LOG.isDebugEnabled()) {
			LOG.debug("Finalized and clsoed block");
		}
	}

	public ExtendedBlock getBlock() {
		return this.oprHeader.getBlock();
	}

	@Override
	void flushOrSync(boolean isSync) throws IOException {
		if (LOG.isTraceEnabled()) {
			LOG.trace("executing async flushOrSync()");
		}
		this.singleThreadExecutor.execute(new FlushOrSyncRunner(isSync));
	}

	class FlushOrSyncRunner implements Runnable {
		final private boolean isSync;

		public FlushOrSyncRunner(boolean isSync) {
			this.isSync = isSync;
		}

		@Override
		public void run() {
			try {
				if (LOG.isTraceEnabled()) {
					LOG.trace("on async call to flushOrSync()");
				}
				BlockReceiverBridge.super.flushOrSync(isSync);
				if (LOG.isTraceEnabled()) {
					LOG.trace("after async call to flushOrSync()");
				}
			} catch (Throwable w) {
				LOG.error(StringUtils.stringifyException(w));
			}
		}

	}

	public void setAsyncFileOutputStreams() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException,
	        IOException {
		Field streamsField = BlockReceiver.class.getDeclaredField("streams");
		streamsField.setAccessible(true);
		ReplicaOutputStreams streams = (ReplicaOutputStreams) streamsField.get(this);
		Field streamsDataOutField = ReplicaOutputStreams.class.getDeclaredField("dataOut");
		streamsDataOutField.setAccessible(true);
		Field streamsChecksumOutField = ReplicaOutputStreams.class.getDeclaredField("checksumOut");
		streamsChecksumOutField.setAccessible(true);

//		// Overriding checksum file output stream to be async - using reflection
//		// ------------------------------------------------------
//		Field coutField = BlockReceiver.class.getDeclaredField("cout");
//		coutField.setAccessible(true);
//		FileOutputStream cout = (FileOutputStream) coutField.get(this);
//		checksumOutField = BlockReceiver.class.getDeclaredField("checksumOut");
//		checksumOutField.setAccessible(true);
//		// flush orig checksum stream
////		OutputStream origChecksumOut = (OutputStream) checksumOutField.get(this);
////		origChecksumOut.flush();
//		// create new checksum stream with orig FD
//		FileDescriptor checksumFd = cout.getFD();
//		asyncCout = new AsyncFileOutputStream(checksumFd, singleThreadExecutor, new AsyncWriteCompletion() {
//
//			@Override
//			public void onWriteComplete(Object context, IOException e) {
//				if (LOG.isTraceEnabled()) {
//					LOG.trace("on checksum write completion");
//					if (context != null) {
//						if (context instanceof PacketHeader) {
//							LOG.trace("checksum output stream write completion for " + (PacketHeader) context);
//						} else if (context instanceof AsyncFileOutputStream.AsyncWrite) {
//							LOG.trace("checksum output stream write completion for " + (AsyncFileOutputStream.AsyncWrite) context);
//						}
//					}
//
//					if (e != null) {
//						LOG.error("error during writing packet checksum to disk: " + StringUtils.stringifyException(e));
//					}
//				}
//			}
//		});
//		asyncCout.limitAsyncIObyThreadID(Thread.currentThread().getId());
//		OutputStream tmpChecksumOut = new DataOutputStream(new BufferedOutputStream(asyncCout, HdfsConstants.SMALL_BUFFER_SIZE));
//		checksumOutField.set(this, tmpChecksumOut);
//		coutField.set(this, asyncCout);
//		streamsChecksumOutField.set(streams, asyncCout);
//
//		BlockMetadataHeader.writeHeader((DataOutputStream)tmpChecksumOut, streams.getChecksum());

		
		// Overriding data file output stream to be async - using reflection
		Field outField = BlockReceiver.class.getDeclaredField("out");
		outField.setAccessible(true);
		FileOutputStream out = (FileOutputStream) outField.get(this);
		FileDescriptor fd = out.getFD();
		asyncOut = new AsyncFileOutputStream(fd, singleThreadExecutor, new AsyncWriteCompletion() {

			@Override
			public void onWriteComplete(Object context, IOException e) {
				if (LOG.isTraceEnabled()) {
					LOG.trace("on data write completion");
					if (context != null) {
						if (context instanceof PacketHeader) {
							LOG.trace("data output stream write completion for " + (PacketHeader) context);
						} else if (context instanceof AsyncFileOutputStream.AsyncWrite) {
							LOG.trace("data output stream write completion for " + (AsyncFileOutputStream.AsyncWrite) context);
						}

					}

					if (e != null) {
						LOG.error("error during writing packet data to disk: " + StringUtils.stringifyException(e));
					}
				}
			}
		});
		asyncOut.limitAsyncIObyThreadID(Thread.currentThread().getId());
		outField.set(this, asyncOut);
		streamsDataOutField.set(streams, asyncOut);

//		Field diskChecksumField = BlockReceiver.class.getDeclaredField("diskChecksum");
//		diskChecksumField.setAccessible(true);
	}

	// TODO: toString()

}
