
public class Ex07_02 {
	public static void main(String[] args) {
		
		String str1 = "";//�ƹ��͵� ���� ������ = "" �� �־���� �ʱ�ȭ�� �ȴ�.
		System.out.println(str1);
		System.out.println(str1.length());// String class�� ����Ҷ� .length() �� ����ϸ� ������ ������ �� �� �ִ�.
		
		try{//String str = "bananan";
			String str = null;// �ν��Ͻ� ���� �϶� class�� �⺻���� null�� ������ ���� ���� �϶��� null �� �־���� �Ѵ�.
			System.out.println(str);
			System.out.println(str.length());//NullPointerException �߻��� �ش� ��ü�� �������. new NullPointerException()
			
			System.out.println("������");// error�߻�-> ��ü���� -> ��ü�� ���� �� �ִ� catch �� �ٷ� �´�. //���� �ش� �ڵ�� ������� �ʴ´�.
			
			// NullPointerException e <= new NullPointerException() //������ ��ü�� ���� �� �ִ� ������ ������ ����.
		} catch(NullPointerException e) {
			System.out.println("����ó�� ��ƾ ����");
			//return; // ������ ���� �Ʒ��� �ڵ���� ������� �ʰ� ����ȴ�. 
		} finally {
			System.out.println("finally �κ�");//finally�κ��� ���ܰ� �߻� �ϴ� ���ϴ� ����.
		}
		
		System.out.println("���α׷� ����");//error�� �� ���� �ڵ�� ������ ���� �ʴ´�. ������ ����ó���� �Ͽ� ������ �� �� �ִ�.
	}
}
