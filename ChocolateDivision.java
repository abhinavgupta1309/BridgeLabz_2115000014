import java.util.Scanner;
public class ChocolateDivision {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = sc.nextInt();
        System.out.print("Enter the number of children: ");
        int numberOfChildren = sc.nextInt();
        if (numberOfChildren == 0) {
        System.out.println("Division by zero is not allowed. There must be at least one child.");
}else {
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
        System.out.println("Each child gets " + result[1] + " chocolates.");
        System.out.println("The remaining chocolates are: " + result[0]);
}
}
        public static int[] findRemainderAndQuotient(int number, int divisor) {
        int remainder = number % divisor;
        int quotient = number / divisor;
        return new int[]{remainder, quotient};
}
}

