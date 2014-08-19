package com.mellanox.r4h;

import java.io.UnsupportedEncodingException;
import java.lang.management.ManagementFactory;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import org.apache.hadoop.hdfs.protocol.DatanodeInfo;

import com.mellanox.jxio.exceptions.JxioGeneralException;
import com.mellanox.jxio.exceptions.JxioSessionClosedException;
import com.mellanox.jxio.ServerSession;
import com.mellanox.jxio.ClientSession;
import com.mellanox.jxio.Msg;

import org.apache.commons.logging.Log;

public class R4HProtocol {
	public static final int ACK_SIZE = (1024);
	public static final int MAX_SEND_PACKETS = 80;
	public static final int MAX_DATA_QUEUE_PACKETS = 80; // 80 * 64K = 5MB
	public static final int JX_SERVER_SPARE_MSGS = 8;
	public static final int JX_BUF_SPARE = 128;
	public static final int SERVER_MSG_POOL_SIZE = MAX_SEND_PACKETS + JX_SERVER_SPARE_MSGS;
	public static final int MSG_POOLS_GROWTH_FACTOR = 10;
	private static final int CLIENT_HASH_LENGTH = 8; // In characters
	public static final int CLIENT_MSGPOOL_SPARE = 8;
	static final int CLIENT_MSG_POOL_NUM_MSGS = MAX_DATA_QUEUE_PACKETS + CLIENT_MSGPOOL_SPARE;
	static final int CLIENT_MSG_POOL_IN_SIZE = ACK_SIZE;


	public static String createSessionHash() {
		long tid = Thread.currentThread().getId();
		String pid = ManagementFactory.getRuntimeMXBean().getName();
		String localIP = "127.0.0.0";
		try {
			localIP = (InetAddress.getLocalHost()).toString();
		} catch (UnknownHostException e) {
		}
		long time = System.nanoTime();

		MessageDigest stringToHash;
		String hash = String.format("%d%s%d%s", time, pid, tid, localIP).replaceAll("[^A-Za-z0-9]", "");
		try {
			stringToHash = MessageDigest.getInstance("SHA-1");
			String hashInput = String.format("%d%s%d%s", time, pid, tid, localIP);
			stringToHash.update(hashInput.getBytes());
			StringBuffer sb = new StringBuffer();
			byte[] mdbytes = stringToHash.digest();

			for (int i = 0; i < mdbytes.length; i++) {
				sb.append(Integer.toString((mdbytes[i] & 0xff) + 0x100, 16).substring(1));
			}
			hash = sb.toString().substring(0, CLIENT_HASH_LENGTH);
		} catch (NoSuchAlgorithmException e) {
		}

		return hash;
	}

	public static URI createInitialURI(DatanodeInfo[] targets, String hash) throws URISyntaxException {
		String pipeline = Arrays.toString(targets).replace("[", "").replace("]", "").replace("", "").replace("\'", "").replace(",", ":")
		        .replace(" ", "");
		return new URI(String.format("rdma://%s/?pipeline=%s&clientHash=%s", targets[0].getName(), pipeline, hash));
	}

	public static URI createPipelineURI(DatanodeInfo[] targets, String clientHash) throws URISyntaxException {
		String pipeline = Arrays.toString(targets).replace("[", "").replace("]", "").replace("", "").replace("\'", "").replace(",", ":")
		        .replace(" ", "");
		long tid = Thread.currentThread().getId();
		String pid = ManagementFactory.getRuntimeMXBean().getName();

		return new URI(String.format("rdma://%s/?pipeline=%s&sourcePID=%s&sourceTID=%d%s", targets[0].getName(), pipeline, pid, tid, clientHash));
	}

	public static void wrappedSendResponse(ServerSession session, Msg message, Log log) {
		try {
			session.sendResponse(message);
		} catch (JxioSessionClosedException exc) {
			log.error("Sending response message failed, session was closed in the middle: " + exc);
		} catch (JxioGeneralException exc) {
			log.error("Sending response message failed, (general error): " + exc);
		}
	}

	public static void wrappedSendRequest(ClientSession session, Msg message, Log log) {
		try {
			session.sendRequest(message);
		} catch (JxioSessionClosedException exc) {
			log.error("Sending request message failed, session was closed in the middle: " + exc);
		} catch (JxioGeneralException exc) {
			log.error("Sending request message failed, (general error): " + exc);
		}
	}

}
