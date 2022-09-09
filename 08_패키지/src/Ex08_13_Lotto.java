import java.util.Scanner;

public class Ex08_13_Lotto {
	public static void main(String[] args) {

		int[] lotto = new int[6];
		int[] my = new int[6];
		int i;
		int j;
		int count = 0;
		
		//1~45 난수 정수 넣기
		for(i=0; i<lotto.length; i++) {
			lotto[i] += (int)(Math.random()*45) + 1;
			
			// 중복 방지

			for(j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					lotto[i] = (int)(Math.random()*45) + 1;
					j=-1; //와;;; 엄청 참신하다. 다시 발생된 난수를 for문을 다시 돌려 다시비교
				}
			}


		}
		
		//========내 로또 번호===========
		Scanner sc = new Scanner(System.in);
		
		for(i=0; i<my.length; i++) {
			System.out.print("숫자"+(i+1)+" 입력:");
			my[i] = sc.nextInt();
			
			if(my[i]<1 || my[i]>45) {
				System.out.println("1~45사이의 수 입력하세요.");
				i--;
			}
			
			//중복 비교
			for(j=0; j<i; j++) {
				if(my[j] == my[i]) {
					System.out.println("중복됨");
					i--;
					break;
				}	
			}
			
		}
		
		
		//==========내 로또,로또 번호 출력==========
		System.out.println("====로또 번호====");
		for(i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println("\n");
		
		System.out.println("===내 로또 번호===");
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
		System.out.println("맞은 갯수: " + count + "개");
		
		switch(count) {
			case 4: System.out.println("3등 당첨입니다"); break;
			case 5: System.out.println("2등 당첨입니다"); break;
			case 6: System.out.println("1등 당첨입니다"); break;
			default: System.out.println("꽝 입니다");
		}
		
		
	}
}
