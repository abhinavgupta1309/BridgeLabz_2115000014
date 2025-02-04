class Employee {
    	private static String companyName = "Capgemini";
    	private static int totalEmployees = 0;
    	private final int id;
    	private String name;
    	private String designation;
    	public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
}
    	public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
}
    	public void displayEmployeeDetails() {
        if (this instanceof Employee) {
        System.out.println("Company: " + companyName);
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Designation: " + this.designation);
}else {
        System.out.println("Invalid employee instance.");
}
}
    	public static void main(String[] args) {
        Employee emp1 = new Employee("Abhinav Gupta", 101, "Software Engineer");
        Employee emp2 = new Employee("Parth Goyal", 102, "Software Analyst");
        displayTotalEmployees();
        System.out.println();
        emp1.displayEmployeeDetails();
        System.out.println();
        emp2.displayEmployeeDetails();
}
}

