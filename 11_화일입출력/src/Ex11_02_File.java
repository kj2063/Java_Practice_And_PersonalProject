import java.io.File;

public class Ex11_02_File {
	public static void main(String[] args) {
		
		File f = new File("c:\\Windows");
		System.out.println(f);
		
		boolean b1 = f.isDirectory(); //isDirectory() : �޼��尡 �����ϴ� ���� ������?
		System.out.println(b1);
		
		boolean b2 = f.isFile();
		System.out.println(b2);
		
		//���׿����� =>  ���� ? �� : ����
		String result = f.isDirectory() ? "����" : "����";
 		System.out.println(result);
 		
 		String[] lists = f.list(); //list() : ���� �� ������ �̸��� String �迭�� ����
 		System.out.println(lists.length);
 		for(int i=0; i<lists.length; i++) {
 			
 			File kind = new File(f,lists[i]);
 			
 			if(kind.isDirectory())
 				System.out.println("����:"+ lists[i]);
 			else
 				System.out.println("����:"+ lists[i]);
 		}
	}
}
