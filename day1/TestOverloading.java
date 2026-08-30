package day1;

public class TestOverloading {

    public void doSomething(int i){
        System.out.println("int");
    }

    public void doSomething(double i){
        System.out.println("double");
    }

    public static void main(String[] args) {
        TestOverloading testOverloading = new TestOverloading();
        testOverloading.doSomething(6);
        testOverloading.doSomething(987d);
    }
}
