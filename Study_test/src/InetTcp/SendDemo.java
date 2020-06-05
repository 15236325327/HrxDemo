package InetTcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

//Socket
// 该类实现客户端套接字（也称为“套接字”）。 套接字是两台机器之间通讯的端点。
public class SendDemo {

    public static void main(String[] args) throws IOException {

        //Socket​(String host, int port) 创建流套接字并将其连接到指定主机上的指定端口号。
        Socket s=new Socket("192.168.113.1",10086);

        //获取输出流，写数据
        //OutputStream getOutputStream​() 返回此套接字的输出流
        OutputStream os=s.getOutputStream();
        os.write("黄任翔真帅！".getBytes());

        //void close​() 关闭此套接字(两台机器之间通讯的端点)
        s.close();
    }
}
