package IoChar;

import java.io.*;

public class ACopyFile1 {

    public static void main(String[] args) throws IOException {

        File fqs = new File("E:\\ggg");

        File fzj = new File("D:\\");

        CopyDirectory(fqs, fzj);

    }

    private static void CopyDirectory(File fqs, File fzj) throws IOException {

        //
        if (fqs.isDirectory()) {
            String name = fqs.getName();
            File fmd = new File(fzj, name);
            if (!fmd.exists()) {
                fmd.mkdir();
            }
            File[] files = fqs.listFiles();
            for (File fil : files) {
                CopyDirectory(fil, fmd);//这一步后，fil赋值给了fqs，fmd给了fzj，所以下面else中，fzj代表目的地目录，fqs.getname代表文件的名字
            }
        }
        //   //和//之间是一个部分，上面最后一步for内的代码运行完，会回到方法第一行，如果不是目录，直接运行下面的else；


        else {
            File fil = new File(fzj, fqs.getName());
            copyFile(fqs, fil);
        }
    }


    private static void copyFile(File fqs, File fzj) throws IOException {

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fqs));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fzj));

        byte[] by = new byte[2048];
        int len;
        while ((len = bis.read(by)) != -1) {
            bos.write(by, 0, len);
        }

        bis.close();
        bos.close();
    }
}
