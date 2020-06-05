package InetTcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

//ServerSocket
// 这个类实现了服务器套接字。 服务器套接字等待通过网络进入的请求。
// 它根据该请求执行一些操作，然后可能将结果返回给请求者。
public class ReceiveDemo {

    public static void main(String[] args) throws IOException {

        //ServerSocket​(int port) 创建绑定到指定端口的服务器套接字。
        ServerSocket s = new ServerSocket(10086);

        //Socket accept​() 侦听要连接到此套接字并接受它。
        Socket accept = s.accept();
        InputStream in = accept.getInputStream();

        byte[] bys = new byte[1024];

        int len;
        while ((len = in.read(bys)) != -1) {
            String ss=new String(bys,0,len);
            System.out.println(ss);
        }

        s.close();
        accept.close();
    }
}
