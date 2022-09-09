import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex11_08_InputStreamReader {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str, read;
		
		
		System.out.print("���� �̸� �Է�:");
		try {
			String fileName = br.readLine();
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);
			
			System.out.println("===�ۼ��� ���� �Է�===");
			
			while((str = br.readLine()) != null) {
				bw.write(str);
				bw.newLine(); //bw.write("\r\n"); => \r:���� �� ������ �� \n:�ؿ� ������ ��
			}//���� ��, ctrl + z ������ str�� null�� ����. 
			System.out.println("�Է��� ��Ĩ�ϴ�.");
			bw.close();
			br.close();
			
//			FileReader fr = new FileReader(fileName);
			BufferedReader br_fr = new BufferedReader(new FileReader(fileName));
			
			
			while((read=br_fr.readLine()) != null) {
				System.out.println(read);
			}
			
			br_fr.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
