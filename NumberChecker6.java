import java.util.Arrays;
public class NumberChecker6 {
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
        public static int findGreatestFactor(int number) {
        int[] factors = findFactors(number);
        return factors[factors.length - 1];
}
        public static int sumOfFactors(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int factor : factors) {
        sum += factor;
}
        return sum;
}
        public static int productOfFactors(int number) {
        int[] factors = findFactors(number);
        int product = 1;
        for (int factor : factors) {
        product *= factor;
}
        return product;
}
        public static double productOfCubeOfFactors(int number) {
        int[] factors = findFactors(number);
        double product = 1;
        for (int factor : factors) {
        product *= Math.pow(factor, 3);
}
        return product;
}
        public static boolean isPerfectNumber(int number) {
        int sum = sumOfFactors(number) - number;
        return sum == number;
}
        public static boolean isAbundantNumber(int number) {
        int sum = sumOfFactors(number) - number;
        return sum > number;
}
        public static boolean isDeficientNumber(int number) {
        int sum = sumOfFactors(number) - number;
        return sum < number;
}
        public static boolean isStrongNumber(int number) {
        int[] digits = getDigitsArray(number);
        int sum = 0;
        for (int digit : digits) {
        sum += factorial(digit);
}
        return sum == number;
}
        private static int factorial(int num) {
        if (num == 0 || num == 1) {
        return 1;
}
        int result = 1;
        for (int i = 2; i <= num; i++) {
        result *= i;
}
        return result;
}
        public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
        digits[i] = numStr.charAt(i) - '0';
}
        return digits;
}
        public static void main(String[] args) {
        int number = 28;
        int[] factors = findFactors(number);
        System.out.println("Factors: " + Arrays.toString(factors));
        int greatestFactor = findGreatestFactor(number);
        System.out.println("Greatest Factor: " + greatestFactor);
        int sumFactors = sumOfFactors(number);
        System.out.println("Sum of Factors: " + sumFactors);
        int productFactors = productOfFactors(number);
        System.out.println("Product of Factors: " + productFactors);
        double productCubeFactors = productOfCubeOfFactors(number);
        System.out.println("Product of Cube of Factors: " + productCubeFactors);
        boolean isPerfect = isPerfectNumber(number);
        System.out.println("Is Perfect Number: " + isPerfect);
        boolean isAbundant = isAbundantNumber(number);
        System.out.println("Is Abundant Number: " + isAbundant);
        boolean isDeficient = isDeficientNumber(number);
        System.out.println("Is Deficient Number: " + isDeficient);
        boolean isStrong = isStrongNumber(number);
        System.out.println("Is Strong Number: " + isStrong);
}
}

