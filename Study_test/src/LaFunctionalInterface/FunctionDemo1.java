package LaFunctionalInterface;

import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionDemo1 {

    public static void main(String[] args) {

        String s="黄任翔,21";

        int i = useFunction(s, s1 -> Integer.parseInt(s.split(",")[1]), s1 -> s1 + 70);
        System.out.println(i);
        
    }

    private static Integer useFunction(String s, Function<String,Integer> f1,Function<Integer,Integer> f2){
        return f1.andThen(f2).apply(s);
    }
}
