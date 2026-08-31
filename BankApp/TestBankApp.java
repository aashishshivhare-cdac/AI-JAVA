package BankApp;

public class TestBankApp {
    public static void main(String[] args) {
        BankOperation bankOperation = new BankOperation();

        bankOperation.accoutCreation("Saving", 1000, 0);
        bankOperation.accoutCreation("Current", 1000, 5000);
        //bankOperation.accoutCreation("Saving", 1000, 0);

        bankOperation.printDetails();

        //bankOperation.deposit(103, 500);
        bankOperation.withdraw(102, 6000);
        bankOperation.withdraw(102, 6000);

        bankOperation.printDetails();

    }

}
