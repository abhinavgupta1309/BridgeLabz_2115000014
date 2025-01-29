import java.util.Scanner;
public class SubstringOccurences {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.print("Enter a substring: ");
        String substring = scanner.nextLine();
        scanner.close();        
        int count = countSubstringOccurrences(input, substring);
        System.out.println("Occurrences: " + count);
}    
        public static int countSubstringOccurrences(String str, String sub) {
        int count = 0, index = 0;
        while ((index = str.indexOf(sub, index)) != -1) {
        count++;
        index += sub.length();
}
        return count;
}
}
