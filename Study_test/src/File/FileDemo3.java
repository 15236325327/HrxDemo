package File;

import java.io.File;
import java.io.IOException;

//File类的方法
public class FileDemo3 {

    public static void main(String[] args) throws IOException {

        File f1=new File("E:\\hrx\\meimao");
        f1.mkdirs();

        File f2=new File("E:\\hrx\\meimao\\zuishuai.txt");
        f2.createNewFile();

        File f4=new File("E:\\hrx\\meimao\\niubi.txt");
        f4.createNewFile();

        File f3=new File("E:\\hrx\\zhihui");
        f3.mkdir();

        /*public boolean isDirectory​()测试此抽象路径名表示的文件是否为目录。*/
        System.out.println(f1.isDirectory());
        System.out.println(f2.isDirectory());
        System.out.println(f3.isDirectory());
        System.out.println("_____");

        /*public boolean isFile​()测试此抽象路径名表示的文件是否为普通文件.
        如果文件不是目录，并且另外满足其他依赖于系统的条件，文件是正常的 。*/
        System.out.println(f1.isFile());
        System.out.println(f2.isFile());
        System.out.println(f3.isFile());
        System.out.println("_____");


        /*public boolean exists​()测试此抽象路径名表示的文件或目录是否存在。
       结果 true当且仅当存在由此抽象路径名表示的文件或目录时; false否则 异常 */
        System.out.println(f1.exists());
        System.out.println(f2.exists());
        System.out.println(f3.exists());
        System.out.println("_____");

        /*public String getAbsolutePath​()返回此抽象路径名的绝对路径名字符串。*/
        System.out.println(f1.getAbsoluteFile());
        System.out.println("_____");

        /*public String getPath​()将此抽象路径名转换为路径名字符串。*/
        System.out.println(f1.getPath());
        System.out.println("_____");

        /*public String getName​()返回由此抽象路径名表示的文件或目录的名称。*/
        System.out.println(f1.getName());
        System.out.println("_____");

        /*public String[] list​()返回一个字符串数组，命名由此抽象路径名表示的目录中的文件和目录。*/
        String[] array = f1.list();
        for (String arr : array){
            System.out.println(arr);
        }
        System.out.println("_____");

        /*public File[] listFiles​()返回一个抽象路径名数组，表示由该抽象路径名表示的目录中的suoyou。
        (可以增加判断，找出文件类以及目录类)*/
        //File f5 =new File("E:\\hrx");//1
        File[] array1 = /*f5*/f1.listFiles();
        for (File array2 : array1){
            System.out.println(array2);
           // System.out.println(array2.getName());
        }
    }
}
