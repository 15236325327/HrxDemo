package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo1 {

    public static void main(String[] args) {

        String[] str = {"张明明", "张小花", "黄任翔", "张空", "李虎"};

        //boolean startsWith​(String prefix) 测试此字符串是否以指定的前缀开头。
        for (int i = 0; i < str.length; i++) {
            if (str[i].startsWith("张")) {
                System.out.println(str[i]);
            }
        }

        System.out.println("-----------");

        ArrayList<String> array=new ArrayList<String>();

        for (int i = 0; i < str.length; i++) {
            if (str[i].startsWith("张")&&str[i].length()==3) {
                array.add(str[i]);
            }
        }

        for (String arr : array){
            System.out.println(arr);
        }

    }
}
