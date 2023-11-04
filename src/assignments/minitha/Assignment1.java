package assignments.minitha;

public class Assignment1 {

	// Declare an Array and print only even numbers form the array

	static void displayEvenNumbersFromArray(int[] intArr) {
		for (int eachElement : intArr) {
			if (eachElement % 2 == 0) {
				System.out.println(eachElement + ":is a Even number");
			}
		}

	}

	public static void main(String[] args) {

		int[] intArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		displayEvenNumbersFromArray(intArr);

	}

}
