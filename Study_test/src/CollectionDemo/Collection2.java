package CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection2 {

    public static void main(String[] args) {

        Collection<String> c = new ArrayList<String>();

        c.add("黄");
        c.add("张");
        c.add("陈");

        //迭代器 查询集合中的元素E next();
        Iterator<String> it = c.iterator();

        /* System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());//NoSuchElementException
        */

        //boolean hasNext();如果迭代器中有更多元素，则返回ture；
//        if (it.hasNext()){
//            System.out.println(it.next());
//        }
//        if (it.hasNext()){
//            System.out.println(it.next());
//        }
//        if (it.hasNext()){
//            System.out.println(it.next());
//        }
//        if (it.hasNext()){
//            System.out.println(it.next());
//        }
        //为了提高复用性，用while循环改进
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
    }
}
