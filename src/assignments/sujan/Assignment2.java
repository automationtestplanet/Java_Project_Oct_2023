package assignments.sujan;

public class Assignment2 {

	// Create a reusable method to check whether the number is Armstrong number not
	
	// 153 -> 1 + 125 + 27 = 153  
	
	static int z;
	static int temp = z;
	int sum = 0;
	int y;

	void DisplayName() {

		while (z > 0) {
			y = z % 10;
			z = z / 10;
			sum = sum + y * y * y;
		}
		if (temp == sum) {
			System.out.println("the number an armstrong number :" + sum);
		} else {
			System.out.println("the number not an armstrong number :" + sum);
		}
	}

	public static void main(String[] args) {

		Assignment2 ass = new Assignment2();
		ass.z = 153;
		ass.temp = z;
		ass.DisplayName();
	}

}