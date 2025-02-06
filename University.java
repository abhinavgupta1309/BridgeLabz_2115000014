class Course {
    String courseName;
    Professor professor;
    void assignProfessor(Professor p) {
    professor = p;
}
}
class Professor {
    	String name;
    	void teachCourse(Course c) {
        c.assignProfessor(this);
}
}
class Student {
    	String name;
    	void enrollCourse(Course c) {
        System.out.println(name + " has enrolled in " + c.courseName);
}
}
public class University {
    	public static void main(String[] args) {
        Course course1 = new Course();
        course1.courseName = "Math 101";
        
        Professor prof1 = new Professor();
        prof1.name = "Dr. Abhinav";
        
        Student student1 = new Student();
        student1.name = "Parth";
        
        student1.enrollCourse(course1);
        prof1.teachCourse(course1);
}
}

