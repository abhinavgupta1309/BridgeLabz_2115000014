class Employee {
    	public int employeeID;
    	protected String department;
    	private double salary;

    	public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
}
    	public double getSalary() {
        return salary;
}
    	public void setSalary(double salary) {
        if (salary >= 0) {
        this.salary = salary;
        } else {
        System.out.println("Salary cannot be negative.");
}
}
    	public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
}
}
class Manager extends Employee {
    	private String team;
    	public Manager(int employeeID, String department, double salary, String team) {
        super(employeeID, department, salary);
        this.team = team;
}
    	public void displayManagerDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Team: " + team);
}
}
