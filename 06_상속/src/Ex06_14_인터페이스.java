
interface Copymachine{
	//abstract void copy(); ��� ��������� �������̽��� �߻�޼��常 �� �� �����Ƿ� abstract�� �����ص� �ڵ����� �ٿ��ش�.
	//�������̽��� ������ �޼���� �ڵ����� 'public' 'abstract' �� �����Ǿ��ִ�!
	void copy(); //public abstract void copy();
}//

interface Printmachine{
	void print();
}//

interface Faxmachine{
	void fax();
}//

class Compound implements Copymachine,Printmachine,Faxmachine{
	public void copy() {
		System.out.println("�����Ѵ�.");
	}
	public void print() {
		System.out.println("����Ʈ�Ѵ�.");
	}
	public void fax() {
		System.out.println("�ѽ� ������.");
	}
}//

public class Ex06_14_�������̽� {
	public static void main(String[] args) {
		//new Copymachine(); // �������̽��� ��ü ���� ���Ѵ�.

		Compound c = new Compound();
		c.copy();
		c.print();
		c.fax();
	}
}
/*
//�߻�Ŭ���� : �ϼ��ȸ޼���� �߻�޼��� ���� �־ ��.
abstract class

//�������̽� : �߻�޼��常 ��
interface ~
*/