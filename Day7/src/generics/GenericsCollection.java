package generics;

import java.util.ArrayList;

public class GenericsCollection {

    public static void main(String[] args) {
        ArrayList<String> sAL = new ArrayList<>();
        sAL.add("7");
//        sAL.add(7); // not possible

        ArrayList al = new ArrayList<>();

        al.add(5);
        al.add("5");

        System.out.println(al);
    }
}
