
public class Ex03_12_break_continue {
	public static void main(String[] args) {
		
		int i,j;
		for(i=1;i<=10;i++) {
			System.out.printf("%d ",i);
			if(i==5) {
				break;// '반복문'을 빠져나가라
			}
		}
		
		System.out.println("여기");
		
		for(i=1;i<=10;i++) {
			if(i==5) {
				continue;// '반복문'의 증감식으로 바로 간다. 따라서 5일때는 print가 되지 않는다.
			}
			System.out.printf("%d ",i);
		}
		
		System.out.println("여기");
		System.out.println();
		
		for(i=1;i<=2;i++) {
			for(j=5;j<=7;j++) {
				System.out.printf("%d,%d\n",i,j);
				if(j==6)
					break;//가장 가까운 반복문을 빠져나간다.		
			}
			if(i==1)
				break;
		}
		
		
		
	}
}
