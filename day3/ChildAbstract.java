package day3;

public class ChildAbstract extends AbstractMyClass{
    @Override
    public void doAbstract() {
        System.out.println("ChildAbstract doAbstract");
    }

    public static void main(String[] args) {
        AbstractMyClass abstractMyClass = new ChildAbstract();
        abstractMyClass.doAbstract();

    }
}
