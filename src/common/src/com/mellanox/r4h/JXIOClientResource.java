package com.mellanox.r4h;

import java.util.AbstractMap.SimpleEntry;

import org.accelio.jxio.MsgPool;
import com.mellanox.r4h.R4HEventHandler;

class JXIOClientResource extends SimpleEntry<R4HEventHandler, MsgPool> {

	public JXIOClientResource(R4HEventHandler eqh, MsgPool msgPool) {
	    super(eqh, msgPool);
    }
	
	R4HEventHandler getEqh() {
		return this.getKey();
	}
	
	MsgPool getMsgPool() {
		return this.getValue();
	}

}
