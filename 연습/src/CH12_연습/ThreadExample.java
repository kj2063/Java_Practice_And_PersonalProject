package CH12_����;

public class ThreadExample {
	public static void main(String[] args) {
		
		Thread thread = new Thread(){
			public void run() {
				for(int i=0; i<5; i++) {
					System.out.println("��");
					try{Thread.sleep(500);}
					catch(Exception e) {}
				}
			}
		};
		
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try{Thread.sleep(500);}
			catch(Exception e) {}

		}
	}
}
