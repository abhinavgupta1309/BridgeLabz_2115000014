import java.util.ArrayList;
class Employee {
    	private String name;
    	public Employee(String name) {
        this.name = name;
}
    	public String getName() {
        return name;
}
}
class Department {
    	private String name;
    	private ArrayList<Employee> employees;
    	public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
}
    	public void addEmployee(Employee employee) {
        employees.add(employee);
}
    	public void displayEmployees() {
        System.out.println("Department: " + name);
        for (Employee employee : employees) {
        System.out.println("Employee: " + employee.getName());
}
}
}
class Company {
    	private String name;
   	private ArrayList<Department> departments;
    	public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
}
    	public void addDepartment(Department department) {
        departments.add(department);
}
    	public void displayCompanyStructure() {
        System.out.println("Company: " + name);
        for (Department department : departments) {
        department.displayEmployees();
}
}
}
public class Company1 {
public static void main(String[] args) {
        Company company = new Company("Capgemini");        
        Department itDepartment = new Department("IT");
        Department hrDepartment = new Department("HR");        
        itDepartment.addEmployee(new Employee("Abhinav"));
        itDepartment.addEmployee(new Employee("Parth"));
        hrDepartment.addEmployee(new Employee("Mahak"));
        
        company.addDepartment(itDepartment);
        company.addDepartment(hrDepartment);
        
        company.displayCompanyStructure();
}
}
