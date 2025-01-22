import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number2 != 0 ? number1 / number2 : Double.NaN; // Avoid division by zero

        System.out.printf("The addition, subtraction, multiplication, and division value of two numbers %.2f and %.2f is %.2f, %.2f, %.2f, and ",
                          number1, number2, addition, subtraction, multiplication);
        if (number2 != 0) {
            System.out.printf("%.2f.%n", division);
        } else {
            System.out.println("undefined (division by zero).\n");
        }
    }
}

