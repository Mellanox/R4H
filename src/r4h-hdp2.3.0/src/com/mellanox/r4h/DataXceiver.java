package com.mellanox.r4h;

import static org.apache.hadoop.hdfs.protocol.datatransfer.DataTransferProtoUtil.fromProto;
import static org.apache.hadoop.hdfs.protocolPB.PBHelper.vintPrefixed;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import org.accelio.jxio.ServerSession.SessionKey;
import org.apache.hadoop.hdfs.protocol.DatanodeInfo;
import org.apache.hadoop.hdfs.protocol.ExtendedBlock;
import org.apache.hadoop.hdfs.protocol.datatransfer.BlockConstructionStage;
import org.apache.hadoop.hdfs.protocol.datatransfer.Sender;
import org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto;
import org.apache.hadoop.hdfs.protocolPB.PBHelper;
import org.apache.hadoop.hdfs.server.datanode.CachingStrategy;

public class DataXceiver extends DataXceiverBase {

	DataXceiver(DataXceiverServer dxcs, ServerPortalWorker spw, SessionKey sKey, R4HExecutor ioExec, R4HExecutor auxExec) {
		super(dxcs, spw, sKey, ioExec, auxExec);
	}

	@Override
	void parseOpWriteBlock(DataInputStream in) throws IOException {
		final OpWriteBlockProto proto = OpWriteBlockProto.parseFrom(vintPrefixed(in));
		final DatanodeInfo[] targets = PBHelper.convert(proto.getTargetsList());
		oprHeader = new WriteOprHeader2_7(PBHelper.convert(proto.getHeader().getBaseHeader().getBlock()), PBHelper.convertStorageType(proto
		        .getStorageType()), PBHelper.convert(proto.getHeader().getBaseHeader().getToken()), proto.getHeader().getClientName(), targets,
		        PBHelper.convertStorageTypes(proto.getTargetStorageTypesList(), targets.length), PBHelper.convert(proto.getSource()),
		        BlockConstructionStage.valueOf(proto.getStage().name()), proto.getPipelineSize(), proto.getMinBytesRcvd(), proto.getMaxBytesRcvd(),
		        proto.getLatestGenerationStamp(), fromProto(proto.getRequestedChecksum()),
		        (proto.hasCachingStrategy() ? getCachingStrategy(proto.getCachingStrategy()) : CachingStrategy.newDefaultStrategy()),
		        (proto.hasAllowLazyPersist() ? proto.getAllowLazyPersist() : false), (proto.hasPinning() ? proto.getPinning() : false), 
		        PBHelper.convertBooleanList(proto.getTargetPinningsList()));
	}

	@Override
	void senderWriteBlock(DataOutputStream out, ExtendedBlock origBlk) throws IOException {
		new Sender(out).writeBlock(origBlk, ((WriteOprHeader2_7) oprHeader).getStorageType(), oprHeader.getBlockToken(), oprHeader.getClientName(),
		        oprHeader.getTargets(), ((WriteOprHeader2_7) oprHeader).getAllStorageTypes(), oprHeader.getSrcDataNode(), oprHeader.getStage(),
		        oprHeader.getPipelineSize(), oprHeader.getMinBytesRcvd(), oprHeader.getMaxBytesRcvd(), oprHeader.getLatestGenerationStamp(),
		        oprHeader.getRequestedChecksum(), oprHeader.getCachingStrategy(), ((WriteOprHeader2_7) oprHeader).getAllowLazyPersist(), 
		        ((WriteOprHeader2_7) oprHeader).getAllowPinning(), ((WriteOprHeader2_7) oprHeader).getTargetPinnings());
	}

}
