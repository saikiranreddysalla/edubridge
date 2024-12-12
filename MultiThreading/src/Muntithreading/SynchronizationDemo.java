package Muntithreading;
class Multable{
	public synchronized void printMulTable(int num){
		for(int i=1;i<=10;i++) {
			System.out.println(num+"*"+i+"="+(num*i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class KohliThread extends Thread{
	Multable t;
	
	public KohliThread(Multable t) {
		this.t = t;
	}
	@Override
	public void run() {
		t.printMulTable(9);
	}
	
}
class DhoniThread extends Thread{
	Multable t;
	
	public DhoniThread(Multable t) {
		this.t = t;
	}
	@Override
	public void run() {
		t.printMulTable(10);
	}
	
}
class SaiThread extends Thread{
	Multable t;
	
	public SaiThread(Multable t) {
		this.t = t;
	}
	@Override
	public void run() {
		t.printMulTable(11);
	}
	
}
public class SynchronizationDemo {

	public static void main(String[] args) {
		Multable t= new Multable();
		
		KohliThread t1 = new KohliThread(t);
		DhoniThread t2 = new DhoniThread(t);
		SaiThread   t3 = new SaiThread(t);
		
		t1.start();
		t2.start();
		t3.start();
		
		// TODO Auto-generated method stub

	}

}
