package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GenericCollection {

	public static void main(String[] args) {
		
		List list1 = new ArrayList();  // Ctrl + Shift + o
		
		list1.add(10);
		list1.add(20);
		list1.add("Thity");
		list1.add(true);
		list1.add(null);
		list1.add(new GenericCollection());
		
		int int1 = (int)list1.get(0);
		int int2 = (int)list1.get(1);
		
		System.out.println(int1);
		System.out.println(int2);
//		
//		int int3 = (int)list1.get(2);
//		int int4 = (int)list1.get(3);
//		int int5 = (int)list1.get(4);
//		int int6 = (int)list1.get(5);
		
		
		
		List<Integer> list2 = new ArrayList<Integer> (); 
		list2.add(10);
		list2.add(20);
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		
		
//		Set<String> set1 = new HashSet<String>();
		
		Set<String> set1 = new HashSet<>();
		
		set1.add("Monday");
		set1.add("Tuesday");
		set1.add("Wednesday");
		set1.add("Thursday");
		set1.add("Friday");
		
//		set1.add(10);
		
		
		Map map1 = new HashMap();
		
		map1.put("One",1);
		map1.put(2,2);
		map1.put('3',3);
		
		System.out.println(map1);
		
		Map<String, Integer> map2 = new HashMap<>();
		
		map2.put("One",1);
//		map2.put("One",'A');
//		map2.put(2,2);
//		map2.put('3',3);
		
		
		

	}

}
