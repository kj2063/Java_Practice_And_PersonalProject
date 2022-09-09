import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Training_13_01_Server {
	public static void main(String[] args) throws IOException {
		/*		
		for(int i=0; i<65535; i++) {
			try {
				ServerSocket ss = new ServerSocket(i);
				ss.close();
			} catch (IOException e) {
				System.out.println(i + "��° �����");
			}
		}
		*/
		
		
		ServerSocket ss = new ServerSocket(5555);
		System.out.println("������ ��ٸ�����...");
		Socket cs = ss.accept();
		System.out.println("������ �߰�!!!");
		
		PrintWriter pw = new PrintWriter(cs.getOutputStream(),true);//����->Ŭ���̾�Ʈ ������.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(cs.getInputStream())); // ����<-Ŭ���̾�Ʈ ������.
		
		String line, reply;
		
		pw.println("���� �Ծ����?(y/n):");
		line = br.readLine();
		if(line.equalsIgnoreCase("y")) {
			pw.println("������ �Ծ�����?:");
			reply = br.readLine();
			pw.println(reply + "�� �Ծ�����!");
		}
		else if(line.equalsIgnoreCase("n")) {
			pw.println("�� ���� �弼��.");
		}
				
		
		
		pw.close();
		br.close();
		cs.close();
		ss.close();
		
		
		
		
		

	}
}
