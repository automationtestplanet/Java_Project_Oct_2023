package demo;

public class MethodExamples {

	int a,  b;
	
	MethodExamples(){
		
	}
	
//	Method without parameters without return
	void addition1() {
		System.out.println(100+200);
	}
	
//	Method with parameters without return
	void addition(int a, int b) {
		System.out.println("Addition: " + (a + b));
	}
	
//	Method without parameters with return
	short addition() {	
		return (short)(100 + 200);
	}
	
//	Method with parameters with return
	long addition(long a, long b) {
		return a+b;
	}
	
	int substraction(int a, int b) {
		System.out.println("Substraction: " + (a - b));		
		return a-b;
	}

	void multiplication(int a, int b) {
		System.out.println("Multiplication: " + (a * b));
	}

	void division(int a, int b) {
		System.out.println("Division -> Quotient: " + (a / b));
	}

	void modDivision(int a, int b) {
		System.out.println("Modular Division -> Remainder: " + (a % b));
	}

	void concatination(String str1, String str2) {
		System.out.println("Addition of two strings: " + (str1 + str2));
		System.out.println("Addition of two strings: " + (str1.concat(str2)));
	}

	public static void main(String[] args) {
		
		MethodExamples mEx = new MethodExamples();
		
		short result = mEx.addition();
		
		System.out.println(result);
		
		byte result1 = (byte)mEx.substraction(100,200);		// -100 Explicit Conversion
		
		System.out.println(result1);
		
		int a = 1000;
		
//		byte b = 100;
		byte b = (byte)a; //Explicit Conversion
		
		short c = 100;
//		short c = a;
		
		int d = a;
		
		int e = b; // implicit Conversion
		
		int f = c;
		
		
		byte g = (byte)130;
		
		System.out.println(g);
		System.out.println(b);
		
		
		float float1 = 100.5F;  //1.7 croes
		
		int int1 = (int)float1;  // Explicit conversin
		
		System.out.println(int1);
		
		float float2 = int1; //implicit conversion
		
		System.out.println(float2);
		
		
//		String str1 = "10";  // referenced data type / non-primitive data type
//		
//		System.out.println(str1);
//		
//		byte byte1 = (byte)str1;  //primitive data type
//		
//		short short1 = (short)str1; //primitive data type
//		
//		int int2 = (int)str1; //primitive data type
//		
//		long long1 = (long)str1; //primitive data type
//		
//		float float3 = (float)str1; //primitive data type
//		
//		double double1 = (double)str1; //primitive data type
		
		
		
		
	}

}
