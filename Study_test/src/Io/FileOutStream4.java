package Io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStream4 {

    public static void main(String[] args) {
        FileOutputStream fs = null;
        try {
            //fs = new FileOutputStream("Z:\\Study_test\\src\\hh.txt");//(系统找不到指定的路径。没有z盘)
            fs = new FileOutputStream("Study_test\\src\\hh.txt");
            fs.write("hello".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fs != null) {
                try {
                    fs.close();//java.lang.NullPointerException 空指针异常 z盘不存在fs为null  null调用close肯定空指针异常
                    //所以用判断语句进行判断，清除空指针异常
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
