
public class Ex03_04_switch_case {
	public static void main(String[] args) {
		
		int num = 2;
		
		
		switch(num+1) { //switch() 괄호 안에 수식이 들어가도 된다. but 오직 정수형,문자열,수식만 들어 갈 수 있다. 실수형은 안된다.
			case 1:
				System.out.println("1입니다");
				System.out.println("one");
				break; //빠져나가라
			case 2:
				System.out.println("2입니다");
				System.out.println("two");
				break;
			case 3:
				System.out.println("3입니다");
				System.out.println("three");
				break;
			default: // 어느것도 해당 되지 않을때 실행하는 명령. 있어도 되고 없어도 됨. 없을경우 해당되는 case가 없을경우 pass됨.
				System.out.println("1~3의 수가 아닙니다.");
				//break; // 안써도 되는데 써도됨 미관상 이쁘자너
		}
		System.out.println("switch~case 공부하는 중");
		
	}
}
