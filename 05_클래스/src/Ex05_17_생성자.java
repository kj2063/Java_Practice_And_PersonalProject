class Member{
	private String id;
	private String pw;
	
	
	// 이 생성자는 작성하지 않아도 Member(){} 의 형태로 존재한다.> 기본생성자
	// 하지만 매개변수가 있는 생성자를 만들면 이 생성자는 자동으로 생성되지 않는다.
	Member() {// 생성자 : 객체를 만들면 자동으로 생성자 호출 , 리턴 하지 않아도 void를 쓰면 안된다.
		System.out.println("Member() 생성자");
		id = "kim";
		pw = "1234";
	}
	
	Member(String id){ //생성자도 overloading 가능하다.
		System.out.println("Member(String s) 생성자");
		this.id = id;
		this.pw = "5678";
	}
	
	Member(String id, String pw){
		System.out.println("Member(String a,String b) 생성자");
		this.id = id;
		this.pw = pw;
	}
	
	
	void abc() {
		System.out.println("abc 메서드");
	}
	
	String getId() {
		return id;
	}
	
	String getPw() {
		return pw;
	}
}

public class Ex05_17_생성자 {// 생성자는 메서드다.
	public static void main(String[] args) {
		
		Member a = new Member(); // 정의
		Member b = new Member("choi");
		Member c = new Member("park","9876");
		
		a.abc();// 호출
		
		System.out.println();
		
		System.out.println(a.getId());
		System.out.println(a.getPw());
		
		System.out.println(b.getId());
		System.out.println(b.getPw());
		
		System.out.println(c.getId());
		System.out.println(c.getPw());

		
	}	
		
}		

//생성자, 클레스와 이름이 같은 메서드