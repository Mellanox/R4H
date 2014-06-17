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

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.hdfs.protocol.DatanodeInfo;
import org.apache.hadoop.hdfs.protocol.ExtendedBlock;
import org.apache.hadoop.hdfs.protocol.datatransfer.BlockConstructionStage;
import org.apache.hadoop.hdfs.security.token.block.BlockTokenIdentifier;
import org.apache.hadoop.hdfs.server.datanode.CachingStrategy;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.security.token.Token;
import org.apache.hadoop.util.DataChecksum;

/**
 * Encapsulating HDFS WriteOperationHeader to be read from a DataInput and written to a DataOutput. Additional it
 * provides the ability to write itself to a DataOutput with a pipeline modification
 */
public class WriteOprHeader {

	final private ExtendedBlock blk;
	final private Token<BlockTokenIdentifier> blockToken;
	final private String clientName;
	final private DatanodeInfo[] targets;
	final private DatanodeInfo source;
	final private BlockConstructionStage stage;
	final private int pipelineSize;
	final private long minBytesRcvd;
	final private long maxBytesRcvd;
	final private long latestGenerationStamp;
	final private DataChecksum requestedChecksum;
	final private CachingStrategy cachingStrategy;
	
	final private boolean isDatanode;
	final private boolean isClient;
	final private boolean isTransfer;

	public WriteOprHeader(ExtendedBlock blk, Token<BlockTokenIdentifier> blockToken, String clientName, DatanodeInfo[] targets, DatanodeInfo source,
	        BlockConstructionStage stage, int pipelineSize, long minBytesRcvd, long maxBytesRcvd, long latestGenerationStamp,
	        DataChecksum requestedChecksum, CachingStrategy cachingStrategy) {
		this.blk = blk;
		this.blockToken = blockToken;
		this.clientName = clientName;
		this.targets = targets;
		this.source = source;
		this.stage = stage;
		this.pipelineSize = pipelineSize;
		this.minBytesRcvd = minBytesRcvd;
		this.maxBytesRcvd = maxBytesRcvd;
		this.latestGenerationStamp = latestGenerationStamp;
		this.requestedChecksum = requestedChecksum;
		this.cachingStrategy = cachingStrategy;

		isDatanode = clientName.length() == 0;
		isClient = !isDatanode;
		isTransfer = stage == BlockConstructionStage.TRANSFER_RBW || stage == BlockConstructionStage.TRANSFER_FINALIZED;

	}

	public CachingStrategy getCachingStrategy() {
		return cachingStrategy;
	}
	
	public boolean isDatanode() {
		return clientName.length() == 0;
	}

	public boolean isClient() {
		return !isDatanode;
	}

	public boolean isTransfer() {
		return (stage == BlockConstructionStage.TRANSFER_RBW || stage == BlockConstructionStage.TRANSFER_FINALIZED);
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(String
		        .format("WriteOprHeader{blk='%s', blockToken='%s', clientName='%s', source='%s', stage='%s', pipelineSize(entire)='%d', minBytesRcvd='%d', maxBytesRcvd='%d', requestedChecksum='%s'",
		                blk, blockToken, clientName, source, stage, pipelineSize, minBytesRcvd, maxBytesRcvd, requestedChecksum));
		if ((targets) != null && (targets.length > 0)) {
			sb.append(String.format("PIPELINE_TARGETS[%d]='[", targets.length));
			for (int i = 0; i < targets.length; i++) {
				sb.append(String.format(" --> '%s'", targets[i]));
			}
			sb.append("]'");
		} else {
			sb.append("PIPELINE_TARGETS[0]");
		}

		sb.append(" }");

		return sb.toString();
	}

	// @Override
	// public void write(DataOutput out) throws IOException {
	// out.writeShort(DataTransferProtocol.DATA_TRANSFER_VERSION);
	// out.write(DataTransferProtocol.OP_WRITE_BLOCK);
	// out.writeLong(getBlkid());
	// out.writeLong(getGenerationStamp());
	// out.writeInt(getPipelineSize());
	// out.writeBoolean(isRecovery());
	// Text.writeString(out, getClient());
	// out.writeBoolean(isHasSrcDataNode());
	// if (isHasSrcDataNode()) {
	// getSrcDataNode().write(out);
	// }
	// int pipelineSize = getNumTargets(); // TODO: VInt
	// out.writeInt(pipelineSize);
	// if (pipelineSize > 0) {
	// for (int i = 0; i < pipelineSize; i++) {
	// targets[i].write(out);
	// }
	// }
	// getAccessToken().write(out);
	// }

	// @Override
	// public void readFields(DataInput in) throws IOException {
	// short version = in.readShort();
	// if (version != DataTransferProtocol.DATA_TRANSFER_VERSION) { // TODO: compare to an own R4H version field!!
	// throw new IOException(String.format("got unexpected DATA_TRANSFER_VERSION=%d - (support VERESION=%d only)", version,
	// DataTransferProtocol.DATA_TRANSFER_VERSION));
	// }
	// byte op = in.readByte();
	// if (op != DataTransferProtocol.OP_WRITE_BLOCK) {
	// throw new IOException(String.format("got unexpected OP_CODE=%d - expected %d(OP_WRITE_BLOCK", op, DataTransferProtocol.OP_WRITE_BLOCK));
	// }
	// setBlkid(in.readLong());
	// setGenerationStamp(in.readLong());
	// setPipelineSize(in.readInt());
	// setRecovery(in.readBoolean());
	// setClient(Text.readString(in));
	// setHasSrcDataNode(in.readBoolean());
	// if (isHasSrcDataNode()) {
	// setSrcDataNode(new DatanodeInfo());
	// getSrcDataNode().readFields(in);
	// }
	//
	// int numTargets = in.readInt();
	// if (numTargets < 0) {
	// throw new IOException("Mislabelled incoming datastream.");
	// }
	// DatanodeInfo[] targets = new DatanodeInfo[numTargets];
	// for (int i = 0; i < targets.length; i++) {
	// DatanodeInfo tmp = new DatanodeInfo();
	// tmp.readFields(in);
	// targets[i] = tmp;
	// }
	// setTargets(targets);
	//
	// setAccessToken(new Token<BlockTokenIdentifier>());
	// getAccessToken().readFields(in);
	// }

	// WriteOprHeader createNextPipeHeader() {
	// WriteOprHeader nextHeader = new WriteOprHeader();
	//
	// nextHeader.setBlkid(getBlkid());
	// nextHeader.setGenerationStamp(getGenerationStamp());
	// nextHeader.setPipelineSize(getPipelineSize());
	// nextHeader.setRecovery(isRecovery());
	// nextHeader.setClient(getClient());
	// nextHeader.setHasSrcDataNode(isHasSrcDataNode());
	// if (isHasSrcDataNode()) {
	// nextHeader.setSrcDataNode(getSrcDataNode());
	// }
	//
	// int nextPipeSize = getNumTargets() - 1;
	// if (nextPipeSize > 0) {
	// DatanodeInfo[] nextPipe = new DatanodeInfo[nextPipeSize];
	// nextHeader.setTargets(nextPipe);
	// for (int i = 1; i < getNumTargets(); i++) {
	// nextPipe[i - 1] = getTargetByIndex(i);
	// }
	// }
	//
	// nextHeader.setAccessToken(getAccessToken());
	//
	// return nextHeader;
	// }

	// void writeNextPipeHeader(DataOutput out) throws IOException {
	// out.writeShort(DataTransferProtocol.DATA_TRANSFER_VERSION);
	// out.writeByte(DataTransferProtocol.OP_WRITE_BLOCK);
	// out.writeLong(getBlkid());
	// out.writeLong(getGenerationStamp());
	// out.writeInt(getPipelineSize());
	// out.writeBoolean(isRecovery());
	// Text.writeString(out, getClient());
	// out.writeBoolean(isHasSrcDataNode());
	// if (isHasSrcDataNode()) {
	// getSrcDataNode().write(out);
	// }
	// int nextPipeSize = getNumTargets() - 1;
	// out.writeInt((nextPipeSize > 0) ? nextPipeSize : 0);
	// if (nextPipeSize > 0) {
	// for (int i = 0; i < nextPipeSize; i++) {
	// targets[i + 1].write(out);
	// }
	// }
	// getAccessToken().write(out);
	// }

	int getPipelineSize() {
		return pipelineSize;
	}

	public String getClientName() {
		return clientName;
	}

	public DatanodeInfo getSrcDataNode() {
		return source;
	}

	int getNumTargets() {
		return (targets != null) ? getTargets().length : 0;
	}

	DatanodeInfo[] getTargets() {
		return targets;
	}

	DatanodeInfo getTargetByIndex(int targetIndex) {
		return targets[targetIndex];
	}

	public DataChecksum getRequestedChecksum() {
		return requestedChecksum;
	}

	public BlockConstructionStage getStage() {
		return stage;
	}

	public ExtendedBlock getBlock() {
		return this.blk;
	}

	public long getLatestGenerationStamp() {
		return latestGenerationStamp;
	}

	public long getMinBytesRcvd() {
		return minBytesRcvd;
	}

	public long getMaxBytesRcvd() {
		return maxBytesRcvd;
	}

	public Token<BlockTokenIdentifier> getBlockToken() {
		return blockToken;
	}

	// TODO:toString()
}
