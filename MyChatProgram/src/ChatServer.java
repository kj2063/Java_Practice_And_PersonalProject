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
							System.out.println("����� ������ ������ϴ�");
//							break;
							System.exit(0);
						}	
						else {
							System.out.println("���� : "+ acceptedM);
						}
					}
				} catch (Exception e) {
					System.out.println("�����߻�!!");
					System.out.println(e.getMessage());
				}
				
				
				
			}
		}
		);
		
		
//		ChatAcceptDemon_Server chatAccepter = new ChatAcceptDemon_Server();
		chatAccepter.setDaemon(true);
		
		ServerSocket ss = new ServerSocket(1000);
		System.out.println("ä�� ���α׷� ������ ��ٸ��� ��...");
		Socket cs = ss.accept();
		
		System.out.println("�����ڿ� ���� �Ǿ����ϴ�");
		
		PrintWriter pw = new PrintWriter(cs.getOutputStream(),true);//����->Ŭ���̾�Ʈ ������
		
		br = new BufferedReader(new InputStreamReader(cs.getInputStream()));//����<-Ŭ���̾�Ʈ ������
		
//		BufferedWriter keyboard = new BufferedWriter(new OutputStreamWriter(System.in));
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));// �����ʿ��� �ۼ��Ұ�(Ŭ���̾�Ʈ�� �������� �ۼ�)
		
		
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
					System.out.println("ä�� ���α׷��� �����մϴ�");
					System.exit(0);
				}//if
			
			}//while
		}//while(true)
				
	}
}
