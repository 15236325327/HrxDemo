package ListDemo;

import java.util.ArrayList;
import java.util.List;

public class List2 {

    public static void main(String[] args) {

        List<String> l= new ArrayList<String>();

        l.add("黄");
        l.add("张");
        l.add("陈");

        //void add(int index,e element)在集合指定索引位置加入元素
        l.add(2,"王");

        //E remove(int index)删除指定索引位置的元素
        l.remove(3);

        //E set(int index,E element)修改指定位置的元素
//        l.set(3,"吴");索引越界
        l.set(2,"wang");

        //E get(int index)返回指定位置的元素
        System.out.println(l.get(2));

        System.out.println(l);
    }
}
