package MaoPao;

import java.util.Arrays;

public class IntegerTest {

    public static void main(String[] args) {
        //定义一个字符串
        String s = "20 25 36 12 16 6 84 65";

        //把字符串中的数字添加到一个int数组中
        String[] strArray = s.split(" ");

        int[] arr = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            arr[i] = Integer.parseInt(strArray[i]);
        }

        Arrays.sort(arr);

        StringBuilder s1 = new StringBuilder();
        s1.append("[");
        for (int i=0;i<arr.length;i++){
            if (i==arr.length-1){
                s1.append(arr[i]);
            }else{
                s1.append(arr[i]).append(" ");
            }
        }
        s1.append("]");
        String h=s1.toString();

        System.out.println(h);


    }
}
