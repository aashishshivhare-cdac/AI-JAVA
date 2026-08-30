package day3;

public class TestInheritance {

    public static void main(String[] args) {
        Vehicle v1 = new Car(100);
        Vehicle v2 = new Car(100, "X700");

        System.out.println(v1.speed);
        //v1.numberOfTyre = 10;
        Vehicle.doNothing();
        Car.doNothing();

        v1.honk();
        Car c = (Car) v1;
        c.engine();
    }


}
