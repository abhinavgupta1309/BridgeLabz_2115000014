import java.io.*;

public class FileReaderVsInputStreamReader {
    public static void main(String[] args) throws IOException {
        String filename = "largeFile.txt"; // A large 100MB file

        // FileReader
        long startTime = System.nanoTime();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        int wordCount = 0;
        String line;
        while ((line = br.readLine()) != null) {
            wordCount += line.split("\\s+").length;
        }
        br.close();
        long endTime = System.nanoTime();
        System.out.println("FileReader Word Count: " + wordCount + ", Time: " + (endTime - startTime));

        // InputStreamReader
        startTime = System.nanoTime();
        BufferedReader br2 = new BufferedReader(new InputStreamReader(new FileInputStream(filename), "UTF-8"));
        wordCount = 0;
        while ((line = br2.readLine()) != null) {
            wordCount += line.split("\\s+").length;
        }
        br2.close();
        endTime = System.nanoTime();
        System.out.println("InputStreamReader Word Count: " + wordCount + ", Time: " + (endTime - startTime));
    }
}
