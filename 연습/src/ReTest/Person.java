package ReTest;

public class Person extends Thread {
	public Person(String name) {
		super(name);
	}
	
	
	public void run() {
		try {
			String movie = Main.vs.lendVideo();

			System.out.println(getName() + ":" + movie + "¸¦ ºô·ÈÀ½");
			System.out.println(getName() + ":" + movie + "¸¦ º¸´ÂÁß");

		
			Thread.sleep(3000);
		
			Main.vs.returnVideo(movie);
			System.out.println(getName() + ":" + movie + "¸¦ ¹Ý³³");
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
}
