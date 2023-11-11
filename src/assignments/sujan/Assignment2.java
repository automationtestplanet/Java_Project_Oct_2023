package assignments.sujan;

public class Assignment2 {

	// Create a reusable method to check whether the number is Armstrong number not

	// 153 -> 1 + 125 + 27 = 153

	void CheckArmstrongNumber(int z) {
		int temp = z;
		int sum = 0;
		int y;
		System.out.println("Actual given number: " + z);
		while (z > 0) {
			y = z % 10;
			z = z / 10;
			sum = sum + y * y * y;
		}
		if (temp == sum) {
			System.out.println("The given number an armstrong number :" + sum);
		} else {
			System.out.println("The given number not an armstrong number :" + sum);
		}
	}

	public static void main(String[] args) {
		Assignment2 assig = new Assignment2();
		assig.CheckArmstrongNumber(153);
		assig.CheckArmstrongNumber(133);
	}
}