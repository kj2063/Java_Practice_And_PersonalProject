
public class Ex03_16_���� {
	public static void main(String[] args) {
		
		int i, j, sum;
		System.out.println("1�� ����:\n");
		System.out.println("for�� �ѹ��� ����Ͽ� ���");
		for(i=1;i<=10;i++) {
			sum = 0;
			j = 1;
			while (j<=i*10) {
				sum += j;
				j++;
			}
			System.out.printf("1~%d=%d\n",i*10,sum);
		}
		
		
		System.out.println("\nfor�� �ι� ����Ͽ� ���");
		for(i=10;i<=100;i+=10) {
			sum = 0;
			for(j=1;j<=i;j++)
				sum += j;
			System.out.printf("1~%d=%d\n",i,sum);
		}
		
		System.out.println("-------------------------");
		System.out.println("\n2�� ����:\n");
		
		
		System.out.println("for�� �ѹ��� ����Ͽ� ���");
		for(i=1;i<=10;i++) {
			sum = 0;
			j = i*10-9;
			while (j<=i*10) {
				sum += j;
				j++;
			}
			System.out.printf("%d~%d=%d\n",j-10,i*10,sum);
		}
		
		
		
		System.out.println("\nfor�� �ι� ����Ͽ� ���");
		for(i=10;i<=100;i+=10) {
			sum = 0;
			for(j=i-9;j<=i;j++)
				sum += j;
			System.out.printf("%d~%d=%d\n",j-10,i,sum);
		}
		//==========================================================
		/* �ٸ������ Ǯ��
		//����
		
		int sum1=0;
		for(int i=1;i <101;i++) {
			sum1 = sum1+i;
			if(i%10==0) {
				System.out.println("1~"+i+"="+sum1);
			}
		}
		
		
		System.out.println("======================");
		
		
		int sum2=0;
		for(int i=1; i<=100; i++) {
			sum += i;
			if(i%10==0) {
				System.out.println(i-9 + "~" + i + "=" + sum2);
				sum2 = 0;
			}
		}
		*/
	}
}
//����for�� and for�� �Ѵ� ����ؼ� �غ���
/*
1������ 

1~10���� �հ�
1~20���� �հ�
...
1~100���� �հ�
*/
	
/*
2������
	
1~10���� �հ�
11~20���� �հ�
21~30���� �հ�
...	
91~100���� �հ�
*/	