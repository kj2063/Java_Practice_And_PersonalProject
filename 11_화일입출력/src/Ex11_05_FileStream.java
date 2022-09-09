import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex11_05_FileStream {
	public static void main(String[] args) {
		
		FileOutputStream fos;
		FileInputStream fis;
		BufferedOutputStream bos = null;
		BufferedInputStream bis = null;
		try {
			fos = new FileOutputStream("data.txt");// 1�� stream : ���� ����ٸ��� ���� ������ ���� 
			bos = new BufferedOutputStream(fos, 5); // 2�� stream : ����ٸ� ���̿� �߰� ������(������ ��� Buffer : �ӽ� �����)�� ���� ���� 
	    											// *Buffer : ����� �ӵ� ������ ���� �ӽ� �����
												    // fos�� ����ٸ� �߰��� 5byte data�� �ӽ� ����Ҹ� ����� ���� �� �ѹ��� ����
													// #����! : 1~5��° data�� �� ���� 6��° �����Ͱ� ���;� ���� 5�� data�� Buffer���� ������ ���µ� ���� 6��° data�� ������ ������ Buffer���� 5�� data�� ������ ���� �ʰ� �ӹ��� �ִ�.
													// buffer�� ũ�⸦ �������� ������� default = 8192�� �����ȴ�. 
			
			
			for(int i=1; i<10; i++) {
				bos.write(48+i); // bos �̿��Ͽ� write! fos.write();�� ���� Buffer�� �̿��ϴ°��� �ƴϴ�.
			}
			bos.flush(); // Buffer�� �ִ� ��� �����͸� �� ä������ �ʾƵ� ��������.(������� �Ѵ�) / �� �޼��带 ���� close()�� ����ϱ� ������ Buffer�� �ִ� �����͸� ������ �� �ִ�.
			
			//�� ���������� 1~5������ data.txt�� ��µǰ� �������� Buffer�� �����ֵ�.
			//Ȯ�� �غ���
			fis = new FileInputStream("data.txt");
			bis = new BufferedInputStream(fis,5);
			int r;
			
			while((r = bis.read()) != -1) {
				System.out.print((char)r);// close()�ϱ��� data.txt�� ��µ� ���� console�� ����غ���
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			//fos.close(); //bos�� fos�� �����Ƿ� bos�� close()�Ͽ��� fos���� close()�ȴ�.
			bos.close(); //close�� �ϸ� Buffer�� �ӹ����ִ� data�� ��� ����������.
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
