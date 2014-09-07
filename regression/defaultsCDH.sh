#!/bin/bash

# CDH5 Specifics
export CM_HOST="r-aa-zorro002"
export SLAVES="r-aa-zorro003,r-aa-zorro004,r-aa-zorro005"
export CONTAINERS_PER_NODE="7"
export MY_HADOOP_HOME="/opt/cloudera/parcels/CDH"
export YARN_CFG="/etc/hadoop/conf.cloudera.yarn"
export HADOOP_EXEC="${MY_HADOOP_HOME}/bin/hadoop --config ${YARN_CFG}"
export HDFS_EXEC="${MY_HADOOP_HOME}/bin/hdfs"
export YARN_EXEC="${MY_HADOOP_HOME}/bin/yarn"
export MAPRED_EXEC="${MY_HADOOP_HOME}/bin/mapred"
export JARS_DIR="/opt/cloudera/parcels/CDH/lib/hadoop-mapreduce"
export TEST_JAR="${JARS_DIR}/hadoop-mapreduce-client-jobclient.jar"
export EXAMPLES_JAR="${JARS_DIR}/hadoop-mapreduce-examples.jar"
export DATATOOLS_JAR="/.autodirect/mtrswgwork/eladi/UFA-JARS/datatools.jar"
export HISTORY_ROOT="/user/history"
export JXIO_JAR_PATH="/opt/cloudera/parcels/CDH/lib/hadoop-hdfs/lib/jxio.jar"
export R4H_JAR_PATH="/opt/cloudera/parcels/CDH/lib/hadoop-hdfs/lib/r4h.jar"
