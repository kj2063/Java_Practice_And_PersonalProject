package ����;

class AA_1{
	class BB{} // AA_1 ��ü�� ��������� BB��ü ���� �� ����
	static class CC{}
	
	BB field1 = new BB();
	CC field2 = new CC();
	
	void method1() {
		BB var1 = new BB();
		CC var2 = new CC();
	}
	
	//static BB field3 = new BB(); //error �߻�
	static CC field4 = new CC();
	
	static void method2() {//AA_1 ��ü ���� method ����
		//BB var1 = new BB(); //error �߻� : AA_1 ��ü�� �������� ������ BB ��ü�� ���� �� �����Ƿ�
		AA_1 var = new AA_1();
		var.BB var1 = var.new BB();//���� �̷��Դ� �����Ǵ� ��...
			
		CC var2 = new CC();
	}

}

public class p396_��øŬ����_�������� {
	
}
