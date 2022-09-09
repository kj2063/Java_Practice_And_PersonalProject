
public class Ex03_16_권준 {
	public static void main(String[] args) {
		
		int i, j, sum;
		System.out.println("1번 문제:\n");
		System.out.println("for문 한번만 사용하여 결과");
		for(i=1;i<=10;i++) {
			sum = 0;
			j = 1;
			while (j<=i*10) {
				sum += j;
				j++;
			}
			System.out.printf("1~%d=%d\n",i*10,sum);
		}
		
		
		System.out.println("\nfor문 두번 사용하여 결과");
		for(i=10;i<=100;i+=10) {
			sum = 0;
			for(j=1;j<=i;j++)
				sum += j;
			System.out.printf("1~%d=%d\n",i,sum);
		}
		
		System.out.println("-------------------------");
		System.out.println("\n2번 문제:\n");
		
		
		System.out.println("for문 한번만 사용하여 결과");
		for(i=1;i<=10;i++) {
			sum = 0;
			j = i*10-9;
			while (j<=i*10) {
				sum += j;
				j++;
			}
			System.out.printf("%d~%d=%d\n",j-10,i*10,sum);
		}
		
		
		
		System.out.println("\nfor문 두번 사용하여 결과");
		for(i=10;i<=100;i+=10) {
			sum = 0;
			for(j=i-9;j<=i;j++)
				sum += j;
			System.out.printf("%d~%d=%d\n",j-10,i,sum);
		}
		//==========================================================
		/* 다른방법의 풀이
		//과제
		
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
//이중for문 and for문 둘다 사용해서 해보기
/*
1번문제 

1~10까지 합계
1~20까지 합계
...
1~100까지 합계
*/
	
/*
2번문제
	
1~10까지 합계
11~20까지 합계
21~30까지 합계
...	
91~100까지 합계
*/	