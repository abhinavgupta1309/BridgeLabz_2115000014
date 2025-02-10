import java.util.*;
abstract class BankAccount {
private String accountNumber;
private String holderName;
private double balance;

public BankAccount(String accountNumber, String holderName, double balance) {
this.accountNumber = accountNumber;
this.holderName = holderName;
this.balance = balance;
}
public String getAccountNumber() {
return accountNumber;
}
public String getHolderName() {
return holderName;
}
public double getBalance() {
return balance;
}
public void deposit(double amount) {
balance += amount;
System.out.println("Deposited: " + amount + " New Balance: " + balance);
}
public void withdraw(double amount) {
if (amount <= balance) {
balance -= amount;
System.out.println("Withdrawn: " + amount + " New Balance: " + balance);
} else {
System.out.println("Insufficient funds!");
}
}
public abstract double calculateInterest();
}
interface Loanable {
void applyForLoan(double amount);
double calculateLoanEligibility();
}
class SavingsAccount extends BankAccount {
private static final double INTEREST_RATE = 0.04;
public SavingsAccount(String accountNumber, String holderName, double balance) {
super(accountNumber, holderName, balance);
}

@Override
public double calculateInterest() {
return getBalance() * INTEREST_RATE;
}
}
class CurrentAccount extends BankAccount implements Loanable {
private static final double INTEREST_RATE = 0.02;
private double loanLimit;

public CurrentAccount(String accountNumber, String holderName, double balance, double loanLimit) {
super(accountNumber, holderName, balance);
this.loanLimit = loanLimit;
}

@Override
public double calculateInterest() {
return getBalance() * INTEREST_RATE;
}

@Override
public void applyForLoan(double amount) {
if (amount <= loanLimit) {
System.out.println("Loan approved for amount: " + amount);
} else {
System.out.println("Loan amount exceeds limit!");
}
}

@Override
public double calculateLoanEligibility() {
return loanLimit * 0.8;
}
}
public class BankingSystem {
public static void main(String[] args) {
List<BankAccount> accounts = new ArrayList<>();

SavingsAccount savings = new SavingsAccount("ABC1", "Adesh", 5000);
CurrentAccount current = new CurrentAccount("DEF2", "Abhinav", 10000, 50000);

accounts.add(savings);
accounts.add(current);

for (BankAccount account : accounts) {
System.out.println("Account Holder: " + account.getHolderName());
System.out.println("Account Number: " + account.getAccountNumber());
System.out.println("Balance: " + account.getBalance());
System.out.println("Interest: " + account.calculateInterest());
if (account instanceof Loanable) {
Loanable loanable = (Loanable) account;
System.out.println("Loan Eligibility: " + loanable.calculateLoanEligibility());
}
System.out.println("--------------------------");
}
}
}

