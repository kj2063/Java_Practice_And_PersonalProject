import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex09_14_HashMap_plus {
	public static void main(String[] args) { //Map�� key�� value�� �ѹ��� Set���� ����� ����ϴ� ���
		
		HashMap<String, Integer> hm = new HashMap<String,Integer>();
		hm.put("��", 1);
		hm.put("��", 2);
		hm.put("��", 3);
		hm.put("��", 4);
		
		Set<Map.Entry<String, Integer>> s = hm.entrySet(); //entrySet() : keySet(), values() �޼��尡 �ƴ� �ѹ��� key�� value�� Set���� ����� �޼���
		
		Iterator<Map.Entry<String, Integer>> iter = s.iterator();
		
		while(iter.hasNext()) {
			Map.Entry<String, Integer> entry =  iter.next();
			String key = entry.getKey();
			int value = entry.getValue();
			
			System.out.println(key + ":" + value);
		}

	}
}
