import java.io.File;

public class Ex11_02_File {
	public static void main(String[] args) {
		
		File f = new File("c:\\Windows");
		System.out.println(f);
		
		boolean b1 = f.isDirectory(); //isDirectory() : 메서드가 관리하는 것이 폴더냐?
		System.out.println(b1);
		
		boolean b2 = f.isFile();
		System.out.println(b2);
		
		//삼항연산자 =>  조건 ? 참 : 거짓
		String result = f.isDirectory() ? "폴더" : "파일";
 		System.out.println(result);
 		
 		String[] lists = f.list(); //list() : 폴더 및 파일의 이름을 String 배열에 넣음
 		System.out.println(lists.length);
 		for(int i=0; i<lists.length; i++) {
 			
 			File kind = new File(f,lists[i]);
 			
 			if(kind.isDirectory())
 				System.out.println("폴더:"+ lists[i]);
 			else
 				System.out.println("파일:"+ lists[i]);
 		}
	}
}
