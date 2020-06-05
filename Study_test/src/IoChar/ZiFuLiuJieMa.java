package IoChar;

import java.io.*;

//字符流的解码，编码问题
public class ZiFuLiuJieMa {

    public static void main(String[] args) throws IOException {
        /*
        InputStreamReader是从字节流到字符流的桥梁：它读取字节，并使用指定的charset将其解码为字符。
        它使用的字符集可以由名称指定，也可以被明确指定，或者可以接受平台的默认字符集。
        */
        //InputStreamReader​(InputStream in) 创建一个使用默认字符集的InputStreamReader。
        /*InputStreamReader isr=new InputStreamReader(new FileInputStream("Study_test\\src\\hh.txt"));
        int i = isr.read();
        System.out.println((char)i);
        isr.close();*/

        //InputStreamReader​(InputStream in, String charsetName) 创建一个使用命名字符集的InputStreamReader。
        /*InputStreamReader isr1=new InputStreamReader(new FileInputStream("Study_test\\src\\hh.txt"),"Gbk");
        int i1 = isr1.read();
        System.out.println((char)i1);
        isr1.close();*/

        /*
        OutputStreamWriter是从字符流到字节流的桥梁：使用指定的charset将写入的字符编码为字节。
         它使用的字符集可以由名称指定，也可以被明确指定，或者可以接受平台的默认字符集。
        */
        //OutputStreamWriter​(OutputStream out) 创建一个使用默认字符编码的OutputStreamWriter。
        /*OutputStreamWriter osi =new OutputStreamWriter(new FileOutputStream("Study_test\\src\\hh.txt"));
        osi.write("黄任翔");
        osi.close();*/

        //OutputStreamWriter​(OutputStream out, String charsetName) 创建一个使用命名字符集的OutputStreamWriter
        OutputStreamWriter osi1=new OutputStreamWriter(new FileOutputStream("Study_test\\src\\hh.txt"),"utf-8");
        osi1.write("黄任翔");
        osi1.close();
    }


}
