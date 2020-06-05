package File;

import java.io.File;
import java.io.IOException;

//File文件及目录的创建
public class FileDemo2 {

    public static void main(String[] args) throws IOException {

        /*public boolean createNewFile​()   （------创建文件-------）
        throws IOException当且仅当具有该名称的文件尚不存在时，原子地创建一个由该抽象路径名命名的新的空文件。
        检查文件的存在和文件的创建（如果不存在）是对可能影响文件的所有其他文件系统活动是单一的操作。*/
        File f1=new File("E:\\java.text");
        System.out.println(f1.createNewFile());


        /*public boolean mkdir​()创建由此抽象路径名命名的目录。  （-------创建目录------）
          结果
          true当且仅当创建目录时; false否则 异常 */
        File f2=new File("E:\\word.txt");
        System.out.println(f2.mkdir());


        /*public boolean mkdirs​()创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录。（------创建多级目录------）
         请注意，如果此操作失败，它可能已成功创建一些必需的父目录。
          结果
          true当且仅当创建目录以及所有必需的父目录时; 否则为false 异常 */
        File f3=new File("E:\\map\\hashmap\\demo.txt");
        System.out.println(f3.mkdirs());


    }
}
