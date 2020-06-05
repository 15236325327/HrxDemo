package Iohuanchong;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class test1 {

    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("Study_test\\src\\hh.txt");

        fos.write("中国".getBytes());//byte[]  String.getBytes()这叫编码
        /*byte[] by="中国".getBytes();//[-28, -72, -83, -27, -101, -67]
        System.out.println(Arrays.toString(by));*/

        FileInputStream fis = new FileInputStream("Study_test\\src\\hh.txt");
        for (int i = 0; i < 3; i++) {
            int f = fis.read();
            System.out.print((byte) f);
        }
        byte[] bys = {-28, -72, -83};
        String s = new String(bys);//String(byte[] bytes)这是解码
        System.out.println(s);
        fos.close();
    }

}
