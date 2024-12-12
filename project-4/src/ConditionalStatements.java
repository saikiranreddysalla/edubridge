
public class ConditionalStatements {
	
	public static boolean isEven(int num) {
		boolean status = false;
		if(num % 2 ==0) {
			status = true;
		}
		return status;
	}
	
	public static boolean isOdd(int num) {
		boolean status = true;
		if (num /2 == 1) {
			status = false;
			
		}
		return false;
		
	}
	public static void findEvenOrOdd(int num) {
		if(num%2 == 0) {
			System.out.println(num+" is even");
		}else {
			System.out.println(num+" is odd");
		}
			
		
	}
	public static double findDiscount (double billAmount) {
		double discount = 0.0;
		
		if (100 < billAmount && billAmount <= 250) {
			discount = billAmount * .05;//5%
		}else if(250 < billAmount && billAmount <= 500) {
			discount = billAmount * .1;//10%
		}else if(500 < billAmount && billAmount <= 750) {
		    discount = billAmount * .15;//15%
		}else if(750<billAmount && billAmount <= 1000) {
		    discount = billAmount * .2;//20%
	    }else{
		    discount = billAmount * .3;//30%
	    }
		
		return discount;
	
	}
	public static void billGenerate(double billAmount) {
		double discount = findDiscount(billAmount);
	    System.out.println("Bill Amount: "+billAmount);
	    System.out.println("Discount: "+discount);
	    System.out.println("Final Bill Amount: "+(billAmount-discount));
	}
	
	public static void calc(int num, String opertion) {
		switch(opertion) {
		case "square":
			System.out.println("Square "+num+" is "+(num*num));
			break;
		case "cube":
			System.out.println("Cube "+num+" is "+(num*num*num));
			break;
		default:
			System.out.println("Invalid Operation");
		}
	}

	public static void main(String[] args) {
		
		int num = 10;
		String operator = "cube";
		calc(num, operator);
		
		
		
		double billAmount = 1000;
		billGenerate(billAmount);
		
        findEvenOrOdd(10);
		findEvenOrOdd(11);
		findEvenOrOdd(12);
		
		
		System.out.println(isEven(10));
		System.out.println(isEven(111));
		System.out.println(isEven(12));

	}

}
