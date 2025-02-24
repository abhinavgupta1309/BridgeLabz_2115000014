import java.io.*;
import java.util.*;
class DataStreamExample {
    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("student.dat"));
             DataInputStream dis = new DataInputStream(new FileInputStream("student.dat"))) {
            dos.writeInt(101);
            dos.writeUTF("John Doe");
            dos.writeDouble(3.8);
            System.out.println("Data written successfully.");
            int id = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();
            System.out.println("Student: " + id + ", " + name + ", GPA: " + gpa);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
