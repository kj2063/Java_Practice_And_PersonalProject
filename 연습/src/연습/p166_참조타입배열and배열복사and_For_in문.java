package ����;

public class p166_����Ÿ�Թ迭and�迭����and_For_in�� {
	public static void main(String[] args) {
		//���� Ÿ�� �迭�� �� �׸��� ��ü�� ������ ������ �ִ�.
		//���� ��� String�� Ŭ���� Ÿ���̹Ƿ� String[] �迭�� �� �׸� ���ڿ��� �ƴ϶� ,String ��ü�� �ּҸ� ������ �ִ�.
		//��, String ��ü�� �����ϰ� �ȴ�.
 		
		
		String[] strarr = new String[3];
		
		strarr[0] = "java";
		strarr[1] = "java";
		strarr[2] = new String("java"); //���ο� "java" String ��ü ����

		System.out.println(strarr[0] == strarr[1]); // true  ���� ��ü ����
		System.out.println(strarr[0] == strarr[2]); // false  ���� �ٸ� ��ü ����
		System.out.println(strarr[0].equals(strarr[2])); //true  ���ڿ��� ���� 
		
		
		//=================================================
		System.out.println("===================");
		
		//�迭�� �ѹ� �����ϸ� ũ�⸦ ������ �� ���� ������ �� ���� ��������� �ʿ��ϴٸ�
		//���� ū �迭�� ���� ����� ���� �迭�κ��� �׸񰪵��� ���� �ؾ� �Ѵ�.
		
		
		int[] oldarr = { 1, 2, 3};
		int[] newarr = new int[5];
		
		/*
		for(int i=0; i<oldarr.length; i++)
			newarr[i] = oldarr[i]; // �̷��� for ���� ����Ͽ� ���� �ϰų�.
		*/
		System.arraycopy(oldarr, 0, newarr, 0, 3); 
		// (������arr(����) , ���������index(����) , �������arr , ���������ġ , �����Һκ���arrũ��(����))
		
		for(int i=0; i<newarr.length; i++)
			System.out.print(newarr[i] + " ");
		
		//====================================================
		System.out.println("\n===================");
		
		//���� ������ string �迭�� strarr�� ��� 
		for(String a: strarr) { //python �� for~in �� �� ����.
			System.out.println(a);
		}
		
	}
}
