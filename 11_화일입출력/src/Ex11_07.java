import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.xml.sax.InputSource;

public class Ex11_07 {
	public static void main(String[] args) {
		
//		System.out.print("������ �Է�:");
		
//		Scanner sc = new Scanner(System.in);
//		
//		String name = sc.next();
//		System.out.println(name);// '�� ���' �� �Է½� ���鹮�� �������� '��'�� �ԷµǾ� name�� ����.
		
		//������� �� �Է��ؼ� �Է��ϰ� �ʹٸ�?
		System.out.print("[(�ѱ�O)���� ���� ���ڿ� �Է� 1]:");
		InputStream is = System.in; // InputStream(����Ʈ ��Ʈ��) Ÿ���� return�ϹǷ� System.in�� ����Ʈ �Է¸�(�ѱ�X) �� �� �ִ�.
		 
		InputStreamReader ir = new InputStreamReader(is); // InputStreamReader class: ����Ʈ �Է� => ���� �Է� | Ű����(System.in)���� �ѱ��� �Է¸������� ���� ��ü�� �������μ� �ѱ۷ε� �Է¹��� �� �ְ� �Ѵ�.
		BufferedReader br = new BufferedReader(ir); // 2����Ʈ�� Buffer�� ������ �޾� ������ �о�� �� �ְ� ��.
		
		//���� ������ �ѽ����� ���̴µ�, ������ ���� �����ϰ� ���ٷ� �� ���� �ִ�.
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		try {
			String name = br.readLine(); //readLine() : ����ġ�� ������ ��� ����(��������)�� �����Ͷ�.
			System.out.println(name);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		//�ٸ����
		byte[] b = new byte[100]; //�Է��� ũ�⸦ �޾� ���� �� �ְ� ����� ũ���� �迭�� ����. ����� �ѱ��ڴ� 1byte, �ѱ��� �ѱ��ڴ� 2byte ����.
		
		try {
			
			System.out.print("[(�ѱ�O)���� ���� ���ڿ� �Է� 2]:");
			InputStream is2 = System.in;

			int readByteNo = is2.read(b);// InputStream.read(byte[] b) : b�� is2��ü�� �ԷµȰ��� ����. + return �Էµ� byte[]�� ���� ����.  
			
			String str = new String(b,0,readByteNo-2); // 0��° ����� readByteNo-2 ������� �а� String���� ��ȯ. -2 �� �ϴ� ������ ���Ͱ� 2����Ʈ�� �����Ͽ� �ԷµǱ� ����
			System.out.println(str);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
	}
}
