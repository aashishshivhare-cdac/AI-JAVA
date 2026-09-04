package stream;

import java.util.ArrayList;
import java.util.List;

public class TestStream {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(list.stream().count());

        list.add("a");
        list.add("b");
        System.out.println(list.stream().count());
    }
}
