package IoChar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class AFileAndArrayList {

    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new FileReader("Study_test\\src\\文本.txt"));
        ArrayList<String> array=new ArrayList<String>();

        String line;
        while ((line=br.readLine())!=null){
            array.add(line);
        }

        br.close();

        for (String arr : array){
            System.out.println(arr);
        }

    }
}
