import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class QuizServer {
	public static void main(String[] args) throws IOException {
		
		ServerSocket ss = null;
		Socket cs = null;
		
		ss = new ServerSocket(5555);
		System.out.println("Server ready...");
		cs = ss.accept();
		System.out.println("Ŭ���̾�Ʈ�� ������ ��");
		
		PrintWriter pw = new PrintWriter(cs.getOutputStream(),true);//������ �õ��� Ŭ���̾�Ʈ�� �����͸� ������ ���� �ٸ�
//		pw.close(); //close �ϰų� PrintWriter ��ü ������ true�� ���� �־��ָ� pw�� ���� �ʾƵ� �����͸� ���� �� �ִ�.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(cs.getInputStream()));//Ŭ���̾�Ʈ�� �����͸� �ޱ� ���� �ٸ�
		
		QuizBank bank = new QuizBank();
		String output;
		output = bank.process(null);
		pw.println(output);// Ŭ���̾�Ʈ��  "��� �����մϴ� (y/n):" ����
		
		String fromClient;
		while((fromClient = br.readLine()) != null) {
			output = bank.process(fromClient);
			pw.println(output); //
			if(output.equals("quit"))
				break;
		}//while
	
		pw.close();
		br.close();
		ss.close();
		cs.close();
	}
	
}	
