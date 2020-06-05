package zixue;

import java.util.Scanner;

public class ArrText6 {

    public static void main(String[] args) {

        int[] arr = new int[6];

        //循环输入
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个分数");
            arr[i] = sc.nextInt();
        }

        //调用方法
        int max = getmax(arr);
        int min = getmin(arr);
        int sum = getsum(arr);

        //通过计算方法求值
        int avg = (sum - max - min) / (arr.length - 2);

        //输出结果
        System.out.println("选手最终得分是：" + avg);
    }

    //获取最大值
    public static int getmax(int[] arr) {
        int max = arr[0];

        for (int x = 1; x < arr.length; x++) {
            if (arr[x] > max) {
                max = arr[x];
            }
        }
        return max;
    }

    //获取最小值
    public static int getmin(int[] arr) {
        int min = arr[0];

        for (int x = 1; x < arr.length; x++) {
            if (arr[x] < min) {
                min = arr[x];
            }
        }
        return min;
    }

    //求和
    public static int getsum(int[] arr) {
        int sum = 0;

        for (int x = 0; x < arr.length; x++) {
            sum += arr[x];
        }
        return sum;
    }


}


