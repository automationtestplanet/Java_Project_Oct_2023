package assignments.suresh;

public class Assignment1 {
	
	// Declare an Array and print only even numbers form the array
	static void displayEvenNumbers(int[] Arr) {
		for (int eahElelement : Arr) {
			if (eahElelement % 2 == 0) {
				System.out.println(eahElelement + " : is a Even number");
			}
		}
	}

	public static void main(String[] args) {
		int[] Arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		displayEvenNumbers(Arr);
		

	}

}
