import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex11_05_FileStream {
	public static void main(String[] args) {
		
		FileOutputStream fos;
		FileInputStream fis;
		BufferedOutputStream bos = null;
		BufferedInputStream bis = null;
		try {
			fos = new FileOutputStream("data.txt");// 1차 stream : 직접 연결다리를 통해 데이터 전송 
			bos = new BufferedOutputStream(fos, 5); // 2차 stream : 연결다리 사이에 중간 간섭자(다음의 경우 Buffer : 임시 저장소)를 통해 전송 
	    											// *Buffer : 입출력 속도 증가를 위한 임시 저장소
												    // fos의 연결다리 중간에 5byte data의 임시 저장소를 만들어 저장 후 한번에 보냄
													// #주의! : 1~5번째 data가 다 차고 6번째 데이터가 들어와야 앞의 5개 data가 Buffer에서 내보내 지는데 만약 6번째 data가 들어오지 않으면 Buffer안의 5개 data는 내보내 지지 않고 머물러 있다.
													// buffer의 크기를 설정하지 않을경우 default = 8192로 설정된다. 
			
			
			for(int i=1; i<10; i++) {
				bos.write(48+i); // bos 이용하여 write! fos.write();를 쓰면 Buffer를 이용하는것이 아니다.
			}
			bos.flush(); // Buffer에 있는 모든 데이터를 꽉 채워지지 않아도 내보낸다.(쏟아지게 한다) / 이 메서드를 쓰면 close()를 사용하기 전에도 Buffer에 있는 데이터를 내보낼 수 있다.
			
			//이 시점에서는 1~5까지만 data.txt에 출력되고 나머지는 Buffer에 남아있따.
			//확인 해보기
			fis = new FileInputStream("data.txt");
			bis = new BufferedInputStream(fis,5);
			int r;
			
			while((r = bis.read()) != -1) {
				System.out.print((char)r);// close()하기전 data.txt에 출력된 문자 console에 출력해보기
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			//fos.close(); //bos가 fos를 받으므로 bos만 close()하여도 fos까지 close()된다.
			bos.close(); //close를 하면 Buffer에 머물러있는 data가 모두 내보내진다.
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
