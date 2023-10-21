package demo;

public class OperatorsExample {

	public static void main(String[] args) {
		
//		Assignment Operator:
			int a = 100, b = 200;  // int a = 100; int b = 200;
			
			String str = "Hello", str2 = "Java";
		
//		Arithmetic Operators:
			System.out.println("Addition: "+ (a+b));
			System.out.println("Substraction: "+ (a-b));
			System.out.println("Multiplication: "+ (a*b));
			System.out.println("Division -> Quotient: "+ (a/b));
			System.out.println("Modular Division -> Remainder: "+ (a%b));
			
			System.out.println("Addition of two strings: "+ (str+str2));
			System.out.println("Addition of two strings: "+ (str.concat(str2)));
			
//		Incremental Operators:
			int c = 1;
			
			System.out.println(c++);			
			System.out.println(c);
			
			System.out.println(c--);
			System.out.println(c);
			
			System.out.println(++c);			
			System.out.println(c);
			
			System.out.println(--c);
			System.out.println(c);
			
			System.out.println(  c+=5 );  // c = c+5
			
			System.out.println(  c-=5 );  // c = c-5
			
			System.out.println(  c*=5 );  // c = c*5
			
			System.out.println(  c/=5 );  // c = c/5
			
			System.out.println(  c%=5 );  // c = c%5
			
//		Comparison Operators:
			boolean	bool1 = a == b;
			
			System.out.println( a == b );
			
			System.out.println( a != b );
			
			System.out.println( a < b );
			System.out.println( a > b );
			
			System.out.println( a <= b );  // a<b or a==b			
			System.out.println( a >= b );  // a>b or a==b
			
			
//		Logical Operators:
//				&&, ||, !
			
			System.out.println( a <= b &&  a >= b );
			
			System.out.println( a <= b ||  a >= b );
			
			System.out.println( a <= b ||  a >= b && a<b && a > b || a==b && a!=b);
			
			System.out.println( !(a <= b ||  a >= b && a<b && a > b || a==b && a!=b));
			
//		Ternary Operator:
			
			System.out.println(a < b ? a : b);
			
			System.out.println(a < b ? true :false);
			
			System.out.println(a < b ? a :false);
			System.out.println(a == b ? a :false);
	}

}
