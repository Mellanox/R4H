#!/bin/bash

# COLORS ARE GOOD FOR YOU

export NONE='\033[00m'
export RED='\033[01;31m'
export GREEN='\033[01;32m'
export YELLOW='\033[01;33m'
export PURPLE='\033[01;35m'
export CYAN='\033[01;36m'
export WHITE='\033[01;37m'
export BOLD='\033[1m'
export UNDERLINE='\033[4m'


prefix="$(basename $0)"

which ant &> /dev/null

if (($? != 0)); then
	echo -e "$prefix: ${RED}ERROR Please add ant to one of your PATH directories and try again.${NONE}"
	exit 1
fi

echo -e "$prefix: ${UNDERLINE}Cleaning old JAR...${NONE}"
echo "$prefix: ant clean"
ant clean &> /dev/null

echo -e "$prefix: ${UNDERLINE}Preparing JXIO submodule...${NONE}"
echo "$prefix: git submodule update --init"
git submodule update --init 

echo -e "$prefix: ${UNDERLINE}Building JXIO...${NONE}"
echo "$prefix: cd jxio"
cd jxio
echo "$prefix: bash build.sh"
bash build.sh

if (($? != 0)); then
	echo -e "$prefix: ${RED}ERROR Building JXIO - Exiting${NONE}"
	exit 1
fi

echo -e "$prefix: ${UNDERLINE}Building HDFS JAR...${NONE}"
echo "$prefix: cd .."
cd ..
echo "$prefix: ant"
ant

if (($? != 0)); then
        echo -e "$prefix: ${RED}ERROR Building HDFS JAR - Exiting${NONE}"
        exit 1
fi

echo -e "$prefix: ${GREEN}DONE${NONE}"
echo "$prefix: JXIO JAR available at: `pwd`/jxio/bin/jxio.jar"
echo "$prefix: HDFS JAR available at: `pwd`/build/r4h.jar"

