package CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;

public class Collection1 {

    public static void main(String[] args) {

        Collection<String> c = new ArrayList<String>();

        //public add(E e)
        c.add("黄任翔");
        c.add("皇帝");
        c.add("皇后");

        //boolean remove(object o)
        System.out.println(c.remove("黄任翔"));
        System.out.println(c.remove("huang"));

        //boolean contains(object o)查询集合中是否具有指定元素；
        System.out.println(c.contains("黄任翔"));

        //boolean isEmpty()判断集合是否为空；
        System.out.println(c.isEmpty());

        //int size()判断集合长度
        System.out.println(c.size());

        //void clear()清空集合中的元素；
        c.clear();
        System.out.println(c);
    }
}
