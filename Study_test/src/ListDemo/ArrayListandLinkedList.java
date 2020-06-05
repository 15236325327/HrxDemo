package ListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListandLinkedList {

    public static void main(String[] args) {

        ArrayList<String> array = new ArrayList<String>();
        array.add("huang");
        array.add("zhang");
        array.add("chen");
        for (int i = 0; i < array.size(); i++) {
            String s = array.get(i);
            System.out.println(s);
        }

        Iterator<String> s = array.iterator();
        while (s.hasNext()) {
            String s1 = s.next();
            System.out.println(s1);
        }

        for (String i : array) {
            System.out.println(i);
        }

        System.out.println("---------");

        LinkedList<String> l = new LinkedList<String>();
        l.add("h");
        l.add("k");
        l.add("g");

        for (int i = 0; i < l.size(); i++) {
            String s1 = l.get(i);
            System.out.println(s1);
        }

        System.out.println("------");

        for (String i : l) {
            System.out.println(i);
        }

        System.out.println("------");

        Iterator<String> it = l.iterator();
        while (it.hasNext()) {
            String s1 = it.next();
            System.out.println(s1);
        }
    }

}
