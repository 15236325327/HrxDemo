package Io;

import java.io.FileInputStream;
import java.io.IOException;

public class a {

    public static void main(String[] args) {

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("Study_test\\src\\文本.txt");

            byte[] by = new byte[1024];

            int len;
            while ((len = fis.read(by)) != -1) {
                System.out.println(new String(by, 0, len));
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
