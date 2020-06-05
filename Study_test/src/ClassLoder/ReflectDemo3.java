package ClassLoder;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*	获取成员方法：
	参数1: 方法名称 参数2:方法行参的class 对象
	• public Method getMethod(String name,Class<?>... parameterTypes)：
	获取单个的方法 不包含私有的
	• public Method getDeclaredMethod(String name,Class<?>... parameterTypes)：
	获取单个方法包括私有的
*/
public class ReflectDemo3 {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException,
            ClassNotFoundException, NoSuchMethodException, InvocationTargetException {

        Class<?> c = Class.forName("ClassLoder.Student");
        //Object o = c.newInstance();
        //Class类中的newInstance()方法jdk9后已经过时，选择使用Constructor里的此方法
        Constructor<?> con = c.getConstructor();
        Object o = con.newInstance();

        //public Method[] getMethods()：
        //获取所有的公共的成员方法不包含私有的
        //包含从父类继承过来的过来的公共方法
        Method[] met1 = c.getMethods();
        for (Method met : met1){
            System.out.println(met);
        }
        System.out.println("========");


        //public Method[] getDeclaredMethods()：
        //获取自己的所有成员方法 包含私有的
        Method[] dmet1 = c.getDeclaredMethods();
        for (Method demt : dmet1){
            System.out.println(demt);
        }
        System.out.println("========");


        //参数1: 方法名称 参数2:方法行参的class 对象
        //public Method getMethod(String name,Class<?>... parameterTypes)：
        //获取单个的方法 不包含私有的
        Method method1 = c.getMethod("method1", String.class);
        //Object invoke​(Object obj, Object... args)
        //在具有指定参数的指定对象上调用此 方法对象表示的基础方法。
        method1.invoke(o,"黄任翔真帅！");
        System.out.println("========");


        //public Method getDeclaredMethod(String name,Class<?>... parameterTypes)：
        //获取单个方法包括私有的
        Method function = c.getDeclaredMethod("function");
        function.setAccessible(true);
        function.invoke(o);

    }
}
