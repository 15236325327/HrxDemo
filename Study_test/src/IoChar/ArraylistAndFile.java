package IoChar;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArraylistAndFile {

    public static void main(String[] args) throws IOException {

        ArrayList<String> array = new ArrayList<String>();

        array.add("001,刘德华,52,北京");
        array.add("002,郭富城,50,西安");
        array.add("003,黎明,56,香港");

        BufferedWriter bw = new BufferedWriter(new FileWriter("Study_test\\src\\hh.txt"));

        for (String arr : array) {
            bw.write(arr);
            bw.newLine();
            bw.flush();
        }

        bw.close();
    }
}
