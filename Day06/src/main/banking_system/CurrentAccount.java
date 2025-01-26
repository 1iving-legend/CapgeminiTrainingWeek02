package main.banking_system;

public class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double calculateInterest() {
        return 0;
    }

    public void applyForLoan() {
        System.out.println("Loan application submitted for account: " + getAccountNumber());
    }

    public double calculateLoanEligibility() {
        return getBalance() + overdraftLimit;
    }
}
