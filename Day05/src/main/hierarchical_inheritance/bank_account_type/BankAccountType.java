package main.hierarchical_inheritance.bank_account_type;

public class BankAccountType {
    public static void main(String[] args) {
        // Create instances of different account types
        SavingAccount savings = new SavingAccount(1001, 5000.0, 4.5);
        CheckingAccount checking = new CheckingAccount(1002, 2000.0, 1000.0);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount(1003, 10000.0, 12);

        // Display details of each account type
        System.out.println("--- Savings Account Details ---");
        savings.displayDetails();
        savings.displayAccountType();

        System.out.println("\n--- Checking Account Details ---");
        checking.displayDetails();
        checking.displayAccountType();

        System.out.println("\n--- Fixed Deposit Account Details ---");
        fixedDeposit.displayDetails();
        fixedDeposit.displayAccountType();


    }

}
