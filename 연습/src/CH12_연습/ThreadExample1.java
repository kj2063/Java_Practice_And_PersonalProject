package CH12_����;

class Dding extends Thread{
	
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try{Thread.sleep(500);}
			catch(Exception e) {}
	}
	
}


public class ThreadExample1 {
	public static void main(String[] args) {
		
		Thread thread = new Dding();
		thread.start();
		
		
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try{Thread.sleep(500);}
			catch(Exception e) {}
				
	}
}
