package Inheritance;

/*
 Inheritance:
 To Extends one class from another In order to reuse the functionality
 */

public class InheritanceDemo {

	public static void main(String[] args) {
		Phone p = new Phone();
		p.call();
		p.msg();
		
		System.out.println("--------------------------------------------");
		
		SmartPhone sp = new SmartPhone();
		sp.call();
		sp.msg();
		sp.browsing();
	}

}
