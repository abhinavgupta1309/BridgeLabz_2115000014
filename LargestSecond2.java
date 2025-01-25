import java.util.Scanner;
public class LargestSecond2 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, index = 0, maxDigit = 10;
        int[] digits = new int[maxDigit];
        int largest = -1, secondLargest = -1;
        System.out.print("Enter a number: ");
        while (!sc.hasNextInt()) {
        sc.next();
        System.out.print("Invalid input. Please enter a valid number: ");
}
        number = sc.nextInt();
        while (number != 0) {
        if (index == maxDigit) {
        maxDigit += 10;
        int[] temp = new int[maxDigit];
        System.arraycopy(digits, 0, temp, 0, digits.length);
        digits = temp;
}
        digits[index] = number % 10;
        number /= 10;
        index++;
}
        for (int i = 0; i < index; i++) {
        if (digits[i] > largest) {
        secondLargest = largest;
        largest = digits[i];
}else if (digits[i] > secondLargest && digits[i] != largest) {
        secondLargest = digits[i];
}
}
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
}
}

