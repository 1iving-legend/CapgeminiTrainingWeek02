import java.util.ArrayList;

public class Bank {

    public static void main(String[] args) {
        // Create Customer object
        Customer customer = new Customer();

        // Create Bank accounts
        Bank2 account1 = new Bank2("Alice", 5000.0);
        Bank2 account2 = new Bank2("Bob", 3000.0);

        // Add accounts to the customer
        customer.addBank(account1);
        customer.addBank(account2);

        // Display all accounts
        customer.display();

        // View specific customer's balance
        customer.viewBalance("Alice");

        // Perform transactions
        account1.addbalance(2000.0);
        account2.withdraw(1000.0);

        // Display updated balances
        customer.display();
    }

}

class Customer {
    ArrayList<Bank2> bank;

    public Customer() {
        this.bank = new ArrayList<>();
    }

    public void addBank(Bank2 bank) {
        this.bank.add(bank);
    }

    public void display() {
        for(Bank2 bank : bank) {
            System.out.println(bank.customerName);
        }
    }
    public void viewBalance(String customerName) {

        for (Bank2 bank : bank) {
            if (bank.customerName.equals(customerName)) {
                System.out.println(bank.getBalance());
            }
        }
    }
}
class Bank2 {
    public String customerName;
    private double balance;

    public Bank2(String customerName, double balance) {
        this.customerName = customerName;
        this.balance = balance;
    }

    public Bank2() {
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;

    }
    public void addbalance(double balance)
    {
        this.balance += balance;
    }

    public void withdraw(double balance)
    {
        if(balance > this.balance)
        {
            System.out.println("Insufficient Balance");
        }
        else {
            this.balance -= balance;
        }
    }

    void openAccount(String name, double amount) {
        this.customerName=name;
        this.balance=amount;
    }
}