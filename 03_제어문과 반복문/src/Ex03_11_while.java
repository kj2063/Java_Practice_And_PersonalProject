
public class Ex03_11_while {
	public static void main(String[] args) {
				
		for(int i=1;i<=5;i++)
			System.out.printf("Hello%d\n",i);
		
		System.out.println();
		
		int i = 1;
		while(i<=5) {
			System.out.printf("Hello%d\n",i);
			i++;
		}
		System.out.println("while �� ��_\"i�� ���\" :" + i);
	
		
		// while�� �Ἥ 10 9 8.. ���
		
		i=10;
		while(i>=1) {
			System.out.printf("%d ",i);
			i--;
		}
		//while�� ����� do~while���� �ִ�.
		/*
		�ʱ��;
		do {
			�ݺ��� ����;
		} while(���ǽ�);
		*/
		System.out.println("\n------------------");
		System.out.println();
		
		i=1;
		do { // while�� �ٸ���. ��� �ѹ��� ������ �����Ѵ�.
			System.out.println("Hello"+ i);
			i++;
		} while(i<6);
		
		System.out.println("do~while�� ��_\"i�� ���\"" + i);
	}
}
