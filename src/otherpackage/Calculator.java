package otherpackage;

public class Calculator {

	public void addition(int a , int b) {
		System.out.println("Addition: " + a + b);
	}
	
	protected void substraction(int a , int b) {
		System.out.println("Substraction: " + (a - b));
	}
	
	private void multiplication(int a , int b) {
		System.out.println("Multiplication: " + a * b);
	}	
	
	void division(int a , int b) {
		System.out.println("Division: " + a / b);
	}
	
//	protected class InnerClass{
//		
//	}
	
//	private class InnerClass{
//		
//	}
}
