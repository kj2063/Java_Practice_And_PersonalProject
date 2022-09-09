package 연습;

class Television {
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	static String info_test = company + "-" + model;
	
	static { //정적 필드는 생성자에서 초기화 할 수 없으므로 다음과 같이 초기화 할 수 있다.
			 // 근데 그냥 정적 필드 생성할때 초기화 하면 되는거 아녀?? 왜 이런 방법을 사용해서 초기화 할까...
		info = company + "-" + model;
	}
}

public class p240_정적초기화블록 {
	public static void main(String[] args) {
		
		System.out.println(Television.info);
		System.out.println(Television.info_test);
		
	}
}
