package IoChar;

import java.io.*;

//字符缓冲流特有功能改进版复制数据
public class CopyBufferedJava {

    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new FileReader("Study_test\\src\\文本.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("Study_test\\src\\hh.txt"));

        String line;
        while ((line=br.readLine())!=null){
            bw.write(line,0,line.length());
            bw.newLine();
            bw.flush();
        }

        br.close();
        bw.close();
    }
}
