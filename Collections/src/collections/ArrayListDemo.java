package collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		System.out.println(al.size());
		
		al.add(100);
		al.add(200);
		System.out.println(al.size());
		System.out.println(al);
		
		al.add("java");
		al.add("python");
		System.out.println(al.size());
		System.out.println(al);
		
		al.add(2,"Angular");
	    System.out.println(al.size());
		System.out.println(al);
		
		al.set(0,1000);//updating
		System.out.println(al.size());
		System.out.println(al);
		
		al.remove(0);
		System.out.println(al.size());
		System.out.println(al);
		
		System.out.println(al.get(0));
	//	System.out.println(al.get(5));
		System.out.println(al.get(al.size()-1));
		
		al.clear();//remove all elements
		System.out.println(al.size());
		System.out.println(al);
		
		
	}
}
