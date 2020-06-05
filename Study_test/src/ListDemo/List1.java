package ListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List1 {

    public static void main(String[] args) {

        List<String> list=new ArrayList<String>();

        //list集合特点：有序
        list.add("hello");
        list.add("java");
        list.add("javaee");

        //list集合特点：可重复
        list.add("javaee");

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String s=iterator.next();
            System.out.println(s);
        }
        //结果：hello java javaee javaee
    }
}
