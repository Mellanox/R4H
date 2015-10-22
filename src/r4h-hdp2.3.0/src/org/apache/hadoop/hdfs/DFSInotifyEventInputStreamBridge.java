package org.apache.hadoop.hdfs;

import java.io.IOException;

import org.apache.hadoop.hdfs.protocol.ClientProtocol;
import org.apache.htrace.Sampler;

public class DFSInotifyEventInputStreamBridge extends DFSInotifyEventInputStream {

	public DFSInotifyEventInputStreamBridge(Sampler<?> traceSampler, ClientProtocol namenode) throws IOException {
		super(traceSampler, namenode);
	}

	public DFSInotifyEventInputStreamBridge(Sampler<?> traceSampler, ClientProtocol namenode, long lastReadTxid) throws IOException {
		super(traceSampler, namenode, lastReadTxid);
	}

}
