import java.time.LocalDate;
import java.util.Scanner;
public class DateComparison {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate date1 = LocalDate.parse(scanner.next());
        LocalDate date2 = LocalDate.parse(scanner.next());
        if (date1.isBefore(date2)) System.out.println("First date is before second date");
        else if (date1.isAfter(date2)) System.out.println("First date is after second date");
        else System.out.println("Both dates are equal");
        scanner.close();
}
}

