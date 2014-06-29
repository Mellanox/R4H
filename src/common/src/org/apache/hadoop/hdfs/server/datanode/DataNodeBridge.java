package org.apache.hadoop.hdfs.server.datanode;

import java.io.IOException;
import java.net.URL;

import org.apache.hadoop.hdfs.protocol.ExtendedBlock;
import org.apache.hadoop.hdfs.security.token.block.BlockPoolTokenSecretManager;
import org.apache.hadoop.hdfs.security.token.block.BlockTokenSecretManager;
import org.apache.hadoop.hdfs.server.protocol.DatanodeRegistration;

/**
 * A Package bridge to the original class org.apache.hadoop.hdfs.server.datanode
 * 
 * @see org.apache.hadoop.hdfs.server.datanode.BlockReceiver
 *      It exposes the neccessary package access fields of BlockReceiver to R4H
 */
public class DataNodeBridge {
	private DataNode          dn;
	private DataXceiverServer dxcs;

	public DataNodeBridge(DataNode dn) {
		if (dn == null)
			throw new IllegalArgumentException("Trying to exppse a null reference DataNode");

		this.dn = dn;
		this.dxcs = (DataXceiverServer) dn.dataXceiverServer.getRunnable();
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
