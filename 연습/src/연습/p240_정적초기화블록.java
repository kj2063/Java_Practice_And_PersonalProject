package ����;

class Television {
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	static String info_test = company + "-" + model;
	
	static { //���� �ʵ�� �����ڿ��� �ʱ�ȭ �� �� �����Ƿ� ������ ���� �ʱ�ȭ �� �� �ִ�.
			 // �ٵ� �׳� ���� �ʵ� �����Ҷ� �ʱ�ȭ �ϸ� �Ǵ°� �Ƴ�?? �� �̷� ����� ����ؼ� �ʱ�ȭ �ұ�...
		info = company + "-" + model;
	}
}

public class p240_�����ʱ�ȭ��� {
	public static void main(String[] args) {
		
		System.out.println(Television.info);
		System.out.println(Television.info_test);
		
	}
}
