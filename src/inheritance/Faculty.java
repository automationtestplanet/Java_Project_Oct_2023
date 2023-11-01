package inheritance;

public class Faculty extends Student{
	
	String facultyName;
	String subjet;
	
	void displayFacultyDetails() {
		System.out.println("Faculty Name: "+ facultyName);
		System.out.println("Faculty teahcing Subject: : "+ subjet);
	}
	
	public static void main(String[] args) {
		Faculty fac = new Faculty();
		
		fac.facultyName= "Raju";
		fac.subjet = "Java";
		
		fac.sName = "Ganesh";
		fac.sRollNo = 123;
		
		fac.displayFacultyDetails();
		fac.displayCollegeDetails();
		
		fac.displayStudentDetails();
	}

}
