package day5;

public class BLockExecution {
    {
        System.out.println("Normal block");
    }
    static {
        System.out.println("Static block");
    }

    BLockExecution(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new BLockExecution();
        new BLockExecution();
    }
}
