import sys
import os
from cm_api.api_client import ApiResource

def checkCmdStatus(cmd):
  if not cmd.success:
    print str(cmd) + " failed. Exiting!"
    exit(1)
  else:
    print str(cmd) + " successfully executed."

cm_host = str(os.getenv('CM_HOST',None))

if cm_host == None:
  print "Environment variable CM_HOST not found. Please export it."
  exit(1)

api = ApiResource(cm_host, 7180, username="admin", password="admin", version=5)

if len(sys.argv) > 1:
  request = sys.argv[1].lower()
else:
  request = None

for c in api.get_all_clusters():
  if c.version == "CDH5":
    cdh5 = c

if cdh5 == None:
  print "Could not find cluster. Exiting!"
  exit(1)

hdfs = None
yarn = None

for s in cdh5.get_all_services():
  if s.type == "HDFS":
    print "Found HDFS service"
    hdfs = s
  if s.type == "YARN":
    print "Found YARN service"
    yarn = s

if hdfs == None:
  print "Could not find HDFS service. Exiting!"
  exit(1)
elif yarn == None:
  print "Could not find YARN service. Exiting!"
  exit(1)

if request == "stop":
  if yarn.serviceState == "STOPPED":
    print "YARN already stopped."
  else:
    print "Stopping YARN..."
    cmd = yarn.stop().wait()
    checkCmdStatus(cmd)
  if hdfs.serviceState == "STOPPED":
    print "HDFS already stopped."
  else:
    print "Stopping HDFS..."
    cmd = hdfs.stop().wait()
    checkCmdStatus(cmd)
  print "HDFS and YARN stopped successfully!"
elif request == "start":
  if hdfs.serviceState == "STARTED":
    print "HDFS already started."
  else:
    print "Starting HDFS..."
    cmd = hdfs.start().wait()
    checkCmdStatus(cmd)
  if yarn.serviceState == "STARTED":
    print "YARN already started."
  else:
    print "Starting YARN..."
    cmd = yarn.start().wait()
    checkCmdStatus(cmd)
  print "HDFS and YARN started successfully!"
elif request == "format":
  namenode = None
  secNamenode = None
  roles = hdfs.get_all_roles()
  for r in roles:
    if r.type.lower() == u'namenode':
      namenode = r
      print "Found a namenode: " + str(namenode.name)
  if namenode == None:
    print "Could not find namenode, skipping format operation"
  else:
    cmd = hdfs.format_hdfs(namenode.name)[0].wait()
    if not cmd.success:
      print "Formatting HDFS NN failed, will continue without format. Command: " + str(cmd) + ")"
    else:
      print "Successfully formatted NN (command: " + str(cmd) + ")"
