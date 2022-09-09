package ����;

class Singleton { //��ü ���α׷����� �� �ϳ��� ��ü�� ���鵵�� �����ؾ� �ϴ� ��� 
	
	private static Singleton st = new Singleton();
	
	private Singleton() { //�����ڸ� private�� ����� �ٸ������� �������� ���ϰ� �����.
	 System.out.println("�̱��� �Դϴ�.");
	}

	static Singleton getInstance() {//���⼭ Singleton �� ����Ÿ���� �ǹ�
		return st;					//�ܺο��� ��ü�� ��� ������ ����� getInstance() �޼ҵ带 ȣ���ϴ� �����
	}
}

public class p243_�̱���_singleton {
	public static void main(String[] args) {
		//Singleton st_main = new Singleton(); //��ü�� ������ �� ����.
		Singleton.getInstance();
		//or
		Singleton result = Singleton.getInstance();
		System.out.println(result); // ��ü ���� �ּ� ��Ÿ�� ...
	}
}
