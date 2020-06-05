package ClassLoder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class TestDemo4 {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        //加载配置文件
        //基于目标类开发
        Properties pro = new Properties();
        //pro.load(new FileReader("./hrx.properties"));
        FileReader fr = new FileReader("./hrx.properties");
        pro.load(fr);
        fr.close();

        //1.获取该类的字节码文件对象
        Class<?> cn = Class.forName(pro.getProperty("ClassName"));

        //2.通过反射来创建目标类对象
        Object o = cn.getDeclaredConstructor().newInstance();

        //3.调用目标类中的方法执行
        Method methodName = cn.getMethod(pro.getProperty("MethodName"));
        methodName.invoke(o);

    }
}
