# Remote-Control-Via-Java-Socket
Client can remote control server via java socket.

# Introduction
This is my team's final project of the "java programming" course in June 2015, here is the developers list:   
馮禹德, 陳與賢, 石碩亨, 徐銘宏, 王強毅   
I contributed to the part of sending screenshot.

# Requirement
Suggested JDK, JRE version
![client's screenshot](/img/version.png)

# How to run?
First, you need 2 computers, one run as the server, and the other run as the client.   
Type these command on your terminal, or you can just directly run these program on IDE, like eclipse.   

**Server**:   
<code>cd src</code>   
<code>javac ServerLoginFrame.java</code>   
<code>java ServerLoginFrame</code>   


You will see 
![server's screenshot](/img/server.png)
STEP1: Input the password   
STEP2: Click the button   
STEP3: Wait client   

***

**Client**:   
<code>cd src</code>   
<code>javac LoginFrame.java</code>   
<code>java LoginFrame</code>


You will see
![client's screenshot](/img/client.png)
STEP1: Input the server's IP and password   
STEP2: Click the button   
STEP3: Now you can control the server's computer   
