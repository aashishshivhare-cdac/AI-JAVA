package BankApp;

public class Account {
    private int accountid;
    private int balance;
    private final String type;

    public Account(int accountid, int balance, String type) {
        this.accountid = accountid;
        this.balance = balance;
        this.type = type;
    }

    public int getAccountid() {
        return accountid;
    }

    public void setAccountid(int accountid) {
        this.accountid = accountid;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountid=" + accountid +
                ", balance=" + balance +
                '}';
    }
}
