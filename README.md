This is example of kafka Demo

set CLASSPATH=C:\Users\10822200\MyWorkSpace\software\kafka\libs\*

cd C:\Users\10822200\MyWorkSpace\software\kafka\bin\windows
below command is used for start the zookeeper server and kafka bootserver.
.\zookeeper-server-start.bat ..\..\config\zookeeper.properties

.\kafka-server-start.bat ..\..\config\server.properties