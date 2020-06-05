package IoChar;

import java.io.*;

public class ACopyFile {

    public static void main(String[] args) throws IOException {

        File fqs=new File("E:\\ggg");

        String name = fqs.getName();

        File fmd=new File("Study_test",name);

        if (!fmd.exists()){
            fmd.mkdir();
        }

        File[] files = fqs.listFiles();

        for (File fil : files){
            String name1 = fil.getName();
            File fzh=new File(fmd,name1);
            copyFile(fil,fzh);
        }

    }

    private static void copyFile(File fil, File fzh) throws IOException {

        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(fil));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(fzh));

        byte[] by=new byte[2048];
        int len;
        while ((len=bis.read(by))!=-1){
            bos.write(by,0,len);
        }

        bis.close();
        bos.close();
    }
}
