import java.util.*;

public class CheckSetsEquality {
public static void main(String[] args) {
Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));
System.out.println("Set1: " + set1 + ", Set2: " + set2 + " -> Output: " + set1.equals(set2));
}
}
