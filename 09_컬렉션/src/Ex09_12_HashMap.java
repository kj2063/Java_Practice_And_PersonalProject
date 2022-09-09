import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex09_12_HashMap { 
	public static void main(String[] args) {
			
		HashMap<String,Integer> hm = new HashMap<String,Integer>(); // map�� ���ʸ� Ÿ�Կ� 2������ �ִ´�. <key, value>
		//Map<String,Integer> hm = new HashMap<String,Integer>();
		//������ ���� Map�� Interface �̹Ƿ� ��ü ������ �ȵ����� �ڽ�class�� ���� �� �ִ�.
		
		System.out.println(hm.size());
		hm.put("����", 30);
		hm.put("����", 25);
		hm.put("����", 22);//key�� �ߺ��� �ȵȴ�. ������ value�� �ߺ��� �����ϴ�. ���� ���� key���� ���� �ٸ� value���� put�ϸ� ���߿� ���� value ������ �ٲ��. 
		hm.put("����", 25);
		System.out.println(hm.size()); 
		System.out.println(hm); //������ ���� ����.
		
		Integer a = hm.get("����"); //.get(~) : ���� key�� �ش��ϴ� value�� return��.
		Integer b = hm.get("����"); //�ش�Ǵ� key�� ������ null ���� return �Ѵ�.
		System.out.println(a);
		System.out.println(b);
		
		boolean c = hm.containsKey("����"); //containsKey() : key���� �ֳ�? ������ true ������ false
		System.out.println(c);
		
		c = hm.containsValue(22);
		System.out.println(c);
		
		Set<String> key = hm.keySet(); //keySet() : key�鸸 ����´�. �׸��� set������ �ִ´�.
		System.out.println("key : " + key);
		
		Collection<Integer> value = hm.values();
		System.out.println("value : " + value);
		
		hm.remove("����");
		//hm.remove("����",25)
		System.out.println(hm);
		
		
		System.out.print("iterator ����Ͽ� ��� => ");
		Iterator<String> it = key.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			int age = hm.get(name);
			
			System.out.print(name + ":" + age + " ");
		}
		System.out.println();
		
	}
}
