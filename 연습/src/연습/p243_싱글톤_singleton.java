package 연습;

class Singleton { //전체 프로그램에서 단 하나의 객체만 만들도록 보장해야 하는 경우 
	
	private static Singleton st = new Singleton();
	
	private Singleton() { //생성자를 private로 만들어 다른곳에서 생성하지 못하게 만든다.
	 System.out.println("싱글톤 입니다.");
	}

	static Singleton getInstance() {//여기서 Singleton 은 참조타입을 의미
		return st;					//외부에서 객체를 얻는 유일한 방법은 getInstance() 메소드를 호출하는 방법뿐
	}
}

public class p243_싱글톤_singleton {
	public static void main(String[] args) {
		//Singleton st_main = new Singleton(); //객체를 생성할 수 없다.
		Singleton.getInstance();
		//or
		Singleton result = Singleton.getInstance();
		System.out.println(result); // 객체 참조 주소 나타냄 ...
	}
}
