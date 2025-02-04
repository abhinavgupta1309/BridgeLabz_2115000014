class Vehicle {
    	private static double registrationFee = 2000.0;
    	private final String registrationNumber;
    	private String ownerName;
    	private String vehicleType;
    	public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
}
    	public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
}
    	public void displayVehicleDetails() {
        if (this instanceof Vehicle) {
        System.out.println("Owner Name: " + this.ownerName);
        System.out.println("Vehicle Type: " + this.vehicleType);
        System.out.println("Registration Number: " + this.registrationNumber);
        System.out.println("Registration Fee: $" + registrationFee);
} else {
        System.out.println("Invalid vehicle instance.");
}
}
    	public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Abhinav Gupta", "JCB", "DL0001");
        Vehicle vehicle2 = new Vehicle("Kshitiz Katiyar", "Buldozer", "MH0069");
        System.out.println("Before fee update:");
        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();
        updateRegistrationFee(600.0);
        System.out.println("\nAfter fee update:");
        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();
}
}

