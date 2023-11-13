package abstraction;

public class UseInterface implements InterfaceEx{
	
	@Override
	public int addition(int a, int b) {
		return a+b;
	}

	@Override
	public int substraction(int a, int b) {
		return 0;
	}

	@Override
	public int multiplication(int a, int b) {
		return 0;
	}

	@Override
	public int division(int a, int b) {
		return 0;
	}
	
	
	public static void main(String[] args) {
		
		InterfaceEx inf = new UseInterface();
		
		System.out.println(inf.addition(10, 20));
		
		
//		"Hello".toU
		
		inf.defaultMethod();
	}

	

}
