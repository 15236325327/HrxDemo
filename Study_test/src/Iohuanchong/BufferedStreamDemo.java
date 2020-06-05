package Iohuanchong;

import java.io.*;

//字节缓冲流

public class BufferedStreamDemo {

    public static void main(String[] args) throws IOException {

        //BufferedOutputStream​(OutputStream out) 创建一个新的缓冲输出流，以将数据写入指定的底层输出流
        FileOutputStream fos = new FileOutputStream("Study_test\\src\\hh.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        fos.write("hello\r\n".getBytes());
        fos.write("java\r\n".getBytes());
        fos.write("javac".getBytes());


        //BufferedInputStream​(InputStream in) 创建一个 BufferedInputStream并保存其参数，输入流 in供以后使用。
        //FileInputStream fis=new FileInputStream("Study_test\\src\\hh.txt");
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Study_test\\src\\hh.txt"));
        /*int len;
        while ((len = bis.read()) != -1) {
            System.out.print((char) len);
        }*/

        byte[] by = new byte[1024];

        int len;
        while ((len = bis.read(by)) != -1) {
            System.out.println(new String(by, 0, len));
        }

        bis.close();
        fos.close();
    }
}
