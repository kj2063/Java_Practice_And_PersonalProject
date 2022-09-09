import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
		
public class Ex11_04_FileStream { 
	public static void main(String[] args) {
		/*
		 Stream : �߰� ���� �ٸ� ex) System.out -> console, console �Է� -> System.in | �ѹ������θ� �۵��Ѵ�. �б�� ���Ⱑ ���ÿ� ���� �ʴ´�.
		 
		 FIFO���� (First in First out) : ���� ������ ���� ������.
		  
		 #���� ��Ʈ�� : �ѱ�,����,����,Ư������ ��...
		 �о���϶� -> Reader
		 ����Ҷ�(����) -> Writer
		 
		 #����Ʈ ��Ʈ�� : �ѱ��� �� ��... | 1byte �� Input/Ouput�� �� �ִ� Stream
		 �о���϶� -> InputStream
		 ����Ҷ�(����) -> OutputStream
		*/
		
		try {
			FileInputStream fis = new FileInputStream("from.txt"); // ��ü ������ from.txt �� ���ϰ� ����ٸ�(Stream) ���� / FileInuputStream�� �����͸� ������(�о����) ���� ���� ����ٸ��� �����Ѵ�.
			FileOutputStream fos = new FileOutputStream("to.txt",true); // FileOutputStream("����"): ���Ͽ� �������� ����ٸ� ����
																   // FileInputStream�� ������ ������ FileNotFoundException�� �߻���Ű����, FileOutputStream�� ������ ������ ���� �߻��� ���� �ʰ� ������ ���� ������Ų��
																   // ������ ������ ��ġ�� ������ �־ ������ ������ ���� ��ο� ������ ������� �Ҷ� ���ܸ� �߻���Ų�� (���� ������ �������� �ʴ´�)
																   // ���ϸ� ���� true: ȭ��X => ���� ������, ȭ��O => ���� �ִ� ���Ͽ� �Է¹��� �߰�
																   // ���ϸ� ���� false: ȭ��X => ���� ������, ȭ��O => ���� �ִ� ������ ���� �� ���θ���
																   // true�� false�� ���� ������� default�� false�� �۵���.
			
			while(true) {
				int r = fis.read(); // ����ٸ�(Stream)�� ���� �ѱ��ڸ� ������ �Ͷ�. �ƽ�Ű�ڵ� ���� return�ȴ�.
				if(r == -1) //������ ������ EOF(end of file)�̶�� ���� ������ �ʴ� ���°� �ִµ�, read()�� ���� EOF�� �о���̰� �Ǹ� -1�� return�Ѵ�.
					break;
				System.out.print((char)r);
				fos.write(r);
			}
			
			fis.close(); // ����ٸ� ����
			fos.close();
			
		} catch (FileNotFoundException e) {	// �ش� ������ �߰����� ���Ҷ� FileNotFoundException ���� �߻�
			System.out.println("ȭ�� �߰� ����");
			e.printStackTrace();
		} catch (IOException e) { //read()�� ���� �߻��� IOException catch
			e.printStackTrace();
		}
		System.out.println("ȭ�� �����");
		
		
		
	}
}
