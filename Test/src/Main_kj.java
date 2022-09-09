import java.util.ArrayList;
import java.util.Scanner;

public class Main_kj {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Student_kj> arr_std = new ArrayList<Student_kj>();
		
		
		while(true) {
			System.out.print("이름입력:");
			String name = sc.next();
			System.out.print("나이입력:");
			int age = sc.nextInt();
			System.out.print("자바입력:");
			int java = sc.nextInt();
			System.out.print("jsp입력:");
			int jsp = sc.nextInt();
			
			arr_std.add(new Student_kj(name,age,java,jsp));
			
			System.out.print("계속?(y/n):");
			String retry = sc.next();
			System.out.println("***************************");
			if(retry.equals("n")) {
				System.out.println("ArrayList 사용한 결과");
				for(int i=0; i<arr_std.size(); i++) {
					double avg = (arr_std.get(i).getJava() + arr_std.get(i).getJsp())/2.0;
					System.out.printf(i + ":" + arr_std.get(i) + "  " + "평균:" + "%.2f\n",avg);
				}
				System.out.println("=================================");
				break;
			}
		}//while
		
		System.out.print("찾는 이름을 입력 : ");
		String name = sc.next();
		boolean retry = false;
		
		for(int i=0; i<arr_std.size(); i++) {
			if(arr_std.get(i).getName().equals(name)) {
				System.out.println(arr_std.get(i).toString2());
				retry = true;
			}
		}
		if(retry == false) {
			System.out.println("찾는 이름이 없습니다.");
		}
		
		
		
	}
}
