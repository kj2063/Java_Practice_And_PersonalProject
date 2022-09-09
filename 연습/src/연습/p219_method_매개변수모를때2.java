package ����;

class calculator { //main class �� �ٸ� class�� ����� calculor method �ۼ�
	int sum_method1(int[] values) { //�Ű������� �����ϴ� 2���� ���
		int sum = 0;				//�� ��� method�� ����Ϸ��� �Ű������� array�� ���� ������ ��� �����ϴ�.
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

public class p219_method_�Ű������𸦶�2 {
	public static void main(String[] args) {
		
		calculator cal = new calculator();
		
		int[] values = {2,3,5};
		int result1 = cal.sum_method1(values);
		System.out.println("method1 result = " + result1);
		
		
		int result2 = cal.sum_method2(2,3,5); 
		System.out.println("method2 result = " + result2);
		
	}
}
