package BankApp;

public class BankOperation {

    static int accountId = 101;
    private final String TYPE_SAVING = "SAVINGACC";
    private final String TYPE_CURRENT = "CURRENTACC";
    Account accounts[] = new Account[5];
    private int index = -1;

    // Account creation
    // withdraw, deposit, checkBalance, printDetails

    public void accoutCreation(String type, int balance, float overdraft){
        Account newAccount = null;

        if(type.equalsIgnoreCase("Saving")){
            newAccount = new SavingAccount(accountId++, balance , TYPE_SAVING);
        }
        else{
            newAccount = new CurrentAccount(accountId++, balance, TYPE_CURRENT
                            , overdraft);
        }

        try {
            accounts[++index] = newAccount;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("No more account creation");
        }
    }

    public void withdraw(int accountId, int amount){
        Account foundAccount = null;
        for (Account account : accounts){
            if(account!= null && account.getAccountid() == accountId){
                foundAccount = account;
                break;
            }
        }
        try {
            if (foundAccount == null)
                throw new NotFoundException("User not found for id -" + accountId);

            if (foundAccount instanceof SavingAccount) {
                if (amount > foundAccount.getBalance()) {
                    throw new InsufficientBalance("Insufficient Balance for withdraw..");
                }
                foundAccount.setBalance(foundAccount.getBalance() - amount);
                System.out.println("Withdraw successfull");
            } else {
                CurrentAccount ca = (CurrentAccount) foundAccount;
                if (amount > (ca.getBalance() + ca.getOverdraft())) {
                    throw new InsufficientBalance("Insufficient Balance for withdraw..");
                }
                foundAccount.setBalance(foundAccount.getBalance() - amount);
                System.out.println("Withdraw successfull");
            }
        }catch (NotFoundException | InsufficientBalance e){
            System.out.println(e.getMessage());
        }
    }

    public void deposit(int accountId, int amount){
        Account foundAccount = null;
        for (Account account : accounts){
            if(account!= null && account.getAccountid() == accountId){
                foundAccount = account;
                break;
            }
        }
        try {
            if (foundAccount == null)
                throw new NotFoundException("User not found for id -" + accountId);

            foundAccount.setBalance(foundAccount.getBalance() + amount);
            System.out.println("Deposit successfull");
        }catch (NotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    public void printDetails(){
        try {
            if (index < 0)
                throw new NotFoundException("No Accounts were added");

            for (Account account : accounts){
                if(account != null)
                    System.out.println(account);
                else
                    break;
            }
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }
//        for (int i =0; i <= index; i++){
//            System.out.println(accounts[i]);
//        }
    }
}
