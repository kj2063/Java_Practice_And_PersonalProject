import java.util.ArrayList;
import java.util.Scanner;

public class Ex09_03_ArrayList { //�ſ�ſ� �߿�!!!!!  ArrayList�� List �������̽��� ����� �޴´�.
	public static void main(String[] args) {
		//collection ���� : �������� �������(�޸�)�� �÷ȴ� �ٿ��� �� �� �ִ�. ���ʸ� �ȿ��� ��ü�� ���� �� �ִ�.
		//|
		//��> List �������̽� : ������ �ִ� ������ ����, �������� �ߺ��� ��� ex)����ڸ�� =(���)=> ArrayList, LinkedList, Vector, Stack
		//��> set �������̽� : ������ ����, �ߺ��� ������� ���� ex)���� =(���)=> HashSet, SortedSet, TreeSet
		
		//map �������̽� : key�� value�� �̷���� �������� ����, ���� ����, Ű�� �ߺ� ������� ����, ���� �ߺ� ��� ex)���̽��� ��ųʸ�
		
		ArrayList<String> s = new ArrayList<String>();
		int size = s.size();
		System.out.println("size:" + size);
		
		s.add("����");
		s.add("ȿ��");
		s.add("����");
		s.add("���");
		s.add("����"); //�ߺ� ���
		size = s.size();
		
//		���� ArrayList ��ü ������ �������� �����ϰ� �� �� �ִ�.
//		List<String> s = Arrays.asList("����","ȿ��","����","���","����"); //�ٵ�, ����������� s.add(1,"����");�� �Ϸ��µ� ���ܹ߻�. ��? UnsupportedOperationException
		
		/*
		length:�迭�� ����(���� ����)
		length():���ڿ��� ����
		size(): �÷��� ���� ����� ����
		*/
		System.out.println("size:" + size);
		System.out.println("s:" + s);
		
		String s_0 = s.get(0);
		System.out.println("s_0:" + s_0);
		System.out.println("s_2:" + s.get(2));

		s.add(1,"����");// 1�� ��ġ���� "����"�� ����. 1�� ��� ���Ĵ� ��ĭ�� �ڷ� �и���.
		System.out.println("s:" + s);
		System.out.println("------------------");
		
		ArrayList<String> s1 = new ArrayList<String>();
		ArrayList<String> s3 = new ArrayList<String>();
		s1.add("����");
		s1.add("����");
		s3.add("ȿ��");
		s3.add("���");
		System.out.println("s1:" + s1);
		
		s.addAll(s1);// addAll() : collection ������ ��°�� ������ ���.
		System.out.println("s + s1:" + s);
		s.remove(1);//1��° ��ġ�� �ִ� "����"����
		System.out.println("s - '1��°s':" + s);
		s.remove("����");//ù��° ���� "����"����
		System.out.println("s - \"����\":" + s);
		s.removeAll(s1);
		System.out.println("s - s1:" + s);
		//-----
		System.out.println("s3:" +s3);
		s.removeAll(s3);//������ �޶� ���� ����
		System.out.println("s - s3:" + s);
		//-----
		
		s.set(1, "����"); //1���ڸ� "����"�� "����"���� ����
		System.out.println("s:" + s);
		
		s.add("����");
		System.out.println(s);
		
		int index1 = s.indexOf("����");// .indexof() :"����" �� ��ġ ���� ���� �´�Ʈ���� �κ��� index�� return
		System.out.println("ù��° ���� ��ġ:" + index1); 
		
		int index2 = s.lastIndexOf("����");// .lastIndexof() :"����" �� ��ġ ���� ���������� �´�Ʈ���� �κ��� index�� return
		System.out.println("������ ���� ��ġ:" + index2);
		
		int index3 = s.indexOf("����");//"����" �� ��ã���� -1�� return
		System.out.println("'����'�� ��ġ:" + index3);
		
		boolean contains = s.contains("����");// list�� "����"�� ������ true ������ false �� return
		System.out.println("contains:" + contains);
		
		System.out.println();
		
		
		System.out.println("s:" + s);
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� �Է�:");
		String name = sc.next();
		
		if(s.indexOf(name) == -1) {
			System.out.println("s�÷��� �ȿ� �����ϴ�");
		}
		else {
			System.out.println("s�÷��� �ȿ� �ֽ��ϴ�");
		}
		
		if(s.contains(name)) {
			System.out.println("s�÷��� �ȿ� �ֽ��ϴ�");
		}
		else {
			System.out.println("s�÷��� �ȿ� �����ϴ�.");
		}
		
		System.out.println("------------------");
		
		ArrayList<Integer> s2 = new ArrayList<Integer>(); // ���ʸ� �ȿ��� ��ü�� ���� �� �ִ�
		System.out.println("s2.size():" + s2.size());
		s2.add(new Integer(10));
		s2.add(new Integer(20));
		s2.add(30); //new Integer(30) => autoboxing
		
		System.out.println("s2.size():" + s2.size());
		System.out.println("s2:" + s2);
		
		Integer i = s2.get(0);
		System.out.println("i:" + i);

		
	}
}


