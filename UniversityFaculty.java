import java.util.ArrayList;
class Faculty {
    	private String name;
    	public Faculty(String name) {
        this.name = name;
}
    	public String getName() {
        return name;
}
}
class Department {
    	private String name;
    	private ArrayList<Faculty> facultyMembers;
    	public Department(String name) {
        this.name = name;
        this.facultyMembers = new ArrayList<>();
}
    	public String getName() {
        return name;
}
    	public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
}
    	public void displayFaculty() {
        System.out.println("Department: " + name);
        for (Faculty faculty : facultyMembers) {
        System.out.println("Faculty: " + faculty.getName());
}
}
}
class University {
    	private String name;
    	private ArrayList<Department> departments;
    	public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
}
    	public void addDepartment(Department department) {
        departments.add(department);
}
    	public void displayUniversity() {
        System.out.println("University: " + name);
        for (Department department : departments) {
        department.displayFaculty();
}
}
}
public class UniversityFaculty {
public static void main(String[] args) {
        University university = new University("Gla University");
        
        Department csDepartment = new Department("Computer Science");
        Department eeDepartment = new Department("Electrical Engineering");
        
        Faculty faculty1 = new Faculty("Dr. Abhinav");
        Faculty faculty2 = new Faculty("Dr. Parth");
        Faculty faculty3 = new Faculty("Dr. Kshitiz");
        
        csDepartment.addFaculty(faculty1);
        csDepartment.addFaculty(faculty2);
        eeDepartment.addFaculty(faculty3);
        
        university.addDepartment(csDepartment);
        university.addDepartment(eeDepartment);
        
        university.displayUniversity();
}
}
