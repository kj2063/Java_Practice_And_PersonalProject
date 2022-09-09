import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Ex09_09_Vector {
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		System.out.println(v.size());
		v.add("봄");
		v.add(new String("여름"));
		v.add("봄");
		v.add("겨울");
		System.out.println(v.size());
		
		System.out.println("v:" + v);
		for(int i=0; i<v.size(); i++) {
			System.out.print(i + ":" + v.get(i) + " ");
		}
		System.out.println();
		
		for(String s : v) {
			System.out.print( s + " ");
		}
		System.out.println();
		
		
		System.out.print("Use Enumeration :");
	    Enumeration<String> en = v.elements(); // .elements로 열거된 요소들을 Enumeration<E>에서 나열.
		while(en.hasMoreElements()) {//en으로 관리되는곳에 요소가 하나라도 있는가? 있으면: true/ 없으면: false
			String temp = en.nextElement();
			System.out.print(temp + " ");
		}
		System.out.println();
		
		
		System.out.print("Use iterator :");
		Iterator<String> iter = v.iterator();
		while(iter.hasNext()) {
			String s = iter.next();
			System.out.print(s + " ");
		}
		System.out.println();
		
		v.remove(1);
		System.out.println(v);
		v.remove("봄");
		System.out.println(v);
		v.add("가을");
		System.out.println(v);
		
		boolean b = v.isEmpty();
		System.out.println("b:" + b);
	
	
	
	}
}
