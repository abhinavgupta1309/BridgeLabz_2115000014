import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weightInPounds = scanner.nextDouble();
        
        double weightInKilograms = weightInPounds / 2.2;
        
        System.out.println("The weight of the person in pounds is " + weightInPounds + " and in kilograms is " + weightInKilograms);
    }
}

