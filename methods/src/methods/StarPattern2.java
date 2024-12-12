package methods;

public class StarPattern2 {
	public static void printStarPattern2 (int n ) {
		for (int i = 5; i>=1;i--) {
			for (int j = 5 ; j<=i ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n = 5;
		printStarPattern2(n);

	}

}
