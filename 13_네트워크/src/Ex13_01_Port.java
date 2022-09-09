import java.io.IOException;
import java.net.ServerSocket;

public class Ex13_01_Port {
	/*
	Network: 다른장치로 data를 이동시킬 수 있는 computer들과 주변 장치들의 집합.(ex. 컴퓨터,프린터,스캐너 등...)
	Node: Network의 연결된 모든 장치들.
	
	md에 ipconfig라고 침 => 내 컴퓨터의 주소 알 수 있다.
	
	*Server: 데이터를 보내는쪽
	*Client: 데이터를 받는쪽
	ServerSocket :Server와 Client 사이에 정보를 주고 받을때 양쪽에 장치를 달아야 하는데 서버쪽에 다는것.
	Port :몇번 포트번호로 데이터를 주고 받을거냐?
	*/
	public static void main(String[] args) {
		
		
		ServerSocket ss = null;
		
		for(int i=0; i<65536; i++) { //사용할 수 있는 포트 번호 0~65536 //번호 0~1023은 System에 의해 예약된 번호이므로 사용하지 않는것이 좋다.
			try {
				ss = new ServerSocket(i);
				ss.close();//네트워크를 통해 더이상 데이터 교환 하지 않겠다. 연결장치 끊음. 안썼을때 문제가 안생길 수 도 있지만, 안전상 써야 한다.
			} catch (IOException e) {
				//e.printStackTrace();
				System.out.println(i + "번 포트는 이미 사용중입니다.");
			
			}
		}
	}
}
