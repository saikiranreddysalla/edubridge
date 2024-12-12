package com.edubridge.elite;

public class Student {
	private int StudentId;
	private String StudentName;
	private long StudentMobileNumber;
	private String StudentEmail;
	
	public Student() {
		super();
	}
	//Source-Generate constructor and fields
	public Student(int studentId, String studentName, long studentMobileNumber, String studentEmail) {
		super();
		StudentId = studentId;
		StudentName = studentName;
		StudentMobileNumber = studentMobileNumber;
		StudentEmail = studentEmail;
	}
	//source- generate getter and setters
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public long getStudentMobileNumber() {
		return StudentMobileNumber;
	}
	public void setStudentMobileNumber(long studentMobileNumber) {
		StudentMobileNumber = studentMobileNumber;
	}
	public String getStudentEmail() {
		return StudentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		StudentEmail = studentEmail;
	}

	// Source-Generate toString()
	@Override
	public String toString() {
		return "Student [studentId=" + StudentId + ", studentName=" + StudentName + ", studentMobilenumber=" + StudentMobileNumber
				+ ", studentEmail=" + StudentEmail + "]";
	}

}

