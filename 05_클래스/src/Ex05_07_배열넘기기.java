
public class Ex05_07_�迭�ѱ�� {
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50,60,70}; // arr �����ȿ� ù��° �� �ּҰ� ����.
		System.out.println("arr[1] : " + arr[1]);
		sub(arr);
		System.out.println("arr[1] : " + arr[1]);
		Ex05_07_�迭�ѱ�� ex = new Ex05_07_�迭�ѱ��();
		ex.sub2();
		
	}
	
	static void sub(int[] des) {
		System.out.println("sub");
		for(int i=0; i<des.length; i++) {
			System.out.print(des[i] + " ");
		}
		
		des[1] = 100;//�ּҰ� �Ѿ�� (*�߿�:�迭�� �Ѿ�°��� �ƴϴ�!), ���� des[1]�� �����ϸ� arr[1]�� �ּҸ� �����ϴ°Ͱ� ����.
		System.out.println();	
		//return; //�����Ǿ�����. 
	}
	
	void sub2() {
		System.out.println("sub2");
	}
	
}
