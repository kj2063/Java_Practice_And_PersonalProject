package CH12_����;

class Thread_A extends Thread{
	public void run() {
		for(int i=0; i<2; i++) {
			System.out.println(getName()+"������ ������");
		}
	}
}

class Thread_B extends Thread{
	public void run() {
		for(int i=0; i<2; i++) {
			System.out.println(getName()+"������ ������");
		}
	}
}



public class ThreadNameExample {
	public static void main(String[] args) {
		
		Thread thread = Thread.currentThread();
		thread.setName("����");
		System.out.println(thread.getName() + "������ ������");
		
		Thread thread_a = new Thread_A();
		thread_a.setName("Athread");
		thread_a.start();
		
		
		Thread thread_b = new Thread_B();
		thread_b.setName("Bthread");
		thread_b.start();
		
	}
}
