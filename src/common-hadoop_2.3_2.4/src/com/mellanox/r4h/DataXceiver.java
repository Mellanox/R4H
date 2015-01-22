package com.mellanox.r4h;

import static org.apache.hadoop.hdfs.protocolPB.PBHelper.vintPrefixed;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import org.accelio.jxio.ServerSession.SessionKey;
import org.apache.hadoop.hdfs.protocol.ExtendedBlock;
import org.apache.hadoop.hdfs.protocol.datatransfer.BlockConstructionStage;
import org.apache.hadoop.hdfs.protocol.datatransfer.Sender;
import org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto;
import org.apache.hadoop.hdfs.protocolPB.PBHelper;
import org.apache.hadoop.hdfs.server.datanode.CachingStrategy;
import static org.apache.hadoop.hdfs.protocol.datatransfer.DataTransferProtoUtil.fromProto;

public class DataXceiver extends DataXceiverBase {

	DataXceiver(DataXceiverServer dxcs, ServerPortalWorker spw, SessionKey sKey) {
		super(dxcs, spw, sKey);
	}

	@Override
	void parseOpWriteBlock(DataInputStream in) throws IOException {
		final OpWriteBlockProto proto = OpWriteBlockProto.parseFrom(vintPrefixed(in));
		oprHeader = new WriteOprHeader(PBHelper.convert(proto.getHeader().getBaseHeader().getBlock()), PBHelper.convert(proto.getHeader()
		        .getBaseHeader().getToken()), proto.getHeader().getClientName(), PBHelper.convert(proto.getTargetsList()), PBHelper.convert(proto
		        .getSource()), BlockConstructionStage.valueOf(proto.getStage().name()), proto.getPipelineSize(), proto.getMinBytesRcvd(),
		        proto.getMaxBytesRcvd(), proto.getLatestGenerationStamp(), fromProto(proto.getRequestedChecksum()),
		        (proto.hasCachingStrategy() ? getCachingStrategy(proto.getCachingStrategy()) : CachingStrategy.newDefaultStrategy()));
	}

	@Override
    void senderWriteBlock(DataOutputStream out, ExtendedBlock origBlk) throws IOException {
	    new Sender(out).writeBlock(origBlk, oprHeader.getBlockToken(), oprHeader.getClientName(), oprHeader.getTargets(), oprHeader.getSrcDataNode(),
		        oprHeader.getStage(), oprHeader.getPipelineSize(), oprHeader.getMinBytesRcvd(), oprHeader.getMaxBytesRcvd(),
		        oprHeader.getLatestGenerationStamp(), oprHeader.getRequestedChecksum(), oprHeader.getCachingStrategy());
    }

}
