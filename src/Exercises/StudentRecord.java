package Exercises;

public class StudentRecord {

	public static void main(String[] args) {
	StudentsDetails student = new StudentsDetails(1001,"Jacob",80,'H',3);
	student.getStudentId();
	student.getName();
	student.getExamMarks();
	student.getresidentialStatus();
	student.getYear();
	System.out.println("Student Id :" +student.getStudentId());
	System.out.println("Student Name :" +student.getName());
	System.out.println("Qualifying Marks :" +student.getExamMarks());
	System.out.println("Residential Status:" +student.getresidentialStatus());
	System.out.println("Year of Engineering :" +student.getYear());
	System.out.println("*************************************");
	StudentsDetails student1 = new StudentsDetails(1002,"Peter",83,'D',2);
	student1.getStudentId();
	student1.getName();
	student1.getExamMarks();
	student1.getresidentialStatus();
	student1.getYear();
	System.out.println("Student Id :" +student1.getStudentId());
	System.out.println("Student Name :" +student1.getName());
	System.out.println("Qualifying Marks :" +student1.getExamMarks());
	System.out.println("Residential Status:" +student1.getresidentialStatus());
	System.out.println("Year of Engineering :" +student1.getYear());
	}

}
