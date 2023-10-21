package demo;

public class ArithematicOperations {
	
	// 100 and 200
	static boolean bool1 = true; //false
	static byte byte1 = 100;  // 127
	static short short1 = 200;
	
	int int1 = 300;
		
	void addition() {
		int a = 10;
		int b =20;
		System.out.println(a+b);
		System.out.println(byte1+short1);
		System.out.println(int1);
	}
	
	public static void main(String[] args) {
		System.out.println("Hello!! Welcome");
		
		System.out.println("Hello!! Welcome");
		
		System.out.println(byte1+short1);
		
		ArithematicOperations ariOps = new ArithematicOperations();
		
		System.out.println(ariOps.int1);
		ariOps.addition();
		
//		System.out.println(a+b);
	}

}
