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

import org.apache.hadoop.fs.StorageType;
import org.apache.hadoop.hdfs.protocol.DatanodeInfo;
import org.apache.hadoop.hdfs.protocol.ExtendedBlock;
import org.apache.hadoop.hdfs.protocol.datatransfer.BlockConstructionStage;
import org.apache.hadoop.hdfs.security.token.block.BlockTokenIdentifier;
import org.apache.hadoop.hdfs.server.datanode.CachingStrategy;
import org.apache.hadoop.security.token.Token;
import org.apache.hadoop.util.DataChecksum;

/**
 * Encapsulating HDFS WriteOperationHeader to be read from a DataInput and written to a DataOutput. Additional it
 * provides the ability to write itself to a DataOutput with a pipeline modification
 * This is the extension for Hadoop 2.6.0
 */
public class WriteOprHeader2_7 extends WriteOprHeader {

	final private StorageType storageType;
	final private StorageType[] allStorageTypes;
	final private boolean allowLazyPersist;
	final private boolean allowPinning;
	final private boolean[] targetPinnings;

	public WriteOprHeader2_7(ExtendedBlock blk, StorageType storageType, Token<BlockTokenIdentifier> blockToken, String clientName,
	        DatanodeInfo[] targets, StorageType[] allStorageTypes, DatanodeInfo source, BlockConstructionStage stage, int pipelineSize,
	        long minBytesRcvd, long maxBytesRcvd, long latestGenerationStamp, DataChecksum requestedChecksum, CachingStrategy cachingStrategy,
	        boolean allowLazyPersist, boolean allowPinning, boolean[] targetPinnings) {
		super(blk, blockToken, clientName, targets, source, stage, pipelineSize, minBytesRcvd, maxBytesRcvd, latestGenerationStamp,
		        requestedChecksum, cachingStrategy);
		this.storageType = storageType;
		this.allStorageTypes = allStorageTypes;
		this.allowLazyPersist = allowLazyPersist;
		this.allowPinning = allowPinning;
		this.targetPinnings = targetPinnings;

	}

	public StorageType getStorageType() {
		return storageType;
	}

	public StorageType[] getAllStorageTypes() {
		return allStorageTypes;
	}

	public boolean getAllowLazyPersist() {
		return allowLazyPersist;
	}

	public boolean getAllowPinning() {
		return allowPinning;
	}

	public boolean[] getTargetPinnings(){
		return targetPinnings;
	}
}
