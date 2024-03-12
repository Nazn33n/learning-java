package banking_system;

public class Account {

    int accountNumber;
    String accountHolderName;
    double balance;

    public Account(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("The current balance is " + balance);
    }

    public void withdrawal(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("The current balance is " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void displayInfo()
    {
        System.out.println("Account Number: " +accountNumber);
        System.out.println("Account Holder Name: "+accountHolderName);
        System.out.println("Account Balance: "+balance);
    }

}
