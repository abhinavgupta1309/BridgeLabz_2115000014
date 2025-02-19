import java.util.*;

class BankingSystem {
    private Map<String, Double> accounts = new HashMap<>();
    private Queue<String> withdrawalQueue = new LinkedList<>();

    public void createAccount(String accountNumber, double initialBalance) {
        accounts.put(accountNumber, initialBalance);
    }

    public void deposit(String accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            accounts.put(accountNumber, accounts.get(accountNumber) + amount);
        }
    }

    public void requestWithdrawal(String accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            withdrawalQueue.add(accountNumber);
        }
    }

    public void processWithdrawals(double amount) {
        while (!withdrawalQueue.isEmpty()) {
            String accountNumber = withdrawalQueue.poll();
            if (accounts.get(accountNumber) >= amount) {
                accounts.put(accountNumber, accounts.get(accountNumber) - amount);
                System.out.println("Withdrawal of INR " + amount + " processed for Account: " + accountNumber);
            } else {
                System.out.println("Insufficient balance in Account: " + accountNumber);
            }
        }
    }

    public void displaySortedAccounts() {
        TreeMap<Double, String> sortedAccounts = new TreeMap<>();
        for (Map.Entry<String, Double> entry : accounts.entrySet()) {
            sortedAccounts.put(entry.getValue(), entry.getKey());
        }
        System.out.println("Accounts sorted by balance:");
        for (Map.Entry<Double, String> entry : sortedAccounts.entrySet()) {
            System.out.println("Account: " + entry.getValue() + " - Balance: INR " + entry.getKey());
        }
    }

    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();
        bank.createAccount("12345", 50000);
        bank.createAccount("67890", 30000);
        bank.createAccount("54321", 70000);
        
        bank.deposit("12345", 10000);
        bank.requestWithdrawal("12345");
        bank.requestWithdrawal("67890");
        bank.processWithdrawals(20000);
        
        bank.displaySortedAccounts();
    }
}
