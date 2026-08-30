package day4;

public class FIrstTryCatch {
    public static void main(String[] args) {
        int numerator,denominator;
        numerator = 10;
        denominator = 0;
        try {
            System.out.println(numerator / denominator);
        }catch (ArithmeticException e){
//            e.printStackTrace();
//            System.out.println(e.getMessage());
            System.out.println("You are dividing by ZERO...");
        }
    }
}
