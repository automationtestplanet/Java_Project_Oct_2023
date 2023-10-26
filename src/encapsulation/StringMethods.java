package encapsulation;

public class StringMethods {

	public static void main(String[] args) {
		
//	String Immutable 	
		String str1 = "Hello";
		
		str1.concat(" Java");
		
		System.out.println(str1);

//	 Mutable Primitive Datatypes
		int a = 1;
		
		a++;
		
		System.out.println(a);
		
		
	 String str2 = "java";
	 
	 String str3 = new String("java");
	 
	 System.out.println(str2);
	 System.out.println(str3);
	 
	 System.out.println(str2 == str3);  // Binary Comparison
	 
	 System.out.println(str2 == str3.intern()); // Move Object memory to COnstatnts pool
	 
	 System.out.println(str2.equals(str3)); // String Comparison
	 
	 
	 String str4 = "Hello Java";	 
	 
	 System.out.println(str4.toUpperCase());
	 
	 System.out.println(str4.toLowerCase());
	 
	 System.out.println(str4.toLowerCase());
	 
	 System.out.println(str4.charAt(4));
	 
	 System.out.println(str4.indexOf("o"));
	 System.out.println(str4.indexOf("a"));
	 
	 System.out.println(str4.lastIndexOf("a"));
	 
	 System.out.println(str4.substring(2, 5));
	 
	 System.out.println(str4.substring(2));
	 
	 System.out.println(str4.equals("HELLO JAVA")); ;
	 
	 System.out.println(str4.equalsIgnoreCase("HELLO JAVA")); ;
	 
	 System.out.println(str4.replace("l", "L"));
	 
	 System.out.println(str4.replaceAll("l", "L"));
	 
	 String str5 = "hcsklv@%&&*%78575JGjkg64648uuuu";
	 
	 System.out.println(str5.replaceAll("[^A-Za-z]", ""));
	 
	 System.out.println(str5.replaceAll("[^0-9]", ""));
	 
	 System.out.println(str5.replaceAll("[A-Za-z0-9]", ""));
	 
	 System.out.println(str4.startsWith("Hello"));
	 
	 System.out.println(str4.startsWith("Java"));
	 
	 System.out.println(str4.endsWith("Java"));
	 
	 System.out.println(str4.endsWith("Hello"));
	 
	 String str6 = "             hello this is Java                 ";
	 
	 System.out.println(str6.length());
	 
	 System.out.println(str6);
	 
	System.out.println(str6.trim()); 
		
	System.out.println(str6.trim().length()); 
	 
	
	 

	}

}
