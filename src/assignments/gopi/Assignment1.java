package assignments.gopi;

public class Assignment1 {
	
	// Declare an Array and print only even numbers form the array

	public static void main(String[] args) {
		int[] arr= new int[10];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		arr[5]=6;
		arr[6]=7;
		arr[7]=8;
		arr[8]=9;
		arr[9]=10;
    for(int i=0;i<arr.length;i++) {
    	if(arr[i]%2==0) {
    		System.out.println("Even numbers are :"+arr[i]);
    	}
    	/*else {
    		System.out.println("remaining numbers are  not a even numbers");
    	}*/
    }

	}

}
