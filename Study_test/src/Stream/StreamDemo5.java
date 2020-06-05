package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo5 {

    public static void main(String[] args) {

        ArrayList<String> arr1 = new ArrayList<String>();

        arr1.add("刘德华");
        arr1.add("黎明");
        arr1.add("洪金宝");
        arr1.add("李虎");
        arr1.add("范丞丞");
        arr1.add("胡歌");

        List<String> collect = arr1.stream().filter(s -> s.length() == 3).skip(1).collect(Collectors.toList());
        for (String s : collect){
            System.out.println(s);
        }


        Set<String> set = arr1.stream().filter(s -> s.startsWith("胡")).collect(Collectors.toSet());
        for (String s : set){
            System.out.println(s);
        }

        String[] str = {"张明明,1", "张小花,3", "黄任翔,2", "张空,5", "李虎,4"};
        Stream<String> zhangStream = Stream.of(str).filter(s -> s.split(",")[0].startsWith("张"));
        Map<String, Integer> collect1 = zhangStream.collect(Collectors.toMap(ss -> ss.split(",")[0], s -> Integer.parseInt(s.split(",")[1])));

        //map遍历1
        Set<String> strings = collect1.keySet();
        for (String s : strings){
            Integer s1 = collect1.get(s);
            System.out.println(s+s1);
        }

        //map遍历2
        Set<Map.Entry<String, Integer>> entries = collect1.entrySet();
        for (Map.Entry<String,Integer> s  : entries){
            System.out.println(s.getKey()+s.getValue());
        }

    }
}
