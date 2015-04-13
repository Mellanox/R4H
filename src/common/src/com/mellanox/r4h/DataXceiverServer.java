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
import java.net.URISyntaxException;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ThreadFactory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.hdfs.server.datanode.DataNodeBridge;
import org.accelio.jxio.EventName;
import org.accelio.jxio.EventReason;
import org.accelio.jxio.ServerPortal;
import org.accelio.jxio.WorkerCache;
import org.accelio.jxio.ServerSession.SessionKey;
import org.accelio.jxio.WorkerCache.Worker;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

/**
 * R4H's parallel class to the original org.apache.hadoop.hdfs.server.datanode.DataXceiverServer
 * 
 * @see org.apache.hadoop.hdfs.server.datanode.DataXceiverServer Implemented with JXIO RDMA library to listen for R4H
 *      clients connection requests. It opens new sessions for every requests and bind it with JX's Event Queue Handler
 *      worker thread
 */
class DataXceiverServer extends ServerPortalWorker implements Runnable {
	static final Log LOG = LogFactory.getLog(DataXceiverServer.class.getName());
	private final ThreadGroup threadGroup;
	final DataNodeBridge dnBridge;
	private final boolean isForwardEnable;
	private final LinkedList<ServerPortalWorker> spPool;
	private final LinkedList<R4HExecutor> ioExecutorPool;
	private final ConcurrentLinkedQueue<R4HExecutor> auxExecutorPool;
	private final ThreadFactory auxThreadFactory;

	private class DXSCallbacks implements ServerPortal.Callbacks {

		@Override
		public void onSessionEvent(EventName session_event, EventReason reason) {
			switch (session_event) {
				case SESSION_CLOSED:
					LOG.info(String.format("Session event: type=%s reason=%s", session_event, reason));
					break;
				case SESSION_ERROR:
				case SESSION_REJECT:
					LOG.error(String.format("Session event: type=%s reason=%s", session_event, reason));
					break;
				default:
					break;
			}
		}

		/**
		 * @param sesKey
		 * @param srcIP
		 */
		@Override
		public void onSessionNew(SessionKey sesKey, String srcIP, Worker workerHint) {
			LOG.info(String.format("New session request from %s (uri=%s)", srcIP, sesKey.getUri()));
			ServerPortalWorker spw;
			if (isForwardEnable) {
				if ((workerHint != null) && (workerHint instanceof ServerPortalWorker)) {
					spw = (ServerPortalWorker) workerHint;
				} else {
					LOG.error("Got invalid server portal worker cache hint. Getting manually next free worker.");
					spw = getNextFreePortalWorker();
				}
			} else {
				spw = DataXceiverServer.this;
			}

			spw.incrementSessionsCounter();
			R4HExecutor ioExecutor = getNextIOExecutor();
			R4HExecutor auxExecutor = getNextFreeAuxillaryExecutor();
			DataXceiverBase dxc = new DataXceiver(DataXceiverServer.this, spw, sesKey, ioExecutor, auxExecutor);

			if (isForwardEnable) {
				sp.forward(spw.sp, dxc.getSessionServer());
				if (LOG.isDebugEnabled()) {
					LOG.debug("After session forward: spw=" + spw + " , uri=" + dxc.getUri());
				}
			} else {
				sp.accept(dxc.getSessionServer());
				if (LOG.isDebugEnabled()) {
					LOG.debug("After session accept: spw=" + spw + " , uri=" + dxc.getUri());
				}
			}
		}

		private R4HExecutor getNextFreeAuxillaryExecutor() {
			R4HExecutor ans;
			if (!auxExecutorPool.isEmpty()) {
				ans = auxExecutorPool.poll();
			} else {
				LOG.warn("No more auxillary executors available in the pool, allocating a new auxillary executor");
				ans = new R4HExecutor(auxThreadFactory);
			}
			return ans;
		}

		private R4HExecutor getNextIOExecutor() {
			R4HExecutor ans = ioExecutorPool.poll();
			ioExecutorPool.add(ans);
			return ans;
		}

	}

	private ServerPortalWorker getNextFreePortalWorker() {
		ServerPortalWorker minSessionsSpw = spPool.getFirst();

		for (ServerPortalWorker spw : spPool) {
			if (spw.isFree()) {
				return spw;
			} else if (spw.getSessionsCounterValue() < minSessionsSpw.getSessionsCounterValue()) {
				minSessionsSpw = spw;
			}
		}
		// if we got here then all spw exceeded the #sessions limit - pick the spw with the lowest #sessions.
		return minSessionsSpw;
	}

