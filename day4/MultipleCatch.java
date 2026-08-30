package day4;

import java.util.Scanner;

public class MultipleCatch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerator,denominator;
        numerator = sc.nextInt();
        denominator = sc.nextInt();
        String s = null;
        try{
            System.out.println(numerator / denominator);
            s.toUpperCase();
        }catch (ArithmeticException | NullPointerException e) {
            if(e instanceof ArithmeticException)
                System.out.println("You are dividing by ZERO...");
            else
                System.out.println("You are working with NULLL");
        }
        finally {
            System.out.println("Closing Scanner Connection");
            sc.close();
        }
    }
}
