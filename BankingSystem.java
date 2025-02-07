class BankAccount {
String accountNumber;
double balance;
BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
}
}
class SavingsAccount extends BankAccount {
double interestRate;
SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
}
void displayAccountType() {
        System.out.println("Savings Account - Account Number: " + accountNumber + ", Balance: " + balance + ", Interest Rate: " + interestRate + "%");
}
}
class CheckingAccount extends BankAccount {
double withdrawalLimit;
CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
}
void displayAccountType() {
        System.out.println("Checking Account - Account Number: " + accountNumber + ", Balance: " + balance + ", Withdrawal Limit: " + withdrawalLimit);
}
}
class FixedDepositAccount extends BankAccount {
int maturityPeriod;
FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
}
void displayAccountType() {
        System.out.println("Fixed Deposit Account - Account Number: " + accountNumber + ", Balance: " + balance + ", Maturity Period: " + maturityPeriod + " months");
}
}
public class BankingSystem {
public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA123", 5000.0, 3.5);
        CheckingAccount checking = new CheckingAccount("CA456", 2000.0, 1000.0);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD789", 10000.0, 12);
        savings.displayAccountType();
        checking.displayAccountType();
        fixedDeposit.displayAccountType();
}
}
