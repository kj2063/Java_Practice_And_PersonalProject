
class Product{
	private String code;
	private String name;

	Product(String code, String name){
		this.code = code;
		this.name = name;
	}
	
	public void display(){//display(this) 로 써야 하지만 this를 생략하여 쓴다.
		//제품 코드에 s가 있네? => 삼성입니다.
		// L이 있네 => LG입니다.
		//그밖의 경우 => 다이슨 입니다. 출력
		if (code.contains("S")) {
			System.out.println("삼성 입니다");
		}
		else if(code.contains("L")){
			System.out.println("LG 입니다");
		}
		else {
			System.out.println("다이슨 입니다");
		}
	}	
	
}


public class Ex09_04_권준 {
	public static void main(String[] args) {
		
		Product[] p={
						new Product("S01","TV"),
						new Product("L03","냉장고"),
						new Product("D04","드라이기")
					};
		
		for(int i=0; i<p.length; i++) {
			p[i].display();// p1.display(p1) 이지만 괄호안의 p1이 생략하여 쓴다. display메서드에선 this로 받는다.
		}
		
		
	}
}
