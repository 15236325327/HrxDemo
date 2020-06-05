package IoDaYinLiu;

import java.io.*;

//字符打印流
public class CharDaYinLiu {

    public static void main(String[] args) throws IOException {

        //public class PrintWriter extends Writer
        // 将对象的格式表示打印到文本输出流。 这个类实现所有的print中发现的方法PrintStream 。
        // 它不包含用于编写原始字节的方法，程序应使用未编码的字节流。


        //PrintWriter​(String fileName) 使用指定的文件名创建一个新的PrintWriter，而不需要自动执行行刷新。
        //这个方便的构造函数创建必要的中间OutputStreamWriter，它将使用默认字符编码将字符转换为字节。
        /*PrintWriter ps=new PrintWriter("Study_test\\src\\hh.txt");

        ps.write("hello");//如果不进行刷新，则目的文件里不会写入这个数据；如果想要换行，需\r\n
        ps.write("\r\n");
        ps.flush();
        ps.write("world");
        ps.flush();

        ps.println("hello");//不用\r\n就可以换行，但还是需要刷新
        ps.flush();
        ps.println("world");

        ps.close;*/


        //public PrintWriter​(Writer out,boolean autoFlush)创建一个新的PrintWriter。
        //参数out - 字符输出流  autoFlush - 一个布尔值 如果为真，则println ， printf ，或format方法将-----刷新输出缓冲区-----
        PrintWriter pw=new PrintWriter(new FileWriter("Study_test\\src\\hh.txt"),true);

        /*pw.write("hello");//用write方法依旧需要刷新
        pw.flush();
        pw.write("world");*/

        pw.println("hello");
        pw.println("world");

        pw.close();

    }
}
