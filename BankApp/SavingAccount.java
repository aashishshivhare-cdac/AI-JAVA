package BankApp;

public class SavingAccount extends Account{
    private final float interestRate = 4;

    public SavingAccount(int accountid, int balance, String type) {
        super(accountid, balance, type);
    }

    public float getInterestRate() {
        return interestRate;
    }

    @Override
    public String toString() {
        return super.toString() + "SavingAccount{" +
                "interestRate=" + interestRate +
                '}';
    }
}
