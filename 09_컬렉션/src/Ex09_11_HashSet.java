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
		
		//�ζ� ���� hashset���� �ڵ� ¥����
		
		
		System.out.print("iterator �� ����غ��� : ");
		Iterator<Integer> iter = hs.iterator();
		
		while(iter.hasNext()) {
			Integer temp = iter.next();
			System.out.print(temp + " ");
		}
		System.out.println();
	}
}
