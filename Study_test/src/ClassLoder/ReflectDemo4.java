package ClassLoder;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectDemo4 {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {

        ArrayList<Integer> arr = new ArrayList<Integer>();

        //public boolean add(E e)
        arr.add(123);
        arr.add(456);
        arr.add(789);

        //泛型，只在编译期有效，运行期就擦除了
        Class<? extends ArrayList> c = arr.getClass();
        Method add = c.getMethod("add", Object.class);
        add.invoke(arr, "abc");

        /*for (int i = 0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }*/

        System.out.println(arr);
    }
}