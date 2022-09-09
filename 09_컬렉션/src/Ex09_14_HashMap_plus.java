import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex09_14_HashMap_plus {
	public static void main(String[] args) { //Map의 key와 value를 한번에 Set으로 만들어 출력하는 방법
		
		HashMap<String, Integer> hm = new HashMap<String,Integer>();
		hm.put("가", 1);
		hm.put("나", 2);
		hm.put("다", 3);
		hm.put("라", 4);
		
		Set<Map.Entry<String, Integer>> s = hm.entrySet(); //entrySet() : keySet(), values() 메서드가 아닌 한번에 key와 value를 Set으로 만드는 메서드
		
		Iterator<Map.Entry<String, Integer>> iter = s.iterator();
		
		while(iter.hasNext()) {
			Map.Entry<String, Integer> entry =  iter.next();
			String key = entry.getKey();
			int value = entry.getValue();
			
			System.out.println(key + ":" + value);
		}

	}
}
