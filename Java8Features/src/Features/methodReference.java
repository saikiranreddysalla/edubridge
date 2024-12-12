package Features;

@FunctionalInterface
interface Printer {
	void print();
}

public class methodReference {
	public static void beginPrintJob() {
		System.out.println("print job begins...");
	}

	public void startPrintJob() {
		System.out.println("print job begins...");
	}

	public static void main(String[] args) {
		methodReference m = new methodReference();
		Printer p3 = () -> m.startPrintJob();
		p3.print();

		Printer p4 = m::startPrintJob;
		p3.print();

		Printer p1 = () -> methodReference.beginPrintJob();
		p1.print();

		// Method Reference with static method
		Printer p2 = methodReference::beginPrintJob;
		p1.print();

	}
}
