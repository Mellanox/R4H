package org.apache.hadoop.hdfs;

import org.apache.hadoop.conf.Configuration;

public class DFSClientConfBridge2_7 extends DFSClientConfBridge {
	public DFSClientConfBridge2_7(Configuration conf) {
		super(conf);
	}
	
	public long getDfsclientSlowIoWarningThresholdMs() {
		return dfsclientSlowIoWarningThresholdMs;
	}
}
