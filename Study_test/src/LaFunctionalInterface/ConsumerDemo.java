package LaFunctionalInterface;

import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {

        /*useaccept("abc",s-> System.out.println(s.toUpperCase()));

        useaccept("abc",System.out::println);

        useaccept("黄任翔",s-> System.out.println(new StringBuilder(s).reverse().toString()));*/

        useaccept1("林青霞",s-> System.out.println(s),s->System.out.println(new StringBuilder(s).reverse().toString()));
    }

    private static void useaccept(String name, Consumer<String> con) {
        con.accept(name);
    }

    private static void useaccept1(String name, Consumer<String> con1,Consumer<String> con2) {
        /*con1.accept(name);
        con2.accept(name);*/

        //	§ default Consumer<T> andThen​(Consumer<? super T> after)
        //	返回一个组成的 Consumer ，依次执行此操作，然后执行 after操作。
        con1.andThen(con2).accept(name);

    }
}
