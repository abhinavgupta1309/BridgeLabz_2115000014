import java.util.*;
import java.time.*;
class Employee {
    String name, department;
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
}

class GroupByDepartment {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee("Alice", "HR"),
            new Employee("Bob", "IT"),
            new Employee("Carol", "HR")
        );
        Map<String, List<Employee>> grouped = new HashMap<>();
        for (Employee emp : employees) {
            grouped.computeIfAbsent(emp.department, k -> new ArrayList<>()).add(emp);
        }
        System.out.println(grouped);
    }
}
