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
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hdfs.server.datanode.BlockReceiverBridge;
import org.apache.hadoop.hdfs.server.datanode.DataNode;
import org.apache.hadoop.hdfs.server.datanode.DataNodeBridge;

import com.mellanox.jxio.ClientSession;
import com.mellanox.jxio.EventName;
import com.mellanox.jxio.EventQueueHandler;
import com.mellanox.jxio.EventQueueHandler.Callbacks;
import com.mellanox.jxio.EventReason;
import com.mellanox.jxio.Msg;
import com.mellanox.jxio.MsgPool;
import com.mellanox.jxio.ServerPortal;
import com.mellanox.jxio.ServerSession;
import com.mellanox.jxio.ServerSession.SessionKey;
import com.mellanox.r4h.DataXceiver.CSCallbacks;

/**
 * R4H's parallel class to the original org.apache.hadoop.hdfs.server.datanode.DataXceiverServer
 * 
 * @see org.apache.hadoop.hdfs.server.datanode.DataXceiverServer Implemented with JXIO RDMA library to listen for R4H
 *      clients connection requests. It opens new sessions for every requests and bind it with JX's Event Queue Handler
 *      worker thread
 */
class DataXceiverServer implements Runnable {
	static final Log LOG = LogFactory.getLog(DataXceiverServer.class.getName());
	private static final int DEFAULT_NUM_OF_PREALLOC_MSGPOOLS = R4HProtocol.MSG_POOLS_GROWTH_FACTOR;
	private final ThreadGroup threadGroup;
	private final URI uri;
	private final List<DataXceiver> dxcList;
	final ServerPortal sp;
	final DataNodeBridge dnBridge;
	final EventQueueHandler eqh;


