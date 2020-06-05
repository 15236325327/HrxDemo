package Io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWrite1 {

    public static void main(String[] args) {

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("Study_test\\src\\hh.txt");
            fos = new FileOutputStream("Study_test\\src\\文本.txt");

            int f;
            while ((f = fis.read()) != -1) {
                //f为fis.read读出来的字节的int类型
                fos.write(f);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null && fis != null) {
                try {
                    fos.close();
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
