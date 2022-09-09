import java.util.HashSet;

public class Ex09_10_HashSet {
	public static void main(String[] args) {
		
		
		HashSet<String> hs = new HashSet<String>();
		System.out.println(hs.size());
		hs.add("웬디");
		hs.add("슬기");
		hs.add("조이");
		hs.add("웬디");//set은 중복을 허용하지 않는다.
		System.out.println(hs.size());
		System.out.println(hs.toString());
		System.out.println(hs.contains("슬기"));
		System.out.println(hs.contains("아이유"));
		hs.remove("슬기");
		System.out.println(hs);
		
		System.out.println(hs.remove("조이"));
		System.out.println(hs);
		
	
	}
}
