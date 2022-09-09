package CH12_¿¬½À;

public class ThreadExample {
	public static void main(String[] args) {
		
		Thread thread = new Thread(){
			public void run() {
				for(int i=0; i<5; i++) {
					System.out.println("¶ò");
					try{Thread.sleep(500);}
					catch(Exception e) {}
				}
			}
		};
		
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("¶Ë");
			try{Thread.sleep(500);}
			catch(Exception e) {}

		}
	}
}
