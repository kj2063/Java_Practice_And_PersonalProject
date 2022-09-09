package 연습;

enum Week {  //public enum(class X) 열거타입이름 { ...} //열거타입을 선언하기 위한 키워드
	월요일,			//열거타입이름은 소스 파일명과 대소문자가 모두 일치해야 한다.	   	
	화요일,						   
	수요일,
	목요일,
	금요일,			//만약 열거 상수가 여러 단어로 구성될 경우에는 단어 사이를 밑줄로 연결하는것이 관례이다.
	토요일,			//ex) 월요일_화요일
	일요일
}

/*
class Fruit {
	public Static final Fruit APPLE = new Fruit();
	public Static final Fruit PEACH = new Fruit();
	public Static final Fruit BANANA = new Fruit();
}
*/
// enum을 통해 다음과 같이 간단하게 나타 낼 수 있다. + 추가 색깔 정보
enum Fruit {
	APPLE("red"), PEACH("pink"), BANANA("yellow");
	public String color;
	Fruit(String color){
		System.out.println("Call constructor " + this); // enum은 사실상 class, 생성자(constructor)를 만들 수 있다.
		this.color = color;								// 생성자는 Fruit 변수가 선언되고 초기화 될때 열거상수의 수 많큼 실행된다.
	}													// 해봤는데 선언만 할때는 실행이 안된다.
}	

public class p171_열거타입 {
	public static void main(String[] args) {
		//enumeration type(enum) 열거타입
		//요일: 월화수목금토일  계절:봄여름가을겨울
		//이와같이 한정된 값만을 갖는 데이터 타입을 열거타입이라고 한다.
		
		//열거파일 만들기 => enum Week 참고.
		//다른 소스 파일을 만들어 enum을 정의할때는 public enum Week{...} 라고 쓴다. 
		//그리고 같은 package 같은 파일안에 정의할때 public enum ~으로 정의 하면 오류가 뜨는데
		//?? 왜 같은 패키지에 있는데 public을 쓴다고 오류가 나지? 아직 잘 모르겠다.
		
		
		Week today = Week.월요일;
		// 열거 타입은 class와 다르게 new를 사용하여 선언 하지 않네?
		Week[] weekarr = Week.values(); // .values()를 사용하면 이렇게 array에 열거 상수를 담을수 도 있다.
		
		
		System.out.println(today); //월요일
		
		for(int i=0; i<weekarr.length;i++) 
			System.out.print(weekarr[i] + " ");
		
		//=============================================
		System.out.println("\n======================");
		
		for(Fruit type : Fruit.values()) {
			switch(type) {
			case APPLE:
				System.out.println("사과색 = " + Fruit.APPLE.color);
				break;
			case PEACH:
				System.out.println("복숭아색 = " + Fruit.PEACH.color);
				break;
			case BANANA:
				System.out.println("바나나색 = " + Fruit.BANANA.color);
				break;
			default:
				System.out.println("주어진 과일이 아닙니다.");
			}
		}
		
		System.out.println("======================");
		System.out.println("그외의 여러 열거_mthod");
		
		System.out.println("Fruit.APPLE.name() : " + Fruit.APPLE.name());  // .name() 를 쓰면 열거타입을 정의 할때 사용한 상수 이름을 리턴
		System.out.println("Week.금요일.ordinal() : " + Week.금요일.ordinal()); //전체 열거 객체 중 몇번째 열거 객체인지 알려준다 
		
		Week 월 = Week.월요일;
		Week 수 = Week.수요일;
		int result1 = 월.compareTo(수);
		int result2 = 수.compareTo(월);
		System.out.println("월.compareTo(수) : " + result1 ); //매개 값으로 주어진 열거 객체를 기준으로 전 후로 몇번째 위치하는지 비교.
		System.out.println("수.compareTo(월) : " + result2 );
		
		Week weekday = Week.valueOf("화요일");
		System.out.println("Week.valueof(\"화요일\") : " + weekday ); // 매개값으로 주어지는 문자열과 동일한 문자열을 가지는 열거 객체를 리턴.
																	// Week 안의 열거 객체를 참조하여 출력
		
		
	}
}
