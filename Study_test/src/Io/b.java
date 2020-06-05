package Io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class b {

    public static void main(String[] args) {

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("E:\\ggg\\hr.jpg");
            fos = new FileOutputStream("Study_test\\src\\ash.jpg");

            byte[] by = new byte[1024];

            int len;
            while ((len = fis.read(by)) != -1) {
                fos.write(by,0,len);
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
