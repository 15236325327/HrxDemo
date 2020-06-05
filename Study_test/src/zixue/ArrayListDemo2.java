package zixue;

import java.util.ArrayList;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        ArrayList<String> array=new ArrayList<>();

        array.add("h");
        array.add("r");
        array.add("x");
        array.add("z");
        array.add("s");

        //遍历集合get方法
//        array.get(0);
//        array.get(1);
//        array.get(2);
//        array.get(3);
//        array.get(4);

        //遍历集合通用格式
        for (int x = 0; x<array.size(); x++){
            String s=array.get(x);
            System.out.println(s);
        }
    }
}
