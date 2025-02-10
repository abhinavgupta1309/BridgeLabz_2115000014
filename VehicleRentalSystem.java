import java.util.*;

abstract class Vehicle {
private String vehicleNumber;
private String type;
private double rentalRate;

public Vehicle(String vehicleNumber, String type, double rentalRate) {
this.vehicleNumber = vehicleNumber;
this.type = type;
this.rentalRate = rentalRate;
}

public String getVehicleNumber() {
return vehicleNumber;
}

public String getType() {
return type;
}

public double getRentalRate() {
return rentalRate;
}

public abstract double calculateRentalCost(int days);
}

interface Insurable {
double calculateInsurance();
String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
private static final double INSURANCE_RATE = 0.05;
private String insurancePolicyNumber;

public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
super(vehicleNumber, "Car", rentalRate);
this.insurancePolicyNumber = insurancePolicyNumber;
}

@Override
public double calculateRentalCost(int days) {
return getRentalRate() * days;
}

@Override
public double calculateInsurance() {
return getRentalRate() * INSURANCE_RATE;
}

@Override
public String getInsuranceDetails() {
return "Car Insurance Policy: " + insurancePolicyNumber;
}
}

class Bike extends Vehicle {
public Bike(String vehicleNumber, double rentalRate) {
super(vehicleNumber, "Bike", rentalRate);
}

@Override
public double calculateRentalCost(int days) {
return getRentalRate() * days;
}
}

class Truck extends Vehicle implements Insurable {
private static final double INSURANCE_RATE = 0.1;
private String insurancePolicyNumber;

public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
super(vehicleNumber, "Truck", rentalRate);
this.insurancePolicyNumber = insurancePolicyNumber;
}

@Override
public double calculateRentalCost(int days) {
return getRentalRate() * days;
}

@Override
public double calculateInsurance() {
return getRentalRate() * INSURANCE_RATE;
}

@Override
public String getInsuranceDetails() {
return "Truck Insurance Policy: " + insurancePolicyNumber;
}
}

public class VehicleRentalSystem {
public static void main(String[] args) {
List<Vehicle> vehicles = new ArrayList<>();

Car car = new Car("C123", 1000, "CAR-INS-001");
Bike bike = new Bike("B456", 500);
Truck truck = new Truck("T789", 2000, "TRUCK-INS-002");

vehicles.add(car);
vehicles.add(bike);
vehicles.add(truck);

int rentalDays = 5;

for (Vehicle vehicle : vehicles) {
System.out.println("Vehicle Type: " + vehicle.getType());
System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
System.out.println("Rental Cost for " + rentalDays + " days: " + vehicle.calculateRentalCost(rentalDays));

if (vehicle instanceof Insurable) {
System.out.println(((Insurable) vehicle).getInsuranceDetails());
System.out.println("Insurance Cost: " + ((Insurable) vehicle).calculateInsurance());
}
System.out.println("--------------------------");
}
}
}
