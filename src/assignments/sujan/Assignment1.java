package assignments.sujan;

public class Assignment1 {

	// Declare an Array and print only even numbers form the array

	public static void main(String[] args) {
		int[] a = { 3, 6, 7, 22, 9, 5, 2, 8, 11, 23, 17, 10 };
		for (int i = 0; i < a.length; i++) {
			{
				if (a[i] % 2 == 0)
					System.out.println(a[i]);
			}
		}
	}
}
