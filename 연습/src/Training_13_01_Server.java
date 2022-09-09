import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Training_13_01_Server {
	public static void main(String[] args) throws IOException {
		/*		
		for(int i=0; i<65535; i++) {
			try {
				ServerSocket ss = new ServerSocket(i);
				ss.close();
			} catch (IOException e) {
				System.out.println(i + "번째 사용중");
			}
		}
		*/
		
		
		ServerSocket ss = new ServerSocket(5555);
		System.out.println("접속자 기다리는중...");
		Socket cs = ss.accept();
		System.out.println("접속자 발견!!!");
		
		PrintWriter pw = new PrintWriter(cs.getOutputStream(),true);//서버->클라이언트 보낼것.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(cs.getInputStream())); // 서버<-클라이언트 받을것.
		
		String line, reply;
		
		pw.println("밥은 먹었어요?(y/n):");
		line = br.readLine();
		if(line.equalsIgnoreCase("y")) {
			pw.println("무엇을 먹었나요?:");
			reply = br.readLine();
			pw.println(reply + "를 먹었군요!");
		}
		else if(line.equalsIgnoreCase("n")) {
			pw.println("얼른 밥을 드세요.");
		}
				
		
		
		pw.close();
		br.close();
		cs.close();
		ss.close();
		
		
		
		
		

	}
}
