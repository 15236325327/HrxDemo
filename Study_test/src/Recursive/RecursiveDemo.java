package Recursive;

public class RecursiveDemo {

    public static void main(String[] args) {

        //一个正整数阶乘是所有小于及等于该数的正整数积，n的阶乘为 n！=1*2*3*...*n
        int x = Recursive(5);
        System.out.println(x);
    }

    //定义方法Recursive表示n的阶乘
    public static int Recursive(int n){
        if (n==1){
            return 1;
        }else{

        }
        return n*Recursive(n-1);//Recursive(n-1)表示（n-1)的阶乘
    }
}
