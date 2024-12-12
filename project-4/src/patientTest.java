public class patientTest {
	public static void main(String[] args) {

		Patient d1 = new Patient("S.Ramesh", "Fever", "Yashoda Hospital");
		d1.displayPatientDetails();
		System.out.println("****");
		Patient d2 = new Patient("T.Suresh", "Cancer", "KIMS Hospital");
		d2.displayPatientDetails();

		System.out.println("****");

		Patient d3 = new Patient("S.Rakesh", "Cancer", "Osmania General Hospital");
		d2.displayPatientDetails();
	}
}