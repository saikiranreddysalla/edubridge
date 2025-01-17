package Muntithreading;



//Creating user defined thread using Thread class 
class JavaThread extends Thread{
	@Override
	public void run () {
		//define thread job
		for (int i=1 ; i<=10; i++) {
			System.out.println("java-"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
//2. Creating user defined thread using runnable interface 
class PyhtonThread implements Runnable{
    @Override
	public void run() {
		//define thread job
		for (int i=1 ; i<=10; i++) {
			System.out.println("python-"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		PyhtonThread p = new PyhtonThread();
		Thread t =new Thread(p);
		t.start();
		t.run();
		
		
		//if we join method it will get line by line
	//
		
		
		
		JavaThread j = new JavaThread();
		j.start();//begin thread exception
		//j.reu();    // new thread cannot be created
		
		//main thread job
		for (int i=1 ; i<=10; i++) {
			System.out.println("main-"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
