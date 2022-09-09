import java.util.HashMap;
import java.util.Scanner;

class Student{
	private String addr;
	private double height;
	private int kor;
	
	public Student(String addr, double height, int kor) {
		super();
		this.addr = addr;
		this.height = height;
		this.kor = kor;
	}

	public String getAddr() {
		return addr;
	}

	public double getHeight() {
		return height;
	}

	public int getKor() {
		return kor;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public String toString() {
		return addr + "/" + height + "/" + kor;
	}
}


public class Ex09_15_���� {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Student> hm = new HashMap<String, Student>();
		
		while(true) {
			System.out.print("�̸� : ");
			String name = sc.next();
			System.out.print("�ּ� : ");
			String add = sc.next();
			System.out.print("Ű : ");
			double height = sc.nextDouble();
			System.out.print("���� : ");
			int score = sc.nextInt();
			
			hm.put(name, new Student(add,height,score));
			
			System.out.print("���?(y/n) : ");
			String retry = sc.next();
			
			if(retry.equals("n")) {
				break;
			}
			else {
				System.out.println();
			}
		}//while
		
		System.out.println(hm);
		System.out.println();
		
		while(true) {
			System.out.print("ã���̸� : ");
			String name = sc.next();
			
			if(hm.containsKey(name)) {
				System.out.println(hm.get(name));
			}
			else {
				System.out.println("ã�� �̸� ����");
			}
			
			System.out.print("���?(y/n) : ");
			String retry = sc.next();
			System.out.println();
			
			if(retry.equals("n")) {
				break;
			}
		}

		
		
		while(true) {
			System.out.print("������ �̸� : ");
			String name = sc.next();
			
			if(hm.containsKey(name)) {
				hm.remove(name);
				System.out.println(hm);
				System.out.println();
			}
			else {
				System.out.println("ã�� �̸� ����");
				System.out.println();
			}
			
			System.out.print("���?(y/n) : ");
			String retry = sc.next();
			
			if(retry.equals("n")) {
				break;
			}
			
		}
		System.out.println("���α׷��� �����մϴ�.");
		
	}//main
}
