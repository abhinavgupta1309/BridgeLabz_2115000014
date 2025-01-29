import java.util.Scanner;
import java.util.LinkedHashSet;
public class RemoveDuplicates {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();        
        String result = removeDuplicateCharacters(input);
        System.out.println("Modified String: " + result);
}    
        public static String removeDuplicateCharacters(String str) {
        LinkedHashSet<Character> seen = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();   
        for (char ch : str.toCharArray()) {
        if (seen.add(ch)) {
        result.append(ch);
}
}        
        return result.toString();
}
}

