package polymorphism;

public class Overloading {
	
	int addition(int a , int b) {
//		System.out.println("Addition: " + (a + b));
		return a+b;
	}
	
	int addition(int a , int b, int c) {
//		System.out.println("Addition: " + (a + b + c));		
		 return (this.addition(a, b)  + c);
	}
	
	void addition(int a , int b, int c, int d) {
		System.out.println("Addition: " + (a + b + c + d));
	}
	
	void addition(float a , float b) {
		System.out.println("Addition: " + (a + b));
	}
	
	void addition(char a , char b) {
		System.out.println("Addition: " + (a + b));
	}
	
	void addition(String a , String b) {
		System.out.println("Addition: " + (a + b));
	}
	
	int substraction(int a , int b) {
//		System.out.println("Substraction: " + (a - b));
		return (a - b);
	}
	
	void multiplication(int a , int b) {
		System.out.println("Multiplication: " + a * b);
	}	
	
	void division(int a , int b) {
		System.out.println("Division: " + a / b);
	}
	
//	static int substraction(int a, int b) {
//		return a-b;
//	}
	
	static int substraction(int a, int b, int c) {
		return a-b-c;
	}
	
	
	public static void main(String[] args) {
		Overloading overLoad = new Overloading();
		
		System.out.println("Addition: "+ overLoad.addition(10, 20));	
		System.out.println("Addition: "+ overLoad.addition(10, 20,30));
		
		overLoad.addition(10.1F, 20.6F);
		
		overLoad.addition('1', '2');
		
		overLoad.addition("Hello", "Java");
		
		
		
		overLoad.addition(10, 20, 30, 40);
		
	}

}
