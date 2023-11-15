package functional.interfaces;

public class MethodReferences {
	
	public int multiplication(int a, int b) {
		return a*b;
	}
	
	static public int susbraction(int a, int b) {
		return a-b;
	}

	public static void main(String[] args) {
		
		MethodReferences methodRef = new MethodReferences();
		
		FunctionalInterfaceEx funEx = methodRef::multiplication;
		
		System.out.println(funEx.addition(10, 20));	
		
		FunctionalInterfaceEx funEx1 = MethodReferences::susbraction;
		
		System.out.println(funEx1.addition(10, 20));
	}

}
