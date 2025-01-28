import java.util.Random;
public class RandomNumbersStats {
public int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        Random random = new Random();
        
        for (int i = 0; i < size; i++) {
        numbers[i] = 1000 + random.nextInt(9000);
}        
        return numbers;
}
        public double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        
        for (int num : numbers) {
        sum += num;
        min = Math.min(min, num);
        max = Math.max(max, num);
}        
        double average = sum / numbers.length;
        return new double[]{average, min, max};
}
        public static void main(String[] args) {
        RandomNumbersStats stats = new RandomNumbersStats();
        int[] numbers = stats.generate4DigitRandomArray(5);
        double[] results = stats.findAverageMinMax(numbers);

        System.out.print("Generated Numbers: ");
        for (int num : numbers) {
        System.out.print(num + " ");
}
        System.out.println();
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
}
}
