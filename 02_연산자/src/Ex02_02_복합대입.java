
public class Ex02_02_���մ��� {
	public static void main(String[] args) {
		
		int a=10, b=20, c=30, d=40, e=50;
		
		System.out.println("a="+ a);
		a += 3;//���� ���Կ����� //a = a + 3;
		System.out.println("a="+ a);

		System.out.println("b="+ b);
		b -= 7; //b = b-7;
		System.out.println("b="+ b);
		
		System.out.println("c="+ c);
		c *= 4; //c = c*4
		System.out.println("c="+ c);
		
		System.out.println("d="+ d);
		d /= 10; //d = d/10
		System.out.println("d="+ d);

		System.out.println("e="+ e);
		e %= 3; //e = e%3  //�����2
		System.out.println("e="+ e);
		
		
		String fruit = "banana";
		System.out.println("fruit="+ fruit);
		
		fruit = fruit + "apple";//���ڿ��� + ���, ���ڿ��� ������ �ǹ��Ѵ�.
		System.out.println("fruit="+ fruit); // result -> fruit = bananaapple
		
	}
}
