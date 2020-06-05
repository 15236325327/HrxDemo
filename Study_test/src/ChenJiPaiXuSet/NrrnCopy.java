package ChenJiPaiXuSet;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class NrrnCopy {

    public static void main(String[] args) {

        Set<Integer> s= new TreeSet<Integer>();

        Random r=new Random();

        while (s.size()<50) {
            int i = r.nextInt(50) + 1;
            s.add(i);
        }

        for (Integer i : s){
            System.out.println(i);
        }
    }
}
