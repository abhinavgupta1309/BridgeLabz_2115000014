import java.io.*;
import java.util.*;

class WordCount {
public static void main(String[] args) {
String filePath = "sample.txt"; // Change this to the path of your text file
Map<String, Integer> wordCountMap = new HashMap<>();

try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
String line;
while ((line = reader.readLine()) != null) {
String[] words = line.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+");
for (String word : words) {
if (!word.isEmpty()) {
wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
}
}
}
} catch (IOException e) {
System.out.println("Error reading the file: " + e.getMessage());
return;
}

List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCountMap.entrySet());
sortedWords.sort((a, b) -> b.getValue().compareTo(a.getValue()));

System.out.println("Top 5 Most Frequent Words:");
int count = 0;
for (Map.Entry<String, Integer> entry : sortedWords) {
System.out.println(entry.getKey() + " - " + entry.getValue());
count++;
if (count == 5) break;
}
}
}
