import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("The number is not a natural number.");
        } else {
            int formulaResult = n * (n + 1) / 2;
            int loopResult = 0;
            int counter = 1;
            while (counter <= n) {
                loopResult += counter;
                counter++;
            }
            System.out.println("Sum using formula: " + formulaResult);
            System.out.println("Sum using while loop: " + loopResult);

            if (formulaResult == loopResult) {
                System.out.println("Both results are correct and match!");
            } else {
                System.out.println("The results do not match.");
            }
        }
    }
}

