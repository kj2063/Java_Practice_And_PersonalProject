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
		
		
		System.out.print("파일 이름 입력:");
		try {
			String fileName = br.readLine();
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);
			
			System.out.println("===작성할 내용 입력===");
			
			while((str = br.readLine()) != null) {
				bw.write(str);
				bw.newLine(); //bw.write("\r\n"); => \r:줄의 맨 앞으로 감 \n:밑에 줄으로 감
			}//엔터 후, ctrl + z 누르면 str에 null이 들어간다. 
			System.out.println("입력을 마칩니다.");
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
