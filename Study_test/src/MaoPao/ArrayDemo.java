package MaoPao;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] arr = {12, 60, 90, 56, 42};
        System.out.println("排序前：" + arrayToString(arr));

        //外圈x循环，是提高了i循环的复用性，不然要写5次才可以，比较一次后就少了一个数字，所以又减去了一个x
        for (int x = 0; x < arr.length - 1; x++)
            for (int i = 0; i < arr.length - 1 - x; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        System.out.println("排序后："+arrayToString(arr));
    }

    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");
        //StringBulder类型转换为String类型
        String s = sb.toString();
        return s;
    }
}
