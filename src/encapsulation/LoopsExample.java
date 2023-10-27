package encapsulation;

public class LoopsExample {

	public static void main(String[] args) {
		
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		System.out.println(6);
//		System.out.println(7);
//		System.out.println(8);
//		System.out.println(9);
//		System.out.println(10);
		
		for(int i=11; i<=10;i++) {			
			System.out.println(i);
		}
		
		int a= 11;

		while(a<=10) {
			System.out.println(a);
			a++;
		}
		
		do {
			System.out.println(a);
		} while (a<=10);


		for(int i=1; i<=5;i++) {			
			
			for(int j=1; j<=i;j++) {			
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
		
	}

}
