package pyramidofnumbers;

import java.util.Scanner;

public class pattren1 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("how many rows you want in the pyramid?");
		
		int Rows = sc.nextInt();
		
		int rowCount = 1;
		
		System.out.println("Here is your pyramid");
		
		for(int i=Rows;i>0;i--)
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.println(" ");
			}
			for(int j=1;j<=rowCount;j++)
			{
				System.out.print(rowCount+" ");
			}
			System.out.println();
			rowCount++;
		}

	}

}