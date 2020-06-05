package File;

import java.io.File;

//构造方法
public class FileDemo1 {

    public static void main(String[] args) {

        /*public File​(String pathname)通过将给定的路径名字符串转换为抽象路径名来创建新的File实例。
        如果给定的字符串是空字符串，则结果是空的抽象路径名。*/
        File f1 = new File("E:\\java.txt");
        System.out.println(f1);
        /*public File​(String parent,
            String child)从父路径名字符串和子路径名字符串创建新的File实例。*/
        File f2 = new File("E:\\", "java.txt");
        System.out.println(f2);
        /*public File​(File parent,
            String child)从父抽象路径名和子路径名字符串创建一个新的File实例。*/
        File f3 = new File("E:\\");
        File f4 = new File(f3, "java.txt");
        System.out.println(f4);


        System.out.println("-------");

        File f5=new File("E:\\java.txt");
        System.out.println(f1);

        File f6=new File("E:\\","java.txt");
        System.out.println(f2);

        File f7=new File("E:\\");
        File f8=new File(f3,"java.txt");
        System.out.println(f4);
    }
}
