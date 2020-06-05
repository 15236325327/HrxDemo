package Set;

import java.util.HashSet;

public class HashsetDemo {

    public static void main(String[] args) {

        HashSet<String> s = new HashSet<String>();

        s.add("huang");
        s.add("ren");
        s.add("xiang");
        s.add("huang");

        System.out.println("huang".hashCode());

        for (String i : s) {
            System.out.println(i);
        }
    }
}
