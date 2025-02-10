abstract class Patient {
private String patientId;
private String name;
private int age;
public Patient(String patientId, String name, int age) {
this.patientId = patientId;
this.name = name;
this.age = age;
}
public String getPatientId() {
return patientId;
}
public String getName() {
return name;
}
public int getAge() {
return age;
}
public abstract double calculateBill();
public void getPatientDetails() {
System.out.println("Patient ID: " + patientId + ", Name: " + name + ", Age: " + age);
}
}
class InPatient extends Patient {
private double roomCharge;
public InPatient(String patientId, String name, int age, double roomCharge) {
super(patientId, name, age);
this.roomCharge = roomCharge;
}
@Override
public double calculateBill() {
return roomCharge;
}
}
class OutPatient extends Patient {
private double consultationFee;
public OutPatient(String patientId, String name, int age, double consultationFee) {
super(patientId, name, age);
this.consultationFee = consultationFee;
}
@Override
public double calculateBill() {
return consultationFee;
}
}
interface MedicalRecord {
void addRecord();
void viewRecords();
}
class HospitalPatientManagement {
public static void main(String[] args) {
Patient inPatient = new InPatient("P123", "Shraddha", 18, 1000);
Patient outPatient = new OutPatient("P456", "Abhinav", 21, 500);
System.out.println("Details of Patients:");
inPatient.getPatientDetails();
System.out.println("Bill: " + inPatient.calculateBill());
outPatient.getPatientDetails();
System.out.println("Bill: " + outPatient.calculateBill());
}
}
