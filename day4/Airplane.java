package day4;

public class Airplane implements IFly{
    @Override
    public void swim() {

    }

    @Override
    public void fly() {
        System.out.println("Airplane Fly");
    }

    @Override
    public boolean land() {
        return true;
    }
}
