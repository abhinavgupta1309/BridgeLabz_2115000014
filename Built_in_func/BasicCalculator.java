import java.util.Scanner;
public class BasicCalculator {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        String op = scanner.next();
        System.out.println("Result: " + calculate(a, b, op));
        scanner.close();
}
        static double calculate(double a, double b, String op) {
        switch (op) {
        case "+": return a + b;
        case "-": return a - b;
        case "*": return a * b;
        case "/": return b != 0 ? a / b : Double.NaN;
        default: return Double.NaN;
}
}
}

