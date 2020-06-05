package IoChar;

import java.io.*;

//FileReader和FileWriter是InputStreamReader和OutputStreamWriter的直接子类方便书写
//如果需要进行字符编码，解码问题，还需要回到InputStreamReader和OutputStreamWriter
public class CopyJava {

    public static void main(String[] args) throws IOException {

        /*InputStreamReader isr=new InputStreamReader(new FileInputStream("Study_test\\src\\IoChar\\StringChuanJieMa.java"));
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("Study_test\\src\\Copy\\copy.java"));

        char[] ch =new char[1024];

        int len;

        while ((len=isr.read(ch))!=-1){
            osw.write(ch,0,len);
        }

        isr.close();
        osw.close();*/


        //FileReader和FileWriter是InputStreamReader和OutputStreamWriter的直接子类方便书写
        FileReader fr = new FileReader("Study_test\\src\\IoChar\\StringChuanJieMa.java");
        FileWriter fw = new FileWriter("Study_test\\src\\Copy\\copy.java");

        char[] ch = new char[1024];
        int len;
        while ((len = fr.read(ch)) != -1) {
            fw.write(ch, 0, len);
        }

        fr.close();
        fw.close();
    }
}
