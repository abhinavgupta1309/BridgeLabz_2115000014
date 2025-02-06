import java.util.ArrayList;
class Course {
    private String name;
    private ArrayList<Student> students;
    
    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }
    
    public String getName() {
        return name;
    }
    
    public void enrollStudent(Student student) {
        students.add(student);
    }
    
    public void displayStudents() {
        System.out.println("Course: " + name);
        for (Student student : students) {
            System.out.println("Student: " + student.getName());
        }
    }
}

class Student {
    private String name;
    private ArrayList<Course> courses;
    
    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }
    
    public String getName() {
        return name;
    }
    
    public void enrollInCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }
    
    public void displayCourses() {
        System.out.println("Student: " + name);
        for (Course course : courses) {
            System.out.println("Course: " + course.getName());
        }
    }
}

class School {
    private String name;
    private ArrayList<Student> students;
    
    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }
    
    public void addStudent(Student student) {
        students.add(student);
    }
    
    public void displayStudents() {
        System.out.println("School: " + name);
        for (Student student : students) {
            student.displayCourses();
        }
    }
}

public class SchoolStudents {
    public static void main(String[] args) {
        School school = new School("DPS Jhansi");
        
        Student student1 = new Student("Abhinav");
        Student student2 = new Student("Kshitiz");
        
        Course math = new Course("Mathematics");
        Course science = new Course("Science");
        
        student1.enrollInCourse(math);
        student1.enrollInCourse(science);
        student2.enrollInCourse(math);
        
        school.addStudent(student1);
        school.addStudent(student2);
        
        school.displayStudents();
        math.displayStudents();
        science.displayStudents();
    }
}

