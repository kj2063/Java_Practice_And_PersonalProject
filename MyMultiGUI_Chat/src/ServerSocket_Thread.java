import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Vector;

public class ServerSocket_Thread {
	BufferedReader br;
	BufferedWriter bw;
	String msg;
	
	Vector<Socket> clients = new Vector<Socket>();
	Socket cs;
	
	ServerSocket_Thread(Socket cs) {
		try {
			this.cs = cs;
			br = new BufferedReader(new InputStreamReader(cs.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(cs.getOutputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		clients.add(cs);
	}
	
	public void run() {
		try {
			while(br != null) {
				try {
					msg = br.readLine();
					sendMsg(msg, cs);
				} catch(NullPointerException e) {
					Thread.sleep(200);
					continue;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
	}//run();
	
	public void sendMsg(String msg, Socket cs) {
		int selected_index = clients.indexOf(cs);
		if() {
			
		}
		
	}
}
