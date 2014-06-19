#!/bin/bash

nrOfFilesSet=$1
fileSizeSet=$2

exportResultsToReport()
{
    if [[ -e "$SHORT_LOG" ]]; then
            AGGTP=`grep "Average of Aggregated" $SHORT_LOG | awk '{ print $6 }'`
            TP=`grep "Throughput mb/sec" $SHORT_LOG | awk '{ print $3 }'`
            TIME=`grep "Test exec time" $SHORT_LOG | awk '{ print $5 }'`
        else
            echo "DFSIOE FAILED ON ALL ${PROGRAM} ATTEMPTS -- PLACING DUMMY VALUES"
            AGGTP=0
            TP=0
            TIME=0
        fi
        AGGTP_MIN=`echo "$AGGTP" | sort -n | head -n 1`
        AGGTP_MAX=`echo "$AGGTP" | sort -n | tail -n 1`
        AGGTP_AVG=`echo $AGGTP | awk '{ size=split($0,a," "); sum=0; for(i=1;i<=NF;i++)sum=sum+a[i]; print sum/size }'`
        TP_MIN=`echo "$TP" | sort -n | head -n 1`
        TP_MAX=`echo "$TP" | sort -n | tail -n 1`
        TP_AVG=`echo $TP | awk '{ size=split($0,a," "); sum=0; for(i=1;i<=NF;i++)sum=sum+a[i]; print sum/size }'`
        TIME_MIN=`echo "$TIME" | sort -n | head -n 1`
        TIME_MAX=`echo "$TIME" | sort -n | tail -n 1`
        TIME_AVG=`echo $TIME | awk '{ size=split($0,a," "); sum=0; for(i=1;i<=NF;i++)sum=sum+a[i]; print sum/size }'`       
        echo "${PROGRAM},${nrFiles},${fileSize},${TIME_MIN},${TIME_MAX},${TIME_AVG},${TP_MIN},${TP_MAX},${TP_AVG},${AGGTP_MIN},${AGGTP_MAX},${AGGTP_AVG},${FAILED_ATTEMPTS}" >> $DFSIOE_SHEET_CSV_PATH

}

runJob()
{
    local USE=$1
    HISTORY_PATH=$(echo /user/history/done/$(date +%Y)/$(date +%m)/$(date +%d)/000000)
    ${HADOOP_EXEC} jar $DATATOOLS_JAR org.apache.hadoop.fs.dfsioe.TestDFSIOEnh -bufferSize 4096 -plotInteval 1000 -sampleUnit m -sampleInteval 200 -sumThreshold 0.5 -Ddfs.replication=${DFS_REPLICATION} ${USE} -write -nrFiles ${nrFiles} -fileSize ${fileSize} -resFile $SHORT_LOG >> $LONG_LOG 2>&1
    if (($? != 0)); then
        FAILED_ATTEMPTS=$((FAILED_ATTEMPTS+1))
    else
        HISTORY_FILE=$(${HDFS_EXEC} dfs -ls ${HISTORY_PATH} | grep .jhist | tail -1 | awk '{print $8}')
        FAILED_KILLED_MAPPERS=`${MAPRED_EXEC} job -history ${HISTORY_FILE} | grep -A 8 "Task Summary" | grep "Map" | awk '{print $4 + $5}'`
        FAILED_ATTEMPTS=$((FAILED_ATTEMPTS+FAILED_KILLED_MAPPERS))
    fi
    pdsh -w $SLAVES sync
}

echo "program,numOfFiles,fileSize,min time,max time,avg time,min TP,max TP,avg TP,min aggTP,max aggTP,avg aggTP,failed attempts" >> $DFSIOE_SHEET_CSV_PATH

echo "Changing hdfs /user permissions to 777..." | tee -a $LONG_LOG
sudo -u hdfs ${HDFS_EXEC} dfs -chmod -R 777 /user

for fileSize in $fileSizeSet
do 
    for nrFiles in $nrOfFilesSet
    do
        # UFA Phase
        PROGRAM="UFA"
        SHORT_LOG="${LOG_PATH}dfsioe_short_${nrFiles}_${fileSize}_${PROGRAM}.log"
        FAILED_ATTEMPTS=0
        RANGE=`echo "$ITERATIONS_R4H" | awk '{ for(i=1;i<=$1;i++) print i;}' | tr '\n' ' '`
        for i in $RANGE
        do
            echo "@@@@@@@@@@@@@@@@@@@ `date` : running ${PROGRAM} with ${nrFiles} file of size ${fileSize}MB, Run number ${i} out of $ITERATIONS_R4H @@@@@@@@@@@@@@@@@@@@@@@@" >> $LONG_LOG
            runJob $USE_UFA
        done
        exportResultsToReport
        
        # Vanilla Phase
        PROGRAM="VANILLA"
        SHORT_LOG="${LOG_PATH}dfsioe_short_${nrFiles}_${fileSize}_${PROGRAM}.log"
        FAILED_ATTEMPTS=0
        RANGE=`echo "$ITERATIONS_VNL" | awk '{ for(i=1;i<=$1;i++) print i;}' | tr '\n' ' '`
        for j in $RANGE
        do
            echo "@@@@@@@@@@@@@@@@@@@ `date` : running ${PROGRAM} with ${nrFiles} files of size ${fileSize}MB, Run number ${j} out of $ITERATIONS_VNL @@@@@@@@@@@@@@@@@@@@@@@@" >> $LONG_LOG
            runJob
        done
        exportResultsToReport

        # Cleaning Phase
        echo "@@@@@@@@@@@@@@@@@@@ `date` : cleaning DFSIOEnh files @@@@@@@@@@@@@@@@@@@@@@@@" >> $LONG_LOG
        ${HADOOP_EXEC} jar $DATATOOLS_JAR org.apache.hadoop.fs.dfsioe.TestDFSIOEnh -clean >> $LONG_LOG 2>&1	
    done
done
