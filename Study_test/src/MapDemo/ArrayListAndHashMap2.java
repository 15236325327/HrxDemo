package MapDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArrayListAndHashMap2 {

    public static void main(String[] args) {

        ArrayList<HashMap<String, String>> a = new ArrayList<HashMap<String, String>>();

        HashMap<String, String> h1 = new HashMap<String, String>();
        h1.put("黄任翔", "爱美女！");
        a.add(h1);

        HashMap<String, String> h2 = new HashMap<String, String>();
        h2.put("陈昊", "爱男人！");
        a.add(h2);

        HashMap<String, String> h3 = new HashMap<String, String>();
        h3.put("李虎", "爱宋琪！");
        a.add(h3);

        for (HashMap<String, String> i : a) {
            Set<String> i1 = i.keySet();
            for (String i2 : i1) {
                String i3 = i.get(i2);
                System.out.println(i2 + ":" + i3);
            }
        }

        System.out.println("--------S");

        for (HashMap<String, String> i : a) {
            Set<Map.Entry<String, String>> i1 = i.entrySet();
            for (Map.Entry<String, String> i2 : i1) {
                String k = i2.getKey();
                String v = i2.getValue();
                System.out.println(k + ":" + v);
            }
        }
    }
}
