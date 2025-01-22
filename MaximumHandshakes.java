import java.util.Scanner;

public class MaximumHandshakes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        if (numberOfStudents < 2) {
            System.out.println("The number of students must be at least 2 for a handshake.");
        } else {
            int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
            System.out.println("The maximum number of handshakes is: " + maxHandshakes);
        }
    }
}

