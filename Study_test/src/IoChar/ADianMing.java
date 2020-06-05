package IoChar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class ADianMing {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("Study_test\\src\\hh.txt"));
        ArrayList<String> array = new ArrayList<String>();

        String line;
        while ((line = br.readLine()) != null) {
            array.add(line);
        }

        br.close();

        Random r = new Random();
        int i = r.nextInt(array.size());//public int nextInt​(int bound)返回伪随机数，从0（包括）和指定值（排除）之间均匀分布的int值
        String s = array.get(i);
        System.out.println(s);
    }
}
