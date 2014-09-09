package com.mellanox.r4h;

import java.io.IOException;

import org.apache.hadoop.hdfs.protocol.ExtendedBlock;
import org.apache.hadoop.hdfs.server.datanode.ReplicaInPipelineInterface;

public interface BRBInetrface {
	void closeBlock();

	ReplicaInPipelineInterface getReplicaInfo();

	ExtendedBlock getBlock();

	String getStorageID() throws IOException;
}
