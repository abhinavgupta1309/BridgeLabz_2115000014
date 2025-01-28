import java.util.Random;
public class ZaraBonus {
public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData();
        int[][] updatedData = calculateNewSalaryAndBonus(employeeData);
        calculateAndDisplayTotals(employeeData, updatedData);
}
        public static int[][] generateEmployeeData() {
        Random rand = new Random();
        int[][] data = new int[10][2];
        for (int i = 0; i < 10; i++) {
        data[i][0] = rand.nextInt(90000) + 10000;
        data[i][1] = rand.nextInt(20);  
}
        return data;
}
        public static int[][] calculateNewSalaryAndBonus(int[][] data) {
        int[][] updatedData = new int[10][3];
        for (int i = 0; i < 10; i++) {
        int salary = data[i][0];
        int yearsOfService = data[i][1];
        int bonus = 0;
        if (yearsOfService > 5) {
        bonus = (int)(salary * 0.05);
}else {
        bonus = (int)(salary * 0.02);
}
        updatedData[i][0] = salary;
        updatedData[i][1] = bonus;
        updatedData[i][2] = salary + bonus;
}
        return updatedData;
}
        public static void calculateAndDisplayTotals(int[][] oldData, int[][] newData) {
        int totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        System.out.println("Employee\tOld Salary\tBonus\tNew Salary");
        for (int i = 0; i < 10; i++) {
        totalOldSalary += oldData[i][0];
        totalNewSalary += newData[i][2];
        totalBonus += newData[i][1];
        System.out.println((i+1) + "\t\t" + oldData[i][0] + "\t\t" + newData[i][1] + "\t" + newData[i][2]);
}
        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        System.out.println("Total Bonus: " + totalBonus);
}
}

