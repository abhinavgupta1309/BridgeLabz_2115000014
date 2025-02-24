import java.io.*;

public class TryWithResources {
    public static void main(String[] args) {
        System.out.println("Reading first line from file: info.txt");
        try (BufferedReader br = new BufferedReader(new FileReader("info.txt"))) {
            System.out.println("First line: " + br.readLine());
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
