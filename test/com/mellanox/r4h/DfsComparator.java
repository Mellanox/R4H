/* Author: Elad Itzhakian - 05/01/14 */
package com.mellanox.r4h;


import java.util.Arrays;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.Path;

import com.mellanox.r4h.DistributedFileSystem;


public class DfsComparator {
	final static Log LOG = LogFactory.getLog(DfsComparator.class);

	public static void run(String[] args, DistributedFileSystem mlnxDfs){
		try {
			if (args.length != 2) {
				LOG.error("Usage: <file-1> <file-2>");
				System.exit(1);
			}
			
			String file1 = args[0];
			String file2 = args[1];
			

			FSDataInputStream dis1 = mlnxDfs.open(new Path(file1));
			FSDataInputStream dis2 = mlnxDfs.open(new Path(file2));
			
			LOG.info("Comparing file " + file1 + " to " + file2);

			byte[] buff1 = new byte[4096];
			byte[] buff2 = new byte[4096];
			int n = 0;
			int m = 0;
			boolean identical = true;
			while (n != -1 && m != -1) {
				n = dis1.read(buff1);
				m = dis2.read(buff2);
				if (n != m || !Arrays.equals(buff1, buff2)){
					identical = false;
					break;
				}
			}
			dis1.close();
			dis2.close();
			if (identical){
				LOG.info("Files: "+file1+" and: "+file2+" are identical.");
				System.exit(0);
			}else{
				LOG.info("Files: "+file1+" and: "+file2+" are NOT identical!");
				System.exit(1);
			}
			
			
		} catch (Exception e) {
			LOG.error("Got exception : " + e.getMessage());
			System.exit(1);
		}
	}

}
