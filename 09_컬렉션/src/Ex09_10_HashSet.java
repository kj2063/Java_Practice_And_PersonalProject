import java.util.HashSet;

public class Ex09_10_HashSet {
	public static void main(String[] args) {
		
		
		HashSet<String> hs = new HashSet<String>();
		System.out.println(hs.size());
		hs.add("����");
		hs.add("����");
		hs.add("����");
		hs.add("����");//set�� �ߺ��� ������� �ʴ´�.
		System.out.println(hs.size());
		System.out.println(hs.toString());
		System.out.println(hs.contains("����"));
		System.out.println(hs.contains("������"));
		hs.remove("����");
		System.out.println(hs);
		
		System.out.println(hs.remove("����"));
		System.out.println(hs);
		
	
	}
}
