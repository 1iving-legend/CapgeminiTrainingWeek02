package main.hierarchical_inheritance.bank_account_type;

class BankAccount{
    int accountNumber;
    double balance;

    // Constructor for main.hierarchical_inheritance.bank_account_type.BankAccount
    BankAccount(int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display account type
    public void displayDetails(){
        System.out.println("Account Number: "+ accountNumber);
        System.out.println("Balance: "+ balance);
    }
}

