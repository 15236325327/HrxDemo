package InetTcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {

    public static void main(String[] args) throws IOException {

        Socket s = new Socket("192.168.113.1", 10000);

        //发送数据
        OutputStream os = s.getOutputStream();
        os.write("黄任翔迷人啊！".getBytes());

        //接收服务器反馈
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String s1 = new String(bys, 0, len);
        System.out.println("客户端：" + s1);
       /* while ((len=is.read(bys))!=-1){
            String s1 = new String(bys,0,len);
            System.out.println("客户端："+s1);
        }*/

        s.close();
    }
}
