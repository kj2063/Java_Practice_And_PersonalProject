
public class Ex05_09_재귀호출 {
	public static void main(String[] args) {
		show(3);
	}
	
	static void show(int cnt){ //재귀 호출 메서드: 자기가 자기를 계속 부르는것
		System.out.println("Hi:" + cnt);
		if(cnt==1)
			return;
		show(--cnt);
	}
	
	
}
