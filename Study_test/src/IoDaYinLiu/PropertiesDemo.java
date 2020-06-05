package IoDaYinLiu;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

    public static void main(String[] args) throws IOException {

        Properties pro = new Properties();

        pro.setProperty("1","hh");
        pro.setProperty("2","gg");
        pro.setProperty("3","ff");

        pro.store(new FileWriter("hr.properties"),null);

        String property = pro.getProperty("1");
        System.out.println(property==null?"没存储":property);

        String property1 = pro.getProperty("5");
        System.out.println(property1==null?"没存储":property1);

        String klk = pro.getProperty("5", "huangrenxiang");
        System.out.println(klk==null?"没存储":klk);

        pro.load(new FileReader("hr.properties"));
        System.out.println(pro);
    }
}
