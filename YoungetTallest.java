import java.util.Scanner;
public class YoungetTallest {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];
        int youngestAge = Integer.MAX_VALUE;
        double tallestHeight = 0;
        String youngestFriend = "";
        String tallestFriend = "";
        for (int i = 0; i < 3; i++) {
        System.out.print("Enter age of " + names[i] + ": ");
        while (!sc.hasNextInt()) {
        sc.next();
        System.out.print("Invalid input. Please enter a valid age for " + names[i] + ": ");
}
        age[i] = sc.nextInt();
        System.out.print("Enter height of " + names[i] + ": ");
        while (!sc.hasNextDouble()) {
        sc.next();
        System.out.print("Invalid input. Please enter a valid height for " + names[i] + ": ");
}
        height[i] = sc.nextDouble();
}
        for (int i = 0; i < 3; i++) {
        if (age[i] < youngestAge) {
        youngestAge = age[i];
        youngestFriend = names[i];
}
        if (height[i] > tallestHeight) {
        tallestHeight = height[i];
        tallestFriend = names[i];
}
}
        System.out.println("The youngest friend is: " + youngestFriend);
        System.out.println("The tallest friend is: " + tallestFriend);
}
}
