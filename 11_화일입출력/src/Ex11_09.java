import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Ex11_09 {
	public static void main(String[] args) {
		
//		PrintStream ps = System.out; //PrintStream 은 바이트출력 스트림, 따라서 System.out은 원래 한글은 쓰지 못한다

		OutputStreamWriter os = new OutputStreamWriter(System.out);//바이트 출력 스트림 => 문자 출력 스트림
		BufferedWriter bw = new BufferedWriter(os);
		PrintWriter pw = new PrintWriter(bw,true);
		pw.println("오늘은");
		pw.println("목요일");

		pw.close();		
				
	}
}
