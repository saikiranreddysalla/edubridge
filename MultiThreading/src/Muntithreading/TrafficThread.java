package Muntithreading;

class RedThread extends Thread{
	@Override
	public void run () {
		//define thread job
		
			System.out.println("Red");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			}
			
	}
class OrangeThread implements Runnable{
	@Override
	public void run () {
		//define thread job
		
		System.out.println("Orange");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}



public class TrafficThread {

	public static void main(String[] args) throws InterruptedException {
		while(true) {
			RedThread r = new RedThread();
			r.start();
			r.join();
			
			OrangeThread o = new OrangeThread();
			Thread t =new Thread(o);
			t.start();
			t.join();
			//main method
			System.out.println("Green");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		}
		
	}
		

	
		




