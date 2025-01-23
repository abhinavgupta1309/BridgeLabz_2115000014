import java.util.Scanner;
public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else if (number == 0) {
            System.out.println("The factorial of 0 is 1.");
        } else {
            long factorial = 1; // Use 'long' to handle large values
            int counter = number;

            while (counter > 0) {
                factorial *= counter;
                counter--;
            }
            System.out.println("The factorial of " + number + " is " + factorial + ".");
        }
    }
}

