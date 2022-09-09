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

public class Ex10_04_우선순위 {
	public static void main(String[] args) {

		Horizontal h = new Horizontal();
		Thread th = new Thread(h);
		
		Vertical tv = new Vertical();
		
//		th.start();
//		tv.start();

		int i = th.getPriority();
		int j = tv.getPriority();
		System.out.println("가로 우선순위:" + i);
		System.out.println("세로 우선순위:" + j);//기본 우선순위는 5, 우선순위는 1~10까지 있다.
		
		tv.setPriority(10); //우선순위는 숫자가 높을 수록 높다. 우선순위는 상대적인것이므로 9로 한다고 더 빨라지거나 하지는 않는다.
		i = th.getPriority();
		j = tv.getPriority();
		System.out.println("가로 우선순위:" + i);
		System.out.println("세로 우선순위:" + j);

		
		th.start();
		tv.start();
	}
}
