package org.apache.hadoop.hdfs;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Options.ChecksumOpt;
import org.apache.hadoop.fs.permission.FsPermission;
import org.apache.hadoop.hdfs.DFSClient.Conf;
import org.apache.hadoop.util.DataChecksum;

import com.mellanox.r4h.R4HProtocol;

/**
 * DFSClient configuration
 */
public class DFSClientConfBridge extends Conf {
	// Default value for time to wait for header ack before pronouncing failure:
	private static final int HEADER_ACK_CLIENT_TIMEOUT_SECONDS_DEFAULT = 30;
	// The parameter name of time to wait for header ack before pronouncing failure:
	private static final String HEADER_ACK_CLIENT_TIMEOUT_PARAM_NAME = "r4h.client.header.ack.timeout";
	// The time to wait for header ack before pronouncing failure:
	private long headerAckTimeoutUsec;
	// The parameter name of the number of msgs in client's msgpool
	private static final String CLIENT_MSG_POOL_NUM_MSGS_PARAM_NAME = "r4h.client.msgpool.num.msgs";
	private static final int CLIENT_MSG_POOL_NUM_MSGS_DEFAULT = R4HProtocol.MAX_DATA_QUEUE_PACKETS + R4HProtocol.CLIENT_MSGPOOL_SPARE;
	// The time to wait for header ack before pronouncing failure:
	private int msgPoolNumMsgs;

	public DFSClientConfBridge(Configuration conf) {
		super(conf);
		this.headerAckTimeoutUsec = 1000000 * conf.getInt(HEADER_ACK_CLIENT_TIMEOUT_PARAM_NAME, HEADER_ACK_CLIENT_TIMEOUT_SECONDS_DEFAULT);
		this.msgPoolNumMsgs = conf.getInt(CLIENT_MSG_POOL_NUM_MSGS_PARAM_NAME, CLIENT_MSG_POOL_NUM_MSGS_DEFAULT);
	}

	public int getClientMsgPoolNumMsgs() {
		return msgPoolNumMsgs;
	}

	/**
	 * 
	 * @return headerAckTimeoutUsec
	 */
	public long getHeaderAckTimeoutUsec() {
		return headerAckTimeoutUsec;
	}

	public boolean getShortCircuitMmapEnabled() {
		return shortCircuitMmapEnabled;
	}

	public boolean getConnectToDnViaHostname() {
		return connectToDnViaHostname;
	}

	/**
	 * @return the hdfsTimeout
	 */
	public int getHdfsTimeout() {
		return hdfsTimeout;
	}

	/**
	 * @return the maxFailoverAttempts
	 */
	public int getMaxFailoverAttempts() {
		return maxFailoverAttempts;
	}

	/**
	 * @return the maxRetryAttempts
	 */
	public int getMaxRetryAttempts() {
		return maxRetryAttempts;
	}

	/**
	 * @return the failoverSleepBaseMillis
	 */
	public int getFailoverSleepBaseMillis() {
		return failoverSleepBaseMillis;
	}

	/**
	 * @return the failoverSleepMaxMillis
	 */
	public int getFailoverSleepMaxMillis() {
		return failoverSleepMaxMillis;
	}

	/**
	 * @return the maxBlockAcquireFailures
	 */
	public int getMaxBlockAcquireFailures() {
		return maxBlockAcquireFailures;
	}

	/**
	 * @return the confTime
	 */
	public int getConfTime() {
		return confTime;
	}

	/**
	 * @return the ioBufferSize
	 */
	public int getIoBufferSize() {
		return ioBufferSize;
	}

	/**
	 * @return the defaultChecksumOpt
	 */
	public ChecksumOpt getDefaultChecksumOpt() {
		return defaultChecksumOpt;
	}

	/**
	 * @return the writePacketSize
	 */
	public int getWritePacketSize() {
		return writePacketSize;
	}

	/**
	 * @return the socketTimeout
	 */
	public int getSocketTimeout() {
		return socketTimeout;
	}

	/**
	 * @return the socketCacheCapacity
	 */
	public int getSocketCacheCapacity() {
		return socketCacheCapacity;
	}

	/**
	 * @return the socketCacheExpiry
	 */
	public long getSocketCacheExpiry() {
		return socketCacheExpiry;
	}

	/**
	 * @return the excludedNodesCacheExpiry
	 */
	public long getExcludedNodesCacheExpiry() {
		return excludedNodesCacheExpiry;
	}

	/**
	 * @return the nCachedConnRetry
	 */
	public int getnCachedConnRetry() {
		return nCachedConnRetry;
	}

	/**
	 * @return the nBlockWriteRetry
	 */
	public int getnBlockWriteRetry() {
		return nBlockWriteRetry;
	}

	/**
	 * @return the nBlockWriteLocateFollowingRetry
	 */
	public int getnBlockWriteLocateFollowingRetry() {
		return nBlockWriteLocateFollowingRetry;
	}

	/**
	 * @return the defaultBlockSize
	 */
	public long getDefaultBlockSize() {
		return defaultBlockSize;
	}

	/**
	 * @return the prefetchSize
	 */
	public long getPrefetchSize() {
		return prefetchSize;
	}

	/**
	 * @return the defaultReplication
	 */
	public short getDefaultReplication() {
		return defaultReplication;
	}

