package polymorphism;

public class UpcastingAndDownCasting extends Calculator{

	int addition(int a , int b, int c) {
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
		return a%b;
	}
	
	public static void main(String[] args) {
				
		int a = 100;
		
		long b = a;  // Implicit Conversion		
		
		a = (int)b;    // Explicit Conversion
		
		UpcastingAndDownCasting ups = new UpcastingAndDownCasting();
		
		Calculator calc = ups;  // Up-Casting -> Implicit Conversion
		
//		calc.modDivision(10,20);
		
		System.out.println(calc.addition(10,20));
		
		ups = (UpcastingAndDownCasting)calc;    //Down-Casting
		
		
		System.out.println(ups.addition(10,20));
		
		Calculator calc2 = new UpcastingAndDownCasting();
		
		UpcastingAndDownCasting ups2 = (UpcastingAndDownCasting)calc2;

	}

}
