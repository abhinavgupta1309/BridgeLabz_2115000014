class Vehicle {
String model;
int maxSpeed;
Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
}
}
interface Refuelable {
void refuel();
}
class ElectricVehicle extends Vehicle {
int batteryCapacity;
ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
}
void charge() {
        System.out.println("Electric Vehicle - Model: " + model + ", Max Speed: " + maxSpeed + " km/h, Battery Capacity: " + batteryCapacity + " kWh - Charging");
}
}
class PetrolVehicle extends Vehicle implements Refuelable {
int fuelCapacity;
PetrolVehicle(String model, int maxSpeed, int fuelCapacity) {
        super(model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
}
public void refuel() {
        System.out.println("Petrol Vehicle - Model: " + model + ", Max Speed: " + maxSpeed + " km/h, Fuel Capacity: " + fuelCapacity + " liters - Refueling");
}
}
public class VehicleManagementSystem {
public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model S", 250, 100);
        PetrolVehicle pv = new PetrolVehicle("Ford Mustang", 240, 60);
        ev.charge();
        pv.refuel();
}
}

