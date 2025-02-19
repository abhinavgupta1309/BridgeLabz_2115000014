import java.util.*;

public class FrequencyCounter {
public static void main(String[] args) {
List<String> words = Arrays.asList("apple", "banana", "apple", "orange");
Map<String, Integer> frequency = new HashMap<>();
for (String word : words) frequency.put(word, frequency.getOrDefault(word, 0) + 1);
System.out.println("Input: " + words + " -> Output: " + frequency);
}
}
