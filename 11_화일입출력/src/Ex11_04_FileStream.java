import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
		
public class Ex11_04_FileStream { 
	public static void main(String[] args) {
		/*
		 Stream : 중간 연결 다리 ex) System.out -> console, console 입력 -> System.in | 한방향으로만 작동한다. 읽기와 쓰기가 동시에 되지 않는다.
		 
		 FIFO구조 (First in First out) : 먼저 들어오면 먼저 나간다.
		  
		 #문자 스트림 : 한글,영어,숫자,특수문자 등...
		 읽어들일때 -> Reader
		 출력할때(쓸때) -> Writer
		 
		 #바이트 스트림 : 한글을 뺀 것... | 1byte 를 Input/Ouput할 수 있는 Stream
		 읽어들일때 -> InputStream
		 출력할때(쓸때) -> OutputStream
		*/
		
		try {
			FileInputStream fis = new FileInputStream("from.txt"); // 객체 생성시 from.txt 인 파일과 연결다리(Stream) 형성 / FileInuputStream은 데이터를 가지고(읽어오기) 오기 위한 연결다리를 형성한다.
			FileOutputStream fos = new FileOutputStream("to.txt",true); // FileOutputStream("파일"): 파일에 쓰기위한 연결다리 형성
																   // FileInputStream은 파일이 없으면 FileNotFoundException을 발생시키지만, FileOutputStream은 파일이 없으면 예외 발생을 하지 않고 파일을 새로 생성시킨다
																   // 하지만 폴더의 위치를 지정해 주어서 파일을 만들경우 없는 경로에 파일을 만들려고 할때 예외를 발생시킨다 (폴더 까지는 생성하지 않는다)
																   // 파일명 옆에 true: 화일X => 새로 생성됨, 화일O => 원래 있던 파일에 입력문자 추가
																   // 파일명 옆에 false: 화일X => 새로 생성됨, 화일O => 원래 있던 파일을 삭제 후 새로만듬
																   // true나 false를 쓰지 않을경우 default로 false로 작동함.
			
			while(true) {
				int r = fis.read(); // 연결다리(Stream)를 통해 한글자만 가지고 와라. 아스키코드 값이 return된다.
				if(r == -1) //문장의 끝에는 EOF(end of file)이라는 눈에 보이지 않는 상태가 있는데, read()를 통해 EOF를 읽어들이게 되면 -1을 return한다.
					break;
				System.out.print((char)r);
				fos.write(r);
			}
			
			fis.close(); // 연결다리 끊기
			fos.close();
			
		} catch (FileNotFoundException e) {	// 해당 파일을 발견하지 못할때 FileNotFoundException 에러 발생
			System.out.println("화일 발견 못함");
			e.printStackTrace();
		} catch (IOException e) { //read()에 의해 발생될 IOException catch
			e.printStackTrace();
		}
		System.out.println("화일 입출력");
		
		
		
	}
}
