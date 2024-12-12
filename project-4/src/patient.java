public class patient {
	String name;
	String specialization;
	String hospital;

	static String City = "Hyderabad";

	public Patient (String name, String suferwith, String hospital) {
		System.out.println("Hyderabad Doctors list");
		this.name = name;
		this.suferwith = suferwith;
		this.hospital = hospital;
	}

	public void displayPatientDetails() {
		System.out.println("patient's Name: " + name);
		System.out.println("Suferwith : " + suferwith);
		System.out.println("Hospital: " + hospital);
	}
}