package stream;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.IntStream;

public class TestStream1 {

    public static void main(String[] args) throws ParseException {
        List list = Arrays.asList("Java", "Python", "C++");
        list.stream().forEach(System.out::println);

        List names = Arrays.asList("Alice","Bob","Charlie");
        names.stream().filter(n -> n.toString().startsWith("A")).forEach(System.out::println);

        List words = Arrays.asList("apple","banana","aavocado");
        words.stream().filter(w -> w.toString().startsWith("a")) .map(w -> w.toString().toUpperCase()).sorted().forEach(System.out::println);


        int sum = IntStream.of(1,2,3,4).reduce(10, Integer::sum);
        System.out.println(sum);
    }
}
