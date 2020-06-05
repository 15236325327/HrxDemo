package IoDaYinLiu;

import java.io.FileNotFoundException;
import java.io.PrintStream;

//字节打印流
public class ByteDaYinLiu {

    public static void main(String[] args) throws FileNotFoundException {

        //PrintStream​(String fileName) 使用指定的文件名创建新的打印流，无需自动换行。extends outputstream
        PrintStream ps=new PrintStream("Study_test\\src\\hh.txt");

        //写数据
        //字节输出流的方法（写一个字节数据，写一个数组的部分字节数据或者全部数据）（会转码）
        ps.write(97);//运行结果为：a

        //使用特有方法写数据（print方法 println方法）(写多少就是多少不进行转码操作)
        ps.print(97);//运行结果为：97
        ps.println(97);//运行结果为：97

        ps.close();

    }
}
