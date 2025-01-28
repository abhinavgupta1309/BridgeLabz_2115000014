import java.util.Arrays;
public class NumberChecker4 {
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
        public static int[] reverseDigitsArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
        reversed[i] = digits[digits.length - 1 - i];
}
        return reversed;
} 
        public static boolean areArraysEqual(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
        return false;
}
        for (int i = 0; i < array1.length; i++) {
        if (array1[i] != array2[i]) {
        return false;
}
}
        return true;
}
        public static boolean isPalindrome(int number) {
        int[] digits = getDigitsArray(number);
        int[] reversed = reverseDigitsArray(digits);
        return areArraysEqual(digits, reversed);
}
        public static boolean isDuckNumber(int number) {
        int[] digits = getDigitsArray(number);
        for (int i = 1; i < digits.length; i++) {
        if (digits[i] == 0) {
        return true;
}
}
        return false;
}
        public static void main(String[] args) {
        int number = 121;
        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);
        int[] digitsArray = getDigitsArray(number);
        System.out.println("Digits array: " + Arrays.toString(digitsArray));
        int[] reversedArray = reverseDigitsArray(digitsArray);
        System.out.println("Reversed digits array: " + Arrays.toString(reversedArray));
        boolean isPalindrome = isPalindrome(number);
        System.out.println("Is Palindrome: " + isPalindrome);
        boolean isDuck = isDuckNumber(number);
        System.out.println("Is Duck Number: " + isDuck);
}
}
