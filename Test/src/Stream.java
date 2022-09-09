import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Stream {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("from.txt");
			FileOutputStream fos = new FileOutputStream("to.txt",false);
			while (true) {
				int s = fis.read();
				if(s == -1)
					break;
				System.out.print((char)s);
				fos.write(s);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
