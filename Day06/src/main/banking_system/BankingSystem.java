package main.banking_system;

import java.util.*;

public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("S101", "Alice", 10000, 4));
        accounts.add(new CurrentAccount("C202", "Bob", 5000, 2000));

        for (BankAccount account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Holder Name: " + account.getHolderName());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Interest: " + account.calculateInterest());

            if (account instanceof Loanable) {
                Loanable loanable = (Loanable) account;
                loanable.applyForLoan();
                System.out.println("Loan Eligibility: " + loanable.calculateLoanEligibility());
            }
            System.out.println();
        }
    }
}
