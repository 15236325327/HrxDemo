package IoChar;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;


//字符流写数据的五种方法

public class WriteFiveWay {

    public static void main(String[] args) throws IOException {

        OutputStreamWriter osi = new OutputStreamWriter(new FileOutputStream("Study_test\\src\\hh.txt"));

        //一、void write​(int c) 写一个字符
        //osi.write(97);//对应空，这个数据还在缓冲区里
        //osi.flush();//刷新流，刷新完就进去了，刷新完还可以添加数据（和close不一样），但是每添加一个新字符都要刷新，不然数据还在缓冲区


        //二、void write​(char[] cbuf) 写入字符数组的一部分。
        /*char[] ch = {'a', 'b', 'c', 'd'};
        osi.write(ch);//不用刷新，直接添加进去*/

        //三、void write​(char[] cbuf, int off, int len) 写入字符数组的一部分。
        /*char[] ch = {'a', 'b', 'c', 'd'};
        osi.write(ch,1,2);//不用刷新，直接添加进去*/

        //四、void write​(String str) 写一个字符串。
        osi.write("黄任翔");//对应黄任翔


        //五、void write​(String str, int off, int len) 写一个字符串的一部分。
        //osi.write("abc",1,2);//对应bc
        //osi.write("abcde",0,"abcde".length());

        osi.close();
    }
}
