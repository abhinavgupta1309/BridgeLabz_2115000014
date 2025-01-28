import java.util.Arrays;
public class NumberChecker5 {
public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
}
        public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
        digits[i] = numStr.charAt(i) - '0';
}
        return digits;
}
        public static boolean isPrime(int number) {
        if (number <= 1) {
        return false;
}
        for (int i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0) {
        return false;
}
}
        return true;
}
        public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        while (square > 0) {
        sumOfDigits += square % 10;
        square /= 10;
}
        return sumOfDigits == number;
}
        public static boolean isSpyNumber(int number) {
        int[] digits = getDigitsArray(number);
        int sum = 0;
        int product = 1;
        for (int digit : digits) {
        sum += digit;
        product *= digit;
}
        return sum == product;
}
        public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        String numStr = String.valueOf(number);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
}
        public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7;
}
        public static void main(String[] args) {
        int number = 7;
        System.out.println("Is Prime: " + isPrime(number));
        System.out.println("Is Neon Number: " + isNeonNumber(number));
        System.out.println("Is Spy Number: " + isSpyNumber(number));
        System.out.println("Is Automorphic Number: " + isAutomorphicNumber(number));
        System.out.println("Is Buzz Number: " + isBuzzNumber(number));
}
}