	DataXceiverServer(DataNodeBridge dnBridge) throws URISyntaxException {
		super(new URI(String.format("rdma://%s", dnBridge.getDN().getDisplayName())), dnBridge.numOfMsgsToBind, dnBridge.msgInSize,
		        dnBridge.msgOutSize, dnBridge.numSessionsLimit, 0, dnBridge.dynamicMsgAllocationAmount, !dnBridge.isForwardEnable);
		LOG.debug("After EventQueueHandler creation");

		this.dnBridge = dnBridge; // TODO: remove debug DNexpoable and rename top DataNodeBridge
		this.threadGroup = new ThreadGroup("R4H Datanode Threads");
		LOG.info("Creating DataXceiverServer - uri=" + uri);
		DataXceiverServer.DXSCallbacks dxsCbs = this.new DXSCallbacks();
		this.sp = new ServerPortal(eqh, uri, dxsCbs, new WorkerCache.WorkerProvider() {
			@Override
			public Worker getWorker() {
				return getNextFreePortalWorker();
			}
		});

		LOG.debug("After ServerPortal creation");
		LOG.trace("writePacketSize=" + dnBridge.getWritePacketSize());

		URI workerUri = new URI(String.format("rdma://%s:0", this.uri.getHost()));

		this.spPool = new LinkedList<ServerPortalWorker>();

		isForwardEnable = dnBridge.isForwardEnable;

		if (isForwardEnable) {
			LOG.info("Using forward model");
			int spwAmount = dnBridge.spwAmount;

			LOG.info(String.format("Starting ahead %d server portal worker with sessions limit of %d sessions each", spwAmount,
			        dnBridge.numSessionsLimit));
			for (int i = 1; i <= spwAmount; i++) {
				ServerPortalWorker spw = new ServerPortalWorker(workerUri, dnBridge.numOfMsgsToBind / spwAmount, dnBridge.msgInSize,
				        dnBridge.msgOutSize, dnBridge.numSessionsLimit, i, dnBridge.dynamicMsgAllocationAmount);
				spw.start();
				spPool.add(spw);
				LOG.info("Started new server portal worker thread: " + spw);
			}
		} else {
			LOG.info("Using accept model");
			LOG.info("Started a new worker thread: " + super.toString());
		}

		auxThreadFactory = new ThreadFactoryBuilder().setNameFormat("r4h-auxillary-thread-%d").build();
		ThreadFactory ioThreadFactory = new ThreadFactoryBuilder().setNameFormat("r4h-io-thread-%d").build();

		LOG.info(String.format("Allocating ahead %d IO executors", dnBridge.numOfioExecutors));
		this.ioExecutorPool = new LinkedList<R4HExecutor>();
		for (int i = 0; i < dnBridge.numOfioExecutors; i++) {
			ioExecutorPool.add(new R4HExecutor(ioThreadFactory));
		}

		LOG.info(String.format("Allocating ahead %d Auxillary executors", dnBridge.numOfAuxExecutors));
		this.auxExecutorPool = new ConcurrentLinkedQueue<R4HExecutor>();
		for (int i = 0; i < dnBridge.numOfAuxExecutors; i++) {
			auxExecutorPool.add(new R4HExecutor(auxThreadFactory));
		}

		LOG.trace(this.toString());
	}

	@Override
	public void run() {
		LOG.debug("Start running event queue handler");
		this.eqh.run();
		LOG.debug("Returned from event queue handler run");
	}

	public void stop() {
		LOG.info("Stopping R4H resources");

		LOG.debug("Closing listener event queue handler");
		eqh.stop();

		if (isForwardEnable) {
			LOG.debug("Closing all workers");
			for (ServerPortalWorker spw : spPool) {
				spw.eqh.stop();
			}
		}
		spPool.clear();

		LOG.info("Stopped R4H resources");
	}

	@Override
	public String toString() {
		return String.format("DataXceiverServer{SP='%s', EQH='%s', ThreadPool='%s', URI='%s'}", sp, eqh.toString(), threadGroup.getName(), uri);
	}

	void returnAuxillaryExecutortoPool(R4HExecutor auxExecutor, boolean needThreadInit) {
		if (LOG.isDebugEnabled()) {
			LOG.debug("Returning Auxillary executor to pool :" + auxExecutor);
		}
		if (needThreadInit) {
			LOG.warn("Auxillary thread init requested. Allocating a new executor");
			List<Runnable> remainingTasks = auxExecutor.shutdownNow();
			if (!remainingTasks.isEmpty()) {
				LOG.warn(String.format("Shutting down Auxillary thread with %d remaining unexecuted tasks", remainingTasks.size()));
			}
			auxExecutorPool.add(new R4HExecutor(auxThreadFactory));
		} else {
			auxExecutorPool.add(auxExecutor);
		}
	}
}
