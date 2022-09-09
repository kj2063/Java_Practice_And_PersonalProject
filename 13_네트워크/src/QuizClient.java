import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class QuizClient {
	public static void main(String[] args) throws IOException {
		Socket cs = null;
		
		try {
			cs = new Socket("localhost",5555);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		PrintWriter pw = new PrintWriter(cs.getOutputStream(),true);//서버로 데이터를 보내기 위한 다리
		//pw.close(); //close 하거나 PrintWriter 객체 생성시 true를 같이 넣어주면 pw를 닫지 않아도 데이터를 보낼 수 있다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(cs.getInputStream()));//서버로 부터 데이터를 받기 위한 다리
		
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));		
		
		String fromServer, fromClient;
		while((fromServer = br.readLine()) != null) {
			System.out.println("서버:" + fromServer); //퀴즈를 시작합니다 y/n
			if(fromServer.equals("quit"))
				break;
			fromClient = keyboard.readLine(); // y/n
			pw.println(fromClient);
		}
	}
}
