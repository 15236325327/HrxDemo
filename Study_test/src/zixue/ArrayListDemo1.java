package zixue;

import java.util.ArrayList;

public class ArrayListDemo1 {

    public static void main(String[] args) {

        ArrayList<String> array = new ArrayList<>();

        //第一种添加方式（添加到末尾）
        //System.out.println(array.add("hello"));

        //第二种添加方式(添加到末尾）
        array.add("helllo");//(0)
        array.add("world");//(1)
        array.add("hrx");//(2)

        //第三种添加方式（在集合中添加到指定索引位置）
//        array.add(1,"javase");
//        array.add(3,"javaee");

        //第一种删除方式（删除指定元素，返回值boolean）
//        System.out.println(array.remove("world"));
//        System.out.println(array.remove("java"));

        //第二种删除方式（删除指定索引位置元素，返回被删除的元素）
//        System.out.println(array.remove(1));
//        System.out.println(array.remove(3));//(java.lang.IndexOutOfBoundsException:索引越界)

        //修改指定索引的元素，返回被修改的元素
//        System.out.println(array.set(2,"lww"));
//        System.out.println(array.set(3,"nzc"));//(java.lang.IndexOutOfBoundsException:索引越界)

        //返回指定索引元素 get
//        System.out.println(array.get(0));
//        System.out.println(array.get(1));
//        System.out.println(array.get(2));

        //返回集合中元素个数 size
        System.out.println(array.size());

        System.out.println("array:" + array);

    }
}
