package ClassLoder;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestDemo3 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<?> c = Class.forName("ClassLoder.Student");

        Constructor<?> con = c.getConstructor();
        Object obj= con.newInstance();

        Method method2 = c.getMethod("method2");
        method2.invoke(obj);
        System.out.println("========");

        Method method1 = c.getMethod("method1", String.class);
        method1.invoke(obj,"林青霞");
        System.out.println("========");

        Method method3 = c.getMethod("method3", String.class, int.class);
        method3.invoke(obj,"林青霞",33);
        System.out.println("========");

        Method function = c.getDeclaredMethod("function");
        function.setAccessible(true);
        function.invoke(obj);
    }
}
