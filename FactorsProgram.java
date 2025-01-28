import java.util.Scanner;
public class FactorsProgram {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = findFactors(number);
        int sum = calculateSum(factors);
        int product = calculateProduct(factors);
        int sumOfSquares = calculateSumOfSquares(factors);

        System.out.print("Factors: ");
        for (int factor : factors) {
        System.out.print(factor + " ");
}
        System.out.println("\nSum of Factors: " + sum);
        System.out.println("Product of Factors: " + product);
        System.out.println("Sum of Squares of Factors: " + sumOfSquares);
}
        public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
        if (number % i == 0) {
        count++;
}
}
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
        if (number % i == 0) {
        factors[index++] = i;
}
}
        return factors;
}
        public static int calculateSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
        sum += factor;
}
        return sum;
}
        public static int calculateProduct(int[] factors) {
        int product = 1;
        for (int factor : factors) {
        product *= factor;
}
        return product;
}
        public static int calculateSumOfSquares(int[] factors) {
        int sumOfSquares = 0;
        for (int factor : factors) {
        sumOfSquares += Math.pow(factor, 2);
}
        return sumOfSquares;
}
}

