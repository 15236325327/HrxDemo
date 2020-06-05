package MaoPao;

import java.util.Arrays;

public class Demo2 {

    public static void main(String[] args) {

        String s = "20 12 32 54 62 15 02 52 36";

        String[] s1 = s.split(" ");

        int[] arr = new int[s1.length];
        for (int i = 0; i < s1.length; i++) {
            arr[i] = Integer.parseInt(s1[i]);
        }

        Arrays.sort(arr);

        StringBuilder s2 = new StringBuilder();
        s2.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                s2.append(arr[i]);
            } else {
                s2.append(arr[i]).append(" ");
            }
        }
        s2.append("]");
        String s3 = s2.toString();


        System.out.println(s3);
    }
}
