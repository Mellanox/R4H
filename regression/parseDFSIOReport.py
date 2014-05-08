#!/usr/bin/python

import sys, os

class TestResult:
    def __init__(self, program, numOfFiles, fileSize, times, tp, failedAttempts, cpuTime):
        self.program = program
        self.numOfFiles = numOfFiles
        self.fileSize = fileSize
        self.times = times
        self.tp = tp
        self.failedAttempts = failedAttempts
        self.avgTime = sum(times)/len(times)
        self.minTime = min(times)
        self.maxTime = max(times)
        self.avgTP = sum(tp)/len(tp)
        self.minTP = min(tp)
        self.maxTP = max(tp)
        self.cpuTime = cpuTime
    
    def __str__(self):
        return self.program+','+str(self.numOfFiles)+'_files,'+str(self.fileSize)+','+str(self.minTime)+','+str(self.maxTime)+','+str(self.avgTime)+','+str(self.minTP)+','+str(self.maxTP)+','+str(self.avgTP)+','+str(self.failedAttempts)+','+str(self.cpuTime)
        

if len(sys.argv) < 3:
    print "Two arguments required: <input> <output>"
    exit(1)

inputFile = sys.argv[1]
outputFile = sys.argv[2]
if os.path.isfile(outputFile):
    os.remove(outputFile)
inputStream = open(inputFile,'r')
outputStream = open(outputFile,'a')

outputStream.write('program,numOfFiles,fileSize,min time,max time,avg time,min TP,max TP,avg TP,failed attempts,avg cpu\n')

text = inputStream.readlines()

row = 0
tests = []
while row < len(text):
    splitLine = text[row].split(' ')
    if splitLine[0] == "Running":
        program = splitLine[1]
        numOfFiles = splitLine[3]
        fileSize = splitLine[7]
        row = row + 1
        splitLine = text[row].split(' ')
        times = map(float,splitLine[1:-2])
        row = row + 1
        splitLine = text[row].split(' ')
        tp = map(float,splitLine[1:-2])
        row = row + 1
        splitLine = text[row].split(' ')
        failedAttempts = splitLine[1].strip()
        row = row + 1
        splitLine = text[row].split(' ')
        cpuTime = splitLine[1].strip()
        row = row + 1
        if len(tp) == 0 or len(times) == 0:
            row = row + 1
            continue
        current = TestResult(program, numOfFiles, fileSize, times, tp, failedAttempts, cpuTime)
        tests.append(current)
        outputStream.write(str(current)+'\n')
    row = row+1

'''
outputStream.write('\n')
outputStream.write('Test,TP improvement %,Time improvement %\n')

for test in tests:
    if test.program == "UFA":
        for otherTest in tests:
            if otherTest.program == "VANILLA" and test.numOfFiles == otherTest.numOfFiles and test.fileSize == otherTest.fileSize:
                tpImp = (test.avgTP - otherTest.avgTP)/otherTest.avgTP * 100
                timeImp = (test.avgTime - otherTest.avgTime)/otherTest.avgTime * 100
                outputStream.write(str(test.numOfFiles)+'_files_'+test.fileSize+','+str(tpImp)+','+str(timeImp)+'\n')
'''

inputStream.close()
outputStream.close()
