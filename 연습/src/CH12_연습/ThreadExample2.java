package CH12_����;

class Dding2 implements Runnable{
	
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try{Thread.sleep(500);}
			catch(Exception e) {}
	}
	
}

public class ThreadExample2 {
	public static void main(String[] args) {
		Dding2 dd = new Dding2();
		Thread thread = new Thread(dd);
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try{Thread.sleep(500);}
			catch(Exception e) {}
		
	}
}
