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
import java.net.URISyntaxException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.hdfs.server.datanode.DataNode;
import org.apache.hadoop.hdfs.server.datanode.DataNodeBridge;
import org.apache.hadoop.util.Daemon;
import org.apache.hadoop.util.ServicePlugin;

/**
 * R4H implementation for a datanode service plugin to run a R4H serve side by side to HDFS server. Datanode starts
 * service plugins during initialization by going through the comma separated list of ServicePlugin implementation
 * classes configured on dfs.datanode.plugins parameter
 */
public class R4HDatanodePlugin implements ServicePlugin {
	private DataNode dn;
	private DataXceiverServer dxs;
	private Daemon daemon;
	private static Log LOG = LogFactory.getLog(R4HDatanodePlugin.class.getName());
	private DataNodeBridge dnExposer;

	// is not called on datanode
	public void close() throws IOException {
		stop();
	}

	/*
	 * Starts a new thread of R4H server. Designed to be called by Datanode as a service.
	 * 
	 * @param service must be a Datanode instance or Object[] for standalone untitest
	 * 
	 * @see org.apache.hadoop.util.ServicePlugin#start(java.lang.Object)
	 */
	public void start(Object service) {

		LOG.debug("Starting plugin");
		if (!(service instanceof DataNode)) {
			throw new IllegalArgumentException("Unexpected service object type");
		}
		LOG.debug("Service object is DataNode");
		dn = (DataNode) service;
		dnExposer = new DataNodeBridge(dn);
		
		try {
			dxs = new DataXceiverServer(dn);
		} catch (URISyntaxException e) {
			throw new IllegalArgumentException("Failed to create URI for DataXceriverServer", e);
		}
		daemon = new Daemon(dxs);
		daemon.start();
		LOG.info("Started");
		LOG.debug(this.toString());
	}

	/*
	 * Stop R4H server and wait until it closes all it's resources
	 * 
	 * @see org.apache.hadoop.util.ServicePlugin#stop()
	 */
	public void stop() {
		stop(-1); // Infinite wait for daemon to stop
	}

	/**
	 * Stop R4H server
	 * 
	 * @param waitForDaemon
	 *            milliseconds to wait for resources to be closed or -1 for infinate wait
	 */
	public void stop(int waitForDaemon) {
		if (waitForDaemon < -1) {
			throw new IllegalArgumentException("Illegal (begative) number of milliseconds argument to wait for deamon to stop");
		}

		LOG.info("Stopping");
		daemon.interrupt();
		dxs.stop();
		try {
			if (waitForDaemon == -1) {
				daemon.join();
			} else {
				daemon.join(waitForDaemon);
			}
		} catch (InterruptedException e) {
			LOG.error("daemon join interrupted. Exception: " + e.toString());
		}
		LOG.info("Stopped");
	}

	/**
	 * @return true if server thread is still alive
	 */
	public boolean isAlive() {
		if (daemon == null)
			return false;

		return daemon.isAlive();
	}

	@Override
	public String toString() {
		if (daemon == null) {
			return super.toString() + " is not started yet";
		} else {
			return String.format("R4HDatanodePlugin{DN='%s', DXS='%s', isAlive='%s'}", (dn == null) ? "-" : dn.toString(), dxs.toString(),
			        daemon.isAlive() ? "TRUE" : "FALSE");
		}
	}

}
