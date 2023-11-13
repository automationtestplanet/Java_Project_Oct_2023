package abstraction;

public interface InterfaceEx {
	
	public static final int a = 100;
	
	int b = 200;

	int addition(int a, int b);

	int substraction(int a, int b); 
	
	int multiplication(int a, int b);
	
	int division(int a, int b);
	
	static void method1() {
		System.out.println("This is method1");
	}
	
	public static void main(String[] args) {
		InterfaceEx.method1();
		
//		a = 200;
		System.out.println(InterfaceEx.a);
		
//		b = 300;
		System.out.println(InterfaceEx.b);
	}
	
	default void defaultMethod() {
		System.out.println("This is Default Method");
	}
}
