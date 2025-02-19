import java.util.*;
import java.time.*;
class WordFrequencyCounter {
    public static void main(String[] args) {
        String text = "Hello world, hello Java!";
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : text.replaceAll("[^a-zA-Z ]", "").toLowerCase().split(" ")) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        System.out.println(frequencyMap);
    }
}
