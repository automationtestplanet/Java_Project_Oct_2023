package encapsulation;

public class TypesOfVariables {
	
	TypesOfVariables(){
		
	}

	int a = 100;
	int b = 200;
//	int a = 100;
//	int b = 200;

	static int globalA = 1000; // static
	int globalB = 2000; // instance

	void addition() {
		int e = 500; // local variables
		int f = 600;
		System.out.println(a + b);

//		System.out.println(c + d);

		System.out.println(e + f);

		int c = 300; // local variables
		int d = 400;
		int a = 100;
		int b = 200;
//		int a = 100;
//		int b = 200;
	}

	static void addition(int a, int b) {
//		int a = 100;
//		int b = 200;
	}

	public static void main(String[] args) {

		int a = 100;
		int b = 200;
		int c = 300; // local variables
		int d = 400;

//		int c = 300;  
//		int d = 400;

		System.out.println(globalA);
		addition(10000, 20000);
		
		TypesOfVariables typesOfVar = new TypesOfVariables();
		
		System.out.println(typesOfVar.globalB);
		
		typesOfVar.addition();
		
		System.out.println(TypesOfVariables.globalA);
		
		TypesOfVariables.addition(10000, 20000);

	}
	
	static void addition(int a, int b, int c) {
//		int a = 100;
//		int b = 200;
	}

}








