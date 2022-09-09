import java.util.HashSet;
import java.util.Iterator;

public class Ex09_11_HashSet {
	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		while(true) {
			hs.add((int)(Math.random()*10) + 1);
			if(hs.size() == 6)
				break;
		}
		
		System.out.println(hs);
		
		//로또 예제 hashset으로 코드 짜보기
		
		
		System.out.print("iterator 로 출력해보기 : ");
		Iterator<Integer> iter = hs.iterator();
		
		while(iter.hasNext()) {
			Integer temp = iter.next();
			System.out.print(temp + " ");
		}
		System.out.println();
	}
}
