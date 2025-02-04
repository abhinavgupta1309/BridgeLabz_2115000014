class BankAccount {
    	private static String bankName = "SBI Bank";
    	private static int totalAccounts = 0;
    	private final int accountNumber;
    	private String accountHolderName;
    	private double balance;
    	public BankAccount(String accountHolderName, int accountNumber, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        totalAccounts++;
}
    	public static int getTotalAccounts() {
        return totalAccounts;
}
    	public void displayAccountDetails() {
        if (this instanceof BankAccount) {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + this.accountHolderName);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Balance: $" + this.balance);
} else {
        System.out.println("Invalid account instance.");
}
}
    	public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Abhinav Gupta", 1001, 5000.00);
        BankAccount acc2 = new BankAccount("Kshitiz Katiyar", 1002, 10000.00);   
        acc1.displayAccountDetails();
        System.out.println();
        acc2.displayAccountDetails();
        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
}
}

