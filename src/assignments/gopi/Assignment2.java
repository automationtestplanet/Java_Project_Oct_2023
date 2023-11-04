package assignments.gopi;

public class Assignment2 {

	// Create a reusable method which should accept parameter as number and reverse
	// the number
	void palindrome(int num) {
		System.out.println("Enter the number :" + num);
		int r, sum = 0, temp;
		temp = num;
		while (num > 0) {
			r = num % 10; // getting remainder
			sum = (sum * 10) + r;
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println(" it is a palindrome number ");
		} 
		else {
			System.out.println(" it is a not palindrome");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment2 Pnumber = new Assignment2();
		Pnumber.palindrome(515);
	}

}
