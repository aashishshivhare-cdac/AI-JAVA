package day3;

import java.util.Arrays;

public class TestPassingData {
    void tryToChange(int x) {
        x = 99;
    }
    void updateItem(Employee e){
        Employee e1 = e;
        e1.setName("Akash");
        System.out.println(e1);
    }
    void updateArray(String[] strings){
        strings[1] = "Aakash";
        System.out.println(Arrays.toString(strings));
    }

    public static void main(String[] args) {
        int num = 5;
        TestPassingData testPassingData = new TestPassingData();
//        testPassingData.tryToChange(num);
//        System.out.println(num);

//        Employee e = new Employee(1, "Aashish");
//        testPassingData.updateItem(e);
//        System.out.println(e);
//        Employee e1 = e;
//        testPassingData.updateItem(e1);
//        System.out.println(e);

        String[] strings = new String[2];
        strings[0] = "A";
        strings[1] = "B";
        testPassingData.updateArray(strings);
        System.out.println(Arrays.toString(strings));
    }
}
