package org.apache.hadoop.hdfs;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.hadoop.hdfs.MiniDFSNNTopology.NNConf;

public class MiniDFSClusterBridge {

	public static int getAppendTestUtils_FILE_SIZE() {
		return AppendTestUtil.FILE_SIZE;
	}

	public static int getAppendTestUtil_BLOCK_SIZE() {
		return AppendTestUtil.BLOCK_SIZE;
	}

	public static int getNNConf_ipcPort(NNConf nnConf) {
		return nnConf.getIpcPort();
	}

	public static String getNNConf_nnId(NNConf nnConf) {
		return nnConf.getNnId();
	}

	public static String getNNConf_cliusterId(NNConf nnConf) {
		return nnConf.getClusterId();
	}

	public static int getNNConf_httpPort(NNConf nnConf) {
		return nnConf.getHttpPort();
	}

	public static Log getAppendTestUtilLOG() {
		return AppendTestUtil.LOG;
	}

}
