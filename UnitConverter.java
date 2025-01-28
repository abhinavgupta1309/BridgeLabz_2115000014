import java.util.Scanner;
public class UnitConverter {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a conversion:");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Miles to Kilometers");
        System.out.println("3. Meters to Feet");
        System.out.println("4. Feet to Meters");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
        case 1:
                System.out.print("Enter kilometers: ");
                double km = scanner.nextDouble();
                System.out.println(km + " kilometers is " + convertKmToMiles(km) + " miles.");
                break;
        case 2:
                System.out.print("Enter miles: ");
                double miles = scanner.nextDouble();
                System.out.println(miles + " miles is " + convertMilesToKm(miles) + " kilometers.");
                break;
        case 3:
                System.out.print("Enter meters: ");
                double meters = scanner.nextDouble();
                System.out.println(meters + " meters is " + convertMetersToFeet(meters) + " feet.");
                break;
        case 4:
                System.out.print("Enter feet: ");
                double feet = scanner.nextDouble();
                System.out.println(feet + " feet is " + convertFeetToMeters(feet) + " meters.");
                break;
        default:
                System.out.println("Invalid choice.");
}
}
        public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
}
        public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
}
        public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
}
        public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
}
}
