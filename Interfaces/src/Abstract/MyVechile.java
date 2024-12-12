package Abstract;

public abstract class MyVechile implements Vechile{
    public void start() {
   	 System.out.println("start....");
    } 
    public void move() {
   	 System.out.println("move....");
    } 
    public abstract void stop();
    public abstract void noOfWheels();    
}