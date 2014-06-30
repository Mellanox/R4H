package org.apache.hadoop.hdfs;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.BlockStorageLocation;
import org.apache.hadoop.fs.VolumeId;
import org.apache.hadoop.hdfs.protocol.DatanodeInfo;
import org.apache.hadoop.hdfs.protocol.HdfsBlocksMetadata;
import org.apache.hadoop.hdfs.protocol.LocatedBlock;
import org.apache.hadoop.hdfs.security.token.block.InvalidBlockTokenException;

public class BlockStorageLocationUtilBridge extends BlockStorageLocationUtil {

	public static Map<DatanodeInfo, HdfsBlocksMetadata> queryDatanodesForHdfsBlocksMetadata(Configuration conf,
	        Map<DatanodeInfo, List<LocatedBlock>> datanodeBlocks, int poolsize, int timeoutMs, boolean connectToDnViaHostname)
	        throws InvalidBlockTokenException {
		return BlockStorageLocationUtil.queryDatanodesForHdfsBlocksMetadata(conf, datanodeBlocks, poolsize, timeoutMs, connectToDnViaHostname);
	}

	public static Map<LocatedBlock, List<VolumeId>> associateVolumeIdsWithBlocks(List<LocatedBlock> blocks,
	        Map<DatanodeInfo, HdfsBlocksMetadata> metadatas) {
		return BlockStorageLocationUtil.associateVolumeIdsWithBlocks(blocks, metadatas);
	}

	public static BlockStorageLocation[] convertToVolumeBlockLocations(List<LocatedBlock> blocks, Map<LocatedBlock, List<VolumeId>> blockVolumeIds)
	        throws IOException {
		return BlockStorageLocationUtil.convertToVolumeBlockLocations(blocks, blockVolumeIds);
	}
}
