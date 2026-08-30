package day1;

public class TestScope {

    static int i_global = 10;
    int i_ns_global = 30;

    public static void main(String[] args) {
        int i_main = 20;

        System.out.println(i_main);
        System.out.println(i_global);
        //System.out.println(i_ns_global);

        TestScope testScope = new TestScope();
        System.out.println(testScope.i_ns_global);

        testScope.doSomeThing();
    }

    public void doSomeThing(){
        System.out.println(i_global);
        System.out.println(i_ns_global);
        //System.out.println(i_main);
    }
}
