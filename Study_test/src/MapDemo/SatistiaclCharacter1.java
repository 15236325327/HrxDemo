package MapDemo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SatistiaclCharacter1 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串：");
        String s = sc.nextLine();

        LinkedHashMap<Character,Integer> lmh=new LinkedHashMap<Character, Integer>();

        for (int i=0; i<s.length(); i++){
            //char charAt​(int index) 返回指定索引处的 char值。
            char k = s.charAt(i);
            Integer v = lmh.get(k);
            if (v==null){
                lmh.put(k,1);
            }else{
                v++;
                lmh.put(k,v);
            }
        }

        StringBuilder s1=new StringBuilder();

        Set<Map.Entry<Character, Integer>> s2 = lmh.entrySet();

        for (Map.Entry<Character, Integer> s3 : s2){
            Character k = s3.getKey();
            Integer v = s3.getValue();
            s1.append(k).append("(").append(v).append(")");
        }

        String s3 = s1.toString();
        System.out.println(s3);
    }
}
