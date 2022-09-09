import java.io.File;
import java.io.IOException;

public class Ex11_03_File {
	public static void main(String[] args) {
		
		File f1 = new File("c:\\workspace\\11_ȭ�������\\A");
//		File f1 = new File("A"); // Ex11_03_File.java ������ �ִ°��� ������(bin,src ���� �ִ°�)�� A����
		
		File f2 = new File("B"); // B����
		File f3 = new File("C"); // C����
		File f4 = new File(f1,"aa.txt"); // 'A'������ aa.txt������ ����� �; File ��ü ����
		
		System.out.println(f1.exists()); //exists() �޼���: ������ �ִ��� ������ Ȯ���ϴ� �޼���
		System.out.println(f2.exists());

		if(f1.exists()) {
			f1.renameTo(f2); //f1���� �����ϴ� 'A'������ �̸��� f2�� �����ϴ� 'B'������ �̸����� �ٲ�
			System.out.println("���� �̸� �ٲٱ� �Ϸ�");
		}
		else { // A������ ������
			f1.mkdir(); //mkdir():�������� /f1���� �����ϴ� 'A'������ �̸����� ���� ����
			System.out.println("���� ������");
			try {
				f4.createNewFile(); //createNewFile() :���ϻ��� / f4��ü�� �����ϴ� �� ó�� 'A'������ aa.txt������ ����
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}//else
		
		if(f3.exists()) {
			boolean b = f3.delete(); //delete(): �������� / �����ȿ� ȭ���� ������ ������ �� �� ��� false�� return�Ѵ�.
			System.out.println(b);
		}
		
	}
}
