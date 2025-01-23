import java.util.Scanner;
public class SumOfNaturalFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("The number is not a natural number.");
        } else {
            int formulaResult = n * (n + 1) / 2;
            int loopResult = 0;
            for (int i = 1; i <= n; i++) {
                loopResult += i;
            }
            System.out.println("Sum using formula: " + formulaResult);
            System.out.println("Sum using for loop: " + loopResult);

            if (formulaResult == loopResult) {
                System.out.println("Both results are correct and match!");
            } else {
                System.out.println("The results do not match.");
            }
        }
    }
}
