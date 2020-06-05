package ClassLoder;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*获取所有构造方法：*/

public class ReflectDemo1 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<?> c1 = Class.forName("ClassLoder.Student");

        //public Constructor<?>[] getConstructors()：
        //获取所有的构造方法，不包含私有的
        Constructor<?>[] cos = c1.getConstructors();
        for (Constructor co : cos){
        System.out.println(co);
        }
        System.out.println("--------");

        //public Constructor<?>[] getDeclaredConstructors()：
        //获取所有的构造方法 ，包括私有的
        Constructor<?>[] cos1 = c1.getDeclaredConstructors();
        for (Constructor co1 : cos1){
            System.out.println(co1);
        }
        System.out.println("--------");




        //public Constructor< T > getConstructor(Class<?>... parameterTypes)：
        //获取单个的构造方法， 不包含私有的
        Constructor<?> cos2 = c1.getConstructor();
        //T newInstance​(Object... initargs) 使用由此 Constructor对象表示的构造函数，
        // 使用指定的初始化参数来创建和初始化构造函数的声明类的新实例。
        Object obj = cos2.newInstance();
        System.out.println(obj);
        System.out.println("--------");

        Constructor<?> cos3 = c1.getConstructor(String.class,int.class,String.class);
        Student obj2 = (Student) cos3.newInstance("黄任翔",21,"河南");
        System.out.println(obj2);
        System.out.println("--------");


        //public Constructor< T > getDeclaredConstructor(Class<?>... parameterTypes)：
        //获取单个的构造方法，包含私有的
        Constructor<?> cos4 = c1.getDeclaredConstructor(String.class, int.class);
        //cos4.setAccessible(true);{加不加这个取消权限的语法监测都可以}
        Object obj3 = cos4.newInstance("张宇", 22);
        System.out.println(obj3);
        System.out.println("--------");


        Constructor<?> con5 = c1.getDeclaredConstructor(String.class);
        //public void setAccessible​(boolean flag)将此反射对象的accessible标志设置为指示的布尔值。
        //值为true表示反射对象应该在使用Java语言访问控制时抑制检查。
        //值为false表示反射对象应该在使用Java语言访问控制时执行检查，并在类描述中指出变体。
        con5.setAccessible(true);
        Object obj4 = con5.newInstance("田兆鑫");
        System.out.println(obj4);

    }
}
