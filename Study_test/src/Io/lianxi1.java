package Io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class lianxi1 {

    public static void main(String[] args) {

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("E:\\my照片\\喜欢的图片\\动漫\\1.jpg");
            fos = new FileOutputStream("Study_test\\src\\1.jpg");

            int len;
            while ((len = fis.read()) != -1) {
                fos.write(len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null && fos != null) {
                try {
                    fis.close();
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
