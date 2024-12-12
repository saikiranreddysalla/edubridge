import java.util.Scanner;
public class testclass {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int num1=in.nextInt();
		
		System.out.println("Enter second number:");
		int num2=in.nextInt();
		
		int min = (num1<num2) ? num1 : num2;
		int max = (num1>num2) ? num1  : num2;
		
		System.out.println("min value is "+min);
		System.out.println("max value is "+max);

	}

}
