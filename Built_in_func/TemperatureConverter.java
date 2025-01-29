import java.util.Scanner;
public class TemperatureConverter {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temp = scanner.nextDouble();
        String type = scanner.next();
        if (type.equals("C")) System.out.println("Fahrenheit: " + celsiusToFahrenheit(temp));
        else System.out.println("Celsius: " + fahrenheitToCelsius(temp));
        scanner.close();
}
        static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
}
        static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
}
}

