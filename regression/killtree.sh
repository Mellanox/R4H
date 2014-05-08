#!/bin/bash

killtree() {
    local _pid=$1
    kill -stop ${_pid} # needed to stop quickly forking parent from producing child between child killing and parent killing
    for _child in $(ps -o pid --no-headers --ppid ${_pid}); do
        killtree ${_child}
    done
    kill -9 ${_pid}
}

killtree $1