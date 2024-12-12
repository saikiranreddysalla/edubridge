package Inheritance;

class Parent {
	public final void study( ) {
		System.out.println("medicine");
	}
	public void property() {
		System.out.println("100Arce+100kgs of Gold");
	}
	public void marry() {
		System.out.println("Arrange marriage");
	}
	
}

class Child extends Parent{
	
	//Overriding method
	public void marry() {
		System.out.println("Love marriage");
	}
	
}

public class OverridingDemo {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.property();
		p.study();
		p.marry();
		
		System.out.println("--------------");
		Child c = new Child();
		c.property();
		c.study();
		c.marry();
	
		}

	}



