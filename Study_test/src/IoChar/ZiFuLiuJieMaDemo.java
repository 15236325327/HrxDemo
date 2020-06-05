package IoChar;

import java.io.*;

public class ZiFuLiuJieMaDemo {

    public static void main(String[] args) throws IOException {

        //默认utf-8，一次读取一个字节
        /*InputStreamReader isr=new InputStreamReader(new FileInputStream("Study_test\\src\\文本.txt"));
        OutputStreamWriter osi=new OutputStreamWriter(new FileOutputStream("Study_test\\src\\hh.txt"));
        int len;
        while ((len=isr.read())!=-1){
            osi.write(len);
        }
        osi.close();
        isr.close();*/

        //输入(读)utf-8，输出（写）GBK
        //运行结果1.���ֶ�����İ����ȳ�����ÿһ�����������ڡ�等等(这是应为读写的肌肤编码不匹配)
        /*InputStreamReader isr1=new InputStreamReader(new FileInputStream("Study_test\\src\\文本.txt"));
        OutputStreamWriter osi1=new OutputStreamWriter(new FileOutputStream("Study_test\\src\\hh.txt"),"GBK");
        int len;
        while ((len=isr1.read())!=-1){
            osi1.write(len);
        }
        osi1.close();
        isr1.close();*/
    }
}
