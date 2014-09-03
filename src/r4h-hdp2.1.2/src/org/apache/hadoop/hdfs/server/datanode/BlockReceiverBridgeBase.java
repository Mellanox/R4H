package org.apache.hadoop.hdfs.server.datanode;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import com.mellanox.r4h.BRBInetrface;
import com.mellanox.r4h.ServerPortalWorker;
import com.mellanox.r4h.WriteOprHeader;

public abstract class BlockReceiverBridgeBase extends BlockReceiver implements BRBInetrface {
	public BlockReceiverBridgeBase(ServerPortalWorker spw, WriteOprHeader oprHeader, DataInputStream inForHeaderOnly, String sessionInfo,
	        DataNodeBridge dnEx, ExecutorService diskIOexecutorService) throws IOException, SecurityException, NoSuchFieldException,
	        IllegalArgumentException, IllegalAccessException, NoSuchMethodException {
		super(oprHeader.getBlock(), inForHeaderOnly, sessionInfo, sessionInfo, oprHeader.getStage(), oprHeader.getLatestGenerationStamp(), oprHeader
		        .getMinBytesRcvd(), oprHeader.getMaxBytesRcvd(), oprHeader.getClientName(), oprHeader.getSrcDataNode(), dnEx.getDN(), oprHeader
		        .getRequestedChecksum(), oprHeader.getCachingStrategy());
	}

	@Override
    public void closeBlock() {
		getDataNode().closeBlock(getBlock(), DataNode.EMPTY_DEL_HINT, getReplicaInfo().getStorageUuid());
    }
	
	@Override
	public String getStorageID() throws IOException {
		return getDataNode().getDNRegistrationForBP(getBlock().getBlockPoolId()).getDatanodeUuid();
	}
}
