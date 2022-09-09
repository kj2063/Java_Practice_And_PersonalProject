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
		
		Movie m1 = new Movie("모가디슈", 15);
		Movie m2 = new Movie("싱크홀", 12);
		Movie m3 = new Movie("미나리", 19);
		
		movie.put("CGV", m1);
		movie.put("롯데시네마", new Movie("싱크홀",12));
		movie.put("서울극장", m3);
		movie.put("CGV", m3);
		
		System.out.println(movie.size());
		System.out.println(movie);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("영화관 입력:");
//		String theater = sc.next();
//		
//		if(movie.containsKey(theater)) {
//			System.out.println("영화 : " + movie.get(theater));
//		}
//		else {
//			System.out.println("영화관 잘못 입력");
//		}
		
		/*
		영화관:영화/나이제한
		출력해보기
		*/
		Set<String> key = movie.keySet();
		Iterator<String> iter = key.iterator();
		
		while(iter.hasNext()) {
			String s = iter.next();
			System.out.println(s + ":" + movie.get(s));
		}	
//		for(String a : key)
//			System.out.println(a + ":" + movie.get(a)); //확장 for문으로 Set을 다음과 같이 간단하게 출력 할 수 있따.
		
		Movie m4 = new Movie("스파이더맨", 7);
		System.out.println(movie);
		
		movie.replace("CGV", m4);//해당key 값의 value 변경
		System.out.println(movie);
		
		movie.remove("CGV"); //해당 key,value 지움
		System.out.println(movie);
		System.out.println(movie.isEmpty());
		
		movie.clear(); //싹다 지움
		System.out.println(movie);
		System.out.println(movie.isEmpty());
		
	}
}
