import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class InputPort extends ServerSocket{
	static final int port = 2100;
	static final int defaultbufferSize = 1024;
	static boolean stop = false;
	Socket connection;
	DataInputStream dataInputStream;
	
	byte[] buffer = new byte[defaultbufferSize];
	byte[] bufferHeader = new byte[4]; 
	
	
	InputPort(int portNumber) throws IOException{
		super(port + portNumber);
		System.out.println("Waiting for connection");
		connection = super.accept();
		System.out.println("Connection Sucessful!");
		dataInputStream = new DataInputStream(connection.getInputStream());
	}
	
	public void stop(){
		stop = true;
	}

}
