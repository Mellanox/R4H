#!/bin/bash

# Creating Tarball Phase
oldDir=`pwd`
LOG_DIR=`dirname $LOG_PATH`
cd $LOG_DIR
jobName=`basename $LOG_PATH`
echo "Performing tar zcf $jobName.tgz $jobName"
tar zcf $jobName.tgz $jobName 2> /dev/null
tarstatus=$?
cd $oldDir
TAR_PATH="${LOG_DIR}/${jobName}.tgz"

# Parsing Results Phase
if [[ -n "$RAN_DFSIO" ]]; then
    # Process CSV to Excel with Graphs (xlsx)
    python processCSV2GraphXlsx_DFSIO.py -i ${DFS_SHEET_CSV_PATH} -o ${DFS_SHEET_XLSX_PATH}
fi

if [[ -n "$RAN_TERAGEN" ]]; then
    python processCSV2GraphXlsx_Tera.py -i ${TERAGEN_SHEET_CSV_PATH} -o ${TERAGEN_SHEET_XLSX_PATH}
fi

if [[ -n "$RAN_TERASORT" ]]; then
    python processCSV2GraphXlsx_Tera.py -i ${TERASORT_SHEET_CSV_PATH} -o ${TERASORT_SHEET_XLSX_PATH}
fi

if [[ -n "$RAN_DFSIOE" ]]; then
    python processCSV2GraphXlsx_DFSIO-Enh.py -i ${DFSIOE_SHEET_CSV_PATH} -o ${DFSIOE_SHEET_XLSX_PATH}
fi

# Produce Error Summary
grep -A 10 "ERROR" ${LONG_LOG} > ${REPORT_PATH_ERROR}

## If error summary is empty - delete it
if [[ ! -s ${REPORT_PATH_ERROR} ]]; then 
    rm -rf ${REPORT_PATH_ERROR}
fi
    
# Prepare Mail Phase
message="<font size=6 color=blue><b>Daily R4H Regression Report</b></font><br><br><b>Date:</b> ${DATE}<br><b>Hadoop Version:</b> ${HADOOP_VERSION}<br>" 
R4H_VERSION=`unzip -q -c "$R4H_JAR_PATH" META-INF/MANIFEST.MF | grep "Implementation-Version" | awk '{ print $2 }'`
JXIO_VERSION=`unzip -q -c "$JXIO_JAR_PATH" META-INF/MANIFEST.MF | grep "Specification-Version" | awk '{ print $2 }'`

if [[ -n "$R4H_VERSION" ]]; then
    message="$message <b>R4H Version:</b> ${R4H_VERSION}<br>"
fi

if [[ -n "$JXIO_VERSION" ]]; then
    message="$message <b>JXIO Version:</b> ${JXIO_VERSION}<br>"
fi

message="$message <b>Tests:</b><br>"
message="$message <ul>"
if [[ -n "$RAN_DFSIO" ]]; then
    message="$message <li>TestDFSIO [NumOfFiles: ${DFS_FILES_NUM_SET}, FileSizes: ${DFS_FILES_SIZE_SET}, Replication: ${DFS_REPLICATION}]</li>"
fi
if [[ -n "$RAN_TERAGEN" ]]; then
    message="$message <li>TeraGen [NumOfMappers: ${TERAGEN_MAP_TASKS_SET}, JobSizes: ${TERAGEN_SIZE_SET}, Replication: ${DFS_REPLICATION}]</li>"
fi
if [[ -n "$RAN_TERASORT" ]]; then
    message="$message <li>TeraSort [NumOfReducers: ${TERASORT_REDUCE_TASKS_SET}, JobSizes: ${TERASORT_SIZE_SET}, Replication: ${DFS_REPLICATION}]</li>"
fi
if [[ -n "$RAN_DFSIOE" ]]; then
    message="$message <li>TestDFSIO-Enh [NumOfFiles: ${DFSIOE_FILES_NUM_SET}, FileSizes: ${DFSIOE_FILES_SIZE_SET}, Replication: ${DFS_REPLICATION}]</li>"
fi
message="$message </ul>"
message="$message <br><br>Attaching reports and logs tarball.<br>"
subject="${MAIL_SUBJECT}"

# Send Mail Phase
echo "Sending mail..."
python mailSenderUFA.py "$subject" "$message" "`date`" "$USER" "$MAILING_LIST" "${TAR_PATH}" "${DFS_SHEET_XLSX_PATH}" "${TERAGEN_SHEET_XLSX_PATH}" "${TERASORT_SHEET_XLSX_PATH}" "${DFSIOE_SHEET_XLSX_PATH}" "${REPORT_PATH_ERROR}"

sleep 5

# Finalize
if [[ "$tarstatus" != "0" ]]; then
    echo "Error creating tgz file. Keeping log directory."
else
    echo "$jobName had compressed successfully. Deleting the directory $LOG_PATH"
    rm -rf $LOG_PATH
fi
