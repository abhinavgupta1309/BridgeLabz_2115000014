import java.util.Scanner;
public class RemoveCharacter {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.print("Enter character to remove: ");
        char ch = scanner.next().charAt(0);
        scanner.close();        
        String result = removeCharacter(input, ch);
        System.out.println("Modified String: " + result);
}    
        public static String removeCharacter(String str, char ch) {
        return str.replace(Character.toString(ch), "");
}
}
