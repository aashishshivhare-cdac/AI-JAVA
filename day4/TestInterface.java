package day4;

public class TestInterface {

    public static void main(String[] args) {
        IFly iFly = new Airplane();
        iFly.fly();
        System.out.println(IFly.speed);
        //type safety check
        if(iFly instanceof Superman) {
            Superman sm = (Superman) iFly;
            System.out.println(Superman.speed);
            sm.power();
        }
        else {
            System.out.println("AirPlane Object");
        }
    }
}
