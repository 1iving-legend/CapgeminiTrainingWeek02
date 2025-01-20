class Main {
    public static void main(String args[]) {
        BankAccount obj = new BankAccount("sujal", 888777);

        if (obj instanceof Account) {
            System.out.println("object of Account type");
        }
        if (obj instanceof BankAccount) {
            System.out.println("object of BankAccount type");
        }

        Account obj2 = new BankAccount("shivraj", 888797);

        BankAccount.getTotalAccounts();
		
		 if (obj2 instanceof Account) {
            System.out.println("object of Account type");
        }
        if (obj2 instanceof BankAccount) {
            System.out.println("object of BankAccount type");
        }
    }
}

class Account {
    String accountHolderName;
    final int accountNumber;
    static int noOfAccount = 0;

    // Constructor for Account
    Account(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        noOfAccount++;
    }
}

class BankAccount extends Account {
    static String bankName = "icici";

    // Constructor for BankAccount
    BankAccount(String accountHolderName, int accountNumber) {
        super(accountHolderName, accountNumber);
    }

    // Static method to get total accounts
    static void getTotalAccounts() {
        System.out.println("Bank: " + bankName);
        System.out.println("Total no. of accounts: " + Account.noOfAccount);
    }
}
