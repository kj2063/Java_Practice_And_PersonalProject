
public class Ex08_02_String {//String Ŭ������ �ݵ�� �˾ƾ� �ϴ� �޼���!
	public static void main(String[] args) {
		
//		String str1 = "Have a nice day";
//		String str2 = "Have a nice day";
		
		String str1 = new String("Have a nice day");
		String str2 = new String("have a nic2e day");
		String str3 = new String("hahaha");
		
//		String str1 = new String("�����ٶ󸶹ٻ������īŸ����");
//		String str2 = new String("�����ٶ󸶹ٻ������īŸ����");
//		String str3 = new String("��������");
		

		System.out.println("str1:" + str1);
		System.out.println("str2:" + str2);
		System.out.println(str1 == str2); //�ּҰ� ����? ���� ������ ��� ����. ������ ��ü�� ����� ���� ���� ������ ������ �ٸ���.
		
		System.out.println(str1.length());
		boolean b = str1.equals(str2); //.equals�� Object class�� �ִ� ���ڿ��� ���ϴ� �޼��� �̴�. 
		System.out.println("b:" + b);
		System.out.println("b1:"+str1.equals("Have"));
		
		System.out.println("b2:" + str1.equalsIgnoreCase(str2));// equalsIgnoreCase�޼��� : ��ҹ��� �����ϰ� ���϶�!
		
		int c = str1.compareTo(str2);//compareTo �޼��� : ���� ó���� �ٸ� ������ �ƽ�Ű�ڵ� ���� �������� retrun��. 
		System.out.println("c:" +c); //������ :0 / �ٸ���: 0�� �ƴ� ����
		/*
		char c1 = 'H';
		char c2 = 'h';
		System.out.println(c1-c2);
		*/
			
		int d = str1.compareToIgnoreCase(str2); //��ҹ��� ���о��� compareTo �޼��� ����
		System.out.println("d:" + d);

		String str4 = str1.concat(str3); //concat() : string Ÿ���� �̾��ִ� �޼��� // str1+str3
		System.out.println("str4:" + str4);
		
		String str5 = str1.toUpperCase();//toUpperCase() : ��� ������ �빮�ڷ� �ٲٴ� �޼���
		System.out.println("str5:" + str5);

		String str6 = str1.toLowerCase();//toLowerCase() : ��� ������ �ҹ��ڷ� �ٲٴ� �޼���
		System.out.println("str6:" + str6);
		
		int indexof = str1.indexOf("nice"); //str1 ���� nice�� ���۵Ǵ� ���� ��° ��.
		System.out.println("indexof(string):" + indexof);
		int indexof1 = str1.indexOf("happy"); //ã�� ���ڿ��� str1�� ������ -1 return
		System.out.println("indexof1(string):" + indexof1);
		
		char str1_ca = str1.charAt(3); //charAt(3) :str1�� 3��° ���ڴ� �����ΰ� // Have a nice day
		System.out.println("str1_ca:"+ str1_ca);
		
		String f = str1.substring(8); //substring(8) :str1�� 8��°������ ���� ���
		System.out.println("f:" +f);
		String f1 = str1.substring(7, 9); //substring(7,9) : str1�� 7��°���� �����ؼ� 9��° �տ��ִ� ���ڱ��� ���
		System.out.println("f1:" +f1);
		
		boolean h = str1.contains("nice"); //contains("nice") : str1�� nice �� ���ԵǾ������� true �ƴϸ� false ����.
		System.out.println("h:" +h);
		boolean h1 = str1.contains("Nice"); 
		System.out.println("h1:" +h1);
		
		String s = "   ab c  d e  f  ";
		System.out.println("s:" + s);
		System.out.println(s.length());
		String s2 = s.trim();// trim() : ���� �պκ� �޺κ��� ���� ����, ���� ���̻��� ������ ������ ����.
		System.out.println("s2:" + s2);
		System.out.println(s2.length());
		
		
	}
}	
