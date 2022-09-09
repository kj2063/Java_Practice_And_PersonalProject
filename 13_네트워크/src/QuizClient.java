import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class QuizClient {
	public static void main(String[] args) throws IOException {
		Socket cs = null;
		
		try {
			cs = new Socket("localhost",5555);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		PrintWriter pw = new PrintWriter(cs.getOutputStream(),true);//������ �����͸� ������ ���� �ٸ�
		//pw.close(); //close �ϰų� PrintWriter ��ü ������ true�� ���� �־��ָ� pw�� ���� �ʾƵ� �����͸� ���� �� �ִ�.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(cs.getInputStream()));//������ ���� �����͸� �ޱ� ���� �ٸ�
		
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));		
		
		String fromServer, fromClient;
		while((fromServer = br.readLine()) != null) {
			System.out.println("����:" + fromServer); //��� �����մϴ� y/n
			if(fromServer.equals("quit"))
				break;
			fromClient = keyboard.readLine(); // y/n
			pw.println(fromClient);
		}
	}
}
