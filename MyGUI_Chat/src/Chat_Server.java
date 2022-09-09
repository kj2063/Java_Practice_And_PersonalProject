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
	static String id="1";
	

	public static void main(String[] args) {

		new SetId_Server();
		
		while(true) {
			if(id.equals("1")) {
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
							
							fc.textArea.append("���� : "+ acceptedM + "\n");
							
						}
					} catch(SocketException e) {
						fc.textArea.append("����� ������ ������ϴ�");
					} catch (Exception e) {
						fc.textArea.append("�����߻�!!");
						fc.textArea.append(e.getMessage());
						e.printStackTrace();
					}
					
					
					
				}//run()
			}//new Thread{}
					);
			
			chatAccepter.setDaemon(true);
			
			ss = new ServerSocket(1000);
			fc.textArea.append("������ ��ٸ��� ��...");	
			cs = ss.accept();
			fc.textArea.append("���� ���� �Ǿ����ϴ�\n");


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
