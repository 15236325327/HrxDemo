package Collections;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Collections;

public class doudizhu1 {

    public static void main(String[] args) {

        //hashmap集合存储索引及牌
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        //创建集合储存键值（索引）
        ArrayList<Integer> k = new ArrayList<Integer>();

        //定义花色和点数
        String[] colors = {"♦", "♣", "♥", "♠"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "j", "q", "k", "A"};
        //存储键值对
        int index = 0;
        for (String number : numbers) {
            for (String color : colors) {
                hm.put(index, color + number);
                k.add(index);
                index++;
            }
        }
        hm.put(index, "小王");
        k.add(index);
        index++;
        hm.put(index, "大王");
        k.add(index);

        //洗牌
        Collections.shuffle(k);


        //发牌
        TreeSet<Integer> w = new TreeSet<Integer>();//我
        TreeSet<Integer> n = new TreeSet<Integer>();//你
        TreeSet<Integer> t = new TreeSet<Integer>();//他
        TreeSet<Integer> dp = new TreeSet<Integer>();//底牌

        for (int i = 0; i < k.size(); i++) {
            Integer s = k.get(i);
            if (i >= k.size() - 3) {
                dp.add(s);
            } else if (i % 3 == 0) {
                w.add(s);
            } else if (i % 3 == 1) {
                n.add(s);
            } else if (i % 3 == 2) {
                t.add(s);
            }
        }

        System.out.println(w);

        see("我", w, hm);
        see("你", n, hm);
        see("他", t, hm);
        see("底牌", dp, hm);
    }

    public static void see(String name, TreeSet<Integer> x, HashMap<Integer, String> hm) {
        System.out.println(name + "的牌是：");

        for (Integer i1 : x) {
            String s1 = hm.get(i1);
            System.out.print(s1 + " ");
        }
        System.out.println();
    }
}
