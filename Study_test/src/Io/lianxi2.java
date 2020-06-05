package Io;

import java.io.FileInputStream;
import java.io.IOException;

public class lianxi2 {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("Study_test\\src\\文本.txt");//汉字的一个拼音字符算一个字节

       byte[] bys=new byte[1024];

       int len;
       while ((len=fis.read(bys))!=-1){
           System.out.println(len);
           System.out.println(new String(bys,0,len));
       }

       fis.close();
    }
}
