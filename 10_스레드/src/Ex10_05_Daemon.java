class DaemonTest extends Thread {
	public void run() {
		while(true) {
			try {
				sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if(Ex10_05_Daemon.autosave == true)
				autoSave();
		}
	}
	
	public void autoSave() {
		System.out.println("작업 화일이 자동저장되었습니다.");
	}
}

public class Ex10_05_Daemon { //데몬스레드 => 주 스레드가 동작하는 중에 보조작업을 하는 보조스레드/ 주 스레드를 끝내면 보조스레드도 강제적으로 종료된다. ex)워드의 자동저장,화면자동생신 등...

	static boolean autosave = false;
	
	public static void main(String[] args) {
		
		
		DaemonTest d = new DaemonTest();
		
		System.out.println("main");
		d.setDaemon(true);//d객체의 class의 run 메서드가 데몬스레드가 된다.
		d.start();

		for(int i=1; i<21; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(i==5)
				autosave = true;
			
		}
		System.out.println("작업을 종료합니다");
	}
}
