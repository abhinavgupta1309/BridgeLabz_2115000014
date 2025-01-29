import java.util.Scanner;
public class ToggleCase {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();        
        String toggled = toggleCase(input);
        System.out.println("Toggled String: " + toggled);
}    
        public static String toggleCase(String str) {
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
        if (Character.isUpperCase(ch)) {
        result.append(Character.toLowerCase(ch));
} else {
        result.append(Character.toUpperCase(ch));
}
}
        return result.toString();
}
}
