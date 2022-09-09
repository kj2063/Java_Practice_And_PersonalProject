import java.io.File;

public class Ex11_01_File {
	public static void main(String[] args) {
		File f1 = new File("c:\\sun\\abc.txt"); //폴더 구분할때 역슬래쉬("\")를 두번 써야한다.
//		File f1 = new File("c:\\sun","abc.txt"); //File("폴더","파일"); 이렇게 해도 된다.
		
//		File dir = new File("c:\\sun"); //폴더위치를 넣은 파일 객체를 만들고
//		File f1 = new File(dir,"abc.txt"); // 다음과 같이 파일 객체를 폴더 위치에다 넣어도 된다.
		
		long len = f1.length(); // 엔터는 크기가 2(2byte)로 측정된다 (엔터를 치면 그 줄의 제일 앞으로 왔다가(+1) 한줄 내려감(+1).) //한글은 한글자당 3byte를 차지.
		System.out.println("len:" + len);
	}
}
