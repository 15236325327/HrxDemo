package MapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Map集合遍历操作1
public class MapTraverse1 {

    public static void main(String[] args) {

        Map<Integer, String> s = new HashMap<Integer, String>();

        s.put(21, "黄任翔");
        s.put(22, "郭靖");
        s.put(23, "刘德华");
        s.put(24, "陈真");

        Set<Integer> s1 = s.keySet();

        for (Integer i : s1) {
            String s2 = s.get(i);
            System.out.println(i + "," + s2);
        }
    }
}
