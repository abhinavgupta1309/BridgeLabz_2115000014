import java.util.Scanner;
public class UnitConverter2 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a conversion:");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Miles to Kilometers");
        System.out.println("3. Meters to Feet");
        System.out.println("4. Feet to Meters");
        System.out.println("5. Yards to Feet");
        System.out.println("6. Feet to Yards");
        System.out.println("7. Meters to Inches");
        System.out.println("8. Inches to Meters");
        System.out.println("9. Inches to Centimeters");
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
        case 5:
                System.out.print("Enter yards: ");
                double yards = scanner.nextDouble();
                System.out.println(yards + " yards is " + convertYardsToFeet(yards) + " feet.");
                break;
        case 6:
                System.out.print("Enter feet: ");
                feet = scanner.nextDouble();
                System.out.println(feet + " feet is " + convertFeetToYards(feet) + " yards.");
                break;
        case 7:
                System.out.print("Enter meters: ");
                meters = scanner.nextDouble();
                System.out.println(meters + " meters is " + convertMetersToInches(meters) + " inches.");
                break;
        case 8:
                System.out.print("Enter inches: ");
                double inches = scanner.nextDouble();
                System.out.println(inches + " inches is " + convertInchesToMeters(inches) + " meters.");
                break;
        case 9:
                System.out.print("Enter inches: ");
                inches = scanner.nextDouble();
                System.out.println(inches + " inches is " + convertInchesToCentimeters(inches) + " centimeters.");
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
        public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
}
        public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
}
        public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
}
        public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
}
        public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
}
}

