#!/bin/bash

# CDH5 Specifics
export CM_HOST="r-aa-fatty01"
export SLAVES="r-aa-fatty02,r-aa-fatty03,r-aa-fatty04,r-aa-fatty05,r-aa-fatty06,r-aa-fatty07"
export MY_HADOOP_HOME="/opt/cloudera/parcels/CDH"
export YARN_CFG="/etc/hadoop/conf.cloudera.yarn"
export HADOOP_EXEC="${MY_HADOOP_HOME}/bin/hadoop --config ${YARN_CFG}"
export HDFS_EXEC="${MY_HADOOP_HOME}/bin/hdfs"
export MAPRED_EXEC="${MY_HADOOP_HOME}/bin/mapred"
export JARS_DIR="/.autodirect/mtrswgwork/eladi/UFA-JARS"
export TEST_JAR="${JARS_DIR}/hadoop-test-2.3.0-mr1-cdh5.0.2.jar"
export EXAMPLES_JAR="${JARS_DIR}/hadoop-mapreduce-examples-2.3.0-cdh5.0.2.jar"
export DATATOOLS_JAR="${JARS_DIR}/datatools.jar"
export HISTORY_ROOT="/user/history"
export JXIO_JAR_PATH="/opt/cloudera/parcels/CDH/lib/hadoop-hdfs/lib/jxio.jar"
export R4H_JAR_PATH="/opt/cloudera/parcels/CDH/lib/hadoop-hdfs/lib/r4h.jar"
