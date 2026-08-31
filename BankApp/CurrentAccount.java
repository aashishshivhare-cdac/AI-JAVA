package BankApp;

public class CurrentAccount extends Account{

    private float overdraft;

    public CurrentAccount(int accountid, int balance, String type
                            , float overdraft) {
        super(accountid, balance, type);
        this.overdraft = overdraft;
    }

    public float getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(float overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public String toString() {
        return super.toString() + "CurrentAccount{" +
                "overdraft=" + overdraft +
                '}';
    }
}
