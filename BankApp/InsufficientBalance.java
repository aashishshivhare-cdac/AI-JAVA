package BankApp;

public class InsufficientBalance extends RuntimeException{

    public  InsufficientBalance(String messsage){
        super(messsage);
    }
}
