package com.mellanox.r4h;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

import org.accelio.jxio.Msg;
import org.apache.hadoop.hdfs.protocol.datatransfer.PacketHeader;
import org.apache.hadoop.hdfs.protocol.datatransfer.PipelineAck;

class PacketMessageContext {

	private final AtomicInteger referenceCounter;
	private ByteBuffer ioBuffer;
	private PipelineAck messageAck;
	private long seqNo;
	private long offsetInBlock;
	private boolean isLastPkt;
	private boolean syncBlock;
	private boolean completeProcessing = false;
	private boolean notifyLastPacket = false;

	PacketMessageContext() {
		this.referenceCounter = new AtomicInteger(0);
	}

	ByteBuffer getIOBuffer() {
		return this.ioBuffer;
	}

	void setPacketData(PacketHeader packetHeader, ByteBuffer ioBuffer) {
		this.offsetInBlock = packetHeader.getOffsetInBlock();
		this.seqNo = packetHeader.getSeqno();
		this.syncBlock = packetHeader.getSyncBlock();
		this.isLastPkt = packetHeader.isLastPacketInBlock();
		this.ioBuffer = ioBuffer;
	}

	void setMessageAck(PipelineAck messageAck) {
		this.messageAck = messageAck;
	}

	PipelineAck getMessageAck() {
		return this.messageAck;
	}

	boolean getSyncBlock() {
		return this.syncBlock;
	}

	boolean isLastPacketInBlock() {
		return this.isLastPkt;
	}

	long getSeqno() {
		return this.seqNo;
	}

	long getUpdatedOffsetInBlock() {
		return this.offsetInBlock;
	}

	int incrementReferenceCounter() {
		return this.referenceCounter.incrementAndGet();
	}

	int decrementReferenceCounter() {
		return this.referenceCounter.decrementAndGet();
	}

	static PacketMessageContext getPacketMessageContext(Msg msg) {
		return (PacketMessageContext) msg.getUserContext();
	}

	boolean getIsCompleted() {
		return this.completeProcessing;
	}

	void setPacketComplete() {
		this.completeProcessing = true;
	}

	boolean isNotifyForLastPacketNeeded() {
		return this.notifyLastPacket;
	}

	void markNotifyNeededForLastPacket() {
		this.notifyLastPacket = true;
	}

}
