import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;


public class Chat_Client {
	static ServerSocket ss;
	static Socket cs;
	static BufferedReader br;
	static PrintWriter pw;
	static BufferedReader keyboard;
	static FigureChat_Client fc;
	static String ip="1", id;

	public static void main(String[] args) {

		new SetIpid_Client();
		
		while(true) {
			if(ip.equals("1")) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				continue;
			}
			else {
				break;
			}
		}
		
		
		//상대방 메세지를 받는것을 스레드로 처리
		fc = new FigureChat_Client();

		try {

			Thread chatAccepter = new Thread(new Runnable() {

				@Override
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
							
							fc.textArea.append("상대방 : "+ acceptedM + "\n");
						}//while
					} catch(SocketException e) {
						fc.textArea.append("상대방과 접속이 끊겼습니다");
					} catch (Exception e) {
						fc.textArea.append("에러발생!!");
						fc.textArea.append(e.getMessage());
						e.printStackTrace();
					}



				}//run()
			}//new Thread{}
					);
			
			chatAccepter.setDaemon(true);
			
			try {
				cs = new Socket(ip, 1000);
				fc.textArea.append("서버와 연결 되었습니다\n");
			} catch (Exception e) {
				fc.textArea.append("접속 실패 하였습니다");
			}
			
			
			pw = new PrintWriter(cs.getOutputStream(),true);
			keyboard = new BufferedReader(new InputStreamReader(System.in));
			br = new BufferedReader(new InputStreamReader(cs.getInputStream()));
			
			chatAccepter.start();
		}//try
		catch (IOException e) {
			System.out.println("IOException 에러발생");
			fc.textArea.append(e.getMessage());
			e.printStackTrace();
		}//catch

	}//main
}//end Class
