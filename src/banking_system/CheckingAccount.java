package banking_system;

public class CheckingAccount extends Account{
    double overdraftLimit;
    public CheckingAccount(int accountNumber, String accountHolderName, double balance, double overdraftLimit){
        super(accountNumber,accountHolderName,balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void handlingOverdraft(double amount){
        if (balance - amount >= -overdraftLimit) {
            balance = balance - amount;
            System.out.println("Overdraft handled. New balance: $" + balance);
        } else {
            System.out.println("Overdraft limit exceeded. Transaction unsuccessful.");
        }

    }
}


