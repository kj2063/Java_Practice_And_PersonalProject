import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex11_06_Reader_Writer {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("write.txt",false); //기본값(default)은 false | 11_05 FileOutputStream class와 매개변수의 이용은 같다.
			
			fw.write("즐거운 자바공부!");
			fw.close();// 바이트 스트림과는 다른게 close()를 해야 write()로 실행된 것이 보인다.
			
			
			FileReader fr = new FileReader("write.txt");
			int r;
			while((r = fr.read()) != -1) {
				System.out.print((char)r);
			}
			fr.close();
			
		} catch (IOException e) { //바이트 스트림 클래스와 다른게, 같은 이유(FileNotFoundException)로 예외가 생겨도 문자 스트림 클래스는 IOException예외를 발생시킨다.
			e.printStackTrace();
		}
	}
}
