#!/bin/bash

# HDP2.1 Specifics
if [[ "$(hostname)" == *zorro002* ]]; then
	export AMBARI_HOST="r-aa-zorro002"
	export SLAVES="r-aa-zorro003,r-aa-zorro004,r-aa-zorro005"
	export CONTAINERS_PER_NODE="7"
elif [[ "$(hostname)" == *zorro006* ]]; then
	export AMBARI_HOST="r-aa-zorro006"
        export SLAVES="r-aa-zorro007,r-aa-zorro008,r-aa-zorro009"
	export CONTAINERS_PER_NODE="8"
else
	export AMBARI_HOST="r-aa-fatty01"
	export SLAVES="r-aa-fatty02,r-aa-fatty03,r-aa-fatty04,r-aa-fatty05,r-aa-fatty06,r-aa-fatty07"
	export CONTAINERS_PER_NODE="15"
#,r-aa-fatty08,r-aa-fatty09,r-aa-fatty10,r-aa-fatty11,r-aa-fatty12"
fi
export MY_HADOOP_HOME="/usr/lib/hadoop"
export YARN_CFG="/etc/hadoop/conf"
export HADOOP_EXEC="hadoop"
export YARN_EXEC="yarn"
export HDFS_EXEC="hdfs"
export MAPRED_EXEC="mapred"
export JARS_DIR="/.autodirect/mtrswgwork/eladi/UFA-JARS"
export TEST_JAR="/usr/lib/hadoop-mapreduce/hadoop-mapreduce-client-jobclient.jar"
export EXAMPLES_JAR="/usr/lib/hadoop-mapreduce/hadoop-mapreduce-examples.jar"
export DATATOOLS_JAR="${JARS_DIR}/datatools.jar"
export HISTORY_ROOT="/mr-history"
export JXIO_JAR_PATH="/usr/lib/hadoop-hdfs/lib/jxio.jar"
export R4H_JAR_PATH="/usr/lib/hadoop-hdfs/lib/r4h.jar"
