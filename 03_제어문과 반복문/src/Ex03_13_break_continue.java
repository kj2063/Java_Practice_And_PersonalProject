
public class Ex03_13_break_continue {
	public static void main(String[] args) {
		
		System.out.println("������ ���� ���");
		
		for(int i=2;i<=9;i++) { //2,3,4,5,6,7,8,9
			if(i%2==1)
				continue; // Ȧ���϶� ��¾��Ѵ�.
			System.out.printf("=====%d��=====\n",i);
			for(int j=1;j<=9;j++) {
				if(j>i)
					break;//2���̸� 2*2���� 6���̸� 6*6���� 9���̸� 9*9���� ��Ÿ���� ��.// break; continue; �Ѵ� ������ break�� �� ȿ������ �ڵ�.
				System.out.printf("%d*%d=%d\n",i,j,i*j);
			}
			System.out.println("--------------");
		}
		
		
		
	
		
	}
}
