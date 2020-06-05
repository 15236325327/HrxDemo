package LaFunctionalInterface;

import java.util.function.Consumer;

public class ConsumerDemo1 {

    public static void main(String[] args) {

        String[] str = {"梅萍蔚，20", "戈尔丹，30", "萧炎，100"};

        /*useaccept(str[0], s -> System.out.print("“姓名：" + str[0].split("，")[0]+" "),
                s -> System.out.println("年龄：" + str[0].split("，")[1] + "”"));

        useaccept(str[1], s -> System.out.print("“姓名：" + str[1].split("，")[0]+" "),
                s -> System.out.println("年龄：" + str[1].split("，")[1] + "”"));

        useaccept(str[2], s -> System.out.print("“姓名：" + str[2].split("，")[0]+" "),
                s -> System.out.println("年龄：" + str[2].split("，")[1] + "”"));

        System.out.println("-----------");*/

        useaccept(str, s -> System.out.print("姓名：" + s.split("，")[0] + ","),
                s -> System.out.println("年龄：" +Integer.parseInt(s.split("，")[1])));
    }

    private static void useaccept(String[] str, Consumer<String> con1, Consumer<String> con2) {

        //con1.andThen(con2).accept(s);

        for (String s : str) {
            con1.andThen(con2).accept(s);

        }
    }
}