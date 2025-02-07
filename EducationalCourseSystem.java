class Course {
String courseName;
int duration;
Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
}
String getCourseInfo() {
        return "Course: " + courseName + ", Duration: " + duration + " weeks";
}
}
class OnlineCourse extends Course {
String platform;
boolean isRecorded;
OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
}
String getCourseInfo() {
        return "Online Course: " + courseName + ", Duration: " + duration + " weeks, Platform: " + platform + ", Recorded: " + isRecorded;
}
}
class PaidOnlineCourse extends OnlineCourse {
double fee;
double discount;
PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
}
String getCourseInfo() {
        return "Paid Online Course: " + courseName + ", Duration: " + duration + " weeks, Platform: " + platform + ", Recorded: " + isRecorded + ", Fee: $" + fee + ", Discount: " + discount + "%";
}
}
public class EducationalCourseSystem {
public static void main(String[] args) {
        Course course = new Course("Mathematics", 12);
        OnlineCourse onlineCourse = new OnlineCourse("Physics", 10, "Udemy", true);
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Java Programming", 8, "Coursera", true, 199.99, 20);
        System.out.println(course.getCourseInfo());
        System.out.println(onlineCourse.getCourseInfo());
        System.out.println(paidOnlineCourse.getCourseInfo());
}
}

