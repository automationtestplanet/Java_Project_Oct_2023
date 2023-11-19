package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {

	public static void main(String[] args) {
		
		Set set1 = new HashSet();
		
		set1.add(true);
		set1.add(10);
		set1.add(100);
		set1.add(1000);
		set1.add(10000L);
		set1.add(100.05F);
		set1.add(100.38E46D);
		set1.add('A');
		set1.add("Java");
		set1.add(new ListCollection());
		set1.add(null);
		
		set1.add(100);
		
//		set1.add(2, 10000);
		
		System.out.println(set1);
		
//		set1.get(0);
		
		Iterator itr = set1.iterator();
		
//		while(itr.hasNext()) {
//			System.out.println(itr.next()); 
//		}
		
//		System.out.println(set1.size());
//		
//		System.out.println(set1.contains(100)); 
		
		
		Set set2 = new LinkedHashSet();
		
		set2.add(true);
		set2.add(10);
		set2.add(100);
		set2.add(1000);
		set2.add(10000L);
		set2.add(100.05F);
		set2.add(100.38E46D);
		set2.add('A');
		set2.add("Java");
		set2.add(new ListCollection());
		set2.add(null);		
		set2.add(100);
		
		System.out.println(set2);
		
		Set set3 = new TreeSet();
		set3.add(20);
		set3.add(10);
		set3.add(30);
		set3.add(50);
		set3.add(40);
		
		System.out.println(set3);

	}

}
