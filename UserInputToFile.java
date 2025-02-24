import java.io.*;
import java.util.*;
class UserInputToFile {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter("user_data.txt")) {
            System.out.print("Enter Name: ");
            String name = reader.readLine();
            System.out.print("Enter Age: ");
            int age = Integer.parseInt(reader.readLine());
            System.out.print("Enter Favorite Programming Language: ");
            String language = reader.readLine();
            writer.write("Name: " + name + "\nAge: " + age + "\nLanguage: " + language);
            System.out.println("Data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
