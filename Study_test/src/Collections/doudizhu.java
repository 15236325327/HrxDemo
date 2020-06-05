package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class doudizhu {

    public static void main(String[] args) {

        //牌盒
        ArrayList<String> s=new ArrayList<String>();

        //定义花色♦♣♠♥
        String[] colors={"♣","♠","♥","♦"};
        //定义点数
        String[] numbers={"2","3","4","5","6","7","8","9","j","q","k","A"};
        //循环嵌套，一种花色多个点数
        for (String color : colors){
            for (String number : numbers){
                s.add(color+number);
            }
        }
        s.add("小王");
        s.add("大王");

        //洗牌
        Collections.shuffle(s);

        //发牌，即遍历集合，给三个玩家
        ArrayList<String> w=new ArrayList<String>();//我
        ArrayList<String> n=new ArrayList<String>();//你
        ArrayList<String> t=new ArrayList<String>();//他
        ArrayList<String> dp=new ArrayList<String>();//底牌

        for (int i=0; i<s.size(); i++){
            String s1 = s.get(i);
            if (i>=s.size()-3){
                dp.add(s1);
            }else if (i%3==0){
                w.add(s1);
            }else if (i%3==1){
                n.add(s1);
            }else if (i%3==2){
                t.add(s1);
            }
        }

        //玩家看牌,即遍历集合(为了提高复用性，用方法写出）
        see("我",w);
        see("你",n);
        see("他",t);
        see("底牌",dp);
    }

    public static void see(String name,ArrayList<String> s){
        System.out.println(name+"的牌是：");

        for (String i : s){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
