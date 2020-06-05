package LaFunctionalInterface;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {

        Integer i = useFunction("123456789", s -> Integer.parseInt(s));
        System.out.println(i);

        String s = useFunction1(100, in -> Integer.toString(in + 100));
        System.out.println(s);

        String s2 = useFunction2("100", s1 -> Integer.parseInt(s1), s1 -> Integer.toString(s1 + 200));
        System.out.println(s2);
    }

    //定一个方法，把String转换为int类型
    private static Integer useFunction(String s, Function<String, Integer> fu) {
        return fu.apply(s);
    }

    //把int类型的数据加上一个整数，转换为字符在控制台输出
    private static String useFunction1(Integer in, Function<Integer, String> fu) {
        return fu.apply(in);
    }

    //把String转换为int了类型，再把int类型的数据加上一个整数，转换为String输出
    private static String useFunction2(String s1, Function<String, Integer> fu1, Function<Integer, String> fu2) {
        return fu1.andThen(fu2).apply(s1);
    }
}
