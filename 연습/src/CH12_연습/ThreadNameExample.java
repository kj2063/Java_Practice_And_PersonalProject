package CH12_연습;

class Thread_A extends Thread{
	public void run() {
		for(int i=0; i<2; i++) {
			System.out.println(getName()+"스레드 실행중");
		}
	}
}

class Thread_B extends Thread{
	public void run() {
		for(int i=0; i<2; i++) {
			System.out.println(getName()+"스레드 실행중");
		}
	}
}



public class ThreadNameExample {
	public static void main(String[] args) {
		
		Thread thread = Thread.currentThread();
		thread.setName("메인");
		System.out.println(thread.getName() + "스레드 실행중");
		
		Thread thread_a = new Thread_A();
		thread_a.setName("Athread");
		thread_a.start();
		
		
		Thread thread_b = new Thread_B();
		thread_b.setName("Bthread");
		thread_b.start();
		
	}
}
