import java.io.*;

public class CountWordOccurrence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        String word = "hello";
        int count = 0;
        String line;
        while ((line = br.readLine()) != null) {
            for (String w : line.split(" ")) {
                if (w.equals(word)) count++;
            }
        }
        br.close();
        System.out.println("Word Count: " + count);
    }
}
