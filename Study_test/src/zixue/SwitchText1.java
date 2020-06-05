package zixue;

import com.sun.org.apache.xpath.internal.res.XPATHErrorResources_sv;

import  java.util.Scanner;

public class SwitchText1 {

    public static  void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("请输入一个星期数：");

        int week = sc.nextInt();

        switch (week){

            case 1:
                System.out.println("跑步");
                break;

            case 2:
                System.out.println("游泳");
                break;

            case 3:
                System.out.println("俯卧撑");
                break;

            case 4:
                System.out.println("羽毛球");
                break;

            case 5:
                System.out.println("篮球");
                break;

            case 6:
                System.out.println("足球");
                break;

            case 7:
                System.out.println("网球");
                break;

            default:
                System.out.println("你输入的星期数有误!");
        }


    }
}
