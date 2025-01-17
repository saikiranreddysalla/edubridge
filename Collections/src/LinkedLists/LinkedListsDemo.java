package LinkedLists;


import java.util.LinkedList;

public class LinkedListsDemo {

	public static void main(String[] args) {
		//normal array list
		LinkedList<Object> al = new LinkedList<> ();
		al.add(100);
		al.add(200);
		al.add("java");
		al.add("python");
		al.add(45000.0);
		al.add(35000.0);
		al.remove(0);
		System.out.println(al.size());
		System.out.println(al);
		System.out.println(al);
		
		//generic version of array list-type safety &avoids type casting
		LinkedList<Integer> subjectMarks = new LinkedList<>();
		subjectMarks.add(44);
		subjectMarks.add(55);
		subjectMarks.add(66);
		subjectMarks.add(77);
		subjectMarks.add(88);
		subjectMarks.add(99);
		//subjectMarks.add("java");
		System.out.println(subjectMarks);
		
		int s1 =subjectMarks.get(0);
		System.out.println(s1);
		

	}

}
