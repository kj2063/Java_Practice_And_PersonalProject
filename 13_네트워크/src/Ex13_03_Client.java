import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Ex13_03_Client {
	public static void main(String[] args) throws IOException {
		
		Socket cs = null;
		PrintWriter pw = null;
		try {
			cs = new Socket("127.0.0.1",5555);//"127.0.0.1"(�� ��ǻ���� IP�ּҸ� ��Ÿ��) or "localhost" or "172.30.1.30"(���� ã�Ƴ��� �˾Ƴ� IP�ּ�) or "0"
			//5555�� ��Ʈ�� ���� �� ��ǻ��(Server IP)�� ���� �õ�. 
			OutputStream os = cs.getOutputStream();
			pw = new PrintWriter(os); //PrintWriter : ����ϱ� ���� stream , byte����� ���� ������� �ٲ� �� �ִ� Ŭ���� // ������ �ѱ��� ���� �� �ְ� ������ش�.
			//client�� Server�� ������ �ϰ� pw��� �ٸ��� ������.
			
			System.out.println("Ŭ���̾�Ʈ ������");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�Է�:");
		String line = br.readLine();
		System.out.println("Ŭ���̾�Ʈ �Է�:" + line);
		pw.println(line);//�Է��� line�� pw�� ���� ����.
		
		pw.close();//�̰� �ݾ���� ������ Buffer�� �ִ� �����͸� �� �������� ������.
		br.close();
		cs.close();
	}
}
