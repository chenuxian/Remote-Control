# Remote-Control-Via-Java-Socket
This is a program that client can remote control server via java socket.

# Developer
This is our team's final project of the course in June 2015, here is the developers list:
馮禹德, 陳與賢, 石碩亨, 徐銘宏, 王強毅
I contributed to the part of sending screenshot.


## How to run?
First, you need 2 computers, one run as the server, and the other run as the client.
Go into the src folder,and then

**Server**:
<code>
    javac ServerLoginFrame.java
    java ServerLoginFrame
</code>

You will see 
![server's screenshot](/img/server.png)
STEP1: Input the password
STEP2: Click the button
STEP3: Wait client 

***

**Client**:
<code>
    javac LoginFrame.java
    java LoginFrame
</code>

You will see
![client's screenshot](/img/client.png)
STEP1: Input the server's IP and password
STEP2: Click the button
STEP3: Now you can control the server's computer

## Requirement
Suggested JDK, JRE version
![client's screenshot](/img/version.png)
