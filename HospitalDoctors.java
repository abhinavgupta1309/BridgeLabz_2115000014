import java.util.ArrayList;
class Patient {
    	private String name;
    	private ArrayList<Doctor> doctors;
    
    	public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
}  
    	public String getName() {
        return name;
}
    	public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
}
    	public void displayDoctors() {
        System.out.println("Patient: " + name + " is consulting:");
        for (Doctor doctor : doctors) {
        System.out.println("Doctor: " + doctor.getName());
}
}
}
class Doctor {
    	private String name;
    	private ArrayList<Patient> patients;
    	public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
}
    	public String getName() {
        return name;
}
    	public void consult(Patient patient) {
        patients.add(patient);
        patient.addDoctor(this);
        System.out.println("Doctor " + name + " is consulting Patient " + patient.getName());
}
    	public void displayPatients() {
        System.out.println("Doctor: " + name + " has patients:");
        for (Patient patient : patients) {
        System.out.println("Patient: " + patient.getName());
}
}
}
class Hospital {
    	private String name;
    	private ArrayList<Doctor> doctors;
    	private ArrayList<Patient> patients;
    
    	public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
}
    	public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
}
    	public void addPatient(Patient patient) {
        patients.add(patient);
}
    	public void displayHospitalDetails() {
        System.out.println("Hospital: " + name);
        for (Doctor doctor : doctors) {
        doctor.displayPatients();
}
        for (Patient patient : patients) {
        patient.displayDoctors();
}
}
}
public class HospitalDoctors {
public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");
        
        Doctor doctor1 = new Doctor("Dr. Abhinav");
        Doctor doctor2 = new Doctor("Dr. Parth");
        
        Patient patient1 = new Patient("Kshtiz");
        Patient patient2 = new Patient("Raghav");
        
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        
        doctor1.consult(patient1);
        doctor1.consult(patient2);
        doctor2.consult(patient1);
        
        hospital.displayHospitalDetails();
}
}

