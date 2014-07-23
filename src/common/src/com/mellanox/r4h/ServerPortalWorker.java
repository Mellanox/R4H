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

import java.io.IOException;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.io.Stringifier;
import org.apache.hadoop.util.StringUtils;

import com.mellanox.jxio.EventQueueHandler;
import com.mellanox.jxio.Msg;
import com.mellanox.jxio.MsgPool;
import com.mellanox.jxio.ServerPortal;
import com.mellanox.jxio.ServerSession;
import com.mellanox.jxio.EventQueueHandler.Callbacks;
import com.mellanox.jxio.WorkerCache.Worker;

public class ServerPortalWorker implements Worker {
	private static final Log LOG = LogFactory.getLog(ServerPortalWorker.class.getName());
	private final Thread th;
	final EventQueueHandler eqh;
	final ServerPortal sp;
	private final LinkedList<ByteBuffer> ioBufferPool = new LinkedList<>();
	private final ConcurrentLinkedQueue<Runnable> asyncOprQueue = new ConcurrentLinkedQueue<>();
	private final int msgOutSize;
	private final int msgInSize;
	private final int numOfMsgsToBind;
	private volatile boolean isFree = false;

	private final Callbacks onDynamicMsgPoolAllocation = new EventQueueHandler.Callbacks() {

		@Override
		public MsgPool getAdditionalMsgPool(int inSize, int outSize) {
			LOG.warn("Potential resources leak - JXIO is missing msg resources, allocating additional buffers. SP=" + ServerPortalWorker.this.sp
			        + "\n");
			return allocateBuffers();
		}
	};

	private final Runnable onEqhBreak = new Runnable() {
		@Override
		public void run() {
			processReplies();
		}
	};

	private class AsyncReply implements Runnable {
		final ServerSession session;
		final Msg msg;
		final List<Msg> onFlightMsgs;

		AsyncReply(ServerSession ss, Msg msg, List<Msg> onFlightMsgs) {
			this.session = ss;
			this.msg = msg;
			this.onFlightMsgs = onFlightMsgs;
		}

		@Override
		public void run() {
			if (!session.getIsClosing()) {
				session.sendResponse(msg);
				if (onFlightMsgs != null) { // Compatibility for CDH44 - no aligned with JXIO discard api yet
					onFlightMsgs.remove(msg);
				}
			}
		}
	}

	ServerPortalWorker(URI uri, int numOfMsgsToBind, int msgInSize, int msgOutSize) {
		this.msgInSize = msgInSize;
		this.msgOutSize = msgOutSize;
		this.numOfMsgsToBind = numOfMsgsToBind;
		this.eqh = new R4HEventHandler(onDynamicMsgPoolAllocation, onEqhBreak);

		this.sp = new ServerPortal(eqh, uri);
		this.th = new Thread(eqh);
		MsgPool msgPool = allocateBuffers();
		this.eqh.bindMsgPool(msgPool);
	}

	MsgPool allocateBuffers() {
		LOG.info(String.format("%s: Allocating %d messages (in=%dB, out=%sB) and addiotnal %d buffers X %dB for async IO", sp, numOfMsgsToBind,
		        msgInSize, msgOutSize, numOfMsgsToBind, msgInSize));
		MsgPool msgPool = new MsgPool(numOfMsgsToBind, msgInSize, msgOutSize);
		for (int j = 0; j < numOfMsgsToBind; j++) {
			ioBufferPool.add(ByteBuffer.allocate(msgInSize));
			// TODO: allocate one big ByteBuffer and slice it.
		}
		return msgPool;
	}

	void start() {
		th.start();
	}

	@Override
	public String toString() {
		return String.format("ServerPortalWorker{thread='%s', sp='%s', ioBufferPoolSize='%s'}", th, sp, ioBufferPool.size());
	}

	public synchronized ByteBuffer getAsyncIOBuffer() throws IOException {
		ByteBuffer buff = ioBufferPool.poll();
		if (buff == null) {
			throw new IOException("No more buffers for async IO");
		}
		buff.clear();
		return buff;
	}

	public synchronized void returnCurrAsyncIOBuffer(ByteBuffer buff) {
		if (buff != null) {
			buff.clear();
			ioBufferPool.add(buff);
		}
	}

	public void queueAsyncReply(ServerSession ss, Msg msg, List<Msg> onFlightMsgs) {
		asyncOprQueue.add(new AsyncReply(ss, msg, onFlightMsgs));
		// if (msgReplyQueue.size() >= REPLY_QUEUE_TRESHOLD_FOR_BREAK_EVENT_LOOP) {
		eqh.breakEventLoop();
		// }
	}

	void processReplies() {
		Runnable opr = asyncOprQueue.poll();
		while (opr != null) {
			try {
				opr.run();
			} catch (Throwable t) {
				LOG.error(StringUtils.stringifyException(t));
			}
			opr = asyncOprQueue.poll();
		}
	}

	public void queueAsyncRunnable(Runnable task) {
		asyncOprQueue.add(task);
		eqh.breakEventLoop();
	}

	@Override
	public boolean isFree() {
		return this.isFree;
	}

	void setFree(boolean isFree) {
		this.isFree = isFree;
	}
}
