package abstraction;

public class UseAbstractClass extends AbstractClassEx{

	
	UseAbstractClass(int c){
		super(c);
	}
	
	@Override
	protected int substraction(int a, int b) {
		return a-b;
	}

	@Override
	protected int division(int a, int b) {
		return a/b;
	}
	
	public int modDivision(int a, int b) {
		return a%b;
	}
	
	public static void main(String[] args) {
		
		AbstractClassEx absCls = new UseAbstractClass(200);
		
		System.out.println(absCls.substraction(10, 20));
		
		System.out.println(absCls.c);
		
//		absCls.modDivision(10,20);
		
	}


}
