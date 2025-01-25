import java.util.Scanner;
public class DigitFrequency {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Enter a number: ");
        while (!sc.hasNextInt()) {
        sc.next();
        System.out.print("Invalid input. Please enter a valid number: ");
}
        number = sc.nextInt();
        int temp = number;
        int count = 0;
        while (temp != 0) {
        temp /= 10;
        count++;
}
        int[] digits = new int[count];
        int[] frequency = new int[10]; // Frequency array for digits 0 to 9
        temp = number;
        for (int i = 0; i < count; i++) {
        digits[i] = temp % 10;
        temp /= 10;
}
        for (int i = 0; i < count; i++) {
        frequency[digits[i]]++;
}
        System.out.println("Frequency of each digit in the number:");
        for (int i = 0; i < 10; i++) {
        if (frequency[i] > 0) {
        System.out.println("Digit " + i + ": " + frequency[i]);
}
}
}
}

