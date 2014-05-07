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
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
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
	private final ConcurrentLinkedQueue<Runnable> asyncOprQueue = new ConcurrentLinkedQueue<>();

	private class AsyncReply implements Runnable {
		final ServerSession session;
		final Msg msg;

		AsyncReply(ServerSession ss, Msg msg) {
			this.session = ss;
			this.msg = msg;
		}

		@Override
		public void run() {
			if (LOG.isTraceEnabled()) {
				LOG.trace("Going to send response: serverSession=" + session);
			}
			session.sendResponse(msg);
		}
	}

	private class AsyncRequest implements Runnable {
		private final DataXceiver dxc;
		private final Msg msg;

		AsyncRequest(DataXceiver dxc, Msg msg) {
			this.dxc = dxc;
			this.msg = msg;
		}

		@Override
		public void run() {
			ClientSession client = dxc.getClientSession();
			if (client != null) {
				if (LOG.isTraceEnabled()) {
					LOG.trace("Going to send request: clientSession=" + client);
				}
				dxc.getClientSession().sendRequest(msg);
				// synchronized (msg) {
				// msg.notifyAll();
				// }
			} else {
				LOG.warn("Failed to send async request because of missing client session");
			}

		}
	}

	private class AsyncPipelineConnection implements Runnable {
		private final URI uri;
		private final DataXceiver.CSCallbacks cbs;
		private final DataXceiver dxc;

		AsyncPipelineConnection(URI uri, DataXceiver.CSCallbacks cbs, DataXceiver dxc) {
			this.uri = uri;
			this.cbs = cbs;
			this.dxc = dxc;
		}

		@Override
		public void run() {
			if (LOG.isTraceEnabled()) {
				LOG.trace("Going to creation new client session");
			}
			dxc.setClientSession(new ClientSession(DataXceiverServer.this.eqh, this.uri, this.cbs));
			if (LOG.isTraceEnabled()) {
				LOG.trace("After new client session: " + dxc.getClientSession());
			}
		}
	}

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
			sp.accept(dxc.getSessionServer());
		}

	}

	DataXceiverServer(DataNode dn) throws URISyntaxException {
		this.dnBridge = new DataNodeBridge(dn); // TODO: remove debug DNexpoable and rename top DataNodeBridge
		this.dxcList = new ArrayList<DataXceiver>();
		this.uri = new URI(String.format("rdma://%s", dn.getDisplayName()));
		this.threadGroup = new ThreadGroup("R4H Datanode Threads");
		LOG.info("Creating DataXceiverServer - uri=" + uri);
		
		Runnable onEqhBreak = new Runnable() {
			@Override
			public void run() {
				processReplies();
			}
		};
		
		Callbacks onDynamicMsgPoolAllocation = new EventQueueHandler.Callbacks() {
			
			@Override
			public MsgPool getAdditionalMsgPool(int inSize, int outSize) {
				return allocateServerMsgPool();
			}
		}; 
		
		this.eqh = new R4HEventHandler(onDynamicMsgPoolAllocation, onEqhBreak);
		LOG.debug("Aftet EventQueueHandler creation");
		DataXceiverServer.DXSCallbacks dxsCbs = this.new DXSCallbacks();
		this.sp = new ServerPortal(eqh, uri, dxsCbs);
		LOG.debug("Aftet ServerPortal creation");
		MsgPool msgPool = allocateServerMsgPool();
		LOG.debug("Aftet MsgPool creation");
		this.eqh.bindMsgPool(msgPool);
		LOG.debug("Aftet bindMsgPool");

		LOG.trace("writePacketSize=" + dnBridge.getWritePacketSize());

		BlockReceiverBridge.loadStatic();
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

	public void queueAsyncReply(ServerSession ss, Msg msg) {
		asyncOprQueue.add(new AsyncReply(ss, msg));
		// if (msgReplyQueue.size() >= REPLY_QUEUE_TRESHOLD_FOR_BREAK_EVENT_LOOP) {
		eqh.breakEventLoop();
		// }
	}

	public void queueAsyncRequest(DataXceiver dxc, Msg mirror) {
		asyncOprQueue.add(new AsyncRequest(dxc, mirror));
		eqh.breakEventLoop();
	}

	public void queueAsyncPipelineConnection(URI uri, CSCallbacks csCBs, DataXceiver dxc) {
		asyncOprQueue.add(new AsyncPipelineConnection(uri, csCBs, dxc));
		eqh.breakEventLoop();
	}

	public void queueAsyncRunnable(Runnable task) {
		asyncOprQueue.add(task);
		eqh.breakEventLoop();
	}

	void processReplies() {
		Runnable opr = asyncOprQueue.poll();
		while (opr != null) {
			opr.run();
			opr = asyncOprQueue.poll();
		}
	}

}
