#!/bin/bash

export UFA_CLASS_PATH=build/ufa.jar:hadoop/build/hadoop-core-1.2.1-SNAPSHOT.jar:hadoop/lib/log4j-1.2.15.jar:hadoop/lib/commons-logging-1.1.1.jar:jxio/bin/jxio.jar:test/

export LOG4J_PROPERTIES_FILES=log4j.properties.ufa

pname="test"
if  [[ $@ = *-c* ]] && [[ $@ != *-s* ]]; then
	pname="client"
fi 
if  [[ $@ != *-c* ]] && [[ $@ = *-s* ]]; then
	pname="server"
fi 


java -Dlogfile=${pname}-`date  +%d.%m.%y_%H-%M`_PID$$.log -Dlog4j.configuration=$LOG4J_PROPERTIES_FILES -cp $UFA_CLASS_PATH $@
