//import java.lang.*; java.lang ��Ű���� �ִ� Ŭ�������� ���� import���� �ʾƵ� �ڵ����� �ҷ��� �ش�. ���� ���� ������...


public class Ex08_05_StringBuffer {
	public static void main(String[] args) {
		
		//StringBuffer sb = "java"; //String ó�� ���ڿ��� ó���� �� �ִ� class. String �� �ٸ��� ������ ���� ��������� �ʴ´�.
		
		StringBuffer sb = new StringBuffer("java");
		StringBuffer sb2 = new StringBuffer("java");
		
		System.out.println(sb.equals(sb2)); //Object.equals() ������ ���� �ּҸ� ��
		
		//String ���� �Ұ����� class
		//StringBuffer ���� ������ class
		String str1 = "Have";
		String str2 = " a";
		String str3 = " nice day";
		String str4 = str1 + str2 + str3;
		System.out.println(str4);
		
		String str5 = str4.replace("nice", "good");//"good" �� ���� ���ο� �ּҰ� �������.
		System.out.println(str5);
		
		System.out.println();
		
		
		
		StringBuffer sb3 = new StringBuffer("Have");
		sb3.append(" a"); //StringBuffer.append(" a") : ������ �ּ� ������� " a"�� �߰���.  
		sb3.append(" nice day");
		StringBuffer sb4 = sb3.replace(7,11,"good"); // ���ڿ��� 7��°���� 11��° �ձ��� �ִ� ���ڸ� "good"���� ������
		System.out.println(sb4);
		
	}
}
