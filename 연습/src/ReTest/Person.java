package ReTest;

public class Person extends Thread {
	public Person(String name) {
		super(name);
	}
	
	
	public void run() {
		try {
			String movie = Main.vs.lendVideo();

			System.out.println(getName() + ":" + movie + "�� ������");
			System.out.println(getName() + ":" + movie + "�� ������");

		
			Thread.sleep(3000);
		
			Main.vs.returnVideo(movie);
			System.out.println(getName() + ":" + movie + "�� �ݳ�");
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
}
