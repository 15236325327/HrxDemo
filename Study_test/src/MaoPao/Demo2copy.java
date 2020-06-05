package MaoPao;

import java.util.Arrays;

public class Demo2copy {

    public static void main(String[] args) {

        String s = "12 25 36 56 98 756 3 5";

        String[] sp = s.split(" ");

        int[] arr = new int[sp.length];
        for (int i = 0; i < sp.length; i++) {
            arr[i] = Integer.parseInt(sp[i]);
        }

        Arrays.sort(arr);

        StringBuilder x = new StringBuilder();
        x.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                x.append(arr[i]);
            } else {
                x.append(arr[i] + " ");
            }
        }
        x.append("]");

        String s1 = x.toString();

        System.out.println(s1);


        String s2 = "100";
        Integer n = Integer.valueOf(s2);
        int i = n.intValue();
        System.out.println(i);

        int i1 = Integer.parseInt(s2);
        System.out.println(i1);

    }


}
