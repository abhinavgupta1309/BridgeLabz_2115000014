import java.util.Scanner;
public class NaturalNumberSum {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        if (n <= 0) {
        System.out.println("The input is not a natural number.");
        return;
}
        int sumRecursive = calculateSumRecursive(n);
        int sumFormula = calculateSumFormula(n);
        System.out.println("Sum using recursion: " + sumRecursive);
        System.out.println("Sum using formula: " + sumFormula);
        if (sumRecursive == sumFormula) {
        System.out.println("Both results match and are correct.");
}else {
        System.out.println("The results do not match. There might be an error.");
}
}
        public static int calculateSumRecursive(int n) {
        if (n == 1) {
        return 1;
}
        return n + calculateSumRecursive(n - 1);
}
        public static int calculateSumFormula(int n) {
        return n * (n + 1) / 2;
}
}
