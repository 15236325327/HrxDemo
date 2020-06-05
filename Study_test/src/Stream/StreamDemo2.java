package Stream;

import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo2 {

    public static void main(String[] args) {

        //filter(Predicate p)：过滤 接收 Lambda ， 从流中排除某些元素
        Stream<String> stream1 = Stream.of("张明明", "张小花", "黄任翔", "张空", "李虎");
        /*Stream<String> zhang1 = stream1.filter(s -> s.startsWith("张") && s.length() == 3);
        zhang1.forEach(System.out::println);*///下面是简写
        /*stream1.filter(s -> s.startsWith("张")).filter(s -> s.length()==3).forEach(s -> System.out.println(s));*/
        stream1.filter(s -> s.startsWith("张") && s.length() == 3).forEach(System.out::println);
        System.out.println("------------");


        //distinct()：去重，通过流所生成元素的 hashCode() 和 equals() 去除重复元素
        Stream<String> stream2 = Stream.of("张明明", "张明明", "张小花", "黄任翔", "张空", "李虎");
        stream2.distinct().forEach(System.out::println);
        System.out.println("------------");


        //limit(long maxSize)：截断流，使其元素不超过给定数量。
        Stream<String> stream3 = Stream.of("张明明", "张明明", "张小花", "黄任翔", "张空", "李虎");
        stream3.limit(3).forEach(System.out::println);
        System.out.println("------------");


        //skip(long n)：跳过元素，返回一个扔掉了前 n 个元素的流。若流中元素不足 n 个，则返回一个空流。与 limit(n) 互补
        Stream<String> stream4 = Stream.of("张明明", "张明明", "张小花", "黄任翔", "张空", "李虎");
        stream4.skip(3).forEach(System.out::println);
        System.out.println("------------");


        //static <T> Stream<T> concat​(Stream<? extends T> a, Stream<? extends T> b) 创建一个懒惰连接的流，其元素是第一个流的所有元素，后跟第二个流的所有元素 
        Stream<String> stream5 = Stream.of("黄任翔");
        Stream<String> stream6 = Stream.of("李文文");
        Stream<String> concat = Stream.concat(stream5, stream6);
        concat.forEach(System.out::println);
        System.out.println("------------");


        //map(Function f)：接收一个函数作为参数，该函数会被应用到每个元素上，并将其映射成一个新的元素
        Stream<String> stream9=Stream.of("1","2","3","4","5","6","7","8","9");
        Stream<Integer> stringStream = stream9.map(s -> Integer.parseInt(s));
        stringStream.forEach(System.out::print);
        System.out.println("\r\n------------");


        //mapToInt(ToIntFunction f)：接收一个函数作为参数，该函数会被应用到每个元素上，产生一个新的 IntStream
        Stream<String> stream10=Stream.of("1","2","3","4","5","6");
        int sum = stream10.mapToInt(s -> Integer.parseInt(s)).sum();
        System.out.print(sum);
        System.out.println("\r\n------------");


        //sorted()：产生一个新流，其中按自然顺序排序(元素实现Compareble接口)
        Stream<Integer> stream7 = Stream.of(1, 5, 9, 8, 3, 4, 7, 6, 2);
        Stream<Integer> sorted = stream7.sorted();
        sorted.forEach(System.out::print);
        System.out.println("\r\n------------");


        //sorted(Comparator comp)：产生一个新流，其中按比较器顺序排序(需传入一个比较器)
        Stream<Integer> stream8 = Stream.of(1, 5, 9, 8, 3, 4, 7, 6, 2);
        Stream<Integer> sorted1 = stream8.sorted((a, b) -> b - a);
        sorted1.forEach(System.out::print);
    }
}
