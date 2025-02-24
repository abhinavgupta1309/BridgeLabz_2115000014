import java.lang.reflect.*;

class Student {
    private String name;
    public Student() { this.name = "Kshitiz"; }
    public String getName() { return name; }
}

class DynamicObjectCreation {
    public static void main(String[] args) throws Exception {
        Constructor<Student> constructor = Student.class.getDeclaredConstructor();
        Student student = constructor.newInstance();
        System.out.println("Student name: " + student.getName());
    }
}
