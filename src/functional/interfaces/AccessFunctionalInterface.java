package functional.interfaces;

public class AccessFunctionalInterface {

	public static void main(String[] args) {
		FunctionalInterfaceEx func = new FunctionalInterfaceEx(){

			@Override
			public int addition(int a, int b) {return a+b;}
			
		};
		
		System.out.println(func.addition(10, 20));
		
		
		FunctionalInterfaceEx func1 = (a,b)->{return a+b;};  //lambda expression or method without name
		
		System.out.println(func1.addition(40, 50));
		
		FunctionalInterfaceEx func2 = new FunctionalInterfaceEx() {
			
			@Override
			public int addition(int a, int b) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		func2.addition(10, 20);
	}
	
	

}
