
public class BankAccountDetails {
    public static void main(String[] args){
        BankAccount account1 = new BankAccount("yogesh", 482842258, 500000);
        account1.depositMoney(200);
        account1.withdrawMoney(5000);
        account1.displayCurrentBalance();
    }
}





class BankAccount{
    String accountHolder;
    int accountNumber;
    double balance;

    BankAccount(String accountHolder, int accountNumber, double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void depositMoney(double money){
        System.out.println(money+ ": is Added in your account");
        balance += money;
    }
    public void withdrawMoney(double money){
        if(balance >= money){
            balance -= money;
            System.out.println("Successful withdraw of: "+ money);
        }else{
            System.out.println(" Insufficient balance");
        }
    }
    public void displayCurrentBalance(){
        System.out.println("Current balance is: "+ balance);
    }
}

