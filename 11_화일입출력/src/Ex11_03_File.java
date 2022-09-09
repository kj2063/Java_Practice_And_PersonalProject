import java.io.File;
import java.io.IOException;

public class Ex11_03_File {
	public static void main(String[] args) {
		
		File f1 = new File("c:\\workspace\\11_화일입출력\\A");
//		File f1 = new File("A"); // Ex11_03_File.java 파일이 있는곳에 윗폴더(bin,src 폴더 있는곳)의 A폴더
		
		File f2 = new File("B"); // B폴더
		File f3 = new File("C"); // C폴더
		File f4 = new File(f1,"aa.txt"); // 'A'폴더에 aa.txt파일을 만들고 싶어서 File 객체 생성
		
		System.out.println(f1.exists()); //exists() 메서드: 폴더가 있는지 없는지 확인하는 메서드
		System.out.println(f2.exists());

		if(f1.exists()) {
			f1.renameTo(f2); //f1으로 관리하는 'A'폴더의 이름을 f2로 관리하는 'B'폴더의 이름으로 바꿈
			System.out.println("폴더 이름 바꾸기 완료");
		}
		else { // A폴더가 없으면
			f1.mkdir(); //mkdir():폴더생성 /f1으로 관리하는 'A'폴더의 이름으로 폴더 생성
			System.out.println("폴더 생성함");
			try {
				f4.createNewFile(); //createNewFile() :파일생성 / f4객체가 관리하는 것 처럼 'A'폴더에 aa.txt파일을 생성
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}//else
		
		if(f3.exists()) {
			boolean b = f3.delete(); //delete(): 폴더삭제 / 폴더안에 화일이 있을때 삭제를 할 수 없어서 false를 return한다.
			System.out.println(b);
		}
		
	}
}
