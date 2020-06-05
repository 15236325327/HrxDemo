package Stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo3 {

    public static void main(String[] args) {

        //方式1.Collection集合中的方法 stream()：
        List<String> list = Arrays.asList("张明明", "张小花", "黄任翔", "张空", "李虎");
        Stream<String> listStream = list.stream();

        Set<String> set = new HashSet<>();
        set.add("张明明");
        set.add("张小花");
        set.add("黄任翔");
        set.add("张空");
        set.add("李虎");
        Stream<String> setStream = set.stream();

        //Map体系集合间接生成流
        HashMap<String, Integer> map = new HashMap<>();
        Stream<String> stream = map.keySet().stream();
        Stream<Integer> stream1 = map.values().stream();
        Stream<Map.Entry<String, Integer>> stream2 = map.entrySet().stream();

        //由值创建流:
        Stream<String> str2 = Stream.of("张明明", "张小花", "黄任翔", "张空", "李虎");
        str2.forEach(System.out::println);


    }
}
