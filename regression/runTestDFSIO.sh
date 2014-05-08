#!/bin/bash

nrOfFilesSet=$1
fileSizeSet=$2

exportResultsToReport()
{
    if [[ -e "$SHORT_LOG" ]]; then
            TP=`grep Throughput $SHORT_LOG | cut -d ' ' -f 8 | tr '\n' ' '`
            TIME=`grep "exec time" $SHORT_LOG | cut -d ' ' -f 9 | tr '\n' ' '`
        else
            echo "TestDFSIO FAILED ON ALL ${PROGRAM} ATTEMPTS -- PLACING DUMMY VALUES"
            TP=0
            TIME=0
        fi
        echo "Running ${PROGRAM} with ${nrFiles} files of size ${fileSize}MB results: <br>" >> $REPORT_PATH_DFSIO
        echo "Times: $TIME <br>" >> $REPORT_PATH_DFSIO
        echo "Throughputs: $TP <br>" >> $REPORT_PATH_DFSIO
        echo "Failed: $FAILED_ATTEMPTS" >> $REPORT_PATH_DFSIO
        echo "CPU: $CPU_TIMES" >> $REPORT_PATH_DFSIO
        echo "<br><br>" >> $REPORT_PATH_DFSIO
}

runJob()
{
    local USE=$1
    runDstat
    hadoop jar $TEST_JAR TestDFSIO -Ddfs.replication=${DFS_REPLICATION} ${USE} -write -nrFiles ${nrFiles} -fileSize ${fileSize}MB -resFile $SHORT_LOG >> $LONG_LOG 2>&1
    succ=$?
    killDstat
    if (($succ != 0)); then
        FAILED_ATTEMPTS=$((FAILED_ATTEMPTS+1))
    else
        FAILED_KILLED_MAPPERS=`mapred job -history ${DFSIO_WRITE_PATH} | grep -A 8 "Task Summary" | grep "Map" | awk '{print $4 + $5}'`
        FAILED_ATTEMPTS=$((FAILED_ATTEMPTS+FAILED_KILLED_MAPPERS))
    fi
    pdsh -w $SLAVES sync
}

runDstat()
{
    pdsh -w ${SLAVES} "dstat -c --output ${DSTAT_TMP_PATH}/dstat_\`hostname\`.csv 5 >& /dev/null"&
    PDSH_PID=$!
}

killDstat()
{
    kill -9 ${PDSH_PID}
    pdsh -w ${SLAVES} "X=\`ps -ef | grep dstat | grep -v grep | awk '{ print \$2 }'\`; if [[ -n \$X ]]; then kill -9 \$X; fi"
}

reduceDstat()
{
    FILES=`ls ${DSTAT_TMP_PATH}`
    SUM_FILE="${DSTAT_TMP_PATH}/summary.csv"
    for file in ${FILES}
    do
        cat ${DSTAT_TMP_PATH}/${file} >> ${SUM_FILE}
    done
    
    CPU_TIMES=`awk -f reduce-dstat.awk ${SUM_FILE}`
    
    # Temporary - get 100-IDLETIME
    CPU_TIMES=`echo ${CPU_TIMES} | awk 'BEGIN{ FS="," } { print 100-$3 }'`
    
    rm -rf ${DSTAT_TMP_PATH}/*.csv
}


echo "Changing hdfs /user permissions to 777..." | tee -a $LONG_LOG
sudo -u hdfs hdfs dfs -chmod -R 777 /user

for fileSize in $fileSizeSet
do 
    for nrFiles in $nrOfFilesSet
    do
        # UFA Phase
        PROGRAM="UFA"
        SHORT_LOG="${LOG_PATH}short_${nrFiles}_${fileSize}_${PROGRAM}.log"
        FAILED_ATTEMPTS=0
        ITERATIONS=3
        RANGE=`echo "$ITERATIONS" | awk '{ for(i=1;i<=$1;i++) print i;}' | tr '\n' ' '`
        
        for i in $RANGE
        do
            echo "@@@@@@@@@@@@@@@@@@@ `date` : running ${PROGRAM} with ${nrFiles} file of size ${fileSize}MB, Run number ${i} out of $ITERATIONS @@@@@@@@@@@@@@@@@@@@@@@@" >> $LONG_LOG
            runJob $USE_UFA
        done
        reduceDstat
        exportResultsToReport
        
        # Vanilla Phase
        PROGRAM="VANILLA"
        SHORT_LOG="${LOG_PATH}short_${nrFiles}_${fileSize}_${PROGRAM}.log"
        FAILED_ATTEMPTS=0
        ITERATIONS=1
        RANGE=`echo "$ITERATIONS" | awk '{ for(i=1;i<=$1;i++) print i;}' | tr '\n' ' '`
        for j in $RANGE
        do
            echo "@@@@@@@@@@@@@@@@@@@ `date` : running ${PROGRAM} with ${nrFiles} files of size ${fileSize}MB, Run number ${j} out of $ITERATIONS @@@@@@@@@@@@@@@@@@@@@@@@" >> $LONG_LOG
            runJob
        done
        reduceDstat
        exportResultsToReport

        # Cleaning Phase
        echo "@@@@@@@@@@@@@@@@@@@ `date` : cleaning TestDFSIO files @@@@@@@@@@@@@@@@@@@@@@@@" >> $LONG_LOG
        hadoop jar $TEST_JAR TestDFSIO -clean >> $LONG_LOG 2>&1	
    done
done
