package collections;

import java.util.ArrayList;

public class ArrayListDDemo2 {

	public static void main(String[] args) {
		//normal array list
		ArrayList al = new ArrayList ();
		al.add(100);
		al.add(200);
		al.add("java");
		al.add("python");
		al.add(45000.0);
		al.add(35000.0);
		System.out.println(al);
		
		//generic version of array list-type safety &avoids type casting
		ArrayList<Integer> subjectMarks = new ArrayList<>();
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
