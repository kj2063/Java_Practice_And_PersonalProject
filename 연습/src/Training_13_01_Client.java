import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Training_13_01_Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket cs = new Socket("localhost",5555);
		
		PrintWriter pw = new PrintWriter(cs.getOutputStream(),true);//클라이언트->서버 보낼것.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(cs.getInputStream())); // 클라이언트<-서버 받을것.
		
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		
		String text, yn;
		
		
		System.out.println("접속하였습니다");
		text = br.readLine();
		System.out.println(text);
		while((yn = keyboard.readLine()) != null) {
			pw.println(yn);
			if(yn.equalsIgnoreCase("n")) {
				text = br.readLine();
				System.out.println(text);
			}
			else if(yn.equalsIgnoreCase("y")) {
				text = br.readLine();
				System.out.println(text);
				yn = keyboard.readLine();
				pw.println(yn);
				text = br.readLine();
				System.out.println(text);
			}
			
			break;
			}
			

		
			
		cs.close();
		pw.close();
		br.close();
		keyboard.close();
	}
}
