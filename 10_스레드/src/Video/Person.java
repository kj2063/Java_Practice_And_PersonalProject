package Video;

public class Person extends Thread {
	
	Person(String name){
		super(name); //Thread(name); //������ �̸��� name���� ��
	}
	

	public void run() {
		String movie;
		try {
			movie = Main.vs.lendVideo();

			System.out.println(getName() + ":" + movie + "������");
			System.out.println(getName() + ":" + movie + "������");


			sleep(3000);
			
			System.out.println(getName() + ":" + movie + "�ݳ�");
			Main.vs.returnVideo(movie);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
//		System.out.println(getName() + ":" + movie + "�ݳ�");
//		Main.vs.returnVideo(movie);
	}
	
}
