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

import com.mellanox.jxio.EventQueueHandler;
import com.mellanox.jxio.Msg;
import com.mellanox.jxio.MsgPool;
import com.mellanox.jxio.ServerPortal;

class ServerPortalWorker {
	private Thread th;
	private MsgPool serverMsgPool;
	EventQueueHandler eqh;
	MsgPool mirrorMsgPool;
	ServerPortal sp;
	
	ServerPortalWorker(URI uri, int numOfMsgsToBind, int msgInSize, int msgOutSize) {
		this.serverMsgPool = new MsgPool(numOfMsgsToBind + R4HProtocol.JX_SERVER_SPARE_MSGS, msgInSize, msgOutSize);
		this.mirrorMsgPool = new MsgPool(numOfMsgsToBind, msgOutSize, msgInSize); // Temporary till JX mirror feature
		this.eqh = new R4HEventHandler(null,null);
		this.eqh.bindMsgPool(serverMsgPool);
		this.sp = new ServerPortal(eqh, uri);
		this.th = new Thread(eqh);
	}

	void start() {
		th.start();
	}

	/*
	 * Temporary API for retrieving msg from mirror client MsgPool
	 * It won't be needed after aligning to JXIO's mirror feature
	 */
	Msg getMsg() {
		return mirrorMsgPool.getMsg();
	}

	@Override
	public String toString() {
		return String
		        .format("ServerPortalWorker{thread='%s', sp='%s', serverMsgPool='%s', mirrorMsgPool='%s'}", th, sp, serverMsgPool, mirrorMsgPool);
	}
}
