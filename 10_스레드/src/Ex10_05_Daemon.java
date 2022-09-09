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
		System.out.println("�۾� ȭ���� �ڵ�����Ǿ����ϴ�.");
	}
}

public class Ex10_05_Daemon { //���󽺷��� => �� �����尡 �����ϴ� �߿� �����۾��� �ϴ� ����������/ �� �����带 ������ ���������嵵 ���������� ����ȴ�. ex)������ �ڵ�����,ȭ���ڵ����� ��...

	static boolean autosave = false;
	
	public static void main(String[] args) {
		
		
		DaemonTest d = new DaemonTest();
		
		System.out.println("main");
		d.setDaemon(true);//d��ü�� class�� run �޼��尡 ���󽺷��尡 �ȴ�.
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
		System.out.println("�۾��� �����մϴ�");
	}
}
