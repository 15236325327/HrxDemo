package Io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream1 {

    public static void main(String[] args) {

        FileInputStream fis = null;

        try {
            fis = new FileInputStream("Study_test\\src\\hh.txt");


            //int read​() 从该输入流读取一个字节的数据。(方法一)
            /*int f=fis.read();
            while(f!=-1){
            System.out.print((char)f);
                f=fis.read();*/
            //-------改进方法一-------（------字节流读数据的标准代码-------）
            int f;
            while ((f = fis.read()) != -1) {
                System.out.print((char) f);
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
