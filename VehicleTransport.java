class Vehicle {
int maxSpeed;
String fuelType;
Vehicle(int maxSpeed, String fuelType) {
this.maxSpeed = maxSpeed;
this.fuelType = fuelType;
}
void displayInfo() {
System.out.println("Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType);
}
}
class Car extends Vehicle {
int seatCapacity;
Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
}
void displayInfo() {
       	System.out.println("Car - Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType + ", Seat Capacity: " + seatCapacity);
}
}
class Truck extends Vehicle {
int loadCapacity;
Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
}
void displayInfo() {
        System.out.println("Truck - Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType + ", Load Capacity: " + loadCapacity + " tons");
}
}
class Motorcycle extends Vehicle {
boolean hasSidecar;
Motorcycle(int maxSpeed, String fuelType, boolean hasSidecar) {
        super(maxSpeed, fuelType);
        this.hasSidecar = hasSidecar;
}
void displayInfo() {
        System.out.println("Motorcycle - Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType + ", Has Sidecar: " + hasSidecar);
}
}
public class VehicleTransport {
public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car(240, "Petrol", 2),
            new Truck(100, "Diesel", 20),
            new Motorcycle(200, "Petrol", false)
};
        for (Vehicle v : vehicles) {
        v.displayInfo();
}
}
}
