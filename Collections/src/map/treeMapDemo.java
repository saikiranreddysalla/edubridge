package map;

import java.util.Map;
import java.util.TreeMap;

/*TreeMap= To Store key and value pair
 * Ordered based on based keys
 * null  Values are not allowed
 */
public class treeMapDemo {
	public static void main(String[] args) {
		TreeMap<String,Integer> hm = new TreeMap<>();
		hm.put("JFS", 400);
		hm.put("PFS",400);
		hm.put("MEAN", 250);
		hm.put("MERN", 250);
		System.out.println(hm);
		
		hm.put("JFS", 500);
		System.out.println(hm);
		
		//Null key is not allowed. Leads to NPE
		//hm.put(null, 100);
		//System.out.println(hm);
		
		hm.put("Angular", null);
		System.out.println(hm);
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		
		for(Map.Entry<String, Integer>entry: hm.entrySet()) {
		System.out.println(entry);	
		}	
	}

}
