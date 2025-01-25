import java.util.Scanner;
public class ReverseNumber {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, count = 0;
        System.out.print("Enter a number: ");
        while (!sc.hasNextInt()) {
        sc.next();
        System.out.print("Invalid input. Please enter a valid number: ");
}
        number = sc.nextInt();
        int temp = number;
        while (temp != 0) {
        temp /= 10;
        count++;
}
        int[] digits = new int[count];
        int[] reversedDigits = new int[count];
        temp = number;
        for (int i = 0; i < count; i++) {
        digits[i] = temp % 10;
        temp /= 10;
}
        for (int i = 0; i < count; i++) {
        reversedDigits[i] = digits[count - 1 - i];
}
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) 
        System.out.print(reversedDigits[i]);
}
}
