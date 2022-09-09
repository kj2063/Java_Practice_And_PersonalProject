import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex11_06_Reader_Writer {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("write.txt",false); //�⺻��(default)�� false | 11_05 FileOutputStream class�� �Ű������� �̿��� ����.
			
			fw.write("��ſ� �ڹٰ���!");
			fw.close();// ����Ʈ ��Ʈ������ �ٸ��� close()�� �ؾ� write()�� ����� ���� ���δ�.
			
			
			FileReader fr = new FileReader("write.txt");
			int r;
			while((r = fr.read()) != -1) {
				System.out.print((char)r);
			}
			fr.close();
			
		} catch (IOException e) { //����Ʈ ��Ʈ�� Ŭ������ �ٸ���, ���� ����(FileNotFoundException)�� ���ܰ� ���ܵ� ���� ��Ʈ�� Ŭ������ IOException���ܸ� �߻���Ų��.
			e.printStackTrace();
		}
	}
}
