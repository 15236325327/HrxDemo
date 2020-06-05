package IoChar;


import java.io.UnsupportedEncodingException;
import java.util.Arrays;


//字符串的编码，解码问题
public class StringChuanJieMa {

    public static void main(String[] args) throws UnsupportedEncodingException {

        //byte[] getBytes​() 使用平台的默认字符集将该 String编码为一系列字节，将结果存储到新的字节数组中
        byte[] by1 = "黄任翔".getBytes();
        System.out.println(Arrays.toString(by1));
        //[-23, -69, -124, -28, -69, -69, -25, -65, -108]utf-8编码对应的字节，三个字节对应一个汉字

        //byte[] getBytes​(String charsetName) 使用命名的字符集将该 String编码为一系列字节，将结果存储到新的字节数组中。
        byte[] by2 = "黄任翔".getBytes("GBK");
        System.out.println(Arrays.toString(by2));
        //[-69, -58, -56, -50, -49, -24]gbk编码对应的字节，两个字节对应一个汉字


        //String​(byte[] bytes) 通过使用平台的默认字符集解码指定的字节数组来构造新的 String   (这是构造方法需要new)
        String s1 = new String(by1);
        System.out.println(s1);
        //黄任翔，这是使用utf-8解码对应的汉字

        //String​(byte[] bytes, String charsetName) 构造一个新的String由指定用指定的字节的数组解码charset 。(这是构造方法需要new)
        String s2 = new String(by1, "GBK");
        System.out.println(s2);
        //by1是使用utf-8编码的，榛勪换缈�，这是使用GBK解码对应的汉字所以没有解出正确的汉字

        // 如果想解出正确的名字，需要用对应字符集编码
        String s3 = new String(by2, "GBK");
        System.out.println(s3);
    }
}
