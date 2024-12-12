package HashSet;

import java.util.LinkedHashSet;
/*
LinkedHashSet:
*Insertion order will be maintained.
Elements are added  based on Insertion of the object
* Duplicates are not allowed.
*/



public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
			LinkedHashSet<Integer> hs = new LinkedHashSet<>();
			hs.add(100);
			hs.add(300);
			hs.add(500);
			hs.add(400);
			hs.add(200);
			hs.add(600);
			System.out.println(hs);
			
			
			hs.add(100);
			hs.add(200);
			System.out.println(hs);
			
			
			
			System.out.println(hs);

	}

}
