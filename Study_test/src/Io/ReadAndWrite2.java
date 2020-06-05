package Io;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadAndWrite2 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
            fis = new FileInputStream("Study_test\\src\\文本.txt");

            //int read​(byte[] b) 从该输入流读取最多 b.length个字节的数据到一个字节数组。
            byte[] by = new byte[1024];

            int len;//这个len表示字节长度，当没有字节时，输出-1
            while ((len = fis.read(by))!=-1){
                //String​(byte[] bytes) 通过使用平台的默认字符集解码指定的字节数组来构造新的 String 。
                System.out.print(new String(by,0,len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
