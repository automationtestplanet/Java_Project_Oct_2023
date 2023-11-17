package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListCollection {

	public static void main(String[] args) {

		List list1 = new ArrayList();

		list1.add(true);
		list1.add(10);
		list1.add(100);
		list1.add(1000);
		list1.add(10000L);
		list1.add(100.05F);
		list1.add(100.38E46D);
		list1.add('A');
		list1.add("Java");
		list1.add(new ListCollection());
		list1.add(null);
		list1.add(100);
		list1.add(2, 10000);

		System.out.println(
				"------------------------------------------With out for loop-----------------------------------------------");
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		System.out.println(list1.get(3));
		System.out.println(list1.get(4));
		System.out.println(list1.get(5));
		System.out.println(list1.get(6));
		System.out.println(list1.get(7));
		System.out.println(list1.get(8));
		System.out.println(list1.get(9));
		System.out.println(list1.get(10));
		System.out.println(list1.get(11));
		System.out.println(list1.get(12));

		System.out.println(
				"------------------------------------------With for loop-----------------------------------------------");
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}

		System.out.println(
				"------------------------------------------With enhanced for loop-----------------------------------------------");
		for (Object eachObject : list1) {
			System.out.println(eachObject);
		}

//		int a = (int)list1.get(1);

		System.out.println((int) list1.get(1) * 3);

		System.out.println(
				"------------------------------------------With For each loop-----------------------------------------------");
		list1.forEach(eachVal -> System.out.println(eachVal));

		List list2 = new ArrayList();
		System.out.println(
				"------------------------------------------List2-----------------------------------------------");
		System.out.println(list2);

		System.out.println(list2.isEmpty());

//		System.out.println(list2.get(0));
//		for(int i=0; i<list1.size();i++) {
//			System.out.println(list2.get(i));
//		}
//		
//		for(Object eachObject:list2) {
//			System.out.println(eachObject);
//		}
//		
//		list2.forEach(eachVal-> System.out.println(eachVal));

		Iterator itr = list2.iterator();

		if (itr.hasNext()) {
			itr.next();
		}

		Iterator itr2 = list1.iterator();

		if (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		List list3 = new ArrayList();

		list3.add(30);
		list3.add(50);
		list3.add(20);
		list3.add(10);
		list3.add(40);

		System.out.println(list3);

		Collections.sort(list3);

		System.out.println(list3);

		System.out.println(list3.contains(10));

		System.out.println(list3.equals(list2));

		System.out.println(list3.indexOf(30));

	}

}
