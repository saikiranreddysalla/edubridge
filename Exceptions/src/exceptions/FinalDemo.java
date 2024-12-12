package exceptions;
/*
 * If we want to code which is mandatory we use final block
 * finally {
			System.out.println("mandatory code");
		}
 */

public class FinalDemo {
	public static void main(String[] args) {
		System.out.println("start");
		try {
			System.out.println(10/0);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("cannot devide by 0");
			
		}finally {
			System.out.println("mandatory code");
		}
		
		System.out.println("end");
	}

}
