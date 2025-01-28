import java.util.Scanner;
public class QuotientAndRemainder {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dividend: ");
        int number = sc.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        if (divisor == 0) {
        System.out.println("Division by zero is not allowed.");
}else {
        int[] result = findRemainderAndQuotient(number, divisor);
        System.out.println("The quotient is: " + result[1]);
        System.out.println("The remainder is: " + result[0]);
}
}
        public static int[] findRemainderAndQuotient(int number, int divisor) {
        int remainder = number % divisor;
        int quotient = number / divisor;
        return new int[]{remainder, quotient};
}
}

