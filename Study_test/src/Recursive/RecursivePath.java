package Recursive;

import java.io.File;

public class RecursivePath {

    public static void main(String[] args) {

//        File f = new File("E:\\hrx");
        File f = new File("Study_test\\src\\File");//路径写绝对路径也ok


        file(f);

    }

    public static void file(File f) {
        File[] array = f.listFiles();

        if (array != null) {
            for (File arr : array) {
                if (arr.isDirectory()) {
                    file(arr);
                    //System.out.println(arr);
                } else {
                    System.out.println(arr.getAbsoluteFile());
                }
            }
        }

    }
}
