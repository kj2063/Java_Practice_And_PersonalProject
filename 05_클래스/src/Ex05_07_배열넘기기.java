
public class Ex05_07_배열넘기기 {
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50,60,70}; // arr 변수안에 첫번째 방 주소가 들어간다.
		System.out.println("arr[1] : " + arr[1]);
		sub(arr);
		System.out.println("arr[1] : " + arr[1]);
		Ex05_07_배열넘기기 ex = new Ex05_07_배열넘기기();
		ex.sub2();
		
	}
	
	static void sub(int[] des) {
		System.out.println("sub");
		for(int i=0; i<des.length; i++) {
			System.out.print(des[i] + " ");
		}
		
		des[1] = 100;//주소가 넘어간것 (*중요:배열이 넘어가는것이 아니다!), 따라서 des[1]을 변형하면 arr[1]의 주소를 변형하는것과 같다.
		System.out.println();	
		//return; //생략되어있음. 
	}
	
	void sub2() {
		System.out.println("sub2");
	}
	
}
