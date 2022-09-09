import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Ex09_09_Vector {
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		System.out.println(v.size());
		v.add("��");
		v.add(new String("����"));
		v.add("��");
		v.add("�ܿ�");
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
	    Enumeration<String> en = v.elements(); // .elements�� ���ŵ� ��ҵ��� Enumeration<E>���� ����.
		while(en.hasMoreElements()) {//en���� �����Ǵ°��� ��Ұ� �ϳ��� �ִ°�? ������: true/ ������: false
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
		v.remove("��");
		System.out.println(v);
		v.add("����");
		System.out.println(v);
		
		boolean b = v.isEmpty();
		System.out.println("b:" + b);
	
	
	
	}
}
