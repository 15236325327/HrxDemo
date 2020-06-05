package LaFunctionalInterface;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {

        /*String s = getSupplier(() -> "林青霞");
        System.out.println(s);*/

        String s = getSupplier(() -> "黄任翔");
        System.out.println(s);


        /*Supplier<Double> ss=new Supplier<Double>() {
            @Override
            public Double get() {
                return Math.random();
            }
        };
        System.out.println(ss.get());

        Supplier<Double> sss=()->Math.random();
        System.out.println(sss.get());

        Supplier<Double> ssss=Math::random;
        System.out.println(ssss.get());*/


        Supplier<Integer> ss=new Supplier<Integer>() {
            @Override
            public Integer get() {
                return Math.max(10,20);
            }
        };
        System.out.println(ss.get());

        Supplier<Integer> sss=()->Math.max(10,30);
        System.out.println(sss.get());


        int[] arr={1,2,3,4,5,6,7,8,9};

        int i1 = getmax(() -> {
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > arr[0]) {
                    max = arr[i];
                }
            }
            return max;
        });
        System.out.println(i1);

    }

    private static String getSupplier(Supplier<String> sup) {

        /*Supplier<String> sup1=new Supplier<String>() {
            @Override
            public String get() {
                return sup.get();
            }
        };
        return sup1.get();*/

        return sup.get();

    }

    private static Integer getmax(Supplier<Integer> sup){

        return sup.get();
    }


}
