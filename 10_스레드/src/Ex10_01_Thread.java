class Test1 implements Runnable{ //Runnable 인터페이스 구현하여 멀티스레드 만들기

	@Override
	public void run() {
		for(int i=1; i<=20; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	
}

public class Ex10_01_Thread { //멀티스레드 : 동시에 2개 이상의 메서드가 실행되는것 
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		Test1 t1 = new Test1();
		Thread th = new Thread(t1); //Runnable 을 상속받은 객체를 Thread 객체 생성의 인자로 넣는다.
		
		//t1.start();
		th.start();//Thread객체 생성시 인자로 들어간 객체의 run 메서드 실행
		
		for(int i='A'; i<='Z'; i++) {
			System.out.print((char)i + " ");
		}
		
		System.out.println("프로그램 종료");
	}
}
