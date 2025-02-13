import java.util.Stack;
public class QueueUsingStacks {
private Stack<Integer> stack1;
private Stack<Integer> stack2;

public QueueUsingStacks() {
stack1 = new Stack<>();
stack2 = new Stack<>();
}
public void enqueue(int value) {
stack1.push(value);
}
public int dequeue() {
if (stack2.isEmpty()) {
while (!stack1.isEmpty()) {
stack2.push(stack1.pop());
}
}
if (stack2.isEmpty()) {
throw new RuntimeException("Queue is empty");
}
return stack2.pop();
}
public static void main(String[] args) {
QueueUsingStacks queue = new QueueUsingStacks();
queue.enqueue(1);
queue.enqueue(2);
queue.enqueue(3);
System.out.println(queue.dequeue());
System.out.println(queue.dequeue());
System.out.println(queue.dequeue());
}
}

