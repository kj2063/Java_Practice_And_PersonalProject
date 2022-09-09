package 연습;

class calculator { //main class 와 다른 class를 만들어 calculor method 작성
	int sum_method1(int[] values) { //매개변수를 정의하는 2가지 방법
		int sum = 0;				//이 경우 method를 사용하려면 매개변수의 array를 따로 만들어야 사용 가능하다.
		for(int value:values) {
			sum += value;
		}
		return sum;
	}
	
	int sum_method2(int ... values) {
		int sum = 0;
		for(int value: values) {
			sum +=value;
		}
		return sum;
	}
}

public class p219_method_매개변수모를때2 {
	public static void main(String[] args) {
		
		calculator cal = new calculator();
		
		int[] values = {2,3,5};
		int result1 = cal.sum_method1(values);
		System.out.println("method1 result = " + result1);
		
		
		int result2 = cal.sum_method2(2,3,5); 
		System.out.println("method2 result = " + result2);
		
	}
}
