package Io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//写数据
public class FileOutputStream1 {

    public static void main(String[] args) throws IOException {

        //FileOutputStream​(String name) 创建文件输出流以指定的名称写入文件。
        FileOutputStream fs = new FileOutputStream("Study_test\\src\\hh.txt");

        //void write​(int b) 将指定的字节写入此文件输出流。
        fs.write(97);

        //void close​() 关闭此文件输出流   并   释放与此流相关联的任何系统资源。
        fs.close();
    }
}
