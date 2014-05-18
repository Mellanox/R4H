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

import com.mellanox.jxio.EventQueueHandler;
import com.mellanox.jxio.Msg;
import com.mellanox.jxio.MsgPool;
import com.mellanox.jxio.ServerPortal;
import com.mellanox.jxio.ServerSession;

public class ServerPortalWorker {
	private final Thread th;
	private final MsgPool serverMsgPool;
	final EventQueueHandler eqh;
	final ServerPortal sp;
	private final LinkedList<ByteBuffer> ioBufferPool = new LinkedList<>();
	private final ConcurrentLinkedQueue<Runnable> asyncOprQueue = new ConcurrentLinkedQueue<>();

	Runnable onEqhBreak = new Runnable() {
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
		this.serverMsgPool = new MsgPool(numOfMsgsToBind + R4HProtocol.JX_SERVER_SPARE_MSGS, msgInSize, msgOutSize);
		this.eqh = new R4HEventHandler(null, onEqhBreak);
		this.eqh.bindMsgPool(serverMsgPool);
		this.sp = new ServerPortal(eqh, uri);
		this.th = new Thread(eqh);

		for (int j = 0; j < numOfMsgsToBind; j++) {
			ioBufferPool.add(ByteBuffer.allocate(msgInSize));
			// TODO: allocate one big ByteBuffer and slice it.
		}
	}

	void start() {
		th.start();
	}

	@Override
	public String toString() {
		return String.format("ServerPortalWorker{thread='%s', sp='%s', serverMsgPool='%s', ioBufferPool='%s'}", th, sp, serverMsgPool, ioBufferPool);
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
