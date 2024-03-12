package banking_system;

public class Main {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount(202226,"Rahman", 500.0,2.0);

        savingAccount.deposit(100);
        savingAccount.calculateInterest();
        savingAccount.displayInfo();

        System.out.println();


        CheckingAccount checkingAccount = new CheckingAccount(999,"zozo",400,50);
        checkingAccount.withdrawal(100);
        checkingAccount.handlingOverdraft(60);
        checkingAccount.displayInfo();

    }
}
