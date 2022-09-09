import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex13_03_Server {
	public static void main(String[] args) throws IOException {
		
		ServerSocket ss = null;
		Socket cs = null;//클라이언트 쪽에 다는 소켓
		
		try {
			ss = new ServerSocket(5555); // 5555번 포트를 사용하여 Client와 통신하겠다. //사용하지 않는 포트 입력
		} catch (IOException e) {
			System.out.println("5555번 포트번호는 이미 사용중입니다.");
			System.exit(1);//정상적으로 종료할때는 0 을 쓰지만 문제가 생겨 쓸 때는 다른번호를 쓴다.
		} 

		System.out.println("Server ready...");

		cs = ss.accept(); // 5555번 포트로 접속해 오는 Client가 있으면 받아드린다. 접속해 오는 Client를 cs에 담음.
		System.out.println("클라이언트가 접속해옴");

		BufferedReader br = new BufferedReader(new InputStreamReader(cs.getInputStream()));
		
		String readLine = br.readLine();
		System.out.println("클라이언트가 보내온 문자:" + readLine);
		readLine = br.readLine();
		
		br.close();
		cs.close();
		ss.close();
	}
}
