package functional.interfaces;

public class Student implements Comparable<Student>{
	
	String studentName;
	int studentRollNo;
	int studentMarks;
	
	public Student(String studentName, int studentRollNo,int studentmarks) {
		this.studentName = studentName;
		this.studentRollNo = studentRollNo;
		this.studentMarks = studentmarks;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public int getStudentRllNo() {
		return studentRollNo;
	}
	
	public int getStudentMarks() {
		return studentMarks;
	}

	@Override
	public int compareTo(Student student2) {
		if(this.getStudentMarks() > student2.getStudentMarks()) {
			return 1;
		}else {
			return -1;
		}
	}

	
	

}
