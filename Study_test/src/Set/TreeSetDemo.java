package Set;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<Integer> s=new TreeSet<Integer>();

        s.add(1);
        s.add(30);
        s.add(20);
        s.add(40);
        s.add(40);

        for (Integer i : s){
            System.out.println(i);
        }//结果：1 20 30 40
    }
}
