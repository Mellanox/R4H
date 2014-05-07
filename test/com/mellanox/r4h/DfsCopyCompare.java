/* Author: Elad Itzhakian - 05/01/14 */
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


public class DfsCopyCompare {
	final static Log LOG = LogFactory.getLog(DfsCopyCompare.class.getName());
//	public static void main(String[] args) {
//		try {
//			if (args.length != 4){
//				LOG.error("Usage: <conf-dir> <copy/compare> <file1> <file2>");
//				System.exit(1);
//			}
//			String[] newArgs = Arrays.copyOfRange(args, 2, 4);
//			
//			File confDir = new File(args[0]);
//			LOG.info("Going to run with conf directory: " + confDir);
//			
//			File[] filesList = confDir.listFiles();
//			Configuration conf = new Configuration();
//	
//			if (filesList == null) {
//				LOG.error("Didn't find files in conf dir, cannot proceed.");
//				System.exit(1);
//			}
//	
//			for (File f : filesList) {
//				if (isRelevantConfFile(f.getName())) {
//					LOG.debug("Using conf file " + f.getName());
//					conf.addResource(new Path(f.getAbsoluteFile().toString()));
//				}
//			}
//			String[] fsValues = conf.getStrings("fs.default.name", (String[])null);
//			if (fsValues == null){
//				LOG.error("Could not retrieve namenode URI from configuration files.");
//				System.exit(1);
//			}
//			
//			String nnUriStr = fsValues[0];
//			LOG.info("Connecting to " + nnUriStr);
//			URI uriObj;
//			
//			uriObj = new URI(nnUriStr);
//			System.out.println("************************");
//			DistributedFileSystem mlnxDfs = new DistributedFileSystem();
//			mlnxDfs.initialize(uriObj, conf);
//			LOG.info("URI obj: " + uriObj.toString());
//			LOG.info("Init done.");
//			
//			switch(args[1].toLowerCase()){
//				case "copy":
//					LOG.info("Going to use copy mode.");
//					DfsCopier.run(newArgs, mlnxDfs);
//					break;
//				
//				case "compare":
//					LOG.info("Going to use compare mode.");
//					DfsComparator.run(newArgs, mlnxDfs);
//					break;
//				
//				default:
//					LOG.error("Unknown method: "+args[1]+". Use copy/compare only.");
//					System.exit(1);
//			}
//			
//			mlnxDfs.close();
//			System.exit(0);
//			
//		} catch (URISyntaxException e) {
//			e.printStackTrace();
//			System.exit(1);
//		} catch (IOException e) {
//			e.printStackTrace();
//			System.exit(1);
//		}
//
//	}
//	
//	private static boolean isRelevantConfFile(String confFileName) {
//		final String[] relevantConfs = { "capacity-scheduler.xml", "core-site.xml", "hadoop-policy.xml", 
//										 "hdfs-site.xml", "mapred-queue-acls.xml","mapred-site.xml" };
//		for (String r : relevantConfs) {
//			if (confFileName.endsWith(r)) {
//				return true;
//			}
//		}
//		return false;
//	}
}
