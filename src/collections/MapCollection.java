package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapCollection {

	public static void main(String[] args) {
		
		Map map1 = new HashMap();
		
		map1.put("Thirty",30); // (k,v ) pairs
		map1.put("Fifty",50);
		map1.put("Twenty",20);
		map1.put("Ten",10);
		map1.put("Fourty",40);
		map1.put("Sixty",10);
		map1.put("Sixty",null);
		map1.put(null,null);
		
		System.out.println(map1);
		
		System.out.println(map1.get("Sixty"));
		
		System.out.println(map1.containsKey("Sixty"));
		System.out.println(map1.containsValue(10));
		System.out.println(map1.size());
		
		System.out.println(map1.values());
		
		System.out.println(map1.keySet());
		
		Map map2 = new LinkedHashMap();
		
		map2.put("Thirty",30); // (k,v ) pairs
		map2.put("Fifty",50);
		map2.put("Twenty",20);
		map2.put("Ten",10);
		map2.put("Fourty",40);
		map2.put("Sixty",10);
		
		System.out.println(map2);
		
		Map<String,Integer> map3 = new Hashtable<>();
		
		map3.put("Thirty",30); // (k,v ) pairs
		map3.put("Fifty",50);
		map3.put("Twenty",20);
		map3.put("Ten",10);
		map3.put("Fourty",40);
		map3.put("Sixty",10);
//		map3.put("Seventy",null);
//		map3.put(null,70);
		
		System.out.println(map3);
		
		Set<Map.Entry<String, Integer>> entrySet = map3.entrySet();
		
		System.out.println(entrySet);
		
		for(Map.Entry<String,Integer> eachEntry:entrySet) {
			System.out.println(eachEntry);
			
			System.out.println(eachEntry.getKey());
			System.out.println(eachEntry.getValue());
		}

	}

}
