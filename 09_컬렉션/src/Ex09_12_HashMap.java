import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex09_12_HashMap { 
	public static void main(String[] args) {
			
		HashMap<String,Integer> hm = new HashMap<String,Integer>(); // map은 제너릭 타입에 2가지를 넣는다. <key, value>
		//Map<String,Integer> hm = new HashMap<String,Integer>();
		//다음과 같이 Map은 Interface 이므로 객체 생성은 안되지만 자식class를 받을 수 있다.
		
		System.out.println(hm.size());
		hm.put("웬디", 30);
		hm.put("조이", 25);
		hm.put("웬디", 22);//key는 중복이 안된다. 하지만 value는 중복이 가능하다. 따라서 같은 key값을 갖는 다른 value값을 put하면 나중에 넣은 value 값으로 바뀐다. 
		hm.put("슬기", 25);
		System.out.println(hm.size()); 
		System.out.println(hm); //순서가 따로 없다.
		
		Integer a = hm.get("슬기"); //.get(~) : 슬기 key에 해당하는 value를 return함.
		Integer b = hm.get("조아"); //해당되는 key가 없으면 null 값을 return 한다.
		System.out.println(a);
		System.out.println(b);
		
		boolean c = hm.containsKey("웬디"); //containsKey() : key값이 있냐? 있으면 true 없으면 false
		System.out.println(c);
		
		c = hm.containsValue(22);
		System.out.println(c);
		
		Set<String> key = hm.keySet(); //keySet() : key들만 갖고온다. 그리고 set공간에 넣는다.
		System.out.println("key : " + key);
		
		Collection<Integer> value = hm.values();
		System.out.println("value : " + value);
		
		hm.remove("슬기");
		//hm.remove("슬기",25)
		System.out.println(hm);
		
		
		System.out.print("iterator 사용하여 출력 => ");
		Iterator<String> it = key.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			int age = hm.get(name);
			
			System.out.print(name + ":" + age + " ");
		}
		System.out.println();
		
	}
}
