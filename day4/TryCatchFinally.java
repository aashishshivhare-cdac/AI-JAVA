package day4;

import java.util.Scanner;

public class TryCatchFinally {

    public static void main(String[] args) {
        Scanner sc = null;
        try{
            sc = new Scanner(System.in);
            int numerator,denominator;
            numerator = sc.nextInt();
            denominator = sc.nextInt();
            System.out.println(numerator / denominator);
            }catch (ArithmeticException e){
                System.out.println("You are dividing by ZERO...");
            }
        finally {
            System.out.println("Closing Scanner Connection");
            sc.close();
        }
        }
    }
