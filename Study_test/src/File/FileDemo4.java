package File;

import java.io.File;
import java.io.IOException;

public class FileDemo4 {

    public static void main(String[] args) throws IOException {

        //使创建的文件在当前模块的目录下
        File f3=new File("Study_test\\java.txt");
        System.out.println(f3.createNewFile());
        File f4=new File("Study_test\\ZH");
        System.out.println(f4.mkdir());


        //public boolean delete(),删除由此抽象路径名表示的文件或目录。
        // 如果此路径名表示目录，则目录必须（------为空------）才能删除。
        System.out.println(f3.delete());//文件
        System.out.println(f4.delete());//目录

       //sanchu
    }
}
