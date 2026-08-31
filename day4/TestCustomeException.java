package day4;

public class TestCustomeException {

    public static void main(String[] args) {
//        TestCustomeException tce = new TestCustomeException();
//        tce.doSomething();
        new TestCustomeException().doSomething();
    }

    void doSomething() {
        String s = new String("Aashish");
        if(!s.equals("Akash"))
            throw new CUstomeException("Name not match");

    }
}
