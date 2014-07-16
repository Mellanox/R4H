#!/bin/bash

source defaults.sh

errorHandler()
{
    local phase="$1"
    message="Error occurred during ${phase} phase."
    python mailSenderUFA.py "HDFS Regression runtime failure" "$message" "$(date)" "$USER" "$MAILING_LIST"
    exit 1
}

restartCluster()
{
    ${HDFS_EXEC} dfs -rm -r "/*"
    ${HDFS_EXEC} dfs -expunge
    
    python cmHandler.py "stop"
    if (($? != 0)); then
        errorHandler "cluster restart"
    fi

    python cmHandler.py "start"
    if (($? != 0)); then
        errorHandler "cluster restart"
    fi
}

waitForPID()
{
    local pid=$1
    while (($SLEEP_TIME > 0));
    do
        sleep 60
        SLEEP_TIME=$((SLEEP_TIME-60))
        if ! ps -p $pid > /dev/null ; then
            break
        fi
    done

    if (($SLEEP_TIME <= 0)); then
        echo "Killing PID: $pid"
        sudo kill $pid
    fi
}

# Arguments Handler
if [[ -z "$1" ]]; then
    echo "$USAGE_MESSAGE"
    exit 0
fi

optspec=":-:"
while getopts "$optspec" optchar; do
    case "${optchar}" in
        -)
            case "${OPTARG}" in
                dfs_files_num=*)
                    val=${OPTARG#*=}
                    opt=${OPTARG%=$val}
                    export DFS_FILES_NUM_SET="${val}"
                    ;;
                dfs_files_size=*)
                    val=${OPTARG#*=}
                    opt=${OPTARG%=$val}
                    export DFS_FILES_SIZE_SET="${val}"
                    ;;
                dfsioe_files_num=*)
                    val=${OPTARG#*=}
                    opt=${OPTARG%=$val}
                    export DFSIOE_FILES_NUM_SET="${val}"
                    ;;
                dfsioe_files_size=*)
                    val=${OPTARG#*=}
                    opt=${OPTARG%=$val}
                    export DFSIOE_FILES_SIZE_SET="${val}"
                    ;;
                teragen_size=*)
                    val=${OPTARG#*=}
                    opt=${OPTARG%=$val}
                    export TERAGEN_SIZE_SET="${val}"
                    ;;
                teragen_map_tasks=*)
                    val=${OPTARG#*=}
                    opt=${OPTARG%=$val}
                    export TERAGEN_MAP_TASKS_SET="${val}"
                    ;;
                terasort_size=*)
                    val=${OPTARG#*=}
                    opt=${OPTARG%=$val}
                    export TERASORT_SIZE_SET="${val}"
                    ;;
                terasort_reduce_tasks=*)
                    val=${OPTARG#*=}
                    opt=${OPTARG%=$val}
                    export TERASORT_REDUCE_TASKS_SET="${val}"
                    ;;
                sleep=*)
                    val=${OPTARG#*=}
                    opt=${OPTARG%=$val}
                    export SLEEP_TIME="${val}"
                    ;;
                mailing_list=*)
                    val=${OPTARG#*=}
                    opt=${OPTARG%=$val}
                    export MAILING_LIST="${val}"
                    ;;  
                dfs_replication=*)
                    val=${OPTARG#*=}
                    opt=${OPTARG%=$val}
                    export DFS_REPLICATION="${val}"
                    ;;  
                help)
                    echo "$USAGE_MESSAGE"
                    exit 0
                    ;;
                no_restart)
                    export NO_RESTART=1
                    ;;
		iter_vnl=*)
		    val=${OPTARG#*=}
                    opt=${OPTARG%=$val}
		    export ITERATIONS_VNL="${val}"
		    ;;
		iter_r4h=*)
		    val=${OPTARG#*=}
                    opt=${OPTARG%=$val}
		    export ITERATIONS_R4H="${val}"
		    ;;
		comment_subject=*)
		    val=${OPTARG#*=}
                    opt=${OPTARG%=$val}
		    export COMMENT_SUBJECT="${val}"
		    ;;
		comment_body=*)
		    val=${OPTARG#*=}
                    opt=${OPTARG%=$val}
		    export COMMENT_BODY="${val}"
		    ;;
                *)
                    if [ "$OPTERR" = 1 ] && [ "${optspec:0:1}" != ":" ]; then
                        echo "Unknown option --${OPTARG}" >&2
                    fi
                    ;;
            esac;;
        *)
            echo "$USAGE_MESSAGE"
            ;;
    esac
done

# Flow Manager
mkdir $LOG_PATH

# DFSIO Running Phase
if [[ -n "$DFS_FILES_NUM_SET" ]] && [[ -n "$DFS_FILES_SIZE_SET" ]]; then
    if [[ -z "$NO_RESTART" ]]; then
        restartCluster
    fi
    export RAN_DFSIO="1"
    bash -x runTestDFSIO.sh "$DFS_FILES_NUM_SET" "$DFS_FILES_SIZE_SET"&
    waitForPID $!
fi

# TeraGen Running Phase
if [[ -n "$TERAGEN_MAP_TASKS_SET" ]] && [[ -n "$TERAGEN_SIZE_SET" ]]; then
    if [[ -z "$NO_RESTART" ]]; then
        restartCluster
    fi
    export RAN_TERAGEN="1"
    bash -x runTeraGen.sh "$TERAGEN_SIZE_SET" "$TERAGEN_MAP_TASKS_SET"&
    waitForPID $!
fi


# TeraSort Running Phase
if [[ -n "$TERASORT_REDUCE_TASKS_SET" ]] && [[ -n "$TERASORT_SIZE_SET" ]]; then
    if [[ -z "$NO_RESTART" ]]; then
        restartCluster
    fi
    export RAN_TERASORT="1"
    bash -x runTeraSort.sh "$TERASORT_SIZE_SET" "$TERASORT_REDUCE_TASKS_SET"&
    waitForPID $!
fi

# DFSIOE Running Phase
if [[ -n "$DFSIOE_FILES_NUM_SET" ]] && [[ -n "$DFSIOE_FILES_SIZE_SET" ]]; then
    if [[ -z "$NO_RESTART" ]]; then
        restartCluster
    fi
    export RAN_DFSIOE="1"
    bash -x runDFSIOE.sh "$DFSIOE_FILES_NUM_SET" "$DFSIOE_FILES_SIZE_SET"&
    waitForPID $!
fi

# Distribute Report Phase
bash -x distributeReport.sh
