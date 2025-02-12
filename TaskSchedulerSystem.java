import java.util.Scanner;

class Task {
String taskID;
String taskName;
int priority;
String dueDate;
Task next;
Task(String taskID, String taskName, int priority, String dueDate) {
this.taskID = taskID;
this.taskName = taskName;
this.priority = priority;
this.dueDate = dueDate;
this.next = null;
}
}

class TaskScheduler {
Task head;
void addTaskAtBeginning(String taskID, String taskName, int priority, String dueDate) {
Task newTask = new Task(taskID, taskName, priority, dueDate);
if (head == null) {
head = newTask;
head.next = head;
return;
}
Task temp = head;
while (temp.next != head) {
temp = temp.next;
}
newTask.next = head;
temp.next = newTask;
head = newTask;
}
void addTaskAtEnd(String taskID, String taskName, int priority, String dueDate) {
Task newTask = new Task(taskID, taskName, priority, dueDate);
if (head == null) {
head = newTask;
head.next = head;
return;
}
Task temp = head;
while (temp.next != head) {
temp = temp.next;
}
temp.next = newTask;
newTask.next = head;
}
void addTaskAtPosition(String taskID, String taskName, int priority, String dueDate, int position) {
Task newTask = new Task(taskID, taskName, priority, dueDate);
if (position == 1) {
addTaskAtBeginning(taskID, taskName, priority, dueDate);
return;
}
Task temp = head;
for (int i = 1; temp.next != head && i < position - 1; i++) {
temp = temp.next;
}
newTask.next = temp.next;
temp.next = newTask;
}
void removeTaskByID(String taskID) {
if (head == null) {
return;
}
Task temp = head, prev = null;
while (temp.taskID.equals(taskID)) {
if (temp.next == head) {
head = null;
return;
}
Task last = head;
while (last.next != head) {
last = last.next;
}
head = head.next;
last.next = head;
return;
}
do {
prev = temp;
temp = temp.next;
} while (temp != head && !temp.taskID.equals(taskID));
if (temp == head) {
return;
}
prev.next = temp.next;
}
Task searchTaskByPriority(int priority) {
Task temp = head;
do {
if (temp.priority == priority) {
return temp;
}
temp = temp.next;
} while (temp != head);
return null;
}
void displayTasks() {
if (head == null) {
return;
}
Task temp = head;
do {
System.out.println(temp.taskID + " " + temp.taskName + " " + temp.priority + " " + temp.dueDate);
temp = temp.next;
} while (temp != head);
}
void viewCurrentTaskAndMoveNext() {
if (head == null) {
return;
}
System.out.println(head.taskID + " " + head.taskName + " " + head.priority + " " + head.dueDate);
head = head.next;
}
}

public class TaskSchedulerSystem {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
TaskScheduler scheduler = new TaskScheduler();
scheduler.addTaskAtBeginning("T1", "Task A", 1, "2025-02-15");
scheduler.addTaskAtEnd("T2", "Task B", 2, "2025-02-16");
scheduler.addTaskAtPosition("T3", "Task C", 3, "2025-02-17", 2);
scheduler.displayTasks();
scheduler.removeTaskByID("T2");
scheduler.displayTasks();
System.out.println("Current Task:");
scheduler.viewCurrentTaskAndMoveNext();
scheduler.displayTasks();
scanner.close();
}
}

