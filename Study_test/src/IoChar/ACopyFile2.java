package IoChar;

import java.io.*;

public class ACopyFile2 {

    public static void main(String[] args) {

        File f1 = new File("E:\\ggg");
        File f2 = new File("D:\\");

        copyfile(f1,f2);
    }

    private static void copyfile(File f1, File f2) {

        if (f1.isDirectory()) {
            String name = f1.getName();
            File fmd = new File(f2, name);
            if (!fmd.exists()) {
                fmd.mkdir();
            }
            File[] files = f1.listFiles();
            for (File fil : files) {
                copyfile(fil, fmd);
            }
        } else {
            File fil = new File(f2, f1.getName());
            copy(f1, fil);
        }
    }

    private static void copy(File f1, File fil) {

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f1));
             BufferedOutputStream bow = new BufferedOutputStream(new FileOutputStream(fil));) {
            byte[] by = new byte[1024];

            int len;
            while ((len = bis.read(by)) != -1) {
                bow.write(by,0,len);
            }
            bis.close();
            bow.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
