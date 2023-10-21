package encapsulation;

public class Student {
	
	String sName ;
	int sRollNo;
	static String qualification = "BTech";
	
//	static void displayStudentDetails1(){
//		System.out.println("Student Name: "+ sName);
//		System.out.println("Student Roll No: "+ sRollNo);
//		System.out.println("Student Qualification: "+ qualification);
//	}
//	
	void displayStudentDetails(){
		System.out.println("Student Name: "+ sName);
		System.out.println("Student Roll No: "+ sRollNo);
		System.out.println("Student Qualification: "+ qualification);
	}
	
	
	
	
	public static void main(String[] args) {
		
		
//		displayStudentDetails1();
		
		Student studentSuresh = new Student();
		
		studentSuresh.sName = "Suresh";
		studentSuresh.sRollNo = 123;
		studentSuresh.displayStudentDetails();
		System.out.println("----------------------------------");
		
		Student studentRam = new Student();
		studentRam.sName  = "Ram";		
		studentRam.sRollNo = 124;
		studentRam.displayStudentDetails();
		System.out.println("----------------------------------");
		
		
		
		Student studentGanesh = new Student();
		studentGanesh.sName  = "Ganesh";		
		studentGanesh.sRollNo = 125;
		studentGanesh.displayStudentDetails();
		System.out.println("----------------------------------");
		
		
		Student studentPavan = new Student();
		
		studentPavan.sName  = "Pavan";		
		studentPavan.sRollNo = 126;
		studentPavan.displayStudentDetails();
		
		
		System.out.println("--------------------------");
		studentSuresh.displayStudentDetails();
		
		System.out.println("--------------------------");
		studentRam.displayStudentDetails();
		
		System.out.println("--------------------------");
		studentGanesh.displayStudentDetails();
		
		System.out.println("--------------------------");
		studentPavan.displayStudentDetails();
		
		
	}

}
