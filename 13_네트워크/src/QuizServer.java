import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class QuizServer {
	public static void main(String[] args) throws IOException {
		
		ServerSocket ss = null;
		Socket cs = null;
		
		ss = new ServerSocket(5555);
		System.out.println("Server ready...");
		cs = ss.accept();
		System.out.println("클라이언트가 접속해 옴");
		
		PrintWriter pw = new PrintWriter(cs.getOutputStream(),true);//접속한 시도한 클라이언트로 데이터를 보내기 위한 다리
//		pw.close(); //close 하거나 PrintWriter 객체 생성시 true를 같이 넣어주면 pw를 닫지 않아도 데이터를 보낼 수 있다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(cs.getInputStream()));//클라이언트로 데이터를 받기 위한 다리
		
		QuizBank bank = new QuizBank();
		String output;
		output = bank.process(null);
		pw.println(output);// 클라이언트로  "퀴즈를 시작합니다 (y/n):" 보냄
		
		String fromClient;
		while((fromClient = br.readLine()) != null) {
			output = bank.process(fromClient);
			pw.println(output); //
			if(output.equals("quit"))
				break;
		}//while
	
		pw.close();
		br.close();
		ss.close();
		cs.close();
	}
	
}	
