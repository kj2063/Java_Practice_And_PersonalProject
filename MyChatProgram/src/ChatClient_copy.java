import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

public class ChatClient_copy {
	static BufferedReader br;
	static Socket cs;
	
	public static void main(String[] args) throws IOException {
		Thread chatAccepter = new Thread(new Runnable() {
			
			@Override
			public void run() {
				String acceptedM;
				
				try {
					while(true) {
						acceptedM = ChatClient_copy.br.readLine();
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
		
		
//		ChatAcceptDemon_Client chatAccepter = new ChatAcceptDemon_Client();
		chatAccepter.setDaemon(true);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Ϸ��� IP�� �Է����ּ��� : ");
		String ipnum = sc.next();
		sc.close();
		
		try{
//			cs = new Socket("localhost",1000);
			cs = new Socket(ipnum,1000);
		}catch(Exception e) {
			System.out.println("�ش� IP�� ������� �Ͽ����ϴ�");
			System.exit(0);
		}
		
		System.out.println("������ ���� �Ǿ����ϴ�");
		
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
					pw.close();
//					br.close();
					keyboard.close();
					System.out.println("ä�� ���α׷��� �����մϴ�");
					System.exit(0);
				}
			}
			
		}
		
		
		
	}
}
