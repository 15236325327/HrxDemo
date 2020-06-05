package ChenJiPaiXuSet;

import java.util.*;

public class NonRepeatingRandomNumber {

    public static void main(String[] args) {
        //创建Set集合对象
//        Set<Integer> s = new HashSet<Integer>();
        Set<Integer> s=new TreeSet<Integer>();
       //创建随机数对象
        Random r = new Random();
        //判断集合数长度
        while(s.size()<10){
            int num = r.nextInt(20) + 1;
            s.add(num);
        }


        for (Integer i : s){
            System.out.println(i);
        }


    }


}
