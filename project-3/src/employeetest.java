import java.util.Scanner;

public class employeetest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter your Id: ");
		int employeeId = in.nextInt();
		
		System.out.println("please enter your Name: ");
		String employeeName = in.next();
		
		System.out.println("Please your your Salary: ");
		double employeeSalary = in.nextDouble();
		
		System.out.println("employee Id: "+employeeId);
		System.out.println("employee Name: "+employeeName);
		System.out.println("employee Salary: "+employeeSalary);
		

	}

}
