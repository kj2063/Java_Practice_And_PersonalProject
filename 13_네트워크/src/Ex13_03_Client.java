import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Ex13_03_Client {
	public static void main(String[] args) throws IOException {
		
		Socket cs = null;
		PrintWriter pw = null;
		try {
			cs = new Socket("127.0.0.1",5555);//"127.0.0.1"(내 컴퓨터의 IP주소를 나타냄) or "localhost" or "172.30.1.30"(직접 찾아내서 알아낸 IP주소) or "0"
			//5555번 포트를 통해 내 컴퓨터(Server IP)와 접속 시도. 
			OutputStream os = cs.getOutputStream();
			pw = new PrintWriter(os); //PrintWriter : 출력하기 위한 stream , byte출력을 문자 출력으로 바꿀 수 있는 클래스 // 서버로 한글을 보낼 수 있게 만들어준다.
			//client가 Server랑 접속을 하고 pw라는 다리가 형성됨.
			
			System.out.println("클라이언트 접속함");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("입력:");
		String line = br.readLine();
		System.out.println("클라이언트 입력:" + line);
		pw.println(line);//입력한 line을 pw를 통해 보냄.
		
		pw.close();//이걸 닫아줘야 보낼때 Buffer에 있는 데이터를 다 내보내어 보낸다.
		br.close();
		cs.close();
	}
}
