#!/bin/bash

MAX_ATTEMPTS=6

stopService()
{
    local service=${1}
    echo "Stopping ${service}"
    curl -s -u admin:admin -i -H 'X-Requested-By: ambari' -X PUT -d \
    '{"RequestInfo": {"context" :"Stop service via REST"}, "Body": {"ServiceInfo": {"state": "INSTALLED"}}}' \
    http://${AMBARI_HOST}:8080/api/v1/clusters/HDP/services/${service} > /dev/null
    
    echo "Waiting for ${service} service to stop..."
    ATTEMPTS=${MAX_ATTEMPTS}
    STATE=""
    while ((${ATTEMPTS} > 0));
    do
        sleep 30
        ATTEMPTS=$((ATTEMPTS-1))
        STATE=$(curl -s -u admin:admin http://${AMBARI_HOST}:8080/api/v1/clusters/HDP/services/${service} | grep '"state"' | awk '{ split($0,a," : "); print a[2]; }' | tr '"' '\0')
        if [[ "$STATE" == "INSTALLED" ]]; then
            echo "Stopped service ${service}"
            break
        fi
    done
    
    if ((${ATTEMPTS} <= 0)) && [[ "$STATE" != "INSTALLED" ]]; then
        echo "Failed to stop service ${service}. Exiting with status 1"
        exit 1
    fi
}

startService()
{
    local service=${1}
    echo "Stopping ${service}"
    curl -s -u admin:admin -i -H 'X-Requested-By: ambari' -X PUT -d \
    '{"RequestInfo": {"context" :"Start service via REST"}, "Body": {"ServiceInfo": {"state": "STARTED"}}}' \
    http://${AMBARI_HOST}:8080/api/v1/clusters/HDP/services/${service} > /dev/null
    
    echo "Waiting for ${service} service to start..."
    ATTEMPTS=${MAX_ATTEMPTS}
    STATE=""
    while ((${ATTEMPTS} > 0));
    do
        sleep 30
        ATTEMPTS=$((ATTEMPTS-1))
        STATE=$(curl -s -u admin:admin http://${AMBARI_HOST}:8080/api/v1/clusters/HDP/services/${service} | grep '"state"' | awk '{ split($0,a," : "); print a[2]; }' | tr '"' '\0')
        if [[ "$STATE" == "STARTED" ]]; then
            echo "Starting service ${service}"
            break
        fi
    done
    
    if ((${ATTEMPTS} <= 0)) && [[ "$STATE" != "STARTED" ]]; then
        echo "Failed to start service ${service}. Exiting with status 1"
        exit 1
    fi
}

action=${1}
if [[ "${action}" == "stop" ]]; then
    stopService "YARN"
    stopService "HDFS"
else
    startService "HDFS"
    startService "YARN"
fi