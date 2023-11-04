package assignments.ganesh;

public class Assignment2 {
	
	// Create a reusable method to check whether the given string is pallendrome
	
	// abcd == dcba -> not Pallendrome,   abba = abba -> Pallendrome
	static void toFindPallendeome(String value1) {
		String value2="";
		for(int i=value1.length()-1;i>=0;i--) {
			value2=value2+value1.charAt(i);
		}
		if(value1.equals(value2))
			System.out.println("The given string is pallendrome");
		else
			System.out.println("The given string is not a pallendrome");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 String value3="abba";
	 toFindPallendeome(value3);
	 String value4="pqrs";
	 toFindPallendeome(value4);

	}

}
