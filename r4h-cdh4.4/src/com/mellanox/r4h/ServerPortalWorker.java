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
import java.util.concurrent.ConcurrentLinkedQueue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.mellanox.jxio.EventQueueHandler;
import com.mellanox.jxio.Msg;
import com.mellanox.jxio.MsgPool;
import com.mellanox.jxio.ServerPortal;
import com.mellanox.jxio.ServerSession;
import com.mellanox.jxio.EventQueueHandler.Callbacks;

public class ServerPortalWorker {
	private static final Log LOG = LogFactory.getLog(ServerPortalWorker.class.getName());
	private final Thread th;
	final EventQueueHandler eqh;
	final ServerPortal sp;
	private final LinkedList<ByteBuffer> ioBufferPool = new LinkedList<>();
	private final ConcurrentLinkedQueue<Runnable> asyncOprQueue = new ConcurrentLinkedQueue<>();
	private final int msgOutSize;
	private final int msgInSize;
	private final int numOfMsgsToBind;
	private final Callbacks onDynamicMsgPoolAllocation = new EventQueueHandler.Callbacks() {

		@Override
		public MsgPool getAdditionalMsgPool(int inSize, int outSize) {
			LOG.warn("Potential resources leak - JXIO is missing msg resources, allocating additional buffers. SP=" + ServerPortalWorker.this.sp + "\n");
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

		AsyncReply(ServerSession ss, Msg msg) {
			this.session = ss;
			this.msg = msg;
		}

		@Override
		public void run() {
			session.sendResponse(msg);
		}
	}

	ServerPortalWorker(URI uri, int numOfMsgsToBind, int msgInSize, int msgOutSize) {
		this.msgInSize = msgInSize;
		this.msgOutSize = msgOutSize;
		this.numOfMsgsToBind = numOfMsgsToBind;
		this.eqh = new R4HEventHandler(onDynamicMsgPoolAllocation, onEqhBreak);

		MsgPool msgPool = allocateBuffers();
		this.eqh.bindMsgPool(msgPool);

		this.sp = new ServerPortal(eqh, uri);
		this.th = new Thread(eqh);
	}

	MsgPool allocateBuffers() {
		LOG.info(String.format("%s : Allocating %d messages (in=%dB, out=%sB) and addiotnal %dX%dB buffers for async IO", this.sp,numOfMsgsToBind, msgInSize, msgOutSize, numOfMsgsToBind, msgInSize));
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

	public void queueAsyncReply(ServerSession ss, Msg msg) {
		asyncOprQueue.add(new AsyncReply(ss, msg));
		// if (msgReplyQueue.size() >= REPLY_QUEUE_TRESHOLD_FOR_BREAK_EVENT_LOOP) {
		eqh.breakEventLoop();
		// }
	}

	void processReplies() {
		Runnable opr = asyncOprQueue.poll();
		while (opr != null) {
			opr.run();
			opr = asyncOprQueue.poll();
		}
	}

	public void queueAsyncRunnable(Runnable task) {
		asyncOprQueue.add(task);
		eqh.breakEventLoop();
	}

}
