#!/usr/bin/python

import sys, os

class TestResult:
    def __init__(self, program, tasks, fileSize, times, failedAttempts):
        self.program = program
        self.tasks = tasks
        self.fileSize = fileSize
        self.times = times
        self.failedAttempts = failedAttempts
        self.avgTime = sum(times)/len(times)
        self.minTime = min(times)
        self.maxTime = max(times)
    
    def __str__(self):
        return self.program+','+str(self.tasks)+','+str(self.fileSize)+','+str(self.minTime)+','+str(self.maxTime)+','+str(self.avgTime)+','+str(self.failedAttempts)
        

if len(sys.argv) < 3:
    print "Two arguments required: <input> <output>"
    exit(1)

inputFile = sys.argv[1]
outputFile = sys.argv[2]
if os.path.isfile(outputFile):
    os.remove(outputFile)
inputStream = open(inputFile,'r')
outputStream = open(outputFile,'a')

outputStream.write('program,tasks,fileSize,min time,max time,avg time,failed attempts\n')

text = inputStream.readlines()

row = 0
tests = []
while row < len(text):
    splitLine = text[row].split(' ')
    if splitLine[0] == "Running":
        program = splitLine[3]
        tasks = splitLine[8]
        fileSize = splitLine[6]
        row = row + 1
        splitLine = text[row].split(' ')
        times = map(float,splitLine[2:-1])
        row = row + 1
        splitLine = text[row].split(' ')
        failedAttempts = splitLine[1]
        current = TestResult(program, tasks, fileSize, times, failedAttempts)
        tests.append(current)
        outputStream.write(str(current))
    row = row+1

inputStream.close()
outputStream.close()
