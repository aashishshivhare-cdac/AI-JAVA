package day6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIntArrayLIst {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(15);
        list.add(25);
        list.add(35);
        System.out.println(list);

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
            it.remove();
        }
        System.out.println(list);
    }
}
