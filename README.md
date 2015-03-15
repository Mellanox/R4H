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
 
### HDFS Write Data Flow 
Application writes data bytes to a DFS output stream of a pre-created file using an HDFS client. The DFS output stream splits the data to packets and streams it to a replication pipeline of datanodes picked by the namenode per new block. The first DN on pipeline of the current block receives the packets from the client, forwards it to the next DN and stores the data locally.

 | Client Write Flow | RDMA | TCP
--- | --- | --- | --- 
1.|	Application creates a file using DistributedFileSystem and provided with a DFSOutputStream for this file | | 
2.|	Application writes data bytes on the DFSOutputStream which calculates checksum, copies and stores the data to internal packet buffer | writes to preregistered direct buffer | writes to byte array
3.|	Each packet is queued to the DataStreamer which creates a connection to the first datanode on the pipeline for the current block that was picked by the namenode and sends the packets | qeues an asynchroniuse work elelment to the HW to transfer the direct buffer with zero-copy and kernel bypass | sends the pakcet's byte array on a socket stream with a buffer copy through the kernel TCP stack
4.| DataStreamers receives acks for sent packets, verifies reply message and enforce sequence order | Single context on DataStreamer for sending packets and receiving acks | seperated ResponseProccessor thread for receiving the acks
4.| Once a block size is exceeded, the DataStreamer sends request to the namenode for new block and creates a connection to the first node on the new pipeline.


