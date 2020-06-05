package InetTcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerFileWrite {

    public static void main(String[] args) throws IOException {

        ServerSocket ss=new ServerSocket(10000);

        Socket s = ss.accept();

        BufferedReader br =new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw =new BufferedWriter(new FileWriter("Study_test//src//hh.txt"));

        String line;
        while ((line=br.readLine())!=null){//等待读取数据

            bw.write(line);
            bw.newLine();
            bw.flush();

            System.out.println(line);
        }

        //给出反馈
       BufferedWriter Jbw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
       Jbw.write("文件上传成功！");
       Jbw.newLine();
       Jbw.flush();

        ss.close();
    }
}
