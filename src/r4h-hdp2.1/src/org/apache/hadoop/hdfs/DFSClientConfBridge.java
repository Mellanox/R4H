package org.apache.hadoop.hdfs;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Options.ChecksumOpt;
import org.apache.hadoop.fs.permission.FsPermission;
import org.apache.hadoop.hdfs.DFSClient.Conf;
import org.apache.hadoop.util.DataChecksum;

/**
 * DFSClient configuration 
 */
public class DFSClientConfBridge extends Conf {


	  public DFSClientConfBridge(Configuration conf) {
		  super(conf);
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

    public DataChecksum createChecksum(ChecksumOpt userOpt) 
            throws IOException {
          // Fill in any missing field with the default.
          ChecksumOpt myOpt = ChecksumOpt.processChecksumOpt(
              defaultChecksumOpt, userOpt);
          DataChecksum dataChecksum = DataChecksum.newDataChecksum(
              myOpt.getChecksumType(),
              myOpt.getBytesPerChecksum());
          if (dataChecksum == null) {
            throw new IOException("Invalid checksum type specified: "
                + myOpt.getChecksumType().name());
          }
          return dataChecksum;
        }
}
//
//  public Conf(Configuration conf) {
//    // The hdfsTimeout is currently the same as the ipc timeout 
//    hdfsTimeout = Client.getTimeout(conf);
//    maxFailoverAttempts = conf.getInt(
//        DFS_CLIENT_FAILOVER_MAX_ATTEMPTS_KEY,
//        DFS_CLIENT_FAILOVER_MAX_ATTEMPTS_DEFAULT);
//    maxRetryAttempts = conf.getInt(
//        DFS_CLIENT_RETRY_MAX_ATTEMPTS_KEY,
//        DFS_CLIENT_RETRY_MAX_ATTEMPTS_DEFAULT);
//    failoverSleepBaseMillis = conf.getInt(
//        DFS_CLIENT_FAILOVER_SLEEPTIME_BASE_KEY,
//        DFS_CLIENT_FAILOVER_SLEEPTIME_BASE_DEFAULT);
//    failoverSleepMaxMillis = conf.getInt(
//        DFS_CLIENT_FAILOVER_SLEEPTIME_MAX_KEY,
//        DFS_CLIENT_FAILOVER_SLEEPTIME_MAX_DEFAULT);
//
//    maxBlockAcquireFailures = conf.getInt(
//        DFS_CLIENT_MAX_BLOCK_ACQUIRE_FAILURES_KEY,
//        DFS_CLIENT_MAX_BLOCK_ACQUIRE_FAILURES_DEFAULT);
//    confTime = conf.getInt(DFS_DATANODE_SOCKET_WRITE_TIMEOUT_KEY,
//        HdfsServerConstants.WRITE_TIMEOUT);
//    ioBufferSize = conf.getInt(
//        CommonConfigurationKeysPublic.IO_FILE_BUFFER_SIZE_KEY,
//        CommonConfigurationKeysPublic.IO_FILE_BUFFER_SIZE_DEFAULT);
//    defaultChecksumOpt = getChecksumOptFromConf(conf);
//    socketTimeout = conf.getInt(DFS_CLIENT_SOCKET_TIMEOUT_KEY,
//        HdfsServerConstants.READ_TIMEOUT);
//    /** dfs.write.packet.size is an internal config variable */
//    writePacketSize = conf.getInt(DFS_CLIENT_WRITE_PACKET_SIZE_KEY,
//        DFS_CLIENT_WRITE_PACKET_SIZE_DEFAULT);
//    defaultBlockSize = conf.getLongBytes(DFS_BLOCK_SIZE_KEY,
//        DFS_BLOCK_SIZE_DEFAULT);
//    defaultReplication = (short) conf.getInt(
//        DFS_REPLICATION_KEY, DFS_REPLICATION_DEFAULT);
//    taskId = conf.get("mapreduce.task.attempt.id", "NONMAPREDUCE");
//    socketCacheCapacity = conf.getInt(DFS_CLIENT_SOCKET_CACHE_CAPACITY_KEY,
//        DFS_CLIENT_SOCKET_CACHE_CAPACITY_DEFAULT);
//    socketCacheExpiry = conf.getLong(DFS_CLIENT_SOCKET_CACHE_EXPIRY_MSEC_KEY,
//        DFS_CLIENT_SOCKET_CACHE_EXPIRY_MSEC_DEFAULT);
//    excludedNodesCacheExpiry = conf.getLong(
//        DFS_CLIENT_WRITE_EXCLUDE_NODES_CACHE_EXPIRY_INTERVAL,
//        DFS_CLIENT_WRITE_EXCLUDE_NODES_CACHE_EXPIRY_INTERVAL_DEFAULT);
//    prefetchSize = conf.getLong(DFS_CLIENT_READ_PREFETCH_SIZE_KEY,
//        10 * defaultBlockSize);
//    timeWindow = conf.getInt(DFS_CLIENT_RETRY_WINDOW_BASE, 3000);
//    nCachedConnRetry = conf.getInt(DFS_CLIENT_CACHED_CONN_RETRY_KEY,
//        DFS_CLIENT_CACHED_CONN_RETRY_DEFAULT);
//    nBlockWriteRetry = conf.getInt(DFS_CLIENT_BLOCK_WRITE_RETRIES_KEY,
//        DFS_CLIENT_BLOCK_WRITE_RETRIES_DEFAULT);
//    nBlockWriteLocateFollowingRetry = conf.getInt(
//        DFS_CLIENT_BLOCK_WRITE_LOCATEFOLLOWINGBLOCK_RETRIES_KEY,
//        DFS_CLIENT_BLOCK_WRITE_LOCATEFOLLOWINGBLOCK_RETRIES_DEFAULT);
//    uMask = FsPermission.getUMask(conf);
//    connectToDnViaHostname = conf.getBoolean(DFS_CLIENT_USE_DN_HOSTNAME,
//        DFS_CLIENT_USE_DN_HOSTNAME_DEFAULT);
//    getHdfsBlocksMetadataEnabled = conf.getBoolean(
//        DFSConfigKeys.DFS_HDFS_BLOCKS_METADATA_ENABLED, 
//        DFSConfigKeys.DFS_HDFS_BLOCKS_METADATA_ENABLED_DEFAULT);
//    getFileBlockStorageLocationsNumThreads = conf.getInt(
//        DFSConfigKeys.DFS_CLIENT_FILE_BLOCK_STORAGE_LOCATIONS_NUM_THREADS,
//        DFSConfigKeys.DFS_CLIENT_FILE_BLOCK_STORAGE_LOCATIONS_NUM_THREADS_DEFAULT);
//    getFileBlockStorageLocationsTimeoutMs = conf.getInt(
//        DFSConfigKeys.DFS_CLIENT_FILE_BLOCK_STORAGE_LOCATIONS_TIMEOUT_MS,
//        DFSConfigKeys.DFS_CLIENT_FILE_BLOCK_STORAGE_LOCATIONS_TIMEOUT_MS_DEFAULT);
//    retryTimesForGetLastBlockLength = conf.getInt(
//        DFSConfigKeys.DFS_CLIENT_RETRY_TIMES_GET_LAST_BLOCK_LENGTH,
//        DFSConfigKeys.DFS_CLIENT_RETRY_TIMES_GET_LAST_BLOCK_LENGTH_DEFAULT);
//    retryIntervalForGetLastBlockLength = conf.getInt(
//      DFSConfigKeys.DFS_CLIENT_RETRY_INTERVAL_GET_LAST_BLOCK_LENGTH,
//      DFSConfigKeys.DFS_CLIENT_RETRY_INTERVAL_GET_LAST_BLOCK_LENGTH_DEFAULT);
//
//    useLegacyBlockReader = conf.getBoolean(
//        DFSConfigKeys.DFS_CLIENT_USE_LEGACY_BLOCKREADER,
//        DFSConfigKeys.DFS_CLIENT_USE_LEGACY_BLOCKREADER_DEFAULT);
//    useLegacyBlockReaderLocal = conf.getBoolean(
//        DFSConfigKeys.DFS_CLIENT_USE_LEGACY_BLOCKREADERLOCAL,
//        DFSConfigKeys.DFS_CLIENT_USE_LEGACY_BLOCKREADERLOCAL_DEFAULT);
//    shortCircuitLocalReads = conf.getBoolean(
//        DFSConfigKeys.DFS_CLIENT_READ_SHORTCIRCUIT_KEY,
//        DFSConfigKeys.DFS_CLIENT_READ_SHORTCIRCUIT_DEFAULT);
//    domainSocketDataTraffic = conf.getBoolean(
//        DFSConfigKeys.DFS_CLIENT_DOMAIN_SOCKET_DATA_TRAFFIC,
//        DFSConfigKeys.DFS_CLIENT_DOMAIN_SOCKET_DATA_TRAFFIC_DEFAULT);
//    domainSocketPath = conf.getTrimmed(
//        DFSConfigKeys.DFS_DOMAIN_SOCKET_PATH_KEY,
//        DFSConfigKeys.DFS_DOMAIN_SOCKET_PATH_DEFAULT);
//
//    if (LOG.isDebugEnabled()) {
//      LOG.debug(
//          DFSConfigKeys.DFS_CLIENT_USE_LEGACY_BLOCKREADERLOCAL
//          + " = " + useLegacyBlockReaderLocal);
//      LOG.debug(
//          DFSConfigKeys.DFS_CLIENT_READ_SHORTCIRCUIT_KEY
//          + " = " + shortCircuitLocalReads);
//      LOG.debug(
//          DFSConfigKeys.DFS_CLIENT_DOMAIN_SOCKET_DATA_TRAFFIC
//          + " = " + domainSocketDataTraffic);
//      LOG.debug(
//          DFSConfigKeys.DFS_DOMAIN_SOCKET_PATH_KEY
//          + " = " + domainSocketPath);
//    }
//
//    skipShortCircuitChecksums = conf.getBoolean(
//        DFSConfigKeys.DFS_CLIENT_READ_SHORTCIRCUIT_SKIP_CHECKSUM_KEY,
//        DFSConfigKeys.DFS_CLIENT_READ_SHORTCIRCUIT_SKIP_CHECKSUM_DEFAULT);
//    shortCircuitBufferSize = conf.getInt(
//        DFSConfigKeys.DFS_CLIENT_READ_SHORTCIRCUIT_BUFFER_SIZE_KEY,
//        DFSConfigKeys.DFS_CLIENT_READ_SHORTCIRCUIT_BUFFER_SIZE_DEFAULT);
//    shortCircuitStreamsCacheSize = conf.getInt(
//        DFSConfigKeys.DFS_CLIENT_READ_SHORTCIRCUIT_STREAMS_CACHE_SIZE_KEY,
//        DFSConfigKeys.DFS_CLIENT_READ_SHORTCIRCUIT_STREAMS_CACHE_SIZE_DEFAULT);
//    shortCircuitStreamsCacheExpiryMs = conf.getLong(
//        DFSConfigKeys.DFS_CLIENT_READ_SHORTCIRCUIT_STREAMS_CACHE_EXPIRY_MS_KEY,
//        DFSConfigKeys.DFS_CLIENT_READ_SHORTCIRCUIT_STREAMS_CACHE_EXPIRY_MS_DEFAULT);
//    shortCircuitMmapEnabled = conf.getBoolean(
//        DFSConfigKeys.DFS_CLIENT_MMAP_ENABLED,
//        DFSConfigKeys.DFS_CLIENT_MMAP_ENABLED_DEFAULT);
//    shortCircuitMmapCacheSize = conf.getInt(
//        DFSConfigKeys.DFS_CLIENT_MMAP_CACHE_SIZE,
//        DFSConfigKeys.DFS_CLIENT_MMAP_CACHE_SIZE_DEFAULT);
//    shortCircuitMmapCacheExpiryMs = conf.getLong(
//        DFSConfigKeys.DFS_CLIENT_MMAP_CACHE_TIMEOUT_MS,
//        DFSConfigKeys.DFS_CLIENT_MMAP_CACHE_TIMEOUT_MS_DEFAULT);
//    shortCircuitMmapCacheRetryTimeout = conf.getLong(
//        DFSConfigKeys.DFS_CLIENT_MMAP_RETRY_TIMEOUT_MS,
//        DFSConfigKeys.DFS_CLIENT_MMAP_RETRY_TIMEOUT_MS_DEFAULT);
//    shortCircuitCacheStaleThresholdMs = conf.getLong(
//        DFSConfigKeys.DFS_CLIENT_SHORT_CIRCUIT_REPLICA_STALE_THRESHOLD_MS,
//        DFSConfigKeys.DFS_CLIENT_SHORT_CIRCUIT_REPLICA_STALE_THRESHOLD_MS_DEFAULT);
//    shortCircuitSharedMemoryWatcherInterruptCheckMs = conf.getInt(
//        DFSConfigKeys.DFS_SHORT_CIRCUIT_SHARED_MEMORY_WATCHER_INTERRUPT_CHECK_MS,
//        DFSConfigKeys.DFS_SHORT_CIRCUIT_SHARED_MEMORY_WATCHER_INTERRUPT_CHECK_MS_DEFAULT);
//
//    datanodeRestartTimeout = conf.getLong(
//        DFS_CLIENT_DATANODE_RESTART_TIMEOUT_KEY,
//        DFS_CLIENT_DATANODE_RESTART_TIMEOUT_DEFAULT) * 1000;
//  }
//
//  private DataChecksum.Type getChecksumType(Configuration conf) {
//    final String checksum = conf.get(
//        DFSConfigKeys.DFS_CHECKSUM_TYPE_KEY,
//        DFSConfigKeys.DFS_CHECKSUM_TYPE_DEFAULT);
//    try {
//      return DataChecksum.Type.valueOf(checksum);
//    } catch(IllegalArgumentException iae) {
//      LOG.warn("Bad checksum type: " + checksum + ". Using default "
//          + DFSConfigKeys.DFS_CHECKSUM_TYPE_DEFAULT);
//      return DataChecksum.Type.valueOf(
//          DFSConfigKeys.DFS_CHECKSUM_TYPE_DEFAULT); 
//    }
//  }
//
//  // Construct a checksum option from conf
//  private ChecksumOpt getChecksumOptFromConf(Configuration conf) {
//    DataChecksum.Type type = getChecksumType(conf);
//    int bytesPerChecksum = conf.getInt(DFS_BYTES_PER_CHECKSUM_KEY,
//        DFS_BYTES_PER_CHECKSUM_DEFAULT);
//    return new ChecksumOpt(type, bytesPerChecksum);
//  }
//
//  // create a DataChecksum with the default option.
//  private DataChecksum createChecksum() throws IOException {
//    return createChecksum(null);
//  }
//
//  private DataChecksum createChecksum(ChecksumOpt userOpt) 
//      throws IOException {
//    // Fill in any missing field with the default.
//    ChecksumOpt myOpt = ChecksumOpt.processChecksumOpt(
//        defaultChecksumOpt, userOpt);
//    DataChecksum dataChecksum = DataChecksum.newDataChecksum(
//        myOpt.getChecksumType(),
//        myOpt.getBytesPerChecksum());
//    if (dataChecksum == null) {
//      throw new IOException("Invalid checksum type specified: "
//          + myOpt.getChecksumType().name());
//    }
//    return dataChecksum;
//  }
//}
//
