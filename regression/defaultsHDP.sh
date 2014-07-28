#!/bin/bash

# HDP2.1 Specifics
export AMBARI_HOST="r-aa-zorro006"
export SLAVES="r-aa-zorro007,r-aa-zorro008,r-aa-zorro009"
export MY_HADOOP_HOME="/usr/lib/hadoop"
export YARN_CFG="/etc/hadoop/conf"
export HADOOP_EXEC="hadoop"
export YARN_EXEC="yarn"
export HDFS_EXEC="hdfs"
export MAPRED_EXEC="mapred"
export JARS_DIR="/.autodirect/mtrswgwork/eladi/UFA-JARS"
export TEST_JAR="/usr/lib/hadoop-mapreduce/hadoop-mapreduce-client-jobclient-2.4.0.2.1.3.0-563-tests.jar"
export EXAMPLES_JAR="/usr/lib/hadoop-mapreduce/hadoop-mapreduce-examples.jar"
export DATATOOLS_JAR="${JARS_DIR}/datatools.jar"
export HISTORY_ROOT="/mr-history"
export JXIO_JAR_PATH="/usr/lib/hadoop-hdfs/lib/jxio.jar"
export R4H_JAR_PATH="/usr/lib/hadoop-hdfs/lib/r4h.jar"
