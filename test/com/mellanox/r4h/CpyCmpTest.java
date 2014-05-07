package com.mellanox.r4h;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Observable;
import java.util.Observer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.util.ToolRunner;

import com.mellanox.r4h.Probability.CpyCmpInfo;
import com.mellanox.r4h.Probability.GenInfo;

public class CpyCmpTest implements Runnable {
	private static final String FS_DEFAULT_NAME = "fs.default.name";
	private final static Log LOG = LogFactory.getLog(CpyCmpTest.class.getName());
	private static final int DEFAULT_COPY_BUFFER_SIZE = 4096;
	private static final String MLNX_DFS_COPY_MARK = "MLNX";

	private final Probability prob;
	private final DistributedFileSystem mlnxDfs;

	public CpyCmpTest(Probability prob, Configuration conf) throws NoSuchMethodException, NoSuchFieldException, IOException {
		this.prob = prob;
		String uriStr = conf.get(FS_DEFAULT_NAME, null);
		if (uriStr == null) {
			throw new IllegalArgumentException("Illegal configuration without " + FS_DEFAULT_NAME);
		}
		URI uri;
		try {
			uri = new URI(uriStr);
		} catch (URISyntaxException e) {
			throw new IllegalArgumentException("Illegal URI: " + FS_DEFAULT_NAME + "=" + uriStr, e);
		}
		this.mlnxDfs = new DistributedFileSystem();
		this.mlnxDfs.initialize(uri, conf);
	}

	public void run() {
		try {
			for (CpyCmpInfo cpyCmp : prob.getCpyCmpInfoList()) {
				String srcPath = cpyCmp.hdfsInputPath;
				String destPath = cpyCmp.hdfsInputPath + MLNX_DFS_COPY_MARK;
				if (cpyCmp.delayMilli != 0)
					LOG.info("Delaying copy for " + cpyCmp.delayMilli + " ms");
				Thread.sleep(cpyCmp.delayMilli);
				mlnxDfs.setConf(cpyCmp.conf);
				copy(srcPath, destPath, cpyCmp.closePercentage, DEFAULT_COPY_BUFFER_SIZE);
				if (equals(srcPath, destPath, cpyCmp.closePercentage)) {
					LOG.info("TEST SUCCEEDED");
				}else{
					LOG.error("TEST FAILED");
				}
			}
		} catch (IOException | InterruptedException e) {
			LOG.error("Failed during Copy/Compare: " + e);
		}
	}


//	private void runGenerators() throws Exception {
//		for (GenInfo gen : prob.getGenInfoList()) {
//			int rc = ToolRunner.run(gen.conf, gen.genTool, gen.args);
//			if (rc != 0) {
//				throw new Exception(String.format("Failed during generator (%s) with error code %d", gen, rc));
//			}
//		}
//	}



	private boolean equals(String hdfsFile1, String hdfsFile2, int percentToCheck) throws IOException {
		FSDataInputStream dis1 = mlnxDfs.open(new Path(hdfsFile1));
		FSDataInputStream dis2 = mlnxDfs.open(new Path(hdfsFile2));
		double percentChecked = 0.0;

		try {
			dis1 = mlnxDfs.open(new Path(hdfsFile1));
			dis2 = mlnxDfs.open(new Path(hdfsFile2));

			LOG.info("Comparing file " + hdfsFile1 + " to " + hdfsFile2);

			byte[] buff1 = new byte[DEFAULT_COPY_BUFFER_SIZE];
			byte[] buff2 = new byte[DEFAULT_COPY_BUFFER_SIZE];
			int n = 0;
			int m = 0;
			double size = dis1.available();
			double bytesRead = 0;

			if (size != dis2.available()) {
				LOG.error(String.format("file1(%s) size (%d) != file2(%s) size (%d)", hdfsFile1, size, hdfsFile2, dis2.available()));
				return false;
			}

			while ((n != -1) && (m != -1) && (percentChecked < percentToCheck)) {
				n = dis1.read(buff1);
				m = dis2.read(buff2);
				if (n != m || !Arrays.equals(buff1, buff2)) {
					LOG.error(String.format("file1(%s) and file2(%s) are not equal", hdfsFile1, hdfsFile2));
					return false;
				}
				bytesRead = bytesRead + n;
				double tmp = (double) bytesRead / size;
				if (tmp != percentChecked) {
					percentChecked = tmp;
					LOG.trace(String.format("Already compared %d% of file1(%s) to file2(%s)", Math.round(percentChecked * 100), hdfsFile1, hdfsFile1));
				}

			}
		} finally {
			if (dis1 != null) {
				dis1.close();
			}
			if (dis2 != null) {
				dis2.close();
			}
		}

		LOG.info(String.format("Successfully compared %d% of file1(%s) to file2(%s)", Math.round(percentChecked * 100), hdfsFile1, hdfsFile1));
		return true;
	}

	private void copy(String srcFileName, String dstFileName, int percentToCopy, int cpBuffSize) throws IOException {
		FSDataInputStream dis = mlnxDfs.open(new Path(srcFileName));
		FSDataOutputStream dos = mlnxDfs.create(new Path(dstFileName));
		LOG.info("Copying file " + srcFileName + " to " + dstFileName);
		try {
			byte[] buff = new byte[cpBuffSize];
			int n = 0;
			double size = dis.available();
			double bytesRead = 0;
			double percent = 0.0;
			while ((n != -1) && (percent < percentToCopy)) {
				n = dis.read(buff);
				if (n > 0) {
					dos.write(buff, 0, n);
					bytesRead = bytesRead + n;
					double tmp = (double) bytesRead / size;
					if (tmp != percent) {
						percent = tmp;
						LOG.trace("Copied " + Math.round(percent * 100) + "% of " + srcFileName + "\r");
					}
				}
			}
			LOG.info("After copying " + Math.round(percent * 100) + "% of " + srcFileName + " to " + dstFileName);
		} finally {
			dos.close();
			dis.close();
		}

	}

}
