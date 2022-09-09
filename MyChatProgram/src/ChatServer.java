import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
	static BufferedReader br;
	static String checkD;
	
	public static void main(String[] args) throws IOException {
		Thread chatAccepter = new Thread(new Runnable() {
			
			@Override
			public void run() {
				String acceptedM;
				
				try {
					while(true) {
						acceptedM = ChatServer.br.readLine();
						if(acceptedM == null) {
							Thread.sleep(200);
							continue;
						}
						else if(acceptedM.equalsIgnoreCase("quit")){
							System.out.println("상대방과 연결이 끊겼습니다");
//							break;
							System.exit(0);
						}	
						else {
							System.out.println("상대방 : "+ acceptedM);
						}
					}
				} catch (Exception e) {
					System.out.println("에러발생!!");
					System.out.println(e.getMessage());
				}
				
				
				
			}
		}
		);
		
		
//		ChatAcceptDemon_Server chatAccepter = new ChatAcceptDemon_Server();
		chatAccepter.setDaemon(true);
		
		ServerSocket ss = new ServerSocket(1000);
		System.out.println("채팅 프로그램 접속자 기다리는 중...");
		Socket cs = ss.accept();
		
		System.out.println("접속자와 연결 되었습니다");
		
		PrintWriter pw = new PrintWriter(cs.getOutputStream(),true);//서버->클라이언트 보낼것
		
		br = new BufferedReader(new InputStreamReader(cs.getInputStream()));//서버<-클라이언트 받을것
		
//		BufferedWriter keyboard = new BufferedWriter(new OutputStreamWriter(System.in));
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));// 서버쪽에서 작성할것(클라이언트에 보낼것을 작성)
		
		
		chatAccepter.start();
		
		String sendM, check = null;
		
		while(true) {
			while((sendM = keyboard.readLine()) != null) {
				check = sendM;
				pw.println(sendM);
				if(check.equalsIgnoreCase("quit")) {
					cs.close();
					ss.close();
					pw.close();
//					br.close();
					keyboard.close();
					System.out.println("채팅 프로그램을 종료합니다");
					System.exit(0);
				}//if
			
			}//while
		}//while(true)
				
	}
}
