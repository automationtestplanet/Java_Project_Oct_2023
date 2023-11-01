package inheritance;

public class OfficeStaff extends Faculty{
	String officeStaffName;
	
	void displayOfficeStaffDetails() {
		System.out.println("Office staff Name"+ officeStaffName);
	}
	
	void display() {
		System.out.println("This is Display Method of Office Staff");
	}
	
	public static void main(String[] args) {
		OfficeStaff ofs = new OfficeStaff();
		
		ofs.displayCollegeDetails();
		ofs.displayStudentDetails();
		ofs.displayFacultyDetails();
		ofs.displayOfficeStaffDetails();
		
//		ofs.displayAdminDetails();
	}
}
