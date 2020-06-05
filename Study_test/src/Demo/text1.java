package Demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class text1 {

    public static void main(String[] args) throws ParseException {

        Map<String, String> map = new HashMap<String, String>();

        map.put("001", "黄任翔");
        map.put("002", "周润发");
        map.put("003", "刘德华");

        System.out.println(map);
        //结果：{001=黄任翔, 002=周润发, 003=刘德华},hashmap重写了toString方法

        System.out.println("----------");

        map.put("001","黎明");

        System.out.println(map);
       //结果：{001=黎明, 002=周润发, 003=刘德华}，put方法，如果键第一次被使用，则是添加操作，若不是第一次，则是修改元素
    }
}
