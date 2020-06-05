package IoChar;

import java.io.*;

//字符缓冲流
public class StringHuanChongLiu {

    public static void main(String[] args) throws IOException {

        /*public class BufferedWriter  extends Writer
    将文本写入字符输出流，缓冲字符，以提供单个字符，数组和字符串的高效写入。
    可以指定缓冲区大小，或者可以接受默认大小。 默认值足够大，可用于大多数用途。
    ------构造方法------  BufferedReader​(Reader in) 创建使用默认大小的输入缓冲区的缓冲字符输入流。 */
        BufferedReader br=new BufferedReader(new FileReader("Study_test\\src\\hh.txt"));
        /*int len;
        while ((len=br.read())!=-1){
            System.out.print((char)len);*/

        char[] ch=new char[1024];
        int len;
        while ((len=br.read(ch))!=-1){
            System.out.println(ch);
        }
        br.close();

    /*public class BufferedReader extends Reader
    从字符输入流读取文本，缓冲字符，以提供字符，数组和行的高效读取。
    可以指定缓冲区大小，或者可以使用默认大小。 默认值足够大，可用于大多数用途。
    ------构造方法------  BufferedWriter​(Writer out) 创建使用默认大小的输出缓冲区的缓冲字符输出流。 */
        BufferedWriter bw=new BufferedWriter(new FileWriter("Study_test\\src\\hh.txt"));
        char[] ch1={'a','b','c','d','e'};
        char[] ch2={'a','b','c','d','e'};

        bw.write(ch1);
        bw.write(ch2);

        bw.close();

    }
}
