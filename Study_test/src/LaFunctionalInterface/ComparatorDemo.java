package LaFunctionalInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {

    public static void main(String[] args) {

        ArrayList<String> array=new ArrayList<String>();

        array.add("dddd");
        array.add("aa");
        array.add("b");
        array.add("ccc");

        System.out.println("排序前"+array);

        Collections.sort(array);
        System.out.println("排序后"+array);

        Collections.sort(array,useComparator());
        System.out.println(array);

    }

    private static Comparator<String> useComparator() {

        /*Comparator<String> c=new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {

                return s1.length()-s2.length();
            }
        };

        return  c;*/

        /*return new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {

                return s1.length()-s2.length();
            }
        };*/

        /*return (String s1, String s2) -> {

                return s1.length()-s2.length();
            };*/

        return (s1, s2) -> s1.length()-s2.length();

    }


}
