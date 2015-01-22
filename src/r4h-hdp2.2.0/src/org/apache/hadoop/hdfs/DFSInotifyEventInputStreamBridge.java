package org.apache.hadoop.hdfs;

import java.io.IOException;

import org.apache.hadoop.hdfs.protocol.ClientProtocol;

public class DFSInotifyEventInputStreamBridge extends DFSInotifyEventInputStream {

	public DFSInotifyEventInputStreamBridge(ClientProtocol namenode) throws IOException {
		super(namenode);
	}

	public DFSInotifyEventInputStreamBridge(ClientProtocol namenode, long lastReadTxid) throws IOException {
		super(namenode, lastReadTxid);
	}

}
