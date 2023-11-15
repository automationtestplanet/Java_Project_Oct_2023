package exceptions;

public class ExceptionExample {
	
	static int division(int a, int b) {
		return a/b;
	}

	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		
		int arr[] = {10,2,30,40};
		
		
		System.out.println(division(10, 2));
		
//		try{
//			System.out.println(division(a,b));
//			System.out.println(arr[4]);
//		}catch(Exception ari){
//			System.out.println(ari.getMessage());
//			ari.printStackTrace();
//		}
//		
//		try{
//			System.out.println(division(a,b));
//			System.out.println(arr[4]);
//		}catch(ArithmeticException ari){
//			System.out.println(division(a,1));
//		}catch(ArrayIndexOutOfBoundsException ari){
//			System.out.println(arr[arr.length-1]);
//		}
		
//		try{
//			System.out.println(division(a,b));
//			System.out.println(arr[4]);
//		}catch(ArithmeticException | ArrayIndexOutOfBoundsException ari){
//			System.out.println(ari.getMessage());
//		}
		
//		try{
//			System.out.println(division(a,b));
//			System.out.println(arr[3]);
//		}catch(ArithmeticException | ArrayIndexOutOfBoundsException ari){
//			System.out.println(ari.getMessage());
//		}finally {
//			System.out.println("Finally Block");
//		}
//		
		
		try{
			System.out.println("Connect Database");
			System.out.println(10/0);
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException ari){
			System.out.println("Eception while performing databse operation");
		}finally {
			System.out.println("Close Database");
		}
		
		
		
		
		System.out.println(division(10, 3));

	}

}
