package assignments.raju;

public class Assignment1 {

	// "12@@45ahfshaf%#!*%#67H" -> O/P: 25

	static int sumOfNumbersInSring(String str) {
		int sum = 0;
		for (char eachChar : str.replaceAll("[^0-9]", "").toCharArray()) {
			sum = sum + eachChar - '0';
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(sumOfNumbersInSring("12@@45ahfshaf%#!*%#67H"));
		System.out.println(sumOfNumbersInSring("*$WFHWF@$^)%^056252562HFSKFHK"));
	}

}
