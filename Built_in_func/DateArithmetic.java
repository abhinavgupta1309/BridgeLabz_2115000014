import java.time.LocalDate;
import java.util.Scanner;
public class DateArithmetic {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate date = LocalDate.parse(scanner.next());
        LocalDate newDate = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        System.out.println("Final Date: " + newDate);
        scanner.close();
}
}

