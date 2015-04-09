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

import java.net.URI;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.util.StringUtils;
import org.accelio.jxio.ClientSession;
import org.accelio.jxio.EventQueueHandler;
import org.accelio.jxio.Msg;
import org.accelio.jxio.MsgPool;
import org.accelio.jxio.ServerPortal;
import org.accelio.jxio.ServerSession;
import org.accelio.jxio.EventQueueHandler.Callbacks;
import org.accelio.jxio.WorkerCache.Worker;

public class ServerPortalWorker implements Worker {
	private static final Log LOG = LogFactory.getLog(ServerPortalWorker.class.getName());
	private Thread th = null;
	protected final EventQueueHandler eqh;
	protected ServerPortal sp = null;
	protected final URI uri;
	private final IOBufferSupplier ioBufferSupplier;
	private final ConcurrentLinkedQueue<Runnable> asyncOprQueue;
	private final AtomicLong msgCounter = new AtomicLong(0);
	private final AtomicInteger sessionsCounter = new AtomicInteger(0);
	private final int msgOutSize;
	private final int msgInSize;
	private final int numSessionsLimit;
	private final int spwNumber;
	private final int dynamicMsgAllocationAmount;

	private final Callbacks onDynamicMsgPoolAllocation = new EventQueueHandler.Callbacks() {

		@Override
		public MsgPool getAdditionalMsgPool(int inSize, int outSize) {
			LOG.warn("Potential resources leak - JXIO is missing msg resources, allocating additional buffers. SP=" + ServerPortalWorker.this.sp);

			// allocating new ioBuffers.
			ioBufferSupplier.allocateBuffers(dynamicMsgAllocationAmount, msgInSize);

			return new MsgPool(dynamicMsgAllocationAmount, msgInSize, msgOutSize);
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
		final DataXceiverBase dxc;
		final Msg msg;
		final List<Msg> onFlightMsgs;
		final boolean lastPacktInBlock;

		AsyncReply(DataXceiverBase dxc, Msg msg, List<Msg> onFlightMsgs, boolean lastPacktInBlock) {
			this.session = dxc.getSessionServer();
			this.dxc = dxc;
			this.msg = msg;
			this.onFlightMsgs = onFlightMsgs;
			this.lastPacktInBlock = lastPacktInBlock;
		}

		@Override
		public void run() {
			if (!session.getIsClosing()) {
				R4HProtocol.wrappedSendResponse(session, msg, LOG);
				if (onFlightMsgs != null) { // TODO: list is not safe!!!
					onFlightMsgs.remove(msg);
				}
			}
			if (!dxc.isSessionEnded && lastPacktInBlock) {
				dxc.isSessionEnded = true;
				decermentSessionsCounter();
				dxc.shutDownAuxillaryExecutor();
			}
		}
	}

	private class AsyncRequest implements Runnable {
		final Msg msg;
		final DataXceiverBase dxc;

		AsyncRequest(Msg msg, DataXceiverBase dxc) {
			this.msg = msg;
			this.dxc = dxc;
		}

		@Override
		public void run() {
			if (!dxc.clientSession.getIsClosing()) {
				R4HProtocol.wrappedSendRequest(dxc.clientSession, msg, LOG);
				dxc.clientOnFlightNumMsgs++;
			}
		}
	}

	private class AsyncPipelineConnection implements Runnable {
		final DataXceiverBase dxc;
		final ClientSession.Callbacks callbacks;
		final String clientURI;
		final WriteOprHeader oprHeader;

		AsyncPipelineConnection(ClientSession.Callbacks callbacks, String clientURI, WriteOprHeader header, DataXceiverBase dxc) {
			this.callbacks = callbacks;
			this.clientURI = clientURI;
			this.oprHeader = header;
			this.dxc = dxc;
		}

		@Override
		public void run() {
			try {
				/* Open connection */
				int index = clientURI.indexOf("&clientHash=");
				URI uri = R4HProtocol.createPipelineURI(oprHeader.getTargets(), clientURI.substring(index));
				LOG.info("Open a proxy client session: " + uri);
				dxc.clientSession = new ClientSession(eqh, uri, callbacks);
			} catch (Throwable t) {
				LOG.error("Failed to create pipeline connection");
				if (dxc.clientSession != null && !dxc.clientSession.getIsClosing()) {
					dxc.clientSession.close();
				}
			}
		}
	}

	ServerPortalWorker(URI uri, int numOfMsgsToBind, int msgInSize, int msgOutSize, int numSessionsLimit, int spwNumber,
	        int dynamicMsgAllocationAmount, boolean allocateResources) {
		this.uri = uri;
		this.msgInSize = msgInSize;
		this.msgOutSize = msgOutSize;
		this.numSessionsLimit = numSessionsLimit;
		this.spwNumber = spwNumber;
		this.dynamicMsgAllocationAmount = dynamicMsgAllocationAmount;

		if (allocateResources) { // dxcs in accept model or worker in forward model
			this.eqh = new R4HEventHandler(onDynamicMsgPoolAllocation, onEqhBreak);
			MsgPool msgPool = new MsgPool(numOfMsgsToBind, msgInSize, msgOutSize);
			this.ioBufferSupplier = new IOBufferSupplier(numOfMsgsToBind, msgInSize);
			this.eqh.bindMsgPool(msgPool);
			this.asyncOprQueue = new ConcurrentLinkedQueue<>();
		} else { // dxcs in forward model
			this.eqh = new R4HEventHandler(null, null);
			this.ioBufferSupplier = null;
			this.asyncOprQueue = null;
		}
	}

	// Constructor for workers in forward model
	ServerPortalWorker(URI uri, int numOfMsgsToBind, int msgInSize, int msgOutSize, int isFreeLimit, int spwNumber, int dynamicMsgAllocationAmount) {
		this(uri, numOfMsgsToBind, msgInSize, msgOutSize, isFreeLimit, spwNumber, dynamicMsgAllocationAmount, true);
		this.sp = new ServerPortal(eqh, uri, null);
		this.th = new Thread(eqh);
		this.th.setName(String.format("ServerPortalWorker-%d", spwNumber));
	}

	void start() {
		th.start();
	}

	@Override
	public String toString() {
		return String.format("ServerPortalWorker{thread='%s', sp='%s', ioBufferSupplier='%s'}", th, sp, ioBufferSupplier.size());
	}

	void processReplies() {
		msgCounter.set(0);
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

	void queueAsyncReply(DataXceiverBase dxc, Msg msg, List<Msg> onFlightMsgs, boolean breakEventLoop, boolean lastPacketInBlock) {
		asyncOprQueue.add(new AsyncReply(dxc, msg, onFlightMsgs, lastPacketInBlock));
		if (msgCounter.incrementAndGet() % 10 == 0 || breakEventLoop || onFlightMsgs.size() < 10) {
			eqh.breakEventLoop();
		}
	}

	void queueAsyncRunnable(Runnable task) {
		asyncOprQueue.add(task);
		eqh.breakEventLoop();
	}

	void queueAsyncRequest(Msg msg, DataXceiverBase dxc) {
		asyncOprQueue.add(new AsyncRequest(msg, dxc));
		eqh.breakEventLoop();
	}

	void queueAsyncPipelineConnection(ClientSession.Callbacks callbacks, String clientURI, WriteOprHeader header, DataXceiverBase dxc) {
		asyncOprQueue.add(new AsyncPipelineConnection(callbacks, clientURI, header, dxc));
		eqh.breakEventLoop();
	}

	@Override
	public boolean isFree() {
		return this.sessionsCounter.get() < this.numSessionsLimit;
	}

	void incrementSessionsCounter() {
		int value = this.sessionsCounter.incrementAndGet();
		if (LOG.isDebugEnabled()) {
			LOG.debug(String.format("incrementing spw's counter - counter after increment = %d , spw number = %d , isFreeLimit = %d", value,
			        this.spwNumber, this.numSessionsLimit));
		}
	}

	int getSessionsCounterValue() {
		return this.sessionsCounter.intValue();
	}

	void decermentSessionsCounter() {
		int value = this.sessionsCounter.decrementAndGet();
		if (LOG.isDebugEnabled()) {
			LOG.debug(String.format("decrementing spw's counter - counter after decerment = %d , spw number = %d , isFreeLimit = %d", value,
			        this.spwNumber, this.numSessionsLimit));
		}
	}

	IOBufferSupplier getIOBufferSupplier() {
		return this.ioBufferSupplier;
	}
}
