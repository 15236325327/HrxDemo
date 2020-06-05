package IoChar;

import java.io.*;

//字符缓冲流特有功能
public class BufferedTeYouGongNeng {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("Study_test\\src\\文本.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("Study_test\\src\\hh.txt"));


        /*for (int i=0;i<10;i++){
            bw.write("hello");
            bw.write("\r\n");
            bw.flush();
        }*/

        //---------void newLine​() 写一行行分隔符。------------//
        for (int i=0;i<10;i++) {
            bw.write("hello");
            bw.newLine();
            bw.flush();
        }

        //----------String readLine​() 读一行文字。------------- //
        /*String s = br.readLine();//第一行
        System.out.println(s);
        s=br.readLine();//第二行
        System.out.println(s);
        s=br.readLine();//第三行
        System.out.println(s);
        s=br.readLine();//第四行
        System.out.println(s);
        s=br.readLine();//第五行
        System.out.println(s);

        s=br.readLine();//第六行 运行结果为空（）null，原因是---文本---共有5行文字
        System.out.println(s);*/

        //所以循环改进为
        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }


        br.close();
        bw.close();
    }
}
