public class SearchWordInSentences {
    public static void main(String[] args) {
        String[] sentences = {"Hello world", "Java programming", "OpenAI ChatGPT"};
        String word = "Java";
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                System.out.println(sentence);
                return;
            }
        }
        System.out.println("Not Found");
    }
}