	/**
	 * @return the taskId
	 */
	public String getTaskId() {
		return taskId;
	}

	/**
	 * @return the uMask
	 */
	public FsPermission getuMask() {
		return uMask;
	}

	/**
	 * @return the connectToDnViaHostname
	 */
	public boolean isConnectToDnViaHostname() {
		return connectToDnViaHostname;
	}

	/**
	 * @return the getHdfsBlocksMetadataEnabled
	 */
	public boolean isHdfsBlocksMetadataEnabled() {
		return getHdfsBlocksMetadataEnabled;
	}

	/**
	 * @return the getFileBlockStorageLocationsNumThreads
	 */
	public int getFileBlockStorageLocationsNumThreads() {
		return getFileBlockStorageLocationsNumThreads;
	}

	/**
	 * @return the getFileBlockStorageLocationsTimeoutMs
	 */
	public int getFileBlockStorageLocationsTimeoutMs() {
		return getFileBlockStorageLocationsTimeoutMs;
	}

	/**
	 * @return the retryTimesForGetLastBlockLength
	 */
	public int getRetryTimesForGetLastBlockLength() {
		return retryTimesForGetLastBlockLength;
	}

	/**
	 * @return the retryIntervalForGetLastBlockLength
	 */
	public int getRetryIntervalForGetLastBlockLength() {
		return retryIntervalForGetLastBlockLength;
	}

	/**
	 * @return the datanodeRestartTimeout
	 */
	public long getDatanodeRestartTimeout() {
		return datanodeRestartTimeout;
	}

	/**
	 * @return the useLegacyBlockReader
	 */
	public boolean isUseLegacyBlockReader() {
		return useLegacyBlockReader;
	}

	/**
	 * @return the useLegacyBlockReaderLocal
	 */
	public boolean isUseLegacyBlockReaderLocal() {
		return useLegacyBlockReaderLocal;
	}

	/**
	 * @return the domainSocketPath
	 */
	public String getDomainSocketPath() {
		return domainSocketPath;
	}

	/**
	 * @return the skipShortCircuitChecksums
	 */
	public boolean isSkipShortCircuitChecksums() {
		return skipShortCircuitChecksums;
	}

	/**
	 * @return the shortCircuitBufferSize
	 */
	public int getShortCircuitBufferSize() {
		return shortCircuitBufferSize;
	}

	/**
	 * @return the shortCircuitLocalReads
	 */
	public boolean isShortCircuitLocalReads() {
		return shortCircuitLocalReads;
	}

	/**
	 * @return the domainSocketDataTraffic
	 */
	public boolean isDomainSocketDataTraffic() {
		return domainSocketDataTraffic;
	}

	/**
	 * @return the shortCircuitStreamsCacheSize
	 */
	public int getShortCircuitStreamsCacheSize() {
		return shortCircuitStreamsCacheSize;
	}

	/**
	 * @return the shortCircuitStreamsCacheExpiryMs
	 */
	public long getShortCircuitStreamsCacheExpiryMs() {
		return shortCircuitStreamsCacheExpiryMs;
	}

	/**
	 * @return the shortCircuitSharedMemoryWatcherInterruptCheckMs
	 */
	public int getShortCircuitSharedMemoryWatcherInterruptCheckMs() {
		return shortCircuitSharedMemoryWatcherInterruptCheckMs;
	}

	/**
	 * @return the shortCircuitMmapEnabled
	 */
	public boolean isShortCircuitMmapEnabled() {
		return shortCircuitMmapEnabled;
	}

	/**
	 * @return the shortCircuitMmapCacheSize
	 */
	public int getShortCircuitMmapCacheSize() {
		return shortCircuitMmapCacheSize;
	}

	/**
	 * @return the shortCircuitMmapCacheExpiryMs
	 */
	public long getShortCircuitMmapCacheExpiryMs() {
		return shortCircuitMmapCacheExpiryMs;
	}

	/**
	 * @return the shortCircuitMmapCacheRetryTimeout
	 */
	public long getShortCircuitMmapCacheRetryTimeout() {
		return shortCircuitMmapCacheRetryTimeout;
	}

	/**
	 * @return the shortCircuitCacheStaleThresholdMs
	 */
	public long getShortCircuitCacheStaleThresholdMs() {
		return shortCircuitCacheStaleThresholdMs;
	}

	public DataChecksum createChecksum(ChecksumOpt userOpt) throws IOException {
		// Fill in any missing field with the default.
		ChecksumOpt myOpt = ChecksumOpt.processChecksumOpt(defaultChecksumOpt, userOpt);
		DataChecksum dataChecksum = DataChecksum.newDataChecksum(myOpt.getChecksumType(), myOpt.getBytesPerChecksum());
		if (dataChecksum == null) {
			throw new IOException("Invalid checksum type specified: " + myOpt.getChecksumType().name());
		}
		return dataChecksum;
	}

	public int getTimeWindow() {
		return timeWindow;
	}

	public boolean connectToDnViaHostname() {
		return connectToDnViaHostname;
	}

	public DataChecksum createChecksum() throws IOException {
		return createChecksum(null);
	}

	public int socketTimeout() {
		return socketTimeout;
	}
}
