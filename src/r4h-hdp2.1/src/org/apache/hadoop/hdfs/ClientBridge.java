package org.apache.hadoop.hdfs;

import org.apache.hadoop.security.UserGroupInformation;

public class ClientBridge {

	public static String getUgiShortUserName(UserGroupInformation ugi) {
		return ugi.getShortUserName();
	}

}
