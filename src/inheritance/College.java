package inheritance;

public class College {

	static final String COLLEGE_NAME = "MLR College";
	static long collegeCode = 1234;
	static String collegeLocation = "Hyderabad";
	static String affUniversity = "Osmania";
	
	void displayCollegeDetails(){
		System.out.println("College Name: "+ COLLEGE_NAME );
		System.out.println("College Code: "+ collegeCode );
		System.out.println("College Location: "+ collegeLocation );
		System.out.println("College Univeristy: "+ affUniversity );
	}
}
