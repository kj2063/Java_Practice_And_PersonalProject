import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class Movie {
	private String name;
	private int age;
	
	public Movie(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		
		return name + "/" + age ;
	}
	
}

public class Ex09_14_HashMap {
	public static void main(String[] args) {
		
		HashMap<String, Movie> movie = new HashMap<String, Movie>();
		
		Movie m1 = new Movie("�𰡵�", 15);
		Movie m2 = new Movie("��ũȦ", 12);
		Movie m3 = new Movie("�̳���", 19);
		
		movie.put("CGV", m1);
		movie.put("�Ե��ó׸�", new Movie("��ũȦ",12));
		movie.put("�������", m3);
		movie.put("CGV", m3);
		
		System.out.println(movie.size());
		System.out.println(movie);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("��ȭ�� �Է�:");
//		String theater = sc.next();
//		
//		if(movie.containsKey(theater)) {
//			System.out.println("��ȭ : " + movie.get(theater));
//		}
//		else {
//			System.out.println("��ȭ�� �߸� �Է�");
//		}
		
		/*
		��ȭ��:��ȭ/��������
		����غ���
		*/
		Set<String> key = movie.keySet();
		Iterator<String> iter = key.iterator();
		
		while(iter.hasNext()) {
			String s = iter.next();
			System.out.println(s + ":" + movie.get(s));
		}	
//		for(String a : key)
//			System.out.println(a + ":" + movie.get(a)); //Ȯ�� for������ Set�� ������ ���� �����ϰ� ��� �� �� �ֵ�.
		
		Movie m4 = new Movie("�����̴���", 7);
		System.out.println(movie);
		
		movie.replace("CGV", m4);//�ش�key ���� value ����
		System.out.println(movie);
		
		movie.remove("CGV"); //�ش� key,value ����
		System.out.println(movie);
		System.out.println(movie.isEmpty());
		
		movie.clear(); //�ϴ� ����
		System.out.println(movie);
		System.out.println(movie.isEmpty());
		
	}
}
