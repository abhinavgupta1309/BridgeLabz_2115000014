import java.util.Scanner;
public class FriendsComparison {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        System.out.println("Enter the ages and heights of the friends:");

        for (int i = 0; i < 3; i++) {
        System.out.print("Enter age of " + friends[i] + ": ");
        ages[i] = scanner.nextInt();

        System.out.print("Enter height of " + friends[i] + " (in cm): ");
        heights[i] = scanner.nextDouble();
}
        String youngestFriend = findYoungestFriend(friends, ages);
        String tallestFriend = findTallestFriend(friends, heights);

        System.out.println("\nThe youngest friend is: " + youngestFriend);
        System.out.println("The tallest friend is: " + tallestFriend);
}
        public static String findYoungestFriend(String[] friends, int[] ages) {
        int minAgeIndex = 0;
        for (int i = 1; i < ages.length; i++) {
        if (ages[i] < ages[minAgeIndex]) {
        minAgeIndex = i;
}
}
        return friends[minAgeIndex];
}
        public static String findTallestFriend(String[] friends, double[] heights) {
        int maxHeightIndex = 0;
        for (int i = 1; i < heights.length; i++) {
        if (heights[i] > heights[maxHeightIndex]) {
        maxHeightIndex = i;
}
}
        return friends[maxHeightIndex];
}
}

