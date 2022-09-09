package Video;

public class Main {
	
	static VideoShop vs = new VideoShop();
	
	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		Person p1 = new Person("지민");
		Person p2 = new Person("슈가");
		Person p3 = new Person("RM");
		Person p4 = new Person("정국");
		
//		String s = p1.getName(); //Person 에 getName() 메서드가 없을땐 Thread에 의해 상속된 getName()이 출력된다. 출력값은 스레드의 이름이다.
//		System.out.println(s);
//		System.out.println(p2.getName());
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		
		
		System.out.println("프로그램 끝");
	}

}
