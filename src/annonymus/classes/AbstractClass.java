package annonymus.classes;

abstract public class AbstractClass {
	
	abstract int addition(int a,int b);
	
	int substraction(int a, int b) {
		return a-b;
	}

	public static void main(String[] args) {

		AbstractClass absCls = new AbstractClass() {

			@Override
			int addition(int a, int b) {
				return a+b;
			}
			
		};
		
		System.out.println(absCls.addition(10, 20)); 

	}

}
