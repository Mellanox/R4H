/* Author: Elad Itzhakian - 05/01/14 */
package com.mellanox.r4h;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.Path;

import com.mellanox.r4h.DistributedFileSystem;


public class DfsCopier {
	final static Log LOG = LogFactory.getLog(DfsCopier.class);

	public static void run(String[] args, DistributedFileSystem mlnxDfs){
		try {
			if (args.length != 2) {
				LOG.error("Usage: <src-file> <dst-file>");
				System.exit(1);
			}
			String srcFileName = args[0];
			String dstFileName = args[1];
			
			FSDataInputStream dis = mlnxDfs.open(new Path(srcFileName));
			FSDataOutputStream dos = mlnxDfs.create(new Path(dstFileName));
			LOG.info("Copying file " + srcFileName + " to " + dstFileName);

			byte[] buff = new byte[4096];
			int n = 0;
			double size = dis.available();
			double bytesRead = 0;
			double percent = 0.0;
			while (n != -1) {
				n = dis.read(buff);
				if (n > 0) {
					dos.write(buff, 0, n);
					bytesRead = bytesRead + n;
					SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd HH:mm:ss");
					String d = sdf.format(new Date());
					double tmp = (double)Math.round(bytesRead/size * 100);
					if (tmp != percent){
						percent = tmp;
						System.out.print(d+" INFO DfsCopier: Copied "+percent+"% of "+srcFileName+"\r");
					}
					
				}
			}
			System.out.println();
			LOG.info("Finished copying " + srcFileName + " to " + dstFileName);
			dos.close();
			dis.close();
		} catch (Exception e) {
			LOG.error("Got exception : " + e.getMessage());
			System.exit(1);
		}
	}
	
}
