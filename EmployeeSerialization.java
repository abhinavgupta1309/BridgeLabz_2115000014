import java.io.*;
import java.util.*;
class Employee implements Serializable {
    int id;
    String name, department;
    double salary;
    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}
class EmployeeSerialization {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employees.dat"));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employees.dat"))) {
            Employee emp = new Employee(101, "Alice", "IT", 75000);
            oos.writeObject(emp);
            System.out.println("Employee serialized.");
            Employee retrieved = (Employee) ois.readObject();
            System.out.println("Deserialized Employee: " + retrieved.name);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
