package polymorphism;

public class Overriding extends Calculator {
		
	int addition(int a , int b, int c) {			
//		 return (this.addition(a, b)  + c);
		return (a + b + c);		
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
	
	int addition(int a, int b) {
		return super.addition(a,b)+1;
	}
	
	int modDivision(int a, int b) {
//		super.modDivision(a,b);
		super.multiplication(10, 20);
		return a%b;
	}
	
	public static void main(String[] args) {		
		Overriding overridie = new Overriding();
		overridie.addition(10, 20, 30);
		overridie.multiplication(10, 20);
		
		System.out.println(overridie.addition(10, 20));
	}

}
