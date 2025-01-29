import java.util.Scanner;
public class MaxOfThreeNumbers {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("Maximum: " + max(a, b, c));
        scanner.close();
}
        static int max(int x, int y, int z) {
        return Math.max(x, Math.max(y, z));
}
}

