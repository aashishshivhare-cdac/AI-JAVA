package day3;

import java.util.Arrays;

public class GenericArray {

    public static void main(String[] args) {
        Object[] objects = new Object[2];

        Employee e = new Employee(1, "Aashish");
        objects[0] = e;
        objects[1] = new String("Akash");

        System.out.println(Arrays.toString(objects));
    }
}
