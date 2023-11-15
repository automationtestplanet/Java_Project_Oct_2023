package abstraction;

public class C extends D implements A,B {

	
	@Override
	public int addition(int a, int b) {
		return a+b;
	}

	
	public static void main(String[] args) {
		
		C c = new C();
		
		System.out.println(c.addition(10, 20));
		
		D d = c;
		
		System.out.println(d.addition(20, 30));
	}

}
