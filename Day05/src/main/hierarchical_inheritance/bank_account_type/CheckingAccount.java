package main.hierarchical_inheritance.bank_account_type;

public class CheckingAccount extends BankAccount{
    double withdrawalLimit;

    // Constructor for main.hierarchical_inheritance.bank_account_type.CheckingAccount
    CheckingAccount(int accountNumber, double balance, double withdrawalLimit){
        super(accountNumber,balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    // Method to display account type
    public void displayAccountType(){
        System.out.println("Checking Account");
    }
}
