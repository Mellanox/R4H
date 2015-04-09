package org.apache.hadoop.hdfs.server.datanode;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hdfs.protocol.ExtendedBlock;
import org.apache.hadoop.hdfs.security.token.block.BlockPoolTokenSecretManager;
import org.apache.hadoop.hdfs.server.protocol.DatanodeRegistration;

import com.mellanox.r4h.R4HProtocol;

/**
 * A Package bridge to the original class org.apache.hadoop.hdfs.server.datanode
 * 
 * @see org.apache.hadoop.hdfs.server.datanode.BlockReceiverPatched
 *      It exposes the neccessary package access fields of BlockReceiver to R4H
 */
public class DataNodeBridge {

	private static final int NUM_OF_MSG_FOR_BLOCK = R4HProtocol.MAX_SEND_PACKETS + R4HProtocol.JX_SERVER_SPARE_MSGS;
	private static final int NUM_OF_SERVER_PORTAL_WORKERS_SESSIONS_LIMIT_DEFAULT = 4;
	private static final int NUM_OF_DYNAMIC_MSG_ALLOCATION_DEFAULT = 1;
	private static final int NUM_OF_MSG_TO_BIND_IN_BLOCKS_DEFAULT = 50;
	private static final String NUM_OF_SERVER_PORTAL_WORKERS_SESSIONS_LIMIT_PARAM_NAME = "r4h.workers.sessions.limit";
	private static final String NUM_OF_MSG_TO_BIND_IN_BLOCKS_PARAM_NAME = "r4h.msg.blocks.bind";
	private static final String NUM_OF_DYNAMIC_MSG_ALLOCATION_NAME = "r4h.msg.dynamic.allocation";
	private static final int NUM_OF_IO_EXECUTORS_DEFAULT = 10;
	private static final int NUM_OF_PRE_ALLOC_SERVER_PORTAL_WORKERS_DEFAULT = 4;
	private static final String NUM_OF_IO_EXECUTORS_PARAM_NAME = "r4h.io.executors";
	private static final String NUM_OF_PRE_ALLOC_SERVER_PORTAL_WORKERS_PARAM_NAME = "r4h.server.portal.workers";

	public final int numOfAuxExecutors;
	public final int numOfioExecutors;
	public final int spwAmount;
	public final int numOfMsgsToBind;
	public final int msgInSize;
	public final int msgOutSize;
	public final int numSessionsLimit;
	public final int dynamicMsgAllocationAmount;
	public final boolean isForwardEnable;

	private DataNode dn;
	private DataXceiverServer dxcs;

	public DataNodeBridge(DataNode dn) {
		if (dn == null) {
			throw new IllegalArgumentException("Trying to exppse a null reference DataNode");
		}

		Configuration dnConf = dn.getConf();

		this.spwAmount = dnConf.getInt(NUM_OF_PRE_ALLOC_SERVER_PORTAL_WORKERS_PARAM_NAME, NUM_OF_PRE_ALLOC_SERVER_PORTAL_WORKERS_DEFAULT);
		if (spwAmount < 0) {
			throw new IllegalArgumentException(String.format("Illegal number of Server portal workers ( %d )", this.spwAmount));
		}

		this.numOfioExecutors = dnConf.getInt(NUM_OF_IO_EXECUTORS_PARAM_NAME, NUM_OF_IO_EXECUTORS_DEFAULT);
		if (this.numOfioExecutors < 1) {
			throw new IllegalArgumentException(String.format("Illegal number of IO executors ( %d )", this.numOfioExecutors));
		}

		int blocksToBind = dnConf.getInt(NUM_OF_MSG_TO_BIND_IN_BLOCKS_PARAM_NAME, NUM_OF_MSG_TO_BIND_IN_BLOCKS_DEFAULT);
		if (blocksToBind < 1) {
			throw new IllegalArgumentException(String.format("Illegal number of messages to bind in blocks ( %d )", blocksToBind));
		}

		this.numSessionsLimit = dnConf.getInt(NUM_OF_SERVER_PORTAL_WORKERS_SESSIONS_LIMIT_PARAM_NAME,
		        NUM_OF_SERVER_PORTAL_WORKERS_SESSIONS_LIMIT_DEFAULT);
		if (numSessionsLimit < 0) {
			throw new IllegalArgumentException(String.format("Illegal number of server portal worker sessions limit ( %d )", numSessionsLimit));
		}

		int dynamicBlocksAllocationAmount = dnConf.getInt(NUM_OF_DYNAMIC_MSG_ALLOCATION_NAME, NUM_OF_DYNAMIC_MSG_ALLOCATION_DEFAULT);
		if (dynamicBlocksAllocationAmount < 1) {
			throw new IllegalArgumentException(String.format("Illegal number of dynamic messages to allocate ( %d )", dynamicBlocksAllocationAmount));
		}

		this.dn = dn;
		this.dxcs = (DataXceiverServer) dn.dataXceiverServer.getRunnable();
		this.isForwardEnable = spwAmount != 0;
		this.dynamicMsgAllocationAmount = NUM_OF_MSG_FOR_BLOCK * dynamicBlocksAllocationAmount;
		this.numOfMsgsToBind = NUM_OF_MSG_FOR_BLOCK * blocksToBind;
		this.msgInSize = getWritePacketSize() + R4HProtocol.JX_BUF_SPARE;
		this.msgOutSize = R4HProtocol.ACK_SIZE;
		this.numOfAuxExecutors = blocksToBind;
	}

	public long getEstimateBlockSize() {
		return dxcs.estimateBlockSize;
	}

	public boolean isBlockTokenEnabled() {
		return dn.isBlockTokenEnabled;
	}

	public DataNode getDN() {
		return this.dn;
	}

	public int getWritePacketSize() {
		return dn.getDnConf().writePacketSize;
	}

	public BlockPoolTokenSecretManager getBlockPoolTokenSecretManager() {
		return dn.blockPoolTokenSecretManager;
	}

	public DatanodeRegistration getDNRegistrationForBP(String bpid) throws IOException {
		return dn.getDNRegistrationForBP(bpid);
	}

	public void recoverClose(ExtendedBlock blk, long newGS, long expectedBlockLen) throws IOException {
		dn.data.recoverClose(blk, newGS, expectedBlockLen);
	}

}
