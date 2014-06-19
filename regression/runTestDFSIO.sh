#!/bin/bash

nrOfFilesSet=$1
fileSizeSet=$2

exportResultsToReport()
{
    if [[ -e "$SHORT_LOG" ]]; then
            TP=$(grep Throughput $SHORT_LOG | awk '{ print $3 }')
            TIME=$(grep "exec time" $SHORT_LOG | awk '{ print $5 }')
    else
            echo "TestDFSIO FAILED ON ALL ${PROGRAM} ATTEMPTS -- PLACING DUMMY VALUES"
            TP=0
            TIME=0
    fi
    
    TP_MIN=$(echo "$TP" | sort -n | head -n 1)
    TP_MAX=$(echo "$TP" | sort -n | tail -n 1)
    TP_AVG=$(echo "$TP" | awk 'BEGIN{ n=0; sum=0; } { sum+=$1; n++ } END{ print sum/n }')
    TIME_MIN=$(echo "$TIME" | sort -n | head -n 1)
    TIME_MAX=$(echo "$TIME" | sort -n | tail -n 1)
    TIME_AVG=$(echo "$TIME" | awk 'BEGIN{ n=0; sum=0; } { sum+=$1; n++ } END{ print sum/n }')
    
    echo "${PROGRAM},${nrFiles}_files,${fileSize}MB,${TIME_MIN},${TIME_MAX},${TIME_AVG},${TP_MIN},${TP_MAX},${TP_AVG},${FAILED_ATTEMPTS},${CPU_TIMES}" >> ${DFS_SHEET_CSV_PATH}
        
}

runJob()
{
    local USE=$1
    HISTORY_PATH=$(echo /user/history/done/$(date +%Y)/$(date +%m)/$(date +%d)/000000)
    runDstat
    ${HADOOP_EXEC} jar $TEST_JAR TestDFSIO -Ddfs.replication=${DFS_REPLICATION} ${USE} -write -nrFiles ${nrFiles} -fileSize ${fileSize}MB -resFile $SHORT_LOG >> $LONG_LOG 2>&1
    succ=$?
    killDstat
    
    HISTORY_FILE=$(${HDFS_EXEC} dfs -ls ${HISTORY_PATH} | grep .jhist | tail -1 | awk '{print $8}')
    
    if (($succ != 0)); then
        FAILED_ATTEMPTS=$((FAILED_ATTEMPTS+1))
    else
        FAILED_KILLED_MAPPERS=$(${MAPRED_EXEC} job -history ${HISTORY_FILE} | grep -A 8 "Task Summary" | grep "Map" | awk '{print $4 + $5}')
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
    FILES=$(ls ${DSTAT_TMP_PATH})
    SUM_FILE="${DSTAT_TMP_PATH}/summary.csv"
    for file in ${FILES}
    do
        cat ${DSTAT_TMP_PATH}/${file} >> ${SUM_FILE}
    done
    
    CPU_TIMES=$(awk -f reduceDstat.awk ${SUM_FILE})
    
    # Temporary - get 100-IDLETIME
    CPU_TIMES=$(echo ${CPU_TIMES} | awk 'BEGIN{ FS="," } { print 100-$3 }')
    
    rm -rf ${DSTAT_TMP_PATH}/*.csv
}

echo "program,numOfFiles,fileSize,min time,max time,avg time,min TP,max TP,avg TP,failed attempts,avg cpu" >> ${DFS_SHEET_CSV_PATH}

echo "Changing hdfs /user permissions to 777..." | tee -a $LONG_LOG
sudo -u hdfs ${HDFS_EXEC} dfs -chmod -R 777 /user

for fileSize in $fileSizeSet
do 
    for nrFiles in $nrOfFilesSet
    do
        # UFA Phase
        PROGRAM="UFA"
        SHORT_LOG="${LOG_PATH}short_${nrFiles}_${fileSize}_${PROGRAM}.log"
        FAILED_ATTEMPTS=0
        if [[ "$ITERATIONS_R4H" != "0" ]]; then
            RANGE=`echo "$ITERATIONS_R4H" | awk '{ for(i=1;i<=$1;i++) print i;}' | tr '\n' ' '`
            
            for i in $RANGE
            do
                echo "@@@@@@@@@@@@@@@@@@@ `date` : running ${PROGRAM} with ${nrFiles} file of size ${fileSize}MB, Run number ${i} out of $ITERATIONS_R4H @@@@@@@@@@@@@@@@@@@@@@@@" >> $LONG_LOG
                runJob $USE_UFA
            done
            reduceDstat
            exportResultsToReport
        fi
        
        # Vanilla Phase
        PROGRAM="VANILLA"
        SHORT_LOG="${LOG_PATH}short_${nrFiles}_${fileSize}_${PROGRAM}.log"
        FAILED_ATTEMPTS=0
        
        if [[ "$ITERATIONS_VNL" != "0" ]]; then
            RANGE=`echo "$ITERATIONS_VNL" | awk '{ for(i=1;i<=$1;i++) print i;}' | tr '\n' ' '`
            for j in $RANGE
            do
                echo "@@@@@@@@@@@@@@@@@@@ `date` : running ${PROGRAM} with ${nrFiles} files of size ${fileSize}MB, Run number ${j} out of $ITERATIONS_VNL @@@@@@@@@@@@@@@@@@@@@@@@" >> $LONG_LOG
                runJob
            done
            reduceDstat
            exportResultsToReport
        fi
        
        # Cleaning Phase
        echo "@@@@@@@@@@@@@@@@@@@ `date` : cleaning TestDFSIO files @@@@@@@@@@@@@@@@@@@@@@@@" >> $LONG_LOG
        ${HADOOP_EXEC} jar $TEST_JAR TestDFSIO -clean >> $LONG_LOG 2>&1	
    done
done
