
public class Ex02_03_���� {
	public static void main(String[] args) {
		
		int a=5, b=5, aa, bb;
		
		System.out.println("a="+ a);
		
		//a = a+1
		//a += 1;
		//a++; // 1���� ������
		//a--; --a; // 1���� ������
		++a;
		System.out.println("a="+ a);
		
		aa = ++a;//�ܵ����� ������ a++ �� ++a�� ������ �տ� �ٸ� �����ڰ� ������ �ٸ� �ǹ̸� ���´�.
			     //++�� �տ� ������, ����~ ��� �ǹ�, a�� +1�� ���� �ϰ��� �ٸ� ������ �ض� ��� �ǹ� 
		System.out.println("a=" + a + "  aa=" + aa);
		
		bb = b++;//++�� �ڿ� ������, ���߿�~ ��� �ǹ�, b�� �ְ� ����(�ٸ� ������ �ϰ� ����) 1������
		System.out.println("b=" + b + "  bb=" + bb);

		int i = 10;
		System.out.println(i); //10
		System.out.println(i++); //10
		System.out.println(i++); //11
		System.out.println(++i); //13
		System.out.println(i++); //13
		System.out.println(i + "\n"); //14
		
		System.out.println(i); //14
		System.out.println(i--); //14
		System.out.println(i--); //13
		System.out.println(--i); //11
		System.out.println(i--); //11
		System.out.println(i); //10
	}
}
