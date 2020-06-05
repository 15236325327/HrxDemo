package MapDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArrayListAndHashMap1 {

    public static void main(String[] args) {

        ArrayList<HashMap<Integer, String>> s = new ArrayList<HashMap<Integer, String>>();

        HashMap<Integer, String> h1 = new HashMap<Integer, String>();
        h1.put(66, "huang");
        s.add(h1);

        HashMap<Integer, String> h2 = new HashMap<Integer, String>();
        h2.put(88, "ren");
        s.add(h2);

        HashMap<Integer, String> h3 = new HashMap<Integer, String>();
        h3.put(99, "xiang");
        s.add(h3);

        //遍历方式1
        for (HashMap<Integer, String> i : s) {
            Set<Integer> i1 = i.keySet();
            for (Integer i2 : i1) {
                String s1 = i.get(i2);
                System.out.println(i2 + ":" + s1);
            }
        }

        //遍历方式2
        for (HashMap<Integer, String> i : s) {

            Set<Map.Entry<Integer, String>> i1 = i.entrySet();
            for (Map.Entry<Integer, String> i2 : i1) {
                System.out.println(i2.getKey() + ":" + i2.getValue());
            }
        }
    }
}
