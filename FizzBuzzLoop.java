import java.util.Scanner;
public class FizzBuzzLoop {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        if (number > 0) {
        System.out.println("FizzBuzz from 0 to " + number + ":");
        int i = 0;
        while (i <= number) {
if(i % 3 == 0 && i % 5 == 0) {
        System.out.println("FizzBuzz");
}else if (i % 3 == 0) {
        System.out.println("Fizz");
}else if (i % 5 == 0) {
        System.out.println("Buzz");
}else {
        System.out.println(i);
}
i++;
}
}else {
        System.out.println("Please enter a positive integer.");
}
}
}

