package MapDemo;

import java.util.*;

public class HashMapAndArrayList {

    public static void main(String[] args) {

        LinkedHashMap<String, ArrayList<String>> h = new LinkedHashMap<String, ArrayList<String>>();

        ArrayList<String> s1 = new ArrayList<String>();
        s1.add("黄任翔");
        h.put("1714134201", s1);

        ArrayList<String> s2 = new ArrayList<String>();
        s2.add("陈诗雨");
        h.put("1714134202", s2);

        ArrayList<String> s3 = new ArrayList<String>();
        s3.add("王巴丹");
        h.put("1714134203", s3);

        Set<Map.Entry<String, ArrayList<String>>> i = h.entrySet();
        for (Map.Entry<String, ArrayList<String>> i1 : i) {
            String k = i1.getKey();
            ArrayList<String> v = i1.getValue();
            for (String i2 : v) {
                System.out.println(k + "\t" + i2);
            }
        }

        System.out.println("---------");

        Set<String> s = h.keySet();
        for (String i3 : s) {
            System.out.println(i3);
            ArrayList<String> a = h.get(i3);
            for (String b : a) {
                System.out.println("\t" + b);
            }
        }

    }
}
