import java.util.*;

public class NthElementFromEnd {
public static void main(String[] args) {
LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
int n = 2;
ListIterator<String> it = list.listIterator(list.size());
while (n-- > 0) it.previous();
System.out.println("Input: " + list + ", N=" + (2) + " -> Output: " + it.previous());
}
}
