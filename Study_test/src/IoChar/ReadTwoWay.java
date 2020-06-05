package IoChar;

import java.io.*;

//字符流读数据的两种方式
public class ReadTwoWay {

    public static void main(String[] args) throws IOException {

        //int     read​() 读一个字符
        InputStreamReader isr = new InputStreamReader(new FileInputStream("Study_test\\src\\文本.txt"));
        /*int r = isr.read();
        System.out.println((char)r);*/

        int r;
        while ((r = isr.read()) != -1) {
            System.out.print((char) r);
        }
        isr.close();


        //int    read​(char[] cbuf) 一次读入一个字符数组。
        InputStreamReader isr1 = new InputStreamReader(new FileInputStream("Study_test\\src\\文本.txt"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("Study_test\\src\\hh.txt"));
        char[] ch = new char[1024];

        int len;
        while ((len = isr1.read(ch)) != -1) {
            osw.write(ch, 0, len);
        }

        //一次读5个字符
        /*while ((len=isr1.read(ch,1,5))!=-1){
            System.out.println(ch);
        }*/
        isr1.close();
        osw.close();


    }
}
