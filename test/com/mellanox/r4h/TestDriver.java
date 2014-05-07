package com.mellanox.r4h;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;

import com.mellanox.r4h.DistributedFileSystem;


public class TestDriver {
	final static Log LOG = LogFactory.getLog(TestDriver.class.getName());
	final static String[] RELEVANT_CONFS = { "capacity-scheduler.xml", "core-site.xml", "hadoop-policy.xml", 
			 "hdfs-site.xml", "mapred-queue-acls.xml","mapred-site.xml" };
	
	public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException, IOException {
			if (args.length != 1){
				LOG.error("Usage: <conf-dir>");
				System.exit(1);
			}
//			String[] newArgs = Arrays.copyOfRange(args, 2, 4);
			
			File confDir = new File(args[0]);
			LOG.info("Going to run with conf directory: " + confDir);
			
			File[] filesList = confDir.listFiles();
			Configuration conf = new Configuration();
	
			if (filesList == null) {
				LOG.error("Didn't find files in conf dir, cannot proceed.");
				System.exit(1);
			}
	
			for (File f : filesList) {
				if (isRelevantConfFile(f.getName())) {
					LOG.debug("Using conf file " + f.getName());
					conf.addResource(new Path(f.getAbsoluteFile().toString()));
				}
			}
			
			Probability p = new Probability(conf);
			CpyCmpTest CCT = new CpyCmpTest(p, conf);
			CCT.run();
			
			System.exit(0);		

	}
	
	private static boolean isRelevantConfFile(String confFileName) {
		for (String r : RELEVANT_CONFS) {
			if (confFileName.endsWith(r)) {
				return true;
			}
		}
		return false;
	}
}
