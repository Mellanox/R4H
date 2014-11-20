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

import org.apache.hadoop.hdfs.protocol.datatransfer.PipelineAck;

import org.accelio.jxio.Msg;

class PipelinePacketContext {
	final private Msg msg;
	private long seqno;
	private boolean isLastPacket;
	private boolean isAsyncIoFinished = false;
	private PipelineAck ackReadyToSend = null;

	static final int INIT_SEQNO = -1;

	Msg getMsg() {
		return msg;
	}

	long getSeqno() {
		return this.seqno;
	}

	boolean isLastPacketInBlock() {
		return this.isLastPacket;
	}

	boolean isAsyncIOFinished() {
		return isAsyncIoFinished;
	}

	PipelinePacketContext(Msg msg) {
		this.msg = msg;
		this.seqno = INIT_SEQNO;
		this.isLastPacket = false;
	}

	void setPktDetails(long seqno, boolean isLastPacketInBlock) {
		this.seqno = seqno;
		this.isLastPacket = isLastPacketInBlock;
	}

	void markAsyncIOasFinished() {
		this.isAsyncIoFinished = true;
	}

	void setAckReadyToSend(PipelineAck ack) {
		this.ackReadyToSend = ack;
	}

	PipelineAck getAckReadyToSend() {
		return ackReadyToSend;
	}
	
	boolean isAckReadyToSend() {
		return ackReadyToSend != null;
	}

}
