import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MakeFile {
	public static void main(String[] args) {
		
		try {
			BufferedOutputStream bis = new BufferedOutputStream(new FileOutputStream("byte_stream_file.txt"),5);
			
			for(char i = '1'; i<='9'; i++)
				bis.write(i);
			
//			bis.close();	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
