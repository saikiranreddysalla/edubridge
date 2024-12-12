package Interface;

public interface vechile {
	void printVechile();
	
	default void Stop () {
		System.out.println("RED-------Stop...");
	}
	static void ReadyToMove() {
		System.out.println("Orange-------Ready to move......");
	}
	static void Move() {
		System.out.println("Green-----vechile is moving......");
	}
 

}



