package day6;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        map.put(5, null);
        map.put(null, "e");

        System.out.println(map);
    }
}
