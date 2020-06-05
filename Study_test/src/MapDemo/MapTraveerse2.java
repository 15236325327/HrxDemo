package MapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Map集合遍历操作2
public class MapTraveerse2 {

    public static void main(String[] args) {

        Map<Integer, String> s = new HashMap<Integer, String>();

        s.put(21, "黄任翔");
        s.put(22, "郭靖");
        s.put(23, "刘德华");
        s.put(24, "陈真");

        //获取所有键值对对象的集合
        Set<Map.Entry<Integer, String>> s1 = s.entrySet();

        for (Map.Entry<Integer, String> i : s1) {
            System.out.println(i.getKey() + ":" + i.getValue());
        }
    }
}
