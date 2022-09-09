import java.io.IOException;
import java.net.ServerSocket;

public class Ex13_01_Port {
	/*
	Network: �ٸ���ġ�� data�� �̵���ų �� �ִ� computer��� �ֺ� ��ġ���� ����.(ex. ��ǻ��,������,��ĳ�� ��...)
	Node: Network�� ����� ��� ��ġ��.
	
	md�� ipconfig��� ħ => �� ��ǻ���� �ּ� �� �� �ִ�.
	
	*Server: �����͸� ��������
	*Client: �����͸� �޴���
	ServerSocket :Server�� Client ���̿� ������ �ְ� ������ ���ʿ� ��ġ�� �޾ƾ� �ϴµ� �����ʿ� �ٴ°�.
	Port :��� ��Ʈ��ȣ�� �����͸� �ְ� �����ų�?
	*/
	public static void main(String[] args) {
		
		
		ServerSocket ss = null;
		
		for(int i=0; i<65536; i++) { //����� �� �ִ� ��Ʈ ��ȣ 0~65536 //��ȣ 0~1023�� System�� ���� ����� ��ȣ�̹Ƿ� ������� �ʴ°��� ����.
			try {
				ss = new ServerSocket(i);
				ss.close();//��Ʈ��ũ�� ���� ���̻� ������ ��ȯ ���� �ʰڴ�. ������ġ ����. �Ƚ����� ������ �Ȼ��� �� �� ������, ������ ��� �Ѵ�.
			} catch (IOException e) {
				//e.printStackTrace();
				System.out.println(i + "�� ��Ʈ�� �̹� ������Դϴ�.");
			
			}
		}
	}
}
