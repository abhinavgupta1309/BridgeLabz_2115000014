import java.util.ArrayList;
import java.util.Arrays;
public class NumberChecker2 {
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
        public static boolean isDuckNumber(int number) {
        int[] digits = getDigitsArray(number);
        for (int i = 1; i < digits.length; i++) {
        if (digits[i] == 0) {
        return true;
}
}
        return false;
}
        public static boolean isArmstrongNumber(int number) {
        int[] digits = getDigitsArray(number);
        int power = digits.length;
        int sum = 0;
        for (int digit : digits) {
        sum += Math.pow(digit, power);
}
        return sum == number;
}
        public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
        if (digit > largest) {
        secondLargest = largest;
        largest = digit;
}else if (digit > secondLargest && digit != largest) {
        secondLargest = digit;
}
}
        return new int[]{largest, secondLargest};
}
        public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
        if (digit < smallest) {
        secondSmallest = smallest;
        smallest = digit;
} else if (digit < secondSmallest && digit != smallest) {
        secondSmallest = digit;
}
}
        return new int[]{smallest, secondSmallest};
}
        public static void main(String[] args) {
        int number = 153;
        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);
        int[] digitsArray = getDigitsArray(number);
        System.out.println("Digits array: " + Arrays.toString(digitsArray));
        boolean isDuck = isDuckNumber(number);
        System.out.println("Is Duck Number: " + isDuck);
        boolean isArmstrong = isArmstrongNumber(number);
        System.out.println("Is Armstrong Number: " + isArmstrong);
        int[] largestAndSecondLargest = findLargestAndSecondLargest(digitsArray);
        System.out.println("Largest and Second Largest: " + Arrays.toString(largestAndSecondLargest));
        int[] smallestAndSecondSmallest = findSmallestAndSecondSmallest(digitsArray);
        System.out.println("Smallest and Second Smallest: " + Arrays.toString(smallestAndSecondSmallest));
}
}

