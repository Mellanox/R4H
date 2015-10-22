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
import org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status;

public class R4HPipelineAck extends PipelineAck {

	/**
	 * Constructor assuming no next DN in pipeline
	 * @param seqno sequence number
	 * @param replies an array of replies
	 */
	public R4HPipelineAck(long seqno, Status[] replies) {
		super(seqno, replies);
	}

	/**
	 * Constructor
	 * @param seqno sequence number
	 * @param replies an array of replies
	 * @param downstreamAckTimeNanos ack RTT in nanoseconds, 0 if no next DN in pipeline
	 */
	public R4HPipelineAck(long seqno, Status[] replies, long downstreamAckTimeNanos) {
		super(seqno, replies, downstreamAckTimeNanos);
	}

	/** default constructor **/
	public R4HPipelineAck() {
		super();
	}

	/**
	 * get the ith reply - The api has been changed since hadoop 2.6
	 * @return the the ith reply
	 */
	public Status getReply(int i) {
		return super.getReply(i);
	}
}
