package day3;

public class Vehicle {
    protected int speed;
    final protected int numberOfTyre=4;
    private int id;

    Vehicle(int speed){
        id = 10;
        this.speed = speed;
    }

    final void doFinal(){}

    public static void doNothing(){
        System.out.println("Vehicle doNothing");
    }

    public void honk(){
        System.out.println("BEEP");
    }
}
