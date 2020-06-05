package MaoPao;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        /*int[] arr={12,60,25,58,94,76,36};
        System.out.println("前面："+ Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("后面："+Arrays.toString(arr));*/

        //Arrays.toString() 返回指定数组的内容的字符串表示形式
        int[] arr={12,25,2,5,36,65,35,55};
        System.out.println("前面："+Arrays.toString(arr));

        //Arrys.sort(); 按照数字顺序排列指定的数组
        Arrays.sort(arr);
        System.out.println("后面："+Arrays.toString(arr));
    }
}
