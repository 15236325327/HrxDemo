package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo4 {

    public static void main(String[] args) {

        ArrayList<String> arr1 = new ArrayList<String>();
        ArrayList<String> arr2 = new ArrayList<String>();

        arr1.add("刘德华");
        arr1.add("黎明");
        arr1.add("洪金宝");
        arr1.add("李虎");
        arr1.add("范丞丞");
        arr1.add("胡歌");

        arr2.add("范冰冰");
        arr2.add("李冰冰");
        arr2.add("刘诗诗");
        arr2.add("赵薇");
        arr2.add("IU");
        arr2.add("李子柒");

        /*Stream<String> stringStream = arr1.stream().filter(s -> s.length() == 3);
        Stream<String> liStream =  arr2.stream().filter(s -> s.startsWith("李"));
        Stream<String> concat = Stream.concat(stringStream, liStream);

        //concat.map(Actor::new).forEach(System.out::println);//需要重写toString方法
        concat.map(Actor::new).forEach(s -> System.out.println(s.getName()));*/

        //简写
        Stream.concat(arr1.stream().filter(s -> s.length() == 3),
                arr2.stream().filter(s -> s.startsWith("李")))
                .map(Actor::new)
                .forEach(s -> System.out.println(s.getName()));;
    }
}
