package MapDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArrayLiistAndHashMap {

    public static void main(String[] args) {

        ArrayList<HashMap<Integer, String>> s = new ArrayList<HashMap<Integer, String>>();

        HashMap<Integer, String> m1 = new HashMap<Integer, String>();
        m1.put(1, "h");
        s.add(m1);

        HashMap<Integer, String> m2 = new HashMap<Integer, String>();
        m2.put(2, "r");
        s.add(m2);

        HashMap<Integer, String> m3 = new HashMap<Integer, String>();
        m3.put(3, "x");
        s.add(m3);

        for (HashMap<Integer, String> i : s) {
            Set<Integer> i1 = i.keySet();
            for (Integer i2 : i1) {
                String s1 = i.get(i2);
                System.out.println(i2 + ":" + s1);
            }
        }
    }
}

