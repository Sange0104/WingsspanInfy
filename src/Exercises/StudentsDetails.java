package Exercises;

public class StudentsDetails {
	private int StudentId;
	private String Name;
	private float ExamMarks;
	private char residentialStatus;
	private int yearOfEngg;
	
	StudentsDetails(int studId,String name,float marks,char status,int year){
		StudentId=studId;
		Name=name;
		ExamMarks=marks;
		residentialStatus=status;
		yearOfEngg=year;
	}
		//Setter and Getter methods
		
		public void setStudentId(int StudentId) {
			this.StudentId=StudentId;
		}
		
		public int getStudentId() {
			return StudentId;
		}
		
		public void setName(String Name) {
			this.Name=Name;
		}
		public String getName() {
			return Name;
		}
		
		public void setExamMarks(float ExamMarks) {
			this.ExamMarks=ExamMarks;
		}
	
		public float getExamMarks() {
			return ExamMarks;
		}
		
		public void setresidentialStatus(char residentialStatus) {
			this.residentialStatus=residentialStatus;
		}
		public char getresidentialStatus() {
			return residentialStatus;
		}
		
		public void setYear(int yearOfEngg ) {
			this.yearOfEngg=yearOfEngg;
		}
		public int getYear() {
			return yearOfEngg;
		}
	}


