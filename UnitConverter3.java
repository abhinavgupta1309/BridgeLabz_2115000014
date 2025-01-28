import java.util.Scanner;
public class UnitConverter3 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a conversion:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Pounds to Kilograms");
        System.out.println("4. Kilograms to Pounds");
        System.out.println("5. Gallons to Liters");
        System.out.println("6. Liters to Gallons");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
        case 1:
                System.out.print("Enter Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                System.out.println(fahrenheit + " Fahrenheit is " + convertFahrenheitToCelsius(fahrenheit) + " Celsius.");
                break;
        case 2:
                System.out.print("Enter Celsius: ");
                double celsius = scanner.nextDouble();
                System.out.println(celsius + " Celsius is " + convertCelsiusToFahrenheit(celsius) + " Fahrenheit.");
                break;
        case 3:
                System.out.print("Enter Pounds: ");
                double pounds = scanner.nextDouble();
                System.out.println(pounds + " Pounds is " + convertPoundsToKilograms(pounds) + " Kilograms.");
                break;
        case 4:
                System.out.print("Enter Kilograms: ");
                double kilograms = scanner.nextDouble();
                System.out.println(kilograms + " Kilograms is " + convertKilogramsToPounds(kilograms) + " Pounds.");
                break;
        case 5:
                System.out.print("Enter Gallons: ");
                double gallons = scanner.nextDouble();
                System.out.println(gallons + " Gallons is " + convertGallonsToLiters(gallons) + " Liters.");
                break;
        case 6:
                System.out.print("Enter Liters: ");
                double liters = scanner.nextDouble();
                System.out.println(liters + " Liters is " + convertLitersToGallons(liters) + " Gallons.");
                break;
        default:
                System.out.println("Invalid choice.");
}
}
        public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
}
        public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
}
        public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
}
        public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
}
        public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
}
        public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
}
}
