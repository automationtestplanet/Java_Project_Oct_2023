package functional.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class BuiltInFunctionalInterfaces {

	public static void main(String[] args) {

		Function function = new Function<String, Integer>() {
			@Override
			public Integer apply(String str) {
				return 100;
			}
		};
		Function function1 = (value) -> {
			return 100;
		};
		System.out.println(function1.apply("Hello"));

		Predicate predicate = new Predicate<Integer>() {
			@Override
			public boolean test(Integer val) {
				if (val % 2 == 0) {
					return true;
				} else {
					return false;
				}
			}
		};

		Predicate predicate1 = (val) -> {
			if ((int) val % 2 == 0) {
				return true;
			} else {
				return false;
			}
		};
		System.out.println(predicate1.test(101));

		Predicate<Integer> predicate2 = (val) -> val % 2 == 0;
		System.out.println(predicate2.test(101));

		Predicate<Integer> predicate3 = val -> val % 2 == 0;
		System.out.println(predicate3.test(101));

		Consumer consumer = new Consumer<Integer>() {
			@Override
			public void accept(Integer val) {
				System.out.println(val);

			}
		};

		Consumer consumer1 = (val) -> {
			System.out.println(val);
		};
		consumer1.accept("Hello");

		Supplier supplier = new Supplier() {
			@Override
			public String get() {
				return null;
			}
		};

		Supplier supplier1 = () -> {
			return 100;
		};
		System.out.println(supplier1.get());

		List<Integer> list1 = new ArrayList<>();
		list1.add(11);
		list1.add(12);
		list1.add(13);
		list1.add(14);
		list1.add(15);
		list1.add(16);

		for (Integer eachVal : list1) {
			if (eachVal % 2 == 0) {
				System.out.println(eachVal);
			}
		}

		System.out.println(list1.stream().filter(val -> val % 2 == 0).collect(Collectors.toList()));

		list1.stream().filter(val -> val % 2 == 0).forEach(eachVal -> System.out.println(eachVal));

		list1.stream().map(eachVal -> {
			return eachVal * 10;
		}).forEach(eachVal -> System.out.println(eachVal));

		System.out.println(list1.stream().reduce(0, (val1, val2) -> val1 + val2));

		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("Suresh", 103,453 ));
		studentList.add(new Student("Ganesh", 101, 451));
		studentList.add(new Student("Gopi", 102, 452));
		
		System.out.println("-----------------------------------");
		studentList.forEach(
				eachStudent -> System.out.println(eachStudent.getStudentName() + " " + eachStudent.getStudentMarks()));
		
		Comparator<Student> comparator = new Comparator<Student>() {
			@Override
			public int compare(Student student1, Student student2) {
				if(student1.getStudentMarks() > student2.getStudentMarks()) {
					return 1;
				}else {
					return -1;
				}
			}
		};
		
		Comparator<Student> comparator2 = (student1,student2) -> {
			if(student1.getStudentMarks() > student2.getStudentMarks()) {
				return 1;
			}else {
				return -1;
			}
		};
		
//		Collections.sort(studentList, comparator);;
//		Collections.sort(studentList, comparator2);;
//		studentList.sort(comparator2);
		
		Collections.sort(studentList);

		System.out.println("-----------------------------------");
		studentList.forEach(
				eachStudent -> System.out.println(eachStudent.getStudentName() + " " + eachStudent.getStudentMarks()));

	}

}
