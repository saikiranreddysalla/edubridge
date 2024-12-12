package methods;

public class StarProgram {
	public static void printStarProgram (int n ) {
		for (int i =1; i<=n;i++) {
			for (int j = 1 ; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n = 5;
		printStarProgram(n);

	}

}

