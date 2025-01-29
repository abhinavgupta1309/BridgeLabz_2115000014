import java.util.Scanner;
public class WordReplacer {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter word to replace: ");
        String target = scanner.nextLine();
        System.out.print("Enter replacement word: ");
        String replacement = scanner.nextLine();
        scanner.close();        
        String result = replaceWord(sentence, target, replacement);
        System.out.println("Modified Sentence: " + result);
}    
        public static String replaceWord(String sentence, String target, String replacement) {
        return sentence.replace(target, replacement);
}
}

