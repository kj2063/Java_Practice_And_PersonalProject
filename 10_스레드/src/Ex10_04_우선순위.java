class Horizontal implements Runnable{
	
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("-");
		}
	}
	
}

class Vertical extends Thread{
	
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("|");
			if(i%50 == 0)
				System.out.println();
		}
	}
}

public class Ex10_04_�켱���� {
	public static void main(String[] args) {

		Horizontal h = new Horizontal();
		Thread th = new Thread(h);
		
		Vertical tv = new Vertical();
		
//		th.start();
//		tv.start();

		int i = th.getPriority();
		int j = tv.getPriority();
		System.out.println("���� �켱����:" + i);
		System.out.println("���� �켱����:" + j);//�⺻ �켱������ 5, �켱������ 1~10���� �ִ�.
		
		tv.setPriority(10); //�켱������ ���ڰ� ���� ���� ����. �켱������ ������ΰ��̹Ƿ� 9�� �Ѵٰ� �� �������ų� ������ �ʴ´�.
		i = th.getPriority();
		j = tv.getPriority();
		System.out.println("���� �켱����:" + i);
		System.out.println("���� �켱����:" + j);

		
		th.start();
		tv.start();
	}
}
