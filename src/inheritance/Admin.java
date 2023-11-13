package inheritance;

public class Admin extends Faculty {

	String adminName;

	void displayAdminDetails() {
		System.out.println("Admi Name: " + adminName);
	}
	
	void display() {
		System.out.println("This is Display Method of Admin");
	}

	public static void main(String[] args) {
			Admin ad = new Admin();
			
			ad.displayCollegeDetails();
			ad.displayStudentDetails();
			ad.displayFacultyDetails();
			ad.displayAdminDetails();
			
//			ad.displayOfficeStaffDetails();
			
			College college = new Admin();
			
			college.displayCollegeDetails();
	}
}
