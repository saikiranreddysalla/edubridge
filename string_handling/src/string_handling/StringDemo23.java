package string_handling;
/*
 string is immutable (non changeable)
 */

public class StringDemo23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="Java";
		System.out.println(s);
		
		s.concat("23");
		System.out.println(s);
		
		//If we want to change we have to assign different variable
		
		String s2 = s.concat("23");
		System.out.println(s2);
		
		

	}

}
