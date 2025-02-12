import java.util.Scanner;

class Process {
String processID;
int burstTime;
int priority;
Process next;
Process(String processID, int burstTime, int priority) {
this.processID = processID;
this.burstTime = burstTime;
this.priority = priority;
this.next = null;
}
}

class RoundRobinScheduler {
Process head;
Process tail;
void addProcess(String processID, int burstTime, int priority) {
Process newProcess = new Process(processID, burstTime, priority);
if (head == null) {
head = tail = newProcess;
newProcess.next = head;
return;
}
tail.next = newProcess;
tail = newProcess;
tail.next = head;
}
void removeProcess(String processID) {
if (head == null) {
return;
}
if (head.processID.equals(processID)) {
if (head == tail) {
head = tail = null;
return;
}
tail.next = head.next;
head = head.next;
return;
}
Process temp = head;
do {
if (temp.next.processID.equals(processID)) {
temp.next = temp.next.next;
if (temp.next == head) {
tail = temp;
}
return;
}
temp = temp.next;
} while (temp != head);
}
void simulateRoundRobin(int timeQuantum) {
if (head == null) {
return;
}
Process temp = head;
do {
if (temp.burstTime > 0) {
int executionTime = Math.min(temp.burstTime, timeQuantum);
temp.burstTime -= executionTime;
System.out.println("Executing " + temp.processID + " for " + executionTime + " units");
}
temp = temp.next;
} while (temp != head);
}
void displayProcesses() {
if (head == null) {
return;
}
Process temp = head;
do {
System.out.println(temp.processID + " " + temp.burstTime + " " + temp.priority);
temp = temp.next;
} while (temp != head);
}
}

public class RoundRobinScheduling {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
RoundRobinScheduler scheduler = new RoundRobinScheduler();
scheduler.addProcess("P1", 10, 1);
scheduler.addProcess("P2", 5, 2);
scheduler.addProcess("P3", 8, 1);
scheduler.displayProcesses();
scheduler.simulateRoundRobin(4);
scheduler.displayProcesses();
scheduler.removeProcess("P2");
scheduler.displayProcesses();
scanner.close();
}
}

