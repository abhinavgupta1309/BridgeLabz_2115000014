class Employee {
String name;
int id;
double salary;
Employee(String name, int id, double salary) {
	this.name = name;
	this.id = id;
	this.salary = salary;
}
void displayDetails() {
System.out.println("Emplyoee Name: " + name + ", ID: " + id + ", Salary: " + salary);
}
}
class Manager extends Employee {
int teamSize;
Manager(String name, int id, double salary, int teamSize) {
	super(name, id, salary);
	this.teamSize = teamSize;
}
void displayDetails() {
super.displayDetails();
System.out.println("Team Size: " + teamSize);
}
}
class Developer extends Employee {
String programmingLanguage;
Developer(String name, int id, double salary, String programmingLanguage) {
	super(name, id, salary);
	this.programmingLanguage = programmingLanguage;
}
void displayDetails() {
super.displayDetails();
System.out.println("Programming Language: " + programmingLanguage);
}
}
class Intern extends Employee {
int duration;
Intern(String name, int id, double salary, int duration) {
	super(name, id, salary);
	this.duration = duration;
}
void displayDetails() {
super.displayDetails();
System.out.println("Internship Duration: " + duration + " months");
}
}
public class EmployeeMngmt {
public static void main(String[] args) {
        Employee manager = new Manager("Abhinav", 101, 100000, 5);
        Employee developer = new Developer("Tarun", 102, 80000, "Java");
        Employee intern = new Intern("Aditya", 103, 20000, 6);

        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();
}
}

