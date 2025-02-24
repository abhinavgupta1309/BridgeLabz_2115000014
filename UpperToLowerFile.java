import java.io.*;
import java.util.*;
class UpperToLowerFile {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("uppercase.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("lowercase.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line.toLowerCase());
                bw.newLine();
            }
            System.out.println("Conversion completed.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
