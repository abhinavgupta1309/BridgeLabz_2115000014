import java.util.Scanner;
public class BonusCalculator {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] newSalary = new double[10];
        double[] bonus = new double[10];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;
        for (int i = 0; i < 10; i++) {
        System.out.print("Enter salary for employee " + (i + 1) + ": ");
        while (!sc.hasNextDouble()) {
        sc.next();
        System.out.print("Invalid input. Please enter a valid salary: ");
}
        salary[i] = sc.nextDouble();
        totalOldSalary += salary[i];
        System.out.print("Enter years of service for employee " + (i + 1) + ": ");
        while (!sc.hasNextDouble()) {
        sc.next();
        System.out.print("Invalid input. Please enter valid years of service: ");
}
        yearsOfService[i] = sc.nextDouble();
        if (salary[i] <= 0 || yearsOfService[i] < 0) {
        i--;
}
}
        for (int i = 0; i < 10; i++) {
        if (yearsOfService[i] > 5) {
        bonus[i] = salary[i] * 0.05;
}else {
        bonus[i] = salary[i] * 0.02;
}
        newSalary[i] = salary[i] + bonus[i];
        totalBonus += bonus[i];
        totalNewSalary += newSalary[i];
}
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
}
}

