import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.xml.sax.InputSource;

public class Ex11_07 {
	public static void main(String[] args) {
		
//		System.out.print("데이터 입력:");
		
//		Scanner sc = new Scanner(System.in);
//		
//		String name = sc.next();
//		System.out.println(name);// '손 흥민' 을 입력시 공백문자 전까지인 '손'만 입력되어 name에 들어간다.
		
		//공백까지 다 입력해서 입력하고 싶다면?
		System.out.print("[(한글O)띄어쓰기 포함 문자열 입력 1]:");
		InputStream is = System.in; // InputStream(바이트 스트림) 타입을 return하므로 System.in은 바이트 입력만(한글X) 할 수 있다.
		 
		InputStreamReader ir = new InputStreamReader(is); // InputStreamReader class: 바이트 입력 => 문자 입력 | 키보드(System.in)으론 한글을 입력못하지만 다음 객체를 만듬으로서 한글로도 입력받을 수 있게 한다.
		BufferedReader br = new BufferedReader(ir); // 2차스트림 Buffer의 도움을 받아 빠르게 읽어올 수 있게 함.
		
		//위의 세줄은 한쌍으로 쓰이는데, 다음과 같이 간단하게 한줄로 쓸 수도 있다.
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		try {
			String name = br.readLine(); //readLine() : 엔터치지 전까지 모든 문자(공백포함)를 가져와라.
			System.out.println(name);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		//다른방법
		byte[] b = new byte[100]; //입력한 크기를 받아 들일 수 있게 충분한 크기의 배열을 만듬. 영어는 한글자당 1byte, 한글은 한글자당 2byte 차지.
		
		try {
			
			System.out.print("[(한글O)띄어쓰기 포함 문자열 입력 2]:");
			InputStream is2 = System.in;

			int readByteNo = is2.read(b);// InputStream.read(byte[] b) : b에 is2객체에 입력된것을 넣음. + return 입력된 byte[]의 방의 갯수.  
			
			String str = new String(b,0,readByteNo-2); // 0번째 방부터 readByteNo-2 번방까지 읽고 String으로 변환. -2 를 하는 이유는 엔터가 2바이트를 차지하여 입력되기 때문
			System.out.println(str);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
	}
}
