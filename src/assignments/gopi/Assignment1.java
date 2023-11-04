package assignments.gopi;

public class Assignment1 {

	// Declare an Array and print only even numbers form the array

	static void displayEvenNumbersFromArray(int[] intArr) {
		for (int eahElelement : intArr) {
			if (eahElelement % 2 == 0) {
				System.out.println(eahElelement + " : is a Even number");
			}
		}
	}

	public static void main(String[] args) {

		int[] intArr = { 10, 20, 31, 40, 50, 60, 77, 80, 90, 100 };
		displayEvenNumbersFromArray(intArr);
	}

}
