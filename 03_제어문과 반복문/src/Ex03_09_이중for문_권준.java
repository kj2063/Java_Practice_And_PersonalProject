
public class Ex03_09_����for��_���� {
	public static void main(String[] args) {
		/*
		 2*1=
		 2*2=
		 ...
		 2*9=
		 ----------
		 3*1=
		 3*2=
		 ...
		 3*9=
		 ----------
		 ...
		 ----------
		 ...
		 9*9=
		 */
		int i,j;
		for(i=2;i<=9;i++) {
			System.out.printf("===%d��===\n",i);
			for(j=1;j<=9;j++) {
				System.out.printf("%d*%d=%d\n",i,j,i*j);
			}
			System.out.println("----------");
		}
		
		//===============================����====================================
		
		System.out.println("=============����=============");
		System.out.println("������ ���� ���:\n");
		for(i=1;i<=9;i++) {
			for(j=2;j<=9;j++) {
				System.out.printf("%d*%d=%d\t",j,i,i*j);
			}
			System.out.println();
		}
		System.out.println("=============================");

		
		
	}
}
