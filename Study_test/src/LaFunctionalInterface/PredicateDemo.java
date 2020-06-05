package LaFunctionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

        /*Boolean boo = usetest("123", s -> s.equals("123"));
        System.out.println(boo);*/

        String[] str = {"梅萍蔚，20", "戈尔丹，35", "萧炎，100", "隔壁老王，35"};

        ArrayList<Boolean> arr = usetest(str, s -> s.split("，")[0].length() > 2,
                                        s -> Integer.parseInt(s.split("，")[1]) > 33);
        for (Boolean b : arr){
            System.out.println(b);
        }

    }

    private static ArrayList usetest(String[] str, Predicate<String> pr1, Predicate<String> pr2) {

        /*return pr.test(s);*/
        //return pr.negate().test(s);

        ArrayList<Boolean> arr=new ArrayList<Boolean>();
        for (String s : str) {
            boolean bo = pr1.and(pr2).test(s);
            arr.add(bo);
        }
       return arr;

    }
}
