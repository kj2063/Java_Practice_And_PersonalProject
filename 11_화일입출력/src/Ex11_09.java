import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Ex11_09 {
	public static void main(String[] args) {
		
//		PrintStream ps = System.out; //PrintStream �� ����Ʈ��� ��Ʈ��, ���� System.out�� ���� �ѱ��� ���� ���Ѵ�

		OutputStreamWriter os = new OutputStreamWriter(System.out);//����Ʈ ��� ��Ʈ�� => ���� ��� ��Ʈ��
		BufferedWriter bw = new BufferedWriter(os);
		PrintWriter pw = new PrintWriter(bw,true);
		pw.println("������");
		pw.println("�����");

		pw.close();		
				
	}
}