	private static final int NUM_OF_PRE_ALLOC_SERVER_PORTAL_WORKERS_DEFAULT = 16;
	private static final String NUM_OF_PRE_ALLOC_SERVER_PORTAL_WROKERS_PARAM_NAME = "r4h.server.portal.workers";
	private int numOfServerPortalWorkers;
	private final URI workerUri;
	final List<ServerPortalWorker> spPool;
	final Hashtable<ServerSession, ServerPortalWorker> sessionToWorkerHashtable;
	private final Hashtable<ServerSession, MsgPool> ssMsgPoolHash = new Hashtable<ServerSession, MsgPool>();

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
		public void onSessionNew(SessionKey sesKey, String srcIP) {
			LOG.info(String.format("New session request from %s (uri=%s)", srcIP, sesKey.getUri()));
			DataXceiver dxc = new DataXceiver(DataXceiverServer.this, sesKey);
			DataXceiverServer.this.dxcList.add(dxc);
			attachServerPortalWorker(dxc);
		}

	}

	DataXceiverServer(DataNode dn) throws URISyntaxException {
		this.dnBridge = new DataNodeBridge(dn); // TODO: remove debug DNexpoable and rename top DataNodeBridge
		this.dxcList = new ArrayList<DataXceiver>();
		this.uri = new URI(String.format("rdma://%s", dn.getDisplayName()));
		this.threadGroup = new ThreadGroup("R4H Datanode Threads");
		LOG.info("Creating DataXceiverServer - uri=" + uri);

		Callbacks onDynamicMsgPoolAllocation = new EventQueueHandler.Callbacks() {

			@Override
			public MsgPool getAdditionalMsgPool(int inSize, int outSize) {
				return allocateServerMsgPool();
			}
		};

		this.eqh = new R4HEventHandler(onDynamicMsgPoolAllocation, null);
		LOG.debug("Aftet EventQueueHandler creation");
		DataXceiverServer.DXSCallbacks dxsCbs = this.new DXSCallbacks();
		this.sp = new ServerPortal(eqh, uri, dxsCbs);
		LOG.debug("Aftet ServerPortal creation");
		MsgPool msgPool = allocateServerMsgPool();
		LOG.debug("Aftet MsgPool creation");
		this.eqh.bindMsgPool(msgPool);
		LOG.debug("Aftet bindMsgPool");

		LOG.trace("writePacketSize=" + dnBridge.getWritePacketSize());

		Configuration dnConf = this.dnBridge.getDN().getConf();
		this.numOfServerPortalWorkers = dnConf.getInt(NUM_OF_PRE_ALLOC_SERVER_PORTAL_WROKERS_PARAM_NAME,
		        NUM_OF_PRE_ALLOC_SERVER_PORTAL_WORKERS_DEFAULT);
		LOG.info(String.format("Starting ahead %d server portal worker", numOfServerPortalWorkers));
		this.sessionToWorkerHashtable = new Hashtable<ServerSession, ServerPortalWorker>();
		workerUri = new URI(String.format("rdma://%s:0", this.uri.getHost()));
		this.spPool = new LinkedList<ServerPortalWorker>();
		for (int i = 0; i < this.numOfServerPortalWorkers; i++) {
			ServerPortalWorker spw = new ServerPortalWorker(workerUri, R4HProtocol.MAX_SEND_PACKETS + R4HProtocol.JX_SERVER_SPARE_MSGS,
			        dnBridge.getWritePacketSize() + R4HProtocol.JX_BUF_SPARE , R4HProtocol.ACK_SIZE);
			spw.start();
			spPool.add(spw);
			LOG.info("Started new server portal worker thread: " + spw);
		}

		LOG.trace(this.toString());
	}

	private MsgPool allocateServerMsgPool() {
		return new MsgPool(DEFAULT_NUM_OF_PREALLOC_MSGPOOLS * R4HProtocol.SERVER_MSG_POOL_SIZE, dnBridge.getWritePacketSize()
		        + R4HProtocol.JX_BUF_SPARE, R4HProtocol.ACK_SIZE);
	}

	@Override
	public void run() {
		LOG.debug("Start running event queue handler");
		this.eqh.run();
		LOG.debug("Returned from event queue handler run");
	}

	public void stop() {
		LOG.debug("Closing all DataXceivers");
		for (DataXceiver dx : dxcList) {
			dx.close();
		}
		LOG.debug("After DataXceivers close");

		LOG.debug("Closing main listener event queue handler");
		eqh.close();
		LOG.debug("After main listener event queue handler close");
	}

	@Override
	public String toString() {
		return String.format("DataXceiverServer{SP='%s', EQH='%s', ThreadPool='%s', URI='%s', #DXC='%d'}", sp, eqh.toString(), threadGroup.getName(),
		        uri, dxcList.size());
	}

	synchronized void attachServerPortalWorker(DataXceiver dxc) {
		ServerPortalWorker spw;

		if (spPool.isEmpty()) {
			LOG.warn("ServerPortalWorker pool is empty. Allocating&Starting new SPW");
			spw = new ServerPortalWorker(workerUri, R4HProtocol.MAX_SEND_PACKETS + R4HProtocol.JX_SERVER_SPARE_MSGS, dnBridge.getWritePacketSize() + R4HProtocol.JX_BUF_SPARE,
			        R4HProtocol.ACK_SIZE);
			spw.start();
		} else {
			spw = spPool.remove(0);
		}

		LOG.trace("Going to put ss on hashtable: ss=" + dxc.getSessionServer());
		sessionToWorkerHashtable.put(dxc.getSessionServer(), spw);
		dxc.setEqh(spw.eqh);
		dxc.setServerPortalWorker(spw);
		sp.forward(spw.sp, dxc.getSessionServer());
		if (LOG.isDebugEnabled()) {
			LOG.debug("After session forward: " + spw.sp);
		}
	}

	synchronized void onSessionClosed(ServerSession ss) {
		if (sessionToWorkerHashtable.containsKey(ss)) {
			ServerPortalWorker spw = sessionToWorkerHashtable.get(ss);
			sessionToWorkerHashtable.remove(ss);
			spPool.add(spw);
		}

	}

}
