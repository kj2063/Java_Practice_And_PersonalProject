import java.io.File;

public class Ex11_01_File {
	public static void main(String[] args) {
		File f1 = new File("c:\\sun\\abc.txt"); //���� �����Ҷ� ��������("\")�� �ι� ����Ѵ�.
//		File f1 = new File("c:\\sun","abc.txt"); //File("����","����"); �̷��� �ص� �ȴ�.
		
//		File dir = new File("c:\\sun"); //������ġ�� ���� ���� ��ü�� �����
//		File f1 = new File(dir,"abc.txt"); // ������ ���� ���� ��ü�� ���� ��ġ���� �־ �ȴ�.
		
		long len = f1.length(); // ���ʹ� ũ�Ⱑ 2(2byte)�� �����ȴ� (���͸� ġ�� �� ���� ���� ������ �Դٰ�(+1) ���� ������(+1).) //�ѱ��� �ѱ��ڴ� 3byte�� ����.
		System.out.println("len:" + len);
	}
}
