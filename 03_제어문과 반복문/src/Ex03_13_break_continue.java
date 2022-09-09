
public class Ex03_13_break_continue {
	public static void main(String[] args) {
		
		System.out.println("구구단 세로 출력");
		
		for(int i=2;i<=9;i++) { //2,3,4,5,6,7,8,9
			if(i%2==1)
				continue; // 홀수일때 출력안한다.
			System.out.printf("=====%d단=====\n",i);
			for(int j=1;j<=9;j++) {
				if(j>i)
					break;//2단이면 2*2까지 6단이면 6*6까지 9단이면 9*9까지 나타내게 함.// break; continue; 둘다 되지만 break가 더 효율적인 코드.
				System.out.printf("%d*%d=%d\n",i,j,i*j);
			}
			System.out.println("--------------");
		}
		
		
		
	
		
	}
}
