class Student {
    	private static String universityName = "GLA University";
    	private static int totalStudents = 0;
    	private final int rollNumber;
    	private String name;
    	private String grade;
    	public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
}
    	public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
}
    	public static void displayUniversityName() {
        System.out.println("University Name: " + universityName);
}
    	public void displayStudentDetails() {
        if (this instanceof Student) {
        System.out.println("University: " + universityName);
        System.out.println("Name: " + this.name);
        System.out.println("Roll Number: " + this.rollNumber);
        System.out.println("Grade: " + this.grade);
} else {
        System.out.println("Invalid student instance.");
}
}
    	public void updateGrade(String newGrade) {
        if (this instanceof Student) {
        this.grade = newGrade;
        System.out.println("Grade updated for " + this.name + " to " + this.grade);
} else {
        System.out.println("Invalid student instance.");
}
}
    	public static void main(String[] args) {
        Student stu1 = new Student("Abhinav Gupta", 1, "A");
        Student stu2 = new Student("Kshitiz Katiyar", 2, "B");
        displayUniversityName();
        displayTotalStudents();
        System.out.println();
        stu1.displayStudentDetails();
        System.out.println();
        stu2.displayStudentDetails();
        System.out.println();
        stu1.updateGrade("A+");
        System.out.println();
        stu1.displayStudentDetails();
}
}

