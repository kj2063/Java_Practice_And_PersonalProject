package Video;

public class Person extends Thread {
	
	Person(String name){
		super(name); //Thread(name); //Ω∫∑πµÂ ¿Ã∏ß¿ª name¿∏∑Œ «‘
	}
	

	public void run() {
		String movie;
		try {
			movie = Main.vs.lendVideo();

			System.out.println(getName() + ":" + movie + "∫Ù∑»¿Ω");
			System.out.println(getName() + ":" + movie + "∫∏¥¬¡ﬂ");


			sleep(3000);
			
			System.out.println(getName() + ":" + movie + "π›≥≥");
			Main.vs.returnVideo(movie);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
//		System.out.println(getName() + ":" + movie + "π›≥≥");
//		Main.vs.returnVideo(movie);
	}
	
}
