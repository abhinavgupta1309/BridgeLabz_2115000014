import java.util.ArrayList;
class Account {
    	private String accountNumber;
    	private double balance;
    	public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
}
    	public String getAccountNumber() {
        return accountNumber;
}
    	public double getBalance() {
        return balance;
}
}
class Customer {
    	private String name;
    	private ArrayList<Account> accounts;
    	public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
}
    	public void addAccount(Account account) {
        accounts.add(account);
}
    	public void viewBalance() {
        System.out.println("Customer: " + name);
        for (Account account : accounts) {
        System.out.println("Account: " + account.getAccountNumber() + ", Balance: " + account.getBalance());
}
}
}
class Bank {
    	private String name;
    	private ArrayList<Customer> customers;
    	public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
}
    	public void openAccount(Customer customer, Account account) {
        customer.addAccount(account);
        if (!customers.contains(customer)) {
        customers.add(customer);
}
}
    	public void displayCustomers() {
        System.out.println("Bank: " + name);
        for (Customer customer : customers) {
        customer.viewBalance();
}
}
}
	public class BankAccounts {
    	public static void main(String[] args) {
        Bank bank = new Bank("HDFC Bank");
        Customer customer1 = new Customer("Abhinav");
        Customer customer2 = new Customer("Parth");
        Account account1 = new Account("12345", 5000);
        Account account2 = new Account("67890", 3000);
        Account account3 = new Account("54321", 7000);
        bank.openAccount(customer1, account1);
        bank.openAccount(customer1, account2);
        bank.openAccount(customer2, account3);
        bank.displayCustomers();
}
}
