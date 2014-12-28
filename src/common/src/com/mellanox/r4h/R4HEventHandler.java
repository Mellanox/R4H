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

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.util.StringUtils;

import org.accelio.jxio.EventQueueHandler;

public class R4HEventHandler extends EventQueueHandler {
	Runnable onBreakEqh;
	/**
	 * @param callbacks
	 */
	public R4HEventHandler(Callbacks callbacks, Runnable onBreakEqhFunc ) {
		super(callbacks);
		this.onBreakEqh=onBreakEqhFunc;
	}

	public R4HEventHandler(Callbacks callbacks, boolean ignoreBreakEventLoop) {
		super(callbacks);
		setIgnoreBreak(ignoreBreakEventLoop);
	}

	private final static Log LOG = LogFactory.getLog(R4HEventHandler.class.getName());
	private boolean ignoreBreak = false;

	@Override
	public void run() {
		try {
			while (true) { //TODO: while !this.stopLoop?
				int ne = runEventLoop(-1 /* Infinite events */, -1 /* Infinite duration */);
				if (ne == -1) {
					LOG.error("JXIO catched exception during event processing");
					if (this.didExceptionOccur()) {
						LOG.error(StringUtils.stringifyException(this.getCaughtException()));
					} else {
						LOG.warn("No exception to retrieve after JXIO indication for exception during event processing");
					}
				}
				onBreakEqh();
			}
		} catch (Throwable t) {
			LOG.fatal("A R4H event handler worker was crashed. " + StringUtils.stringifyException(t));
		}
	}
	
	private void onBreakEqh() {
		if (onBreakEqh != null) {
			onBreakEqh.run();
		}
	}

	public synchronized boolean isBreakIgnored() {
		return ignoreBreak;
	}

	public synchronized void setIgnoreBreak(boolean ignoreBreak) {
		this.ignoreBreak = ignoreBreak;
	}

	@Override
	public synchronized void breakEventLoop() {
		if (!isBreakIgnored()) {
			super.breakEventLoop();
		}
	}
}
