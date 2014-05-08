#!/bin/bash

jobSizeSet=$1
reduceTasksSet=$2
MAPS=$(echo $SLAVES | awk '{ print split($0,a,","); }')

exportResultsToReport()
{
    TIMES=$(echo "$TIMES" | xargs | tr ' ' '\n')
    TIME_MIN=$(echo "$TIMES" | sort -n | head -n 1)
    TIME_MAX=$(echo "$TIMES" | sort -n | tail -n 1)
    TIME_AVG=$(echo "$TIMES" | awk 'BEGIN{ n=0; sum=0; } { sum+=$1; n++ } END{ print sum/n }')
    
    echo "${PROGRAM},${reduceTasks},${jobSize},${TIME_MIN},${TIME_MAX},${TIME_AVG},${FAILED_ATTEMPTS}" >> ${TERASORT_SHEET_CSV_PATH}
}

generateData()
{
    local size=$1
    echo "Generating data of size ${size}"
    echo "Cleaning ${TERAGEN_PATH}"
    hdfs dfs -rm -r ${TERAGEN_PATH}
    echo "Executing: hadoop jar $EXAMPLES_JAR teragen -Dmapred.map.tasks=${MAPS} ${jobSize} ${TERAGEN_PATH}"
    hadoop jar $EXAMPLES_JAR teragen -Dmapred.map.tasks=${MAPS} ${jobSize} ${TERAGEN_PATH} >> $LONG_LOG 2>&1
    if (($? != 0)); then
        echo "Data generation FAILED!" | tee -a $LONG_LOG
        exit 1
    fi
}

runJob()
{
    local REDUCERS=$1
    local USE=$2
    echo "Cleaning ${TERASORT_PATH}"
    hdfs dfs -rm -r ${TERASORT_PATH}
    echo "Executing: hadoop jar $EXAMPLES_JAR terasort ${USE} -Dmapred.reduce.tasks=${REDUCERS} ${TERAGEN_PATH} ${TERASORT_PATH}"
    hadoop jar $EXAMPLES_JAR terasort ${USE} -Ddfs.replication=${DFS_REPLICATION} -Dmapred.reduce.tasks=${REDUCERS} ${TERAGEN_PATH} ${TERASORT_PATH} >> $LONG_LOG 2>&1
    if (($? != 0)); then
        FAILED_ATTEMPTS=$((FAILED_ATTEMPTS+1))
    else
        HISTORY=$(mapred job -history ${TERASORT_PATH})
        START_TIME=$(echo "$HISTORY" | grep "Launched At:" | awk '{ print $4 }')
        FINISH_TIME=$(echo "$HISTORY" | grep "Finished At:" | awk '{ print $4 }')
        START_SEC=$(date -d "$START_TIME" +%s)
        FINISH_SEC=$(date -d "$FINISH_TIME" +%s)
        JOB_TIME=$((${FINISH_SEC}-${START_SEC}))
        TIMES="$TIMES $JOB_TIME"
        
        # Saves number of both FAILED and KILLED mappers
        FAILED_KILLED_MAPPERS=$(echo "$HISTORY" | grep -A 8 "Task Summary" | grep "Map" | awk '{print $4 + $5}')
        FAILED_ATTEMPTS=$((FAILED_ATTEMPTS+FAILED_KILLED_MAPPERS))
    fi
    pdsh -w $SLAVES sync
}

echo "program,tasks,fileSize,min time,max time,avg time,failed attempts" >> ${TERASORT_SHEET_CSV_PATH}

for jobSize in $jobSizeSet
do
    generateData $jobSize
    for reduceTasks in $reduceTasksSet
    do 
        # UFA Phase
        TIMES=""
        PROGRAM="UFA"
        FAILED_ATTEMPTS=0
        ITERATIONS=3
        RANGE=$(echo "$ITERATIONS" | awk '{ for(i=1;i<=$1;i++) print i;}' | tr '\n' ' ')
        for i in $RANGE
        do
            echo "@@@@@@@@@@@@@@@@@@@ `date` : (TERASORT) running ${PROGRAM}, job size = ${jobSize}, reducers = $reduceTasks Run number ${i} out of $ITERATIONS @@@@@@@@@@@@@@@@@@@@@@@@" >> $LONG_LOG
            runJob $reduceTasks $USE_UFA
        done
        exportResultsToReport
        
        # Vanilla Phase
        TIMES=""
        PROGRAM="VANILLA"
        FAILED_ATTEMPTS=0
        ITERATIONS=1
        RANGE=$(echo "$ITERATIONS" | awk '{ for(i=1;i<=$1;i++) print i;}' | tr '\n' ' ')
        for j in $RANGE
        do
            echo "@@@@@@@@@@@@@@@@@@@ `date` : (TERASORT) running ${PROGRAM}, job size = ${jobSize}, reducers = $reduceTasks Run number ${j} out of $ITERATIONS @@@@@@@@@@@@@@@@@@@@@@@@" >> $LONG_LOG
            runJob $reduceTasks
        done
        exportResultsToReport
    done
done
