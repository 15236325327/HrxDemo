package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<Integer>();

        l.add(10);
        l.add(50);
        l.add(60);
        l.add(30);
        l.add(20);
        l.add(40);

        /*public static <T extends Comparable<? super T>> void sort​(List<T> list)
        根据其元素的natural ordering ，将指定的列表按升序排序。 列表中的所有元素必须实现Comparable界面。
        此外，列表中的所有元素必须相互可比较
        即， e1.compareTo(e2)不能为ClassCastException中的任何元素e1和e2抛出ClassCastException ）。
        这种保证是稳定的 ：等同的元素将不会被排序作为排序的结果。指定的列表必须是可修改的，但不能调整大小。(自然排序）*/
        //Collections.sort(l);

        //public static void reverse​(List<?> list)反转指定列表中元素的顺序。
        Collections.reverse(l);

        //public static void shuffle​(List<?> list)使用默认的随机源随机排列指定的列表。 所有排列都以大致相等的可能性发生。
        //Collections.shuffle(l);

        System.out.println(l);
    }
}
