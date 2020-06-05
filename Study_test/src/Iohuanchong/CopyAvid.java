package Iohuanchong;

import java.io.*;

public class CopyAvid {

    public static void main(String[] args) throws IOException {

        //static long currentTimeMillis​() 返回当前时间（以毫秒为单位）。
        long start = System.currentTimeMillis();

        //调用方法
        //copuavi1();//29805字节一个
        // copuavi2();//78字节缓冲一个
        //copuavi3();//31字节一个组
        //copuavi4();//62j4字节缓冲一个组（按道理说这个应该是最快的，可能我的视频太短了）

        //结束时间
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    //字节流一次读写一个字节
    public static void copuavi1() throws IOException {

        FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\长期文件\\1.mp4");
        FileOutputStream fos = new FileOutputStream("Study_test\\src\\h.mp4");

        int len;
        while ((len = fis.read()) != -1) {
            fos.write(len);
        }

        fis.close();
        fos.close();
    }

    //字节缓冲流一次读写一个字节
    public static void copuavi2() throws IOException {

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\Lenovo\\Desktop\\长期文件\\1.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Study_test\\src\\h.mp4"));

        int f;
        while ((f = bis.read()) != -1) {
            bos.write(f);
        }

        bis.close();
        bos.close();
    }

    //字节流一次读写一个数组
    public static void copuavi3() throws IOException {

        FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\长期文件\\1.mp4");
        FileOutputStream fos = new FileOutputStream("Study_test\\src\\h.mp4");

        byte[] by = new byte[1024];

        int len;
        while ((len = fis.read(by)) != -1) {
            fos.write(by, 0, len);
        }

        fis.close();
        fos.close();
    }

    //字节缓冲流一次读写一个数组
    public static void copuavi4() throws IOException {

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\Lenovo\\Desktop\\长期文件\\1.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Study_test\\src\\h.mp4"));

        byte[] by = new byte[1024];

        int len;
        while ((len = bis.read(by)) != -1) {
            bos.write(by, 0, len);
        }

        bis.close();
        bos.close();
    }
}
