import java.util.Scanner;
public class FibonacciGenerator {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int terms = scanner.nextInt();
        generateFibonacci(terms);
        scanner.close();
}
        static void generateFibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
        System.out.print(a + " ");
        int next = a + b;
        a = b;
        b = next;
}
}
}

