package Io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream3 {

    public static void main(String[] args) throws IOException {

        //追加写入：在构造方法内添加第二个参数true  public FileOutputStream​(String name,boolean append)
        // append - 如果是 true ，则字节将写入文件的末尾而不是开头<每run一次，就多添加这个内部规定的字节数>
        FileOutputStream fs = new FileOutputStream("Study_test\\src\\hh.txt", true);

        //怎样让hello换行：不同操作系统记事本识别的换行符不同
        //windows：\r\n   linux:\n   mac:\r
        for (int i = 0; i < 10; i++) {
            fs.write("hello".getBytes());
            fs.write("\r\n".getBytes());
        }

        fs.close();
    }
}
