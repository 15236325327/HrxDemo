package File;

import java.io.File;

public class Demo5 {
    public static void main(String[] args) {
        File f = new File("Study_test\\src\\MapDemo");

        file(f);
    }

    public static void file(File f) {

        File[] array = f.listFiles();

        for (File arr : array) {
            if (arr.isDirectory()) {
                file(arr);
            } else {
                System.out.println(arr.getAbsoluteFile());
            }
        }
    }
}

