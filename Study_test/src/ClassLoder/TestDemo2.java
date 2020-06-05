package ClassLoder;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class TestDemo2 {

    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<?> c = Class.forName("ClassLoder.Student");
        Constructor<?> con = c.getConstructor();
        Object o = con.newInstance();

        Field name = c.getDeclaredField("name");
        name.setAccessible(true);
        name.set(o,"林青霞");

        Field age = c.getDeclaredField("age");
        age.set(o,22);

        Field address = c.getField("address");
        address.set(o,"香港");

        System.out.println(o);
    }
}
