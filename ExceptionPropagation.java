import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class ExceptionPropagation {  // Renamed from BankTransaction to ExceptionPropagation
    private double balance = 5000;

    public void withdraw(double amount) throws InsufficientBalanceException {
        System.out.println("Processing withdrawal...");
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter withdrawal amount:");
        double amount = scanner.nextDouble();
        scanner.close();  // Close scanner to prevent resource leak

        ExceptionPropagation ep = new ExceptionPropagation();  // Updated object name
        try {
            ep.withdraw(amount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
