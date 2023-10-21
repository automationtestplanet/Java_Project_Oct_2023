package encapsulation;

public class StaticAndInstance {
	
	static int globalA = 1000;
	
	int globalB = 2000;

	void addition(){
		
	}
	
	static void addition(int a, int b){

		
	}	
	
	public static void main(String[] args) {
		
//		System.out.println(globalA);
		
		
		System.out.println("-----------------------with staticAndInstance1----------------------");
		StaticAndInstance staticAndInstance1 = new StaticAndInstance();
		System.out.println(staticAndInstance1.globalA);
		System.out.println(staticAndInstance1.globalB);
		
		
		
		
		System.out.println();
		System.out.println();
		
		System.out.println("-----------------------with staticAndInstance2----------------------");
		StaticAndInstance staticAndInstance2 = new StaticAndInstance();
		System.out.println(staticAndInstance2.globalA);
		System.out.println(staticAndInstance2.globalB);
		
		
		System.out.println("-----------------------with staticAndInstance1----------------------");
		staticAndInstance1.globalA = 10000;
		staticAndInstance1.globalB = 20000;
		System.out.println(staticAndInstance1.globalA);
		System.out.println(staticAndInstance1.globalB);
		
		System.out.println("-----------------------with staticAndInstance2----------------------");
		staticAndInstance2.globalB = 3000;
		System.out.println(staticAndInstance2.globalA);
		System.out.println(staticAndInstance2.globalB);
		
		
		staticAndInstance2.globalA = 30000;
		
		System.out.println("-----------------------Static----------------------");
		System.out.println(staticAndInstance1.globalA);
		System.out.println(staticAndInstance2.globalA);
		
	}
	
	
	
	

}
