package exceptions;

public class Test1 {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		
		try {
			System.out.println(x/y);
		}catch(ArithmeticException e) {
			System.out.println("cannot divide by 0");
		}
		System.out.println("hello");
		
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			System.out.println("Exception Raised!");
		}
		System.out.println("java");
				
		

	}

}
