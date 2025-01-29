import java.util.Scanner;
public class LongestWordFinder {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();        
        String longestWord = findLongestWord(input);
        System.out.println("Longest Word: " + longestWord);
}    
        public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = "";   
        for (String word : words) {
        if (word.length() > longestWord.length()) {
        longestWord = word;
}
}        
        return longestWord;
}
}

