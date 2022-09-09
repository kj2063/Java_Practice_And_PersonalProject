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
	
	public static class ChatAccepter extends Thread{
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
				}//while
			} catch(SocketException e) {
				fc.textArea.append("����� ������ ������ϴ�");
			} catch (Exception e) {
				fc.textArea.append("�����߻�!!");
				fc.textArea.append(e.getMessage());
				e.printStackTrace();
			}



		}//run()
		
	}//ChatAccepter class
	
	
	
	

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
		
		
		//���� �޼����� �޴°��� ������� ó��
		fc = new FigureChat_Client();
		try {
		

			ChatAccepter chatAccepter = new ChatAccepter();

			chatAccepter.setDaemon(true);

			try {
				cs = new Socket(ip, 1000);
				fc.textArea.append("������ ���� �Ǿ����ϴ�\n");
			} catch (Exception e) {
				fc.textArea.append("���� ���� �Ͽ����ϴ�");
			}
			
		
			pw = new PrintWriter(cs.getOutputStream(),true);
			keyboard = new BufferedReader(new InputStreamReader(System.in));
			br = new BufferedReader(new InputStreamReader(cs.getInputStream()));

			chatAccepter.start();
		}//try
		catch (IOException e) {
			System.out.println("IOException �����߻�");
			fc.textArea.append(e.getMessage());
			e.printStackTrace();
		}//catch

	}//main
}//end Class
