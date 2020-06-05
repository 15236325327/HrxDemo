package ClassLoder;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestDemo1 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<?> c = Class.forName("ClassLoder.Student");

        Constructor<?> con = c.getDeclaredConstructor(String.class, int.class, String.class);

        con.setAccessible(true);

        Student s = (Student) con.newInstance("林青霞", 33, "香港");

        System.out.println(s+"\r\n");

        Constructor<?> con1 = c.getConstructor();
        Object o = con1.newInstance();
        System.out.println(o);
    }
}
