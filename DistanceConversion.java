import java.util.Scanner;

public class DistanceConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        double feetPerYard = 3.0;
        double yardsPerMile = 1760.0;

        double distanceInYards = distanceInFeet / feetPerYard;
        double distanceInMiles = distanceInYards / yardsPerMile;

        System.out.printf("The distance is %.2f yards and %.2f miles for the distance of %.2f feet.%n", 
                          distanceInYards, distanceInMiles, distanceInFeet);

    }
}

