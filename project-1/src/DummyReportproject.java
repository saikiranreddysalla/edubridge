import java.util.Scanner;
public class DummyReportProject {
	public static void main(String[] args) {
	 
	 int  StudentRollNumber=1001;
	 String StudentName ="Dikshu";
	 String StudentFatherName="Srinivas";
	 String StudentMotherName="Bhavani";
	 String StudentDateOfBirth="20/04/2002";
	 String StudentSchoolName="KAKATIYA CONCEPT SCHOOL SURYAPET";
	 String DateOFIssueByTheBoard="03/05/2017";
	 Scanner scanner=new Scanner(System.in);
	 System.out.println("BOARD OS SECONDARY EDUCATION TELANGANA STATE");
	 System.out.println("Student RollNumber:"+StudentRollNumber);
	 System.out.println("Student Name:"+StudentName);    
	 System.out.println("Student FatherName:"+StudentFatherName);
	 System.out.println("Student MotherName:"+StudentMotherName);
	 System.out.println("Student DateOfBirth:"+StudentDateOfBirth);
	 System.out.println("Student SchoolName:"+StudentSchoolName);
	 
  System.out.println("Enter marks for Telugu:");
  int teluguMarks=scanner.nextInt();
  System.out.println("Enter marks for Hindi:");
  int hindiMarks=scanner.nextInt();
  System.out.println("Enter marks for English:");
  int englishMarks=scanner.nextInt();
  System.out.println("Enter marks for Maths:");
  int mathsMarks=scanner.nextInt();
 
  int totalMarks = teluguMarks + hindiMarks + englishMarks + mathsMarks;
  double percentage = (double) totalMarks / 4;
  if (teluguMarks < 35 || hindiMarks < 35 || englishMarks < 35 || mathsMarks < 35) {
      System.out.println("Status: Fail (Failed in one or more subjects)");
  } else {
      System.out.println("Status: Pass");
  }
 
  System.out.println("Total Marks: " + totalMarks);
  System.out.println("Percentage: " + percentage + "%");
  System.out.println("DateOFIssueByTheBoard:" +DateOFIssueByTheBoard);
  
  
 }
 
}