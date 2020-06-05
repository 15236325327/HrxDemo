package IoDaYinLiu;

import java.io.*;

public class Copyjava {

    public static void main(String[] args) throws IOException {

        /*BufferedReader br=new BufferedReader(new FileReader("Study_test\\src\\CharDaYinLiu.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("Study_test\\src\\h1.txt"));

        String line;
        if((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        bw.close();
        br.close();*/



        BufferedReader br=new BufferedReader(new FileReader("Study_test\\src\\文本.txt"));
        PrintWriter pw=new PrintWriter(new FileWriter("Study_test\\src\\hh.txt"),true);

       String line;
       while ((line=br.readLine())!=null){
           pw.println(line);

       }

        pw.close();
        br.close();
    }
}
