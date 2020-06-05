package zixue;

import java.util.Scanner;

public class IfText2 {

    public static void main(String[] args) {

//        Scanner sc=new Scanner(System.in);
//
//        System.out.println("请输入1-100之间的数字：");
//
//        int s=sc.nextInt();
//
//        if (s%7==0||s%10==7){
//            System.out.println("喊过的数字："+s);
//        }else if (s<1||s>100){
//            System.out.println("您输入的数字有误！");
//        }

        for (int x = 1; x <= 100; x++) {
            if (x % 7 == 0 || x / 10 % 10 == 7 || x % 10 == 7) {
                System.out.println("喊过的数字：" + x);
            }
        }
    }
}
