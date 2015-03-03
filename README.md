# R4H
RDMA for HDFS (R4H) is a plugin for Hadoop Distributed FileSystem (HDFS) which accelerates HDFS by using RDMA (Remote Direct Memory Access) technology.  
R4H enables HDFS write operations over RDMA and is tested using Mellanox ConnectX® interconnect for Ethernet and InfiniBand fabrics.  


### Architecture Highlights
The R4H plugin works side-by-side with other HDFS communication layers, and does not replace or intervene with the TCP activity and other HDFS core tasks.
 
You can choose to use:
* The existing HDFS over TCP
* The faster R4H with RDMA, to get faster writes with higher bandwidth and lower CPU utilization
 
Upon startup, every DataNode loads R4H plugin in addition to standard HDFS code.  
If the client application uses the standard HDFS jar, the R4H plugin does not process any data transfer. The client DFS will use the standard TCP connection to that respectful DataNode according to the Namenode's pipeline.  
When the client application uses the R4H plugin jar, the connection is initiated over RDMA using JXIO framework to the DataNode. With R4H the client utilizes RDMA connectivity for all write operations. All other client communication uses the TCP/IP connectivity. Similarly, the server R4H plugin process all incoming write operations from the clients. All other communications between the server and Namenode are handled by the TCP stack.  

R4H provides significant CPU utilization by using Mellanox ConnectX® interconnect for Ethernet and InfiniBand fabrics to transfer the data over RDMA (Remote Direct Memory Access) technology with kernel bypass and zero-copy.  
 
