import java.util.HashMap;
import java.util.Scanner;
public class MostFrequentCharacter {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();        
        char mostFrequent = findMostFrequentCharacter(input);
        System.out.println("Most Frequent Character: " + mostFrequent);
}    
        public static char findMostFrequentCharacter(String str) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
        frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
}        
        char maxChar = ' ';
        int maxCount = 0;
        for (char ch : frequencyMap.keySet()) {
        if (frequencyMap.get(ch) > maxCount) {
        maxCount = frequencyMap.get(ch);
        maxChar = ch;
}
}
        return maxChar;
}
}
