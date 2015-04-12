package org.apache.hadoop.hdfs.server.datanode;

import java.io.DataInputStream;
import java.io.IOException;
import com.mellanox.r4h.WriteOprHeader;

public abstract class R4HBlockReceiverBase extends BlockReceiver {
	public R4HBlockReceiverBase(WriteOprHeader oprHeader, DataInputStream inForHeaderOnly, String sessionInfo, DataNodeBridge dnEx)
	        throws IOException, SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException {
		super(oprHeader.getBlock(), inForHeaderOnly, sessionInfo, sessionInfo, oprHeader.getStage(), oprHeader.getLatestGenerationStamp(), oprHeader
		        .getMinBytesRcvd(), oprHeader.getMaxBytesRcvd(), oprHeader.getClientName(), oprHeader.getSrcDataNode(), dnEx.getDN(), oprHeader
		        .getRequestedChecksum(), oprHeader.getCachingStrategy());
	}

}
