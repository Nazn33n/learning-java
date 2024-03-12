package banking_system;

public class SavingAccount extends Account {
    double interestRate;

    public SavingAccount(int accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = balance * interestRate / 100.0;
        deposit(interest);
        System.out.println("The interest value is: " + interest);
    }


}
