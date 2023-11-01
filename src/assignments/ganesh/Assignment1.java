package assignments.ganesh;

public class Assignment1 {
	
	// Declare an Array and print only even numbers form the array
	static void displayEvenNumbers() {
		int[] array1 = {0,1,2,3,4,5,6,7,8,9,10,11,12};
		for(int i=0;i<array1.length;i++)
	if(array1[i]%2==0)
				System.out.println("Even numbers from the array are:"+array1[i]);

	}

	public static void main(String[] args) {
	   displayEvenNumbers();	
	}

}
