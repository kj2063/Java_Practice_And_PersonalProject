class Count {
	static int a;//��ü ������ �ڵ����� 0�� �� //static �̹Ƿ� ��ü ������ �������� �ּ� 1���� �����ȴ�.
	int b;//��ü ������ �ڵ����� 0�� �� 
	void increment() {
		int c=0; //�������� : ��ü ������ ���� 0 �� �ȵǹǷ� �� �ʱ�ȭ�� ���־�� ��
		a++;
		b++;
		c++;
		System.out.println("static ���� a: " + a);
		System.out.println("�ν��Ͻ� ���� b: " + b);
		System.out.println("���� ���� c: " + c);
		System.out.println();
	} // increment
	
	/*
	void abc() {
		System.out.println(c);
	}
	*/
} // Count


public class Ex05_08_���� { // �������: Ŭ���� �ȿ� �ִ� ���� , �ν��Ͻ�����, ��������, static����(Ŭ��������), �Ű�����, ��������
	public static void main(String[] args) {
		System.out.println("��ü1 ����");
		Count c1 = new Count();
		c1.increment();
		c1.increment();
		
		System.out.println();
		
		System.out.println("��ü2 ����");
		Count c2 = new Count();
		c2.increment();
		c2.increment();
		
		System.out.println();
		
		System.out.println("��ü3 ����");
		Count c3 = new Count();
		c3.increment();
		c3.increment();	
		
		System.out.println("___________________");
		
		for(int i = 1; i<4; i++) {
			System.out.print(i+"  ");
		}
	}
}
/*
�������(��������?): Ŭ���� �ȿ� �����鼭 �޼��� �ȿ��� ���� ����  
��������
�ν��Ͻ�����: �������� => ��ü������, �Ҹ���� =>
static����(Ŭ��������): �������� => ~~ �����ȴ�, �Ҹ���� =>
��������: �������� => ~~ �����ȴ�, �Ҹ���� =>
�Ű�����
*/