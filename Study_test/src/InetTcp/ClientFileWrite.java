package InetTcp;

import java.io.*;
import java.net.Socket;

public class ClientFileWrite {

    public ClientFileWrite() throws IOException {
    }

    public static void main(String[] args) throws IOException {

        Socket s=new Socket("192.168.113.1",10000);

        //BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br =new BufferedReader(new FileReader("Study_test//src//文本.txt"));

        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;

        while ((line=br.readLine())!=null){

            bw.write(line);
            bw.newLine();
            bw.flush();
            }

        //调用结束标记方法
        s.shutdownOutput();

        //接收反馈
        BufferedReader Jbr=new BufferedReader(new InputStreamReader(s.getInputStream()));
        String s1 = Jbr.readLine();
        System.out.println("客户端"+s1);

        s.close();
    }
}
