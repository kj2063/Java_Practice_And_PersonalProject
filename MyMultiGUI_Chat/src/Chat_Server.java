import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Vector;


public class Chat_Server {
	static ServerSocket ss;
	static Socket cs;
	static BufferedReader br;
	static PrintWriter pw;
	static BufferedReader keyboard;
	static FigureChat_Server fc;
	static String id="default";
	
	static Vector<Socket> socket_arr = new Vector<Socket>();
	
	
	
	public static class ChatAccepter extends Thread {
		
		public void run() {
			String acceptedM;
			
			try {
				while(true) {
					try {
					acceptedM = br.readLine();
					}catch(NullPointerException e) {
						Thread.sleep(200);
						continue;
					}
					
					String[] str = acceptedM.split("#");
					fc.textArea.append(str[0] + " : " + str[1] + "\n");
				}
			} catch(SocketException e) {
				fc.textArea.append("상대방과 접속이 끊겼습니다");
			} catch (Exception e) {
				fc.textArea.append("에러발생!!");
				fc.textArea.append(e.getMessage());
				e.printStackTrace();
			}
		
		}//run()
		
	}//ChatAccepter class
	
	
	
	
	public static void main(String[] args) {

		new SetId_Server();
		
		while(true) {
			if(id.equals("default")) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				continue;
			}
			else	
				break;
		}		
		
		fc = new FigureChat_Server();
		try {
			ChatAccepter chatAccepter = new ChatAccepter();
			
			chatAccepter.setDaemon(true);
			
			ss = new ServerSocket(1000);
			while(true) {
				cs = ss.accept();
				fc.textArea.append("상대와 연결 되었습니다\n");


				pw = new PrintWriter(cs.getOutputStream(),true);
				keyboard = new BufferedReader(new InputStreamReader(System.in));
				br = new BufferedReader(new InputStreamReader(cs.getInputStream()));

				chatAccepter.start();
			}
			
		}//try
		catch (IOException e) {
			System.out.println("IOException 에러발생");
			fc.textArea.append(e.getMessage());
			e.printStackTrace();
		}//catch

	}//main
}//end Class
