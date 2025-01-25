package main.hierarchical_inheritance.bank_account_type;

public class FixedDepositAccount extends BankAccount{
    int maturityPeriod;
    // Constructor for main.hierarchical_inheritance.bank_account_type.FixedDepositAccount
    public FixedDepositAccount(int accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance); // Call to the superclass constructor
        this.maturityPeriod = maturityPeriod;
    }
    public void displayAccountType(){
        System.out.println("Fixed Deposit Account");
        System.out.println("Maturity Period: " + maturityPeriod + " months");

    }
}
