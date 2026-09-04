package generics;

import java.util.ArrayList;
import java.util.List;

public class WildCharacterGenerics {

    // ? represent upper bound to Number class
    public void doSomething(List<? extends Number> list){

    }

    public  void doThing (List<? super Number> list){

    }

    public static void main(String[] args) {
        WildCharacterGenerics generics = new WildCharacterGenerics();
        List<Integer> list = new ArrayList<>();
        list.add(5);
        generics.doSomething(list);

        List<String> stringList = new ArrayList<>();
        stringList.add("a");
//        generics.doSomething(stringList); // not possible

//        generics.doThing(list);
    }
}
