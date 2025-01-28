import java.util.Random;
public class FootballTeamHeights {
public static void main(String[] args) {
        int[] heights = new int[11];
        Random random = new Random();

        for (int i = 0; i < heights.length; i++) {
        heights[i] = 150 + random.nextInt(101);
}
        int sum = calculateSum(heights);
        double mean = calculateMean(sum, heights.length);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("Heights: ");
        for (int height : heights) {
        System.out.print(height + " ");
}
        System.out.println();
        System.out.println("Sum: " + sum);
        System.out.println("Mean: " + mean);
        System.out.println("Shortest: " + shortest);
        System.out.println("Tallest: " + tallest);
}
        public static int calculateSum(int[] array) {
        int sum = 0;
        for (int value : array) {
        sum += value;
}
        return sum;
}
        public static double calculateMean(int sum, int count) {
        return (double) sum / count;
}
        public static int findShortest(int[] array) {
        int shortest = array[0];
        for (int value : array) {
        if (value < shortest) {
        shortest = value;
}
}
        return shortest;
}
        public static int findTallest(int[] array) {
        int tallest = array[0];
        for (int value : array) {
        if (value > tallest) {
        tallest = value;
}
}
        return tallest;
}
}

