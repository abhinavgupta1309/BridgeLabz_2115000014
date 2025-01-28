import java.util.Arrays;
public class NumberChecker3 {
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
        public static int sumOfDigits(int number) {
        int[] digits = getDigitsArray(number);
        int sum = 0;
        for (int digit : digits) {
        sum += digit;
}
        return sum;
}
        public static int sumOfSquaresOfDigits(int number) {
        int[] digits = getDigitsArray(number);
        int sum = 0;
        for (int digit : digits) {
        sum += Math.pow(digit, 2);
}
        return sum;
}
        public static boolean isHarshadNumber(int number) {
        int sum = sumOfDigits(number);
        return number % sum == 0;
}
        public static int[][] digitFrequency(int number) {
        int[] digits = getDigitsArray(number);
        int[][] frequency = new int[10][2];
        for (int i = 0; i < 10; i++) {
        frequency[i][0] = i;
}
        for (int digit : digits) {
        frequency[digit][1]++;
}
        return frequency;
}
        public static void main(String[] args) {
        int number = 21;
        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);
        int[] digitsArray = getDigitsArray(number);
        System.out.println("Digits array: " + Arrays.toString(digitsArray));
        int sumDigits = sumOfDigits(number);
        System.out.println("Sum of digits: " + sumDigits);
        int sumSquares = sumOfSquaresOfDigits(number);
        System.out.println("Sum of squares of digits: " + sumSquares);
        boolean isHarshad = isHarshadNumber(number);
        System.out.println("Is Harshad Number: " + isHarshad);
        int[][] frequency = digitFrequency(number);
        System.out.println("Digit frequencies:");
        for (int[] freq : frequency) {
        if (freq[1] > 0) {
        System.out.println("Digit: " + freq[0] + ", Frequency: " + freq[1]);
}
}
}
}
