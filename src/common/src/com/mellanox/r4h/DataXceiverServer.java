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
import java.util.Hashtable;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hdfs.server.datanode.DataNode;
import org.apache.hadoop.hdfs.server.datanode.DataNodeBridge;
import org.apache.hadoop.util.StringUtils;

import org.accelio.jxio.EventName;
import org.accelio.jxio.EventQueueHandler;
import org.accelio.jxio.EventReason;
import org.accelio.jxio.ServerPortal;
import org.accelio.jxio.ServerSession;
import org.accelio.jxio.ServerSession.SessionKey;
import org.accelio.jxio.WorkerCache.Worker;
import org.accelio.jxio.WorkerCache.WorkerProvider;

/**
 * R4H's parallel class to the original org.apache.hadoop.hdfs.server.datanode.DataXceiverServer
 * 
 * @see org.apache.hadoop.hdfs.server.datanode.DataXceiverServer Implemented with JXIO RDMA library to listen for R4H
 *      clients connection requests. It opens new sessions for every requests and bind it with JX's Event Queue Handler
 *      worker thread
 */
class DataXceiverServer implements Runnable {
	static final Log LOG = LogFactory.getLog(DataXceiverServer.class.getName());
	private final ThreadGroup threadGroup;
	private final URI uri;
	final ServerPortal sp;
	final DataNodeBridge dnBridge;
	final EventQueueHandler eqh;
	private static final int NUM_OF_PRE_ALLOC_SERVER_PORTAL_WORKERS_DEFAULT = 30;
	private static final String NUM_OF_PRE_ALLOC_SERVER_PORTAL_WROKERS_PARAM_NAME = "r4h.server.portal.workers";
	private static final String CONNECTION_CACHING_PARAM_NAME = "r4h.connection.caching";
	private int numOfServerPortalWorkers;
	private final URI workerUri;
	final ConcurrentLinkedQueue<ServerPortalWorker> spPool;
	final Hashtable<ServerSession, DataXceiverBase> sessionToWorkerHashtable;
	private boolean conCacheEnable;

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
			try {
				LOG.info(String.format("New session request from %s (uri=%s)", srcIP, sesKey.getUri()));
				ServerPortalWorker spw;
				if (!DataXceiverServer.this.conCacheEnable) {
					spw = getFreeServerPortalWorker();
				} else {
					if (workerHint != null) {
						spw = (ServerPortalWorker) workerHint;
					} else {
						LOG.error("JXIO connection cache provided NULL worker hint. Pulling worker manually...");
						spw = getFreeServerPortalWorker();
					}

					if (spw.isFree()) {
						LOG.info("Got cached worker hint to attach with new session");
						spPool.remove(spw);
						spw.setFree(false);
					}
				}

				if (spw == null) {
					LOG.fatal("Failed to pull server worker. Rejecting new session request");
					sp.reject(sesKey, EventReason.UNSUCCESSFUL, "Failed to pull server worker");
				} else {
					DataXceiverBase dxc = new DataXceiver(DataXceiverServer.this, spw, sesKey);
					attachServerPortalWorker(dxc);
				}
			} catch (Throwable t) {
				LOG.error("Unexpected error during processing new session event: " + StringUtils.stringifyException(t));
				sp.reject(sesKey, EventReason.UNSUCCESSFUL, "Exception during processing session event");
			}
		}
	}

	DataXceiverServer(DataNode dn) throws URISyntaxException {
		this.dnBridge = new DataNodeBridge(dn); // TODO: remove debug DNexpoable and rename top DataNodeBridge
		this.uri = new URI(String.format("rdma://%s", dn.getDisplayName()));
		this.threadGroup = new ThreadGroup("R4H Datanode Threads");
		LOG.info("Creating DataXceiverServer - uri=" + uri);
		this.eqh = new R4HEventHandler(null, null);
		LOG.debug("Aftet EventQueueHandler creation");
		DataXceiverServer.DXSCallbacks dxsCbs = this.new DXSCallbacks();

		conCacheEnable = dn.getConf().getBoolean(CONNECTION_CACHING_PARAM_NAME, true);
		if (conCacheEnable) {
			LOG.info("Using JXIO connection caching");
			WorkerProvider wp = new WorkerProvider() {
				@Override
				public Worker getWorker() {
					return getFreeServerPortalWorker();
				}
			};
			this.sp = new ServerPortal(eqh, uri, dxsCbs, wp);
		} else {
			this.sp = new ServerPortal(eqh, uri, dxsCbs);
		}
		LOG.debug("Aftet ServerPortal creation");

		LOG.trace("writePacketSize=" + dnBridge.getWritePacketSize());

		Configuration dnConf = this.dnBridge.getDN().getConf();
		this.numOfServerPortalWorkers = dnConf.getInt(NUM_OF_PRE_ALLOC_SERVER_PORTAL_WROKERS_PARAM_NAME,
		        NUM_OF_PRE_ALLOC_SERVER_PORTAL_WORKERS_DEFAULT);
		LOG.info(String.format("Starting ahead %d server portal worker", numOfServerPortalWorkers));
		this.sessionToWorkerHashtable = new Hashtable<ServerSession, DataXceiverBase>();
		workerUri = new URI(String.format("rdma://%s:0", this.uri.getHost()));
		this.spPool = new ConcurrentLinkedQueue<ServerPortalWorker>();
		for (int i = 0; i < this.numOfServerPortalWorkers; i++) {
			ServerPortalWorker spw = new ServerPortalWorker(workerUri, R4HProtocol.MAX_SEND_PACKETS + R4HProtocol.JX_SERVER_SPARE_MSGS,
			        dnBridge.getWritePacketSize() + R4HProtocol.JX_BUF_SPARE, R4HProtocol.ACK_SIZE);
			spw.start();
			spPool.add(spw);
			LOG.info("Started new server portal worker thread: " + spw);
		}

		LOG.trace(this.toString());
	}

	synchronized ServerPortalWorker getFreeServerPortalWorker() {
		ServerPortalWorker spw;
		if (spPool.isEmpty()) {
			LOG.warn("Server workers pool is empty... allocating and starting new worker");
			spw = new ServerPortalWorker(workerUri, R4HProtocol.MAX_SEND_PACKETS + R4HProtocol.JX_SERVER_SPARE_MSGS, dnBridge.getWritePacketSize()
			        + R4HProtocol.JX_BUF_SPARE, R4HProtocol.ACK_SIZE);
			spw.start();
		} else {
			spw = spPool.remove();
		}
		spw.setFree(false);
		return spw;
	}

	@Override
	public void run() {
		LOG.debug("Start running event queue handler");
		this.eqh.run();
		LOG.debug("Returned from event queue handler run");
	}

	public void stop() {
		// TODO: PROPER CLOSE OF ALL WORKERS!

		LOG.debug("Closing main listener event queue handler");
		eqh.close();
		LOG.debug("After main listener event queue handler close");
	}

	@Override
	public String toString() {
		return String.format("DataXceiverServer{SP='%s', EQH='%s', ThreadPool='%s', URI='%s', #DXC='%d'}", sp, eqh.toString(), threadGroup.getName(),
		        uri, sessionToWorkerHashtable.size());
	}

	synchronized void attachServerPortalWorker(DataXceiverBase dxc) {
		sessionToWorkerHashtable.put(dxc.getSessionServer(), dxc);
		ServerPortalWorker spw = dxc.getServerPortalWorker();
		dxc.setServerPortalWorker(spw);
		sp.forward(spw.sp, dxc.getSessionServer());
		if (LOG.isDebugEnabled()) {
			LOG.debug("After session forward: spw=" + spw + " , uri=" + dxc.getUri());
		}
	}

	synchronized void returnServerWorkerToPool(ServerSession ss, boolean needIOThreadInit) {
		if (sessionToWorkerHashtable.containsKey(ss)) {
			DataXceiverBase dxc = sessionToWorkerHashtable.get(ss);
			ServerPortalWorker spw = dxc.getServerPortalWorker();
			sessionToWorkerHashtable.remove(ss);
			if (needIOThreadInit) {
				LOG.warn("IO thread init requested. Allocating a new executor");
				List<Runnable> remainingTasks = spw.getPacketAsyncIOExecutor().shutdownNow();
				if (!remainingTasks.isEmpty()) {
					LOG.warn(String.format("Shutting down IO thread with %d remaining unexecuted tasks", remainingTasks.size()));
				}
				spw.setPacketAsyncIOExecutor(Executors.newSingleThreadExecutor());
			}
			// Adding worker to pool before marking it as free is necessary
			// This way JXIO does not supply it as a hinted before it's back in the pool
			spPool.add(spw);
			spw.setFree(true);
			
			if (LOG.isDebugEnabled()) {
				LOG.debug("returned SPW to pool. poolSize=" + spPool.size());
			}
		} else {
			LOG.error(String.format("Failed to retrieve worker from session-->worker hashtable. missing session=%s", ss));
			LOG.warn("Potential resource leak - Failed to return server portal worker to pool");
		}
	}

}
