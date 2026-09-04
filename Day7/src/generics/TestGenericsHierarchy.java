package generics;

import java.util.ArrayList;
import java.util.List;

public class TestGenericsHierarchy {

    public void doSomething(List<? extends B> list){ }

    public  void doThing (List<? super C> list){ }

    public static void main(String[] args) {
        TestGenericsHierarchy test = new TestGenericsHierarchy();

        List<A> aList = new ArrayList<>();
        List<B> bList = new ArrayList<>();
        List<C> cList = new ArrayList<>();
        List<D> dList = new ArrayList<>();

//        test.doSomething(aList); //not possible
        test.doSomething(bList);
        test.doSomething(cList);
        test.doSomething(dList);

//        test.doThing(dList); //not possible
        test.doThing(cList);
        test.doThing(bList);
        test.doThing(aList);

    }
}
