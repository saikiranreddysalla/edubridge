package string_handling;

public class ReverseString {

	public static void main(String[] args) {
		String S = "java";
		String reverse = "";
		System.out.println(S);
		
	        for (int i = S.length() - 1; i >= 0; i--) {
	            reverse += S.charAt(i);
	        }
	    	System.out.println("Reversed String:"+reverse); 
		

	}


}
