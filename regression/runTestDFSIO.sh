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
        echo "<br><br>" >> $REPORT_PATH_DFSIO
}

runJob()
{
    local USE=$1
    hadoop jar $TEST_JAR TestDFSIO -Ddfs.replication=${DFS_REPLICATION} ${USE} -write -nrFiles ${nrFiles} -fileSize ${fileSize}MB -resFile $SHORT_LOG >> $LONG_LOG 2>&1
    if (($? != 0)); then
        FAILED_ATTEMPTS=$((FAILED_ATTEMPTS+1))
    else
        FAILED_KILLED_MAPPERS=`mapred job -history ${DFSIO_WRITE_PATH} | grep -A 8 "Task Summary" | grep "Map" | awk '{print $4 + $5}'`
        FAILED_ATTEMPTS=$((FAILED_ATTEMPTS+FAILED_KILLED_MAPPERS))
    fi
    pdsh -w $SLAVES sync
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
        exportResultsToReport

        # Cleaning Phase
        echo "@@@@@@@@@@@@@@@@@@@ `date` : cleaning TestDFSIO files @@@@@@@@@@@@@@@@@@@@@@@@" >> $LONG_LOG
        hadoop jar $TEST_JAR TestDFSIO -clean >> $LONG_LOG 2>&1	
    done
done
