package org.apache.hadoop.hdfs.server.datanode.fsdataset.impl;

import java.io.File;
import java.io.IOException;


public class FsDataSetBridge {
		
	public static File findMetaFile(File blockFile) throws IOException {
		return FsDatasetUtil.findMetaFile(blockFile);
	}

}
