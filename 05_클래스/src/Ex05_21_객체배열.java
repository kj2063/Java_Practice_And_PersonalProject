import java.util.Scanner;

class Person3{
	private String name;
	private int age;
	
	Person3(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() { //하나라도 return 중 String 타입이 있으면 int가 있어도 String 이다. 
		return name + "," + age;
	}

}


public class Ex05_21_객체배열 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Person3 p1,p2,p3;
		
		Person3[] p = new Person3[3];
		
		int i;
		for(i=0;i<p.length;i++) {
			System.out.printf("\"%d\"번째 방 \"이름\" : ",i);
			String name = sc.next();
			System.out.printf("\"%d\"번째 방 \"나이\" : ",i);
			int age = sc.nextInt();
			p[i] = new Person3(name, age);
			
		}
		/*
		for(i=0;i<p.length;i++) {
			System.out.println(p[i].toString());
		}
		*/
		for(i=0;i<p.length;i++) {
			System.out.println(p[i]); //.toString() 이라는 메서드는 특수한 메서드로 p[i].toString()이라고 쓰지 않아도 메서드가 발현된다.
		} 
		
	}
}
