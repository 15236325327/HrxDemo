package InetTcp;

import java.io.*;
import java.net.Socket;

public class ServerThread implements Runnable {

    private Socket s;

    public ServerThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {

        //接收数据写到文本文件
        try {
            BufferedReader br =new BufferedReader(new InputStreamReader(s.getInputStream()));
            /*BufferedWriter bw=new BufferedWriter(new FileWriter("Study_test\\src\\hh.txt"));*/

            //解决重名问题
            int count=0;
            File file =new File("Study_test\\src["+count+"].java");
            while (file.exists()){
                count++;
                file=new File("Study_test\\src\\["+count+"].java");
            }
            BufferedWriter bw=new BufferedWriter(new FileWriter(file));

            String line;
            while ((line=br.readLine())!=null){
                bw.write(line);
                bw.newLine();
                bw.flush();
                System.out.println(line);
            }

            //给出反馈
            BufferedWriter bw1=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bw1.write("文件上传成功");
            bw1.newLine();
            bw1.flush();

            s.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
