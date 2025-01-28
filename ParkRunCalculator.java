import java.util.Scanner;
public class ParkRunCalculator {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input for Side 1 (in meters):");
        double side1 = scanner.nextDouble();
        System.out.println("Input for Side 2 (in meters):");
        double side2 = scanner.nextDouble();
        System.out.println("Input for Side 3 (in meters):");
        double side3 = scanner.nextDouble();

        double perimeter = calculatePerimeter(side1, side2, side3);
        double distanceToRun = 5000;
        int rounds = (int) Math.ceil(calculateRounds(distanceToRun, perimeter));
        System.out.println("The user needs to complete " + rounds + " rounds to cover 5km.");
}
        public static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
}
        public static double calculateRounds(double distanceToRun, double perimeter) {
        return distanceToRun / perimeter;
}
}

