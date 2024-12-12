package myproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentTest {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
				new Student(101, "Wills", "JFS", 2000),
				new Student(102, "Smith", "JFS", 2000),
				new Student(103, "Alice", "PFS", 1500),
				new Student(104, "Alex", "PFS", 1500),
				new Student(105, "Jones", "JFS", 2000)
				);
		
		System.out.println("--------All student list---------");
		students.forEach(System.out::println);
		
		System.out.println("----------JFS student list--------");
		students.stream().filter(student -> student.getCourseName().equals("JFS")).forEach(System.out::println);
		
		System.out.println("-------JFS Fees-----------");
		double sum = students.stream().filter(student -> student.getCourseName().equals("PFS")).mapToDouble(student -> student.getCourseFee()).sum();
		System.out.println(sum);
	}




}
