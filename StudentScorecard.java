import java.util.Random;
import java.util.Scanner;
public class StudentScorecard {
public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
        scores[i][0] = rand.nextInt(41) + 60;
        scores[i][1] = rand.nextInt(41) + 60;
        scores[i][2] = rand.nextInt(41) + 60;
}
        return scores;
}
        public static double[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
        int total = scores[i][0] + scores[i][1] + scores[i][2];
        double average = total / 3.0;
        double percentage = (total / 300.0) * 100;
        results[i][0] = total;
        results[i][1] = Math.round(average * 100.0) / 100.0;
        results[i][2] = Math.round(percentage * 100.0) / 100.0;
}
        return results;
}
        public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
        System.out.println((i + 1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t\t" + scores[i][2] + "\t" +
                (int) results[i][0] + "\t" + results[i][1] + "\t" + results[i][2] + "%");
}
}
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        int[][] scores = generateScores(numStudents);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);
        scanner.close();
}
}
