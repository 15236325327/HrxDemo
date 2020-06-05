package Io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


//构造方法(1)与构造方法(2) 是一个道理，1在方法内部调用了方法，2直接写了出来，是一样的
public class FileOutputStream2 {

    public static void main(String[] args) throws IOException {

        //FileOutputStream​(String name) 创建文件输出流以指定的名称写入文件。 构造方法(1)
        FileOutputStream fs1 = new FileOutputStream("Study_test\\src\\hh.txt");
        /*new File(name)|ctrl b得到的|  FileOutputStream fs1=new FileOutputStream(new File(name));*/

        //FileOutputStream​(String name, boolean append) 创建文件输出流以指定的名称写入文件。 构造方法(2)
        /*File file=new File("src\\hh.txt");  FileOutputStream fs2=new FileOutputStream(file);*/
        FileOutputStream fs2 = new FileOutputStream(new File("Study_test\\src\\hh.txt"));


        //void write​(int b) 将指定的字节写入此文件输出流。 （一次写入一个  字节   数据）
        /*fs1.write(98);
        fs1.write(99);
        fs1.write(100);*/


        //void write​(byte[] b) 将 b.length字节从指定的字节数组写入此文件输出流。 （一次写入一个   字节组   数据）
        byte[] bys={97,98,99,100};
        fs1.write(bys);




        /*void write​(byte[] b, int off, int len) 将 len字节从指定的字节数组开始，从偏移量 off开始写入此文件输出流。
        （一次写入一个   字节组   数据）*/
        //byte[] bys={97,98,99,100,101};

       /* byte[] bys = "abcde".getBytes();//byte[] getBytes​() 使用平台的默认字符集将该 String编码为一系列字节，将结果存储到新的字节数组中

        fs1.write(bys, 1, 4);*/


        //释放资源
        fs1.close();
    }
}
