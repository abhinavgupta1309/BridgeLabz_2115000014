class Patient {
    	private static String hospitalName = "KD Dental Hospital";
    	private static int totalPatients = 0;
    	private final int patientID;
    	private String name;
    	private int age;
    	private String ailment;
    	public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
}
    	public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
}
    	public static void displayHospitalName() {
        System.out.println("Hospital Name: " + hospitalName);
}
    	public void displayPatientDetails() {
        if (this instanceof Patient) {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Patient ID: " + this.patientID);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Ailment: " + this.ailment);
} else {
        System.out.println("Invalid patient instance.");
}
}
    	public static void main(String[] args) {
        Patient p1 = new Patient(101, "Abhinav Gupta", 20, "Fever");
        Patient p2 = new Patient(102, "Parth Goyal", 21, "RTS");
        displayHospitalName();
        getTotalPatients();
        System.out.println();
        p1.displayPatientDetails();
        System.out.println();
        p2.displayPatientDetails();
}
}
