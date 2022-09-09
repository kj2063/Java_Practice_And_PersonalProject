import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex13_03_Server {
	public static void main(String[] args) throws IOException {
		
		ServerSocket ss = null;
		Socket cs = null;//Ŭ���̾�Ʈ �ʿ� �ٴ� ����
		
		try {
			ss = new ServerSocket(5555); // 5555�� ��Ʈ�� ����Ͽ� Client�� ����ϰڴ�. //������� �ʴ� ��Ʈ �Է�
		} catch (IOException e) {
			System.out.println("5555�� ��Ʈ��ȣ�� �̹� ������Դϴ�.");
			System.exit(1);//���������� �����Ҷ��� 0 �� ������ ������ ���� �� ���� �ٸ���ȣ�� ����.
		} 

		System.out.println("Server ready...");

		cs = ss.accept(); // 5555�� ��Ʈ�� ������ ���� Client�� ������ �޾Ƶ帰��. ������ ���� Client�� cs�� ����.
		System.out.println("Ŭ���̾�Ʈ�� �����ؿ�");

		BufferedReader br = new BufferedReader(new InputStreamReader(cs.getInputStream()));
		
		String readLine = br.readLine();
		System.out.println("Ŭ���̾�Ʈ�� ������ ����:" + readLine);
		readLine = br.readLine();
		
		br.close();
		cs.close();
		ss.close();
	}
}
