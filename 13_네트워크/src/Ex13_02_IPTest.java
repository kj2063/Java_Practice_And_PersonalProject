import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class Ex13_02_IPTest {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�� ����Ʈ �ּҸ� �Է��ϼ���:");
		try {
			String url = br.readLine(); //www.daum.net
			
			//InetAddress.getAllByName() : ������ ���Ӱ� ���εǾ� �ִ� IP�ּҸ� �˷��ִ� �޼���
			InetAddress[] address = InetAddress.getAllByName(url);//131.232.32.22 �̷� IP�ּҸ� �迭�� ���� //�ּҰ� 1���� �迭1��, �ּҰ� 2���� �迭2�� ����
			//UnknownHostException : ���� ������Ʈ �ּ��Է½� �߻� (IOException�� �ڽĿ���)
			
			for(int i=0; i<address.length; i++) {
				System.out.println(address[i]);
			}
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
