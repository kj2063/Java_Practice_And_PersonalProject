import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class Ex13_02_IPTest {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("웹 사이트 주소를 입력하세요:");
		try {
			String url = br.readLine(); //www.daum.net
			
			//InetAddress.getAllByName() : 도메인 네임과 매핑되어 있는 IP주소를 알려주는 메서드
			InetAddress[] address = InetAddress.getAllByName(url);//131.232.32.22 이런 IP주소를 배열로 리턴 //주소가 1개면 배열1개, 주소가 2개면 배열2개 리턴
			//UnknownHostException : 없는 웹사이트 주소입력시 발생 (IOException의 자식예외)
			
			for(int i=0; i<address.length; i++) {
				System.out.println(address[i]);
			}
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
