package String;

import java.util.Iterator;

public class reverseString {

	public static void main(String[] args) {
	 //1. Using StringBuffer Class
		 
		String str = "SallaSai";
		StringBuffer sbf = new StringBuffer(str);
		System.out.println(sbf.reverse());
		
		System.out.println("-----------------------------");
		
		//2. Using iterative method
		char[] strArray = str.toCharArray();
		
		for (int i = strArray.length-1;i>=0;i--) {
			System.out.print(strArray[i]);
		}
		System.out.println();
		
		

		System.out.println("-----------------------------");
		
		 //Recursive method to reverse string
		
		System.out.println(recursiveMethod(str));
	}
	static String recursiveMethod(String str){
		if ((null ==str)||(str.length()<=1)) {
			return str;
		}
		return recursiveMethod(str.substring(1))+str.charAt(0);
	}

}
