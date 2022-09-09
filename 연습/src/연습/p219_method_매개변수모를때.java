package 연습;

public class p219_method_매개변수모를때 { //main class 와 같은 class에서 calculor method 작성
	public static void main(String[] args) {
		
		int[] values = {2,3,5}; //array를 만들고 method에 넣던가 or 
		int result1 = sum_method1(values); // int[] result1 = sum_method1(new int[] {2,3,5}); 이렇게 바로 정의할 수도 있음.
		System.out.println("method1 결과 =" + result1);
		
		
		int result2 = sum_method2(2,3,5);
		System.out.println("method2 결과 =" + result2);
	}//main 
	
	static int sum_method1(int[] values) { // 같은 클래스에 method를 만들어 객체 생성 없이 method를 호출하므로 static
		int sum = 0;
		for(int value: values) {
			sum += value;
		}
		return sum;
	}//sum_method1
	
	static int sum_method2(int ... values) { //int[] values를 사용하여 매개변수를 정의 할 수 도 있지만 
		int sum = 0; 						 //그러면 매개변수의 array를 따로 정의 해야 하기 때문에 이와같이 정의하면 매개변수의 array를 따로 만들지 않아도 된다.
		for(int value: values) { 
			sum +=value;
		}
		return sum;
	}//sum_method2
	
}
