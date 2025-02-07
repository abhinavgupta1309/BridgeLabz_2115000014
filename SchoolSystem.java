class Person {
String name;
int age;
Person(String name, int age) {
        this.name = name;
        this.age = age;
}
}
class Teacher extends Person {
String subject;
Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
}
void displayRole() {
        System.out.println("Teacher - Name: " + name + ", Age: " + age + ", Subject: " + subject);
}
}
class Student extends Person {
int grade;
Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
}
void displayRole() {
        System.out.println("Student - Name: " + name + ", Age: " + age + ", Grade: " + grade);
}
}
class Staff extends Person {
String position;
Staff(String name, int age, String position) {
        super(name, age);
        this.position = position;
}
void displayRole() {
        System.out.println("Staff - Name: " + name + ", Age: " + age + ", Position: " + position);
}
}
public class SchoolSystem {
public static void main(String[] args) {
        Teacher teacher = new Teacher("Abhinav", 21, "JAVA");
        Student student = new Student("Parth", 16, 10);
        Staff staff = new Staff("Kshitiz", 22, "Sweeper");
        teacher.displayRole();
        student.displayRole();
        staff.displayRole();
}
}

