//Introduced in java 8
@FunctionalInterface 

//FunctionalInterface which has only one abstract method and (default + static methods)
public interface Printer {
	//Only one abstract method is allowed
    void printJob(); //Implicitly public abstract
    
    //Any number of default and static methods are allowed. by using directly in interface
    default void scan() {
    	System.out.println("scan.....");
    }
    static void threeDprint() {
    	System.out.println("3D print.....");
    }
}