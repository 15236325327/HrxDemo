package ClassLoder;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/*获取所有成员变量：*/
public class ReflectDemo2 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<?> c = Class.forName("ClassLoder.Student");

        //public Field[] getFields()：
        //获取所有的成员变量包含从父类继承过来的
        Field[] f1 = c.getFields();
        for (Field f : f1){
            System.out.println(f);
        }
        System.out.println("--------");

        //public Field[] getDeclaredFields()：
        //获取所有的成员变量 包含私有的 也包含从父类继承过来的成员变量
        Field[] df1 = c.getDeclaredFields();
        for (Field df : df1){
            System.out.println(df);
        }
        System.out.println("--------");

        //public Field getField(String name) 获取单个成员变量
        Field fiel = c.getField("address");
        System.out.println(fiel);
        System.out.println("--------");

        //获取单个成员变量(包括私有)：
        //public Field getDeclaredField(String name)
        Field fiel1 = c.getDeclaredField("name");
        System.out.println(fiel1);
        System.out.println("--------");

        Field fiel2 = c.getField("address");
        Constructor<?> con = c.getConstructor();
        Object o = con.newInstance();
        //void set​(Object obj, Object value)
        // 将指定的对象参数中由此 Field对象表示的字段设置为指定的新值。
        fiel2.set(o,"北京");//给对象o的成员变量fiel2(address)赋值为北京
        System.out.println(o);
        System.out.println("--------");


        Field fiel3 = c.getDeclaredField("name");
        Constructor<?> con1= c.getConstructor();
        Object o1 = con1.newInstance();

        fiel3.setAccessible(true);

        //void set​(Object obj, Object value)
        // 将指定的对象参数中由此 Field对象表示的字段设置为指定的新值。
        fiel3.set(o1,"北京");//给对象o的成员变量fiel2(address)赋值为北京
        System.out.println(o1);
    }

}
