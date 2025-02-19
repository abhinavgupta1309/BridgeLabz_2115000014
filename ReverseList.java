import java.util.*;

public class ReverseList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose list type: 1 for ArrayList, 2 for LinkedList");
        int choice = scanner.nextInt();

        List<Integer> list;
        if (choice == 1) {
            list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        } else {
            list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        }

        List<Integer> reversed = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }

        System.out.println("Input: " + list + " -> Output: " + reversed);
    }
}
