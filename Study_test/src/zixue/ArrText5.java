package zixue;

public class ArrText5 {

    public static void main(String[] args) {

        int[] arr={19,28,37,46,50};

        /*for(int start=0,end=arr.length-1;start<=end;start++,end--){
            //变量交换
            int empty=arr[start];
            arr[start]=arr[end];
            arr[end]=empty;
        }*/

        //调用反转方法
        exchange(arr);

        //调用数组遍历
        printArray(arr);
    }

    public static void exchange(int[] arr){
        for(int start=0,end=arr.length-1;start<=end;start++,end--){
            //变量交换
            int empty=arr[start];
            arr[start]=arr[end];
            arr[end]=empty;
        }
    }

    public static  void printArray(int[] arr){
        System.out.print("[");

        for (int x=0;x<arr.length;x++){
            if (x==arr.length){
                System.out.print(arr[x]);
            }else{
                System.out.print(arr[x]+",");
            }
        }

        System.out.println("]");
    }
}
