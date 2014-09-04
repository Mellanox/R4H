#!/bin/bash

compareOutputs()
{
    ${HDFS_EXEC} dfs -copyToLocal /wordcount_R4H ${TMP_JOB_DIR}
    ${HDFS_EXEC} dfs -copyToLocal /wordcount_VANILLA ${TMP_JOB_DIR}
    result=$(diff -rq ${TMP_JOB_DIR}/wordcount_R4H ${TMP_JOB_DIR}/wordcount_VANILLA)
    if [[ "$result" != "" ]]; then
        echo "FAILED: Output files differ between R4H and Vanilla." | tee -a ${LONG_LOG} ${WORDCOUNT_REPORT_PATH}
        JOB_FAILED=1
    fi
}

generateData()
{
    if [ -f ${TMP_JOB_LOG} ]; then
        sudo rm -rf ${TMP_JOB_LOG}
    fi
    
    # Remove old files
    ${HDFS_EXEC} dfs -rm -r -skipTrash ${RANDOM_TEXT_PATH} "/wordcount*"
    sudo rm -rf "${TMP_JOB_DIR}/wordcount*"
    
    # Generate data (10GB per node by default)
    echo "@@@@ $(date) : Generating data for WordCount @@@@" | tee -a ${LONG_LOG}
    ${HADOOP_EXEC} jar $EXAMPLES_JAR randomtextwriter -Dmapreduce.client.submit.file.replication=${DFS_REPLICATION} -Ddfs.replication=${DFS_REPLICATION} ${USE} ${RANDOM_TEXT_PATH} 2>&1 | tee -a ${LONG_LOG} ${TMP_JOB_LOG} > /dev/null
    
    succ=$(grep -irc "job failed" ${TMP_JOB_LOG})
    if ((${succ} != 0)); then
        echo "FAILED: Data generation failed!" | tee -a ${LONG_LOG} ${WORDCOUNT_REPORT_PATH}
        JOB_FAILED=1
    fi
    
}

runJob()
{
    local PROGRAM=$1
    local USE=$2
    local OUTPUT_DIR="/wordcount_${PROGRAM}"
    
    if [ -f ${TMP_JOB_LOG} ]; then
        sudo rm -rf ${TMP_JOB_LOG}
    fi
    
    FAILED_KILLED_MAPPERS=0
    
    # Execute WordCount
    echo "@@@@ $(date) : Running WordCount with ${PROGRAM} " | tee -a ${LONG_LOG}
    ${HADOOP_EXEC} jar $EXAMPLES_JAR wordcount -Dmapreduce.client.submit.file.replication=${DFS_REPLICATION} -Ddfs.replication=${DFS_REPLICATION} ${USE} ${RANDOM_TEXT_PATH} ${OUTPUT_DIR} 2>&1 | tee -a $LONG_LOG ${TMP_JOB_LOG} > /dev/null
    
    succ=$(grep -irc "job failed" ${TMP_JOB_LOG})
    if (($succ != 0)); then
        echo "@@@ Job failed! @@@" | tee -a ${LONG_LOG}
    else
        FAILED_KILLED_MAPPERS=$(grep -c "Status : FAILED" ${TMP_JOB_LOG})
        if [[ "$FAILED_KILLED_MAPPERS" != "0" ]]; then
            echo "FAILED: Got ${FAILED_KILLED_MAPPERS} failed/killed mappers with ${PROGRAM}!" | tee -a ${LONG_LOG} ${WORDCOUNT_REPORT_PATH}
        fi
    fi

    APP_ID=$(grep "Submitted application" ${TMP_JOB_LOG} | awk '{ print $7 }')
    ERRORS=$(${YARN_EXEC} logs -applicationId ${APP_ID} | grep "ERROR\|FATAL")
    
    if [[ "$ERRORS" != "" ]] || (($succ != 0)); then
        echo "FAILED: Found errors when running with ${PROGRAM}, exiting." | tee -a ${LONG_LOG} ${WORDCOUNT_REPORT_PATH}
        echo "$ERRORS" > ${REPORT_PATH_ERROR}
        JOB_FAILED=1
    fi
    
    rm -rf ${TMP_JOB_LOG}
    pdsh -w $SLAVES sync
}


echo "Changing hdfs /user permissions to 777..." | tee -a $LONG_LOG
sudo -u hdfs ${HDFS_EXEC} dfs -chmod -R 777 /

JOB_FAILED=0
generateData
if (($JOB_FAILED == 1)); then
    exit 1
fi
runJob "R4H" $USE_UFA
if (($JOB_FAILED == 1)); then
    exit 1
fi
runJob "VANILLA"
if (($JOB_FAILED == 1)); then
    exit 1
fi
compareOutputs
