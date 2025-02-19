import java.util.*;
import java.time.*;
class GenerateBinaryNumbers {
    public static void main(String[] args) {
        int n = 5;
        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        for (int i = 0; i < n; i++) {
            String binary = queue.remove();
            System.out.print(binary + " ");
            queue.add(binary + "0");
            queue.add(binary + "1");
        }
    }
}
