package exceptions;

public class CustomizedExceptionDemo {
	static int balance = 5000;
	public static void checkAge(int age) throws InvalidAgeException {
		if (age >= 18) {
			System.out.println("Eligible to vote");
		}else {
			throw new InvalidAgeException("not eligible to vote");
		}
	}

	
	public static void withdraw(int amount) {
		
		if (amount > balance) {
			throw new InSufficientBalanceException("Insufficient funds");
		}else {
			System.out.println("collect cash");
		}
	}

	public static void main(String[] args) {
		try {
			checkAge(18);
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
			
		}
		try {
			withdraw(4000);
		} catch (InSufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
