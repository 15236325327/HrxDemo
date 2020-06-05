package zixue;

import java.util.Scanner;

public class ArrText4 {

    public static void main(String[] args) {

        int[] arr = {19, 28, 37, 46, 50};

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入您需要查询的数字：");

        int h = sc.nextInt();

        int x=-1;

        for (int i = 0; i < arr.length; i++) {
            if (h == arr[i]) {
                x=i;
                break;
            }
        }
        System.out.println("索引值为："+x);
    }
}
