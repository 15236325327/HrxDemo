package IoChar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class ADianMing1 {

    public static void main(String[] args) throws IOException {

        ArrayList<String> array=new ArrayList<String>();

        BufferedReader br=new BufferedReader(new FileReader("Study_test\\src\\hh.txt"));

        String line;
        while ((line=br.readLine())!=null){
            array.add(line);
        }

        br.close();

        Random r=new Random();
        int i = r.nextInt(array.size());
        String s = array.get(i);
        System.out.println(s);
    }

}
