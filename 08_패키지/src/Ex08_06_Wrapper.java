
public class Ex08_06_Wrapper { //wrapper class : �⺻ �ڷ��� 8������ ��ü�� ����� ������ ���
	public static void main(String[] args) {
		
		//�⺻�ڷ����� ��ü�� ����� ���� �� : 1������ ����
		int a = 10;
		int b = 20;
		System.out.println(a+b);
		
		Integer it1 = new Integer(11);
		Integer it2 = new Integer(22);
		System.out.println(it1 + it2);
		
		Integer it3 = 30; // new Integer(30) : autoboxing>�⺻�� �����Ͱ� ��ü���·� �ٲ�� ��
		Integer it4 = 40; // new Integer(40) 
		System.out.println(it3 + it4);
		
		int x = new Integer(50); // new Integer(50) => 50 : unboxing
		int y = new Integer(60);
		System.out.println(x+y);
		
		
		//.parseInt() & .valueOf()
		
		int i = Integer.parseInt("100"); //���ڿ� "100" -> ����(����) 100 ���� �ٲ�� //int�� return
		int j = Integer.parseInt("200"); 
 		System.out.println(i+j);
 		
 		double d1 = Double.parseDouble("123.4");
 		double d2 = Double.parseDouble("345.4");
 		System.out.println(d1+d2);
 		
 		Integer i2 = Integer.valueOf("123"); //"123" => new Integer(123)
 		//int i2 = Integer.valueOf("123"); //"123" => new Integer(123)
 		//int i2 = new Integer(123); unboxing ��.
 		
 		Integer j2 = Integer.valueOf("789"); //���ڿ� "100" -> ����(����) 100 ���� �ٲ�� //Integer�� return (��ü ���·� ����� return)
 		System.out.println(i2+j2);
 		
 		
	}
}
