package IoChar;

import java.io.*;


//BufferedReader br=new BufferedReader(new InputstreamReader(System.in));标准输入流（Scanner）
// (键盘录入，一般一下一行，所以用读一行的方法，读一行是字符缓冲输入流的特有方法)
//System.out.print/println()   带ln的可以没有参数，不带ln的必须有参数，标准输出流
// (system.out)(printStream ps=System.out;  printStream类有的方法，System。out都能使用)


public class TryCatch {

    public static void main(String[] args) {

        method();

    }

    ////try---catch---的简单写法,不用写finally，自动释放资源（jdk7）
    private static void method() {
        try (FileReader fr = new FileReader("hh.txt");
             FileWriter fw = new FileWriter("hh.txt");) {
            char[] ch = new char[2048];
            int len;
            while ((len = fr.read(ch)) != -1) {
                fw.write(ch, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //jdk9感觉没有7方便
    /*private static void method2() throws IOException {

        FileReader fr = new FileReader("hj.txt");
        FileWriter fw = new FileWriter("hh.txt");

        try (fr;fw) {
            char[] ch = new char[2048];
            int len;
            while ((len = fr.read(ch)) != -1) {
                fw.write(ch, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
}

