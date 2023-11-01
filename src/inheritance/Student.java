package inheritance;

public class Student extends College {

	String sName;
	int sRollNo;
	static String qualification = "BTech";

	void displayStudentDetails() {
		System.out.println("Student Name: " + sName);
		System.out.println("Student Roll No: " + sRollNo);
		System.out.println("Student Qualification: " + qualification);
	}

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.sName = "Ganesh";
		s1.sRollNo = 123;
		s1.displayStudentDetails();

//		College col = new College();
//		col.displayCollegeDetails();

		s1.displayCollegeDetails();
	}
}
