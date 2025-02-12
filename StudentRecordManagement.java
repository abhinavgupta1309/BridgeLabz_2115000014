import java.util.Scanner;

class Student {
int rollNumber;
String name;
int age;
char grade;
Student next;
Student(int rollNumber, String name, int age, char grade) {
this.rollNumber = rollNumber;
this.name = name;
this.age = age;
this.grade = grade;
this.next = null;
}
}

class StudentLinkedList {
Student head;
void addStudentAtBeginning(int rollNumber, String name, int age, char grade) {
Student newStudent = new Student(rollNumber, name, age, grade);
newStudent.next = head;
head = newStudent;
}
void addStudentAtEnd(int rollNumber, String name, int age, char grade) {
Student newStudent = new Student(rollNumber, name, age, grade);
if (head == null) {
head = newStudent;
return;
}
Student temp = head;
while (temp.next != null) {
temp = temp.next;
}
temp.next = newStudent;
}
void addStudentAtPosition(int rollNumber, String name, int age, char grade, int position) {
Student newStudent = new Student(rollNumber, name, age, grade);
if (position == 1) {
newStudent.next = head;
head = newStudent;
return;
}
Student temp = head;
for (int i = 1; temp != null && i < position - 1; i++) {
temp = temp.next;
}
if (temp == null) {
return;
}
newStudent.next = temp.next;
temp.next = newStudent;
}
void deleteStudentByRollNumber(int rollNumber) {
Student temp = head, prev = null;
if (temp != null && temp.rollNumber == rollNumber) {
head = temp.next;
return;
}
while (temp != null && temp.rollNumber != rollNumber) {
prev = temp;
temp = temp.next;
}
if (temp == null) {
return;
}
prev.next = temp.next;
}
Student searchStudentByRollNumber(int rollNumber) {
Student temp = head;
while (temp != null) {
if (temp.rollNumber == rollNumber) {
return temp;
}
temp = temp.next;
}
return null;
}
void updateStudentGrade(int rollNumber, char newGrade) {
Student student = searchStudentByRollNumber(rollNumber);
if (student != null) {
student.grade = newGrade;
}
}
void displayStudents() {
Student temp = head;
while (temp != null) {
System.out.println(temp.rollNumber + " " + temp.name + " " + temp.age + " " + temp.grade);
temp = temp.next;
}
}
}
public class StudentRecordManagement {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
StudentLinkedList list = new StudentLinkedList();
list.addStudentAtBeginning(1, "Abhinav", 20, 'A');
list.addStudentAtEnd(2, "Kshitiz", 22, 'B');
list.addStudentAtPosition(3, "Adesh", 21, 'C', 2);
list.displayStudents();
list.deleteStudentByRollNumber(2);
list.displayStudents();
list.updateStudentGrade(1, 'B');
list.displayStudents();
scanner.close();
}
}

