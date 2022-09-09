
public class Ex03_05_switch_case {
	public static void main(String[] args) {
		
		String fruit = "grape";
		
		switch(fruit) {
			case "apple":
				System.out.println("사과");
				break;
			case "grape": //grape 와 Grape에서 같은 결과 값을 보이고 싶으면 이렇게 코딩해도 됨.
			case "Grape":
				System.out.println("포도");
				break;
			case "banana":
				System.out.println("바나나");
				break;
			default:
				System.out.println("그 밖의 과일");
		}
		
		System.out.println("switch~case 공부중");
	}
}
