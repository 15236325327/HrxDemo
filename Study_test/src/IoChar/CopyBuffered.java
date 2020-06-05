package IoChar;

import java.io.*;

//字符缓冲流复制文本文件
public class CopyBuffered {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("Study_test\\src\\文本.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("Study_test\\src\\hh.txt"));

        /*int len;
        while ((len=br.read())!=-1){
            bw.write(len);
        }*/

        char[] ch = new char[1024];

        int len;
        while ((len = br.read(ch)) != -1) {
            bw.write(ch, 0, len);
        }
        br.close();
        bw.close();
    }
}
