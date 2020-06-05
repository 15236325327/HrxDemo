package MapDemo;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class SatisticalCharacter {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("请输入字符串：");
        String s1 = s.nextLine();

        LinkedHashMap<Character, Integer> lh = new LinkedHashMap<Character, Integer>();

        for (int i = 0; i < s1.length(); i++) {
            char k = s1.charAt(i);
            Integer v = lh.get(k);
            if (v == null) {
                lh.put(k, 1);
            } else {
                v++;
                lh.put(k, v);
            }
        }

        StringBuilder sb = new StringBuilder();

        Set<Character> ch = lh.keySet();
        for (Character k : ch) {
            Integer v = lh.get(k);
            sb.append(k ).append("(").append(v).append(")");
        }

        String s2 = sb.toString();

        System.out.println(s2);

    }
}
