package org.apache.hadoop.hdfs.server.datanode;

import static org.apache.hadoop.hdfs.server.datanode.DataNode.DN_CLIENTTRACE_FORMAT;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import org.apache.hadoop.record.Utils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.hdfs.protocol.ExtendedBlock;
import org.apache.hadoop.hdfs.protocol.datatransfer.PacketHeader;
import org.apache.hadoop.hdfs.protocol.datatransfer.PacketReceiver;
import org.apache.hadoop.hdfs.server.datanode.fsdataset.ReplicaOutputStreams;
import org.apache.hadoop.util.StringUtils;
import org.accelio.jxio.Msg;

import com.mellanox.r4h.AsyncFileOutputStream;
import com.mellanox.r4h.BRBInetrface;
import com.mellanox.r4h.ByteBufferInputStream;
import com.mellanox.r4h.IOBufferSupplier;
import com.mellanox.r4h.MessageAction;
import com.mellanox.r4h.R4HExecutor;
import com.mellanox.r4h.WriteOprHeader;
import com.mellanox.r4h.AsyncFileOutputStream.AsyncWriteCompletion;

/**
 * Package bridge to the original class org.apache.hadoop.hdfs.server.datanode.DataNode
 * 
 * @see org.apache.hadoop.hdfs.server.datanode.DataNode It exposes the neccessary package access fields of DataNode to
 *      R4H
 */
public class R4HBlockReceiver extends R4HBlockReceiverBase implements BRBInetrface {
	private final static Log LOG = LogFactory.getLog(R4HBlockReceiver.class);
	private final Field inputStreamField;
	private final Field mirrorOutField;
	private final Field packetReceiverField;
	private final Field currPacketBufField;
	private final Method receivePacketMethod;
	private final WriteOprHeader oprHeader;
	private final ReplicaInPipelineInterface replicaInfo;
	private final IOBufferSupplier bufSupplier;
	private final String ssInfo;
	private final long startTime;
	private ByteBuffer curCopyBuff;
	private AsyncFileOutputStream asyncOut;
	private final MessageAction msgCallbacks;
	private final R4HExecutor ioExecutor;
	private Msg currMsg = null;

	public R4HBlockReceiver(IOBufferSupplier bufSupplier, WriteOprHeader oprHeader, DataInputStream inForHeaderOnly, String sessionInfo,
	        DataNodeBridge dnEx, R4HExecutor ioExecutor, MessageAction msgCallbacks) throws IOException, NoSuchFieldException, SecurityException,
	        NoSuchMethodException, IllegalArgumentException, IllegalAccessException {
		super(oprHeader, inForHeaderOnly, sessionInfo, dnEx);
		this.bufSupplier = bufSupplier;
		// TODO: check if it is really a newSingleThreadExecutor
		ssInfo = sessionInfo;
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
		this.ioExecutor = ioExecutor;
		this.msgCallbacks = msgCallbacks;

		setAsyncFileOutputStreams();

		startTime = ClientTraceLog.isInfoEnabled() ? System.nanoTime() : 0;
	}

	public PacketHeader getPacketHeader() throws IllegalArgumentException, IllegalAccessException {
		return getPacketReceiver().getHeader();
	}

	private PacketReceiver getPacketReceiver() throws IllegalArgumentException, IllegalAccessException {
		return (PacketReceiver) packetReceiverField.get(this);
	}

	private void updatePacketCopyBuffer() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException,
	        IOException {
		curCopyBuff = bufSupplier.getBuffer();
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

	public void processPacket(Msg msg) throws IOException {
		msg.getIn().clear();
		DataInputStream in = new DataInputStream(new ByteBufferInputStream(msg.getIn()));
		int headerStart = Utils.readVInt(in);
		msg.getIn().position(headerStart);
		in = new DataInputStream(new BufferedInputStream(new ByteBufferInputStream(msg.getIn()), 512));

		// update currMsg for executing async tasks.
		this.currMsg = msg;
		asyncOut.setCurrMsg(msg);

		try {
			updatePacketCopyBuffer();
			inputStreamField.set(this, in);
			receivePacketMethod.invoke(this);
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
		closeBlock();
		if (ClientTraceLog.isInfoEnabled() && oprHeader.isClient()) {
			LOG.info(String.format(DN_CLIENTTRACE_FORMAT, ssInfo, getDataNode().getXferAddress(), oprHeader.getBlock().getNumBytes(), "HDFS_WRITE",
			        oprHeader.getClientName(), offset, getStorageID(), oprHeader.getBlock(), endTime - startTime));
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
	void flushOrSync(final boolean isSync) throws IOException {
		if (LOG.isTraceEnabled()) {
			LOG.trace("executing async flushOrSync()");
		}
		this.ioExecutor.execute(currMsg, msgCallbacks, new Runnable() {

			@Override
			public void run() {
				try {
					if (LOG.isTraceEnabled()) {
						LOG.trace("on async call to flushOrSync()");
					}
					R4HBlockReceiver.super.flushOrSync(isSync);
					if (LOG.isTraceEnabled()) {
						LOG.trace("after async call to flushOrSync()");
					}
				} catch (Throwable w) {
					LOG.error(StringUtils.stringifyException(w));
				}
			}
		});
	}

	private void setAsyncFileOutputStreams() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException,
	        IOException {
		Field streamsField = BlockReceiver.class.getDeclaredField("streams");
		streamsField.setAccessible(true);
		ReplicaOutputStreams streams = (ReplicaOutputStreams) streamsField.get(this);
		Field streamsDataOutField = ReplicaOutputStreams.class.getDeclaredField("dataOut");
		streamsDataOutField.setAccessible(true);
		Field streamsChecksumOutField = ReplicaOutputStreams.class.getDeclaredField("checksumOut");
		streamsChecksumOutField.setAccessible(true);

		// Overriding data file output stream to be async - using reflection
		Field outField = BlockReceiver.class.getDeclaredField("out");
		outField.setAccessible(true);
		FileOutputStream out = (FileOutputStream) outField.get(this);
		FileDescriptor fd = out.getFD();
		asyncOut = new AsyncFileOutputStream(fd, ioExecutor, msgCallbacks, new AsyncWriteCompletion() {

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
	}

	// TODO: toString()

	@Override
	public void closeBlock() {
		getDataNode().closeBlock(getBlock(), DataNode.EMPTY_DEL_HINT, getReplicaInfo().getStorageUuid());
	}

	@Override
	public String getStorageID() throws IOException {
		return getDataNode().getDNRegistrationForBP(getBlock().getBlockPoolId()).getDatanodeUuid();
	}

}
