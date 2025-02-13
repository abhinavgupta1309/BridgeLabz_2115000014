import java.util.Stack;
public class SortStackRecursively {
private static void sortedInsert(Stack<Integer> stack, int element) {
if (stack.isEmpty() || element > stack.peek()) {
stack.push(element);
return;
}
int temp = stack.pop();
sortedInsert(stack, element);
stack.push(temp);
}
private static void sortStack(Stack<Integer> stack) {
if (!stack.isEmpty()) {
int temp = stack.pop();
sortStack(stack);
sortedInsert(stack, temp);
}
}
public static void main(String[] args) {
Stack<Integer> stack = new Stack<>();
stack.push(3);
stack.push(1);
stack.push(4);
stack.push(2);
sortStack(stack);
while (!stack.isEmpty()) {
System.out.println(stack.pop());
}
}
}

