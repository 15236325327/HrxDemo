package MapDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapAndArrayList1 {

    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> h = new HashMap<String, ArrayList<String>>();

        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("黄任翔");
        h.put("河南", a1);

        ArrayList<String> a2 = new ArrayList<String>();
        a2.add("白旭东");
        h.put("新疆", a2);

        ArrayList<String> a3 = new ArrayList<String>();
        a3.add("张宇");
        h.put("周口", a3);

        Set<String> s = h.keySet();
        for (String k : s) {
            ArrayList<String> vl = h.get(k);
            for (String v : vl) {
                System.out.println(k + ":" + v);
            }
        }

        System.out.println("--------");

        Set<Map.Entry<String, ArrayList<String>>> s1 = h.entrySet();
        for (Map.Entry<String, ArrayList<String>> s2 : s1){
            String k = s2.getKey();
            ArrayList<String> vl = s2.getValue();
            for (String v : vl){
                System.out.println(k+":"+v);
            }
        }
    }
}
