package ����;

public class p219_method_�Ű������𸦶� { //main class �� ���� class���� calculor method �ۼ�
	public static void main(String[] args) {
		
		int[] values = {2,3,5}; //array�� ����� method�� �ִ��� or 
		int result1 = sum_method1(values); // int[] result1 = sum_method1(new int[] {2,3,5}); �̷��� �ٷ� ������ ���� ����.
		System.out.println("method1 ��� =" + result1);
		
		
		int result2 = sum_method2(2,3,5);
		System.out.println("method2 ��� =" + result2);
	}//main 
	
	static int sum_method1(int[] values) { // ���� Ŭ������ method�� ����� ��ü ���� ���� method�� ȣ���ϹǷ� static
		int sum = 0;
		for(int value: values) {
			sum += value;
		}
		return sum;
	}//sum_method1
	
	static int sum_method2(int ... values) { //int[] values�� ����Ͽ� �Ű������� ���� �� �� �� ������ 
		int sum = 0; 						 //�׷��� �Ű������� array�� ���� ���� �ؾ� �ϱ� ������ �̿Ͱ��� �����ϸ� �Ű������� array�� ���� ������ �ʾƵ� �ȴ�.
		for(int value: values) { 
			sum +=value;
		}
		return sum;
	}//sum_method2
	
}
