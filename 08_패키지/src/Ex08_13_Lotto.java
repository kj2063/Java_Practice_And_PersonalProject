import java.util.Scanner;

public class Ex08_13_Lotto {
	public static void main(String[] args) {

		int[] lotto = new int[6];
		int[] my = new int[6];
		int i;
		int j;
		int count = 0;
		
		//1~45 ���� ���� �ֱ�
		for(i=0; i<lotto.length; i++) {
			lotto[i] += (int)(Math.random()*45) + 1;
			
			// �ߺ� ����

			for(j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					lotto[i] = (int)(Math.random()*45) + 1;
					j=-1; //��;;; ��û �����ϴ�. �ٽ� �߻��� ������ for���� �ٽ� ���� �ٽú�
				}
			}


		}
		
		//========�� �ζ� ��ȣ===========
		Scanner sc = new Scanner(System.in);
		
		for(i=0; i<my.length; i++) {
			System.out.print("����"+(i+1)+" �Է�:");
			my[i] = sc.nextInt();
			
			if(my[i]<1 || my[i]>45) {
				System.out.println("1~45������ �� �Է��ϼ���.");
				i--;
			}
			
			//�ߺ� ��
			for(j=0; j<i; j++) {
				if(my[j] == my[i]) {
					System.out.println("�ߺ���");
					i--;
					break;
				}	
			}
			
		}
		
		
		//==========�� �ζ�,�ζ� ��ȣ ���==========
		System.out.println("====�ζ� ��ȣ====");
		for(i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println("\n");
		
		System.out.println("===�� �ζ� ��ȣ===");
		for(i=0; i<my.length; i++) {
			System.out.print(my[i] + " ");
		}
		System.out.println("\n");
		
		
		for(i=0; i<lotto.length; i++) {
			for(j=0; j<my.length; j++) {
				if(lotto[i] == my[j]) {
					count++;
				}
			}
		}
		System.out.println("���� ����: " + count + "��");
		
		switch(count) {
			case 4: System.out.println("3�� ��÷�Դϴ�"); break;
			case 5: System.out.println("2�� ��÷�Դϴ�"); break;
			case 6: System.out.println("1�� ��÷�Դϴ�"); break;
			default: System.out.println("�� �Դϴ�");
		}
		
		
	}
}
