package Set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        LinkedHashSet<Integer> s=new LinkedHashSet<Integer>();

        s.add(10);
        s.add(30);
        s.add(20);

        s.add(20);

        for (int i : s){
            System.out.println(i);
        }
    }
}
