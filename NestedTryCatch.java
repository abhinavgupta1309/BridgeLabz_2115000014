import java.util.Scanner;
public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {10, 20, 30};
        System.out.println("Enter index and divisor:");
        try {
            int index = scanner.nextInt();
            int divisor = scanner.nextInt();
            try {
                System.out.println("Performing division...");
                System.out.println("Result: " + (arr[index] / divisor));
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
    }
}
