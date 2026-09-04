package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflection {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> namedClass = Class.forName("java.lang.String");

        Method[] methods = namedClass.getMethods();

//        for (Method m : methods) {
//            System.out.println(m.getName());
//        }

        new TestReflection().accesingPrivateMethod();
    }
    
    void accesingPrivateMethod() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> namedClass = Class.forName("reflection.TestReflection");

        //Private method access
        Method method = namedClass.getDeclaredMethod("lastIndexOf", Integer.class);

        method.setAccessible(true);
        Integer invoke = (Integer) method.invoke(this, 5);

        System.out.println(invoke);
    }

    public int lastIndexOf(int a){
        return a;
    }
}
