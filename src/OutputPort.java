
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;





public class OutputPort{
	DesktopInfo desktopInfo = new DesktopInfo();
	String targetIP = "192.168.1.116";
	static boolean stop = false;
	Socket connection;
	static final int port = 2100;
	DataOutputStream dataOutputStream;
	byte[] buffer;
	
	OutputPort(int portNumber){
		
        try {
        	System.out.println("Waiting for connection");
			connection = new Socket(targetIP,port+portNumber);
	        System.out.println("Connection Sucessful!!");
	        dataOutputStream = new DataOutputStream(connection.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}  
		
	}
	public void stop(){
		stop = true;
	}

}
