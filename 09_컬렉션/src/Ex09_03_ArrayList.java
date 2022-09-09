import java.util.ArrayList;
import java.util.Scanner;

public class Ex09_03_ArrayList { //매우매우 중요!!!!!  ArrayList는 List 인터페이스의 상속을 받는다.
	public static void main(String[] args) {
		//collection 공간 : 동적으로 저장공간(메모리)을 늘렸다 줄였다 할 수 있다. 제너릭 안에는 객체만 넣을 수 있다.
		//|
		//ㄴ> List 인터페이스 : 순서가 있는 데이터 집합, 데이터의 중복을 허용 ex)대기자명단 =(상속)=> ArrayList, LinkedList, Vector, Stack
		//ㄴ> set 인터페이스 : 순서가 없고, 중복을 허용하지 않음 ex)집합 =(상속)=> HashSet, SortedSet, TreeSet
		
		//map 인터페이스 : key와 value로 이루어진 데이터의 집합, 순서 없음, 키는 중복 허용하지 않음, 값은 중복 허용 ex)파이썬의 딕셔너리
		
		ArrayList<String> s = new ArrayList<String>();
		int size = s.size();
		System.out.println("size:" + size);
		
		s.add("수영");
		s.add("효연");
		s.add("윤아");
		s.add("써니");
		s.add("수영"); //중복 허용
		size = s.size();
		
//		위의 ArrayList 객체 생성은 다음으로 간단하게 할 수 있다.
//		List<String> s = Arrays.asList("수영","효연","윤아","써니","수영"); //근데, 다음방식으로 s.add(1,"유리");를 하려는데 예외발생. 왜? UnsupportedOperationException
		
		/*
		length:배열의 길이(방의 갯수)
		length():문자열의 갯수
		size(): 컬렉션 안의 요소의 갯수
		*/
		System.out.println("size:" + size);
		System.out.println("s:" + s);
		
		String s_0 = s.get(0);
		System.out.println("s_0:" + s_0);
		System.out.println("s_2:" + s.get(2));

		s.add(1,"유리");// 1번 위치에서 "유리"를 넣음. 1번 요소 이후는 한칸씩 뒤로 밀린다.
		System.out.println("s:" + s);
		System.out.println("------------------");
		
		ArrayList<String> s1 = new ArrayList<String>();
		ArrayList<String> s3 = new ArrayList<String>();
		s1.add("웬디");
		s1.add("슬기");
		s3.add("효연");
		s3.add("써니");
		System.out.println("s1:" + s1);
		
		s.addAll(s1);// addAll() : collection 공간을 통째로 넣을때 사용.
		System.out.println("s + s1:" + s);
		s.remove(1);//1번째 위치해 있는 "유리"제거
		System.out.println("s - '1번째s':" + s);
		s.remove("수영");//첫번째 만난 "수영"제거
		System.out.println("s - \"수영\":" + s);
		s.removeAll(s1);
		System.out.println("s - s1:" + s);
		//-----
		System.out.println("s3:" +s3);
		s.removeAll(s3);//순서가 달라도 삭제 가능
		System.out.println("s - s3:" + s);
		//-----
		
		s.set(1, "권준"); //1번자리 "수영"이 "권준"으로 변경
		System.out.println("s:" + s);
		
		s.add("권준");
		System.out.println(s);
		
		int index1 = s.indexOf("권준");// .indexof() :"권준" 의 위치 가장 먼저 맞닥트리는 부분의 index를 return
		System.out.println("첫번째 권준 위치:" + index1); 
		
		int index2 = s.lastIndexOf("권준");// .lastIndexof() :"권준" 의 위치 가장 마지막으로 맞닥트리는 부분의 index를 return
		System.out.println("마지막 권준 위치:" + index2);
		
		int index3 = s.indexOf("건준");//"건준" 을 못찾으면 -1을 return
		System.out.println("'건준'의 위치:" + index3);
		
		boolean contains = s.contains("윤아");// list에 "윤아"가 있으면 true 없으면 false 를 return
		System.out.println("contains:" + contains);
		
		System.out.println();
		
		
		System.out.println("s:" + s);
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력:");
		String name = sc.next();
		
		if(s.indexOf(name) == -1) {
			System.out.println("s컬렉션 안에 없습니다");
		}
		else {
			System.out.println("s컬렉션 안에 있습니다");
		}
		
		if(s.contains(name)) {
			System.out.println("s컬렉션 안에 있습니다");
		}
		else {
			System.out.println("s컬렉션 안에 없습니다.");
		}
		
		System.out.println("------------------");
		
		ArrayList<Integer> s2 = new ArrayList<Integer>(); // 제너릭 안에는 객체만 넣을 수 있다
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


