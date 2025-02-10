abstract class Vehicle {
private String vehicleId;
private String driverName;
private double ratePerKm;
public Vehicle(String vehicleId, String driverName, double ratePerKm) {
this.vehicleId = vehicleId;
this.driverName = driverName;
this.ratePerKm = ratePerKm;
}
public String getVehicleId() {
return vehicleId;
}
public String getDriverName() {
return driverName;
}
public double getRatePerKm() {
return ratePerKm;
}
public abstract double calculateFare(double distance);
public void getVehicleDetails() {
System.out.println("Vehicle ID: " + vehicleId + ", Driver Name: " + driverName + ", Rate per KM: " + ratePerKm);
}
}
class Car extends Vehicle {
public Car(String vehicleId, String driverName, double ratePerKm) {
super(vehicleId, driverName, ratePerKm);
}
@Override
public double calculateFare(double distance) {
return getRatePerKm() * distance;
}
}
class Bike extends Vehicle {
public Bike(String vehicleId, String driverName, double ratePerKm) {
super(vehicleId, driverName, ratePerKm);
}
@Override
public double calculateFare(double distance) {
return getRatePerKm() * distance;
}
}
class Auto extends Vehicle {
public Auto(String vehicleId, String driverName, double ratePerKm) {
super(vehicleId, driverName, ratePerKm);
}
@Override
public double calculateFare(double distance) {
return getRatePerKm() * distance;
}
}
interface GPS {
String getCurrentLocation();
void updateLocation(String newLocation);
}
class RideHailingApplication {
public static void main(String[] args) {
Vehicle car = new Car("V123", "Abhinav Gupta", 200);
Vehicle bike = new Bike("V456", "Bob Marley", 10);
Vehicle auto = new Auto("V789", "Osama Bin laden", 12);
System.out.println("Details of Vehicles:");
car.getVehicleDetails();
System.out.println("Fare for 10 KM: " + car.calculateFare(10));
bike.getVehicleDetails();
System.out.println("Fare for 10 KM: " + bike.calculateFare(10));
auto.getVehicleDetails();
System.out.println("Fare for 10 KM: " + auto.calculateFare(10));
}
}
