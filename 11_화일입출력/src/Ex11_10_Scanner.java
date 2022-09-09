import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex11_10_Scanner {
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 입력:");
//		int num = sc.nextInt();
//		System.out.println("num:" + num);
//		sc.close();
		
		File f= new File("test.txt");
		int num, sum=0;
		try {
			Scanner sc = new Scanner(f); //Scanner가 test.txt파일을 읽음
			sc.useDelimiter(","); // ","를 구분자 해서 sc로 읽어드릴것이다.
			while(sc.hasNextInt()) {
				num = sc.nextInt();
				System.out.print(num);
				sum += num;
			}
			System.out.println();
			System.out.println("sum:" + sum);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		
		
		
	}
}
