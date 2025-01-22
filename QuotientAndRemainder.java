import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        if (number2 == 0) {
            System.out.println("Division by zero is not allowed. Please enter a non-zero second number.");
        } else {
            int quotient = number1 / number2;
            int remainder = number1 % number2;
            System.out.printf("The Quotient is %d and Remainder is %d of two numbers %d and %d.%n",
                              quotient, remainder, number1, number2);
        }
    }
}

