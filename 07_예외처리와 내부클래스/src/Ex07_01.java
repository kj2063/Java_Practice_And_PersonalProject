
public class Ex07_01 {
	public static void main(String[] args) {
		
		String str1 = "";//�ƹ��͵� ���� ������ = "" �� �־���� �ʱ�ȭ�� �ȴ�.
		System.out.println(str1);
		System.out.println(str1.length());// String class�� ����Ҷ� .length() �� ����ϸ� ������ ������ �� �� �ִ�.
		
		String str = null;// �ν��Ͻ� ���� �϶� class�� �⺻���� null�� ������ ���� ���� �϶��� null �� �־���� �Ѵ�.
		System.out.println(str);
		System.out.println(str.length());//NullPointerException
		
		System.out.println("���α׷� ����");//error�� �� ���� �ڵ�� ������ ���� �ʴ´�.
	}
}
