
public class FuntionalInterfaceDemo {
	public static void main(String[] args) {
		Printer p = new EpsonPrinter();
		p.printJob();
		p.scan();
		Printer.threeDprint();
		
	}

}
