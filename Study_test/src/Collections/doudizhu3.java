package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class doudizhu3 {

    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        ArrayList<Integer> k = new ArrayList<Integer>();

        String[] colors = {"♦", "♣", "♠", "♥"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "j", "q", "k", "A","2"};
        int index = 0;
        for (String number : numbers) {
            for (String color : colors) {
                hm.put(index, color + number);
                k.add(index);
                index++;
            }
        }
        hm.put(index, "黑jack");
        k.add(index);
        index++;
        hm.put(index, "红jack");
        k.add(index);

        Collections.shuffle(k);

        TreeSet<Integer> w = new TreeSet<Integer>();
        TreeSet<Integer> n = new TreeSet<Integer>();
        TreeSet<Integer> t = new TreeSet<Integer>();
        TreeSet<Integer> dp = new TreeSet<Integer>();

        for (int i = 0; i < k.size(); i++) {
            Integer i1 = k.get(i);
            if (i >= k.size() - 3) {
                dp.add(i1);
            } else if (i % 3 == 0) {
                w.add(i1);
            } else if (i % 3 == 1) {
                n.add(i1);
            } else if (i % 3 == 2) {
                t.add(i1);
            }
        }

        lookpoker("黄任翔", w, hm);
        lookpoker("陈昊", n, hm);
        lookpoker("白旭东", t, hm);
        lookpoker("底牌", dp, hm);

    }

    public static void lookpoker(String name, TreeSet<Integer> T, HashMap<Integer, String> hm) {
        System.out.println(name + "的牌点为：");

        for (Integer i : T) {
            String s = hm.get(i);
            System.out.print(s + "\t");
        }
        System.out.println();
    }
}
