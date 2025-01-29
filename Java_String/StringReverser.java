import java.util.Scanner;
public class StringReverser {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();        
        String reversed = reverseString(input);
        System.out.println("Reversed String: " + reversed);
}    
        public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
        reversed.append(str.charAt(i));
}
        return reversed.toString();
}
}
