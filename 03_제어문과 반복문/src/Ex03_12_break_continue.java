
public class Ex03_12_break_continue {
	public static void main(String[] args) {
		
		int i,j;
		for(i=1;i<=10;i++) {
			System.out.printf("%d ",i);
			if(i==5) {
				break;// '�ݺ���'�� ����������
			}
		}
		
		System.out.println("����");
		
		for(i=1;i<=10;i++) {
			if(i==5) {
				continue;// '�ݺ���'�� ���������� �ٷ� ����. ���� 5�϶��� print�� ���� �ʴ´�.
			}
			System.out.printf("%d ",i);
		}
		
		System.out.println("����");
		System.out.println();
		
		for(i=1;i<=2;i++) {
			for(j=5;j<=7;j++) {
				System.out.printf("%d,%d\n",i,j);
				if(j==6)
					break;//���� ����� �ݺ����� ����������.		
			}
			if(i==1)
				break;
		}
		
		
		
	}
}
