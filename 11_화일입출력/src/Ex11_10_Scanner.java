import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex11_10_Scanner {
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("���� �Է�:");
//		int num = sc.nextInt();
//		System.out.println("num:" + num);
//		sc.close();
		
		File f= new File("test.txt");
		int num, sum=0;
		try {
			Scanner sc = new Scanner(f); //Scanner�� test.txt������ ����
			sc.useDelimiter(","); // ","�� ������ �ؼ� sc�� �о�帱���̴�.
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
