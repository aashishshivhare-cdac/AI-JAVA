package day4;

public class Superman implements IFly  {
    @Override
    public void fly() {
        System.out.println("Superman Fly");
    }

    @Override
    public boolean land() {
        return false;
    }

    public void power(){
        System.out.println("1000 HP");
    }

    @Override
    public void swim() {

    }
}
