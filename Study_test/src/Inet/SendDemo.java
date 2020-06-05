package Inet;

import java.io.IOException;
import java.net.*;

public class SendDemo {

    public static void main(String[] args) throws IOException {

        //DatagramSocket​() 构造数据报套接字并将其绑定到本地主机上的任何可用端口。
        DatagramSocket ds = new DatagramSocket();


        byte[] bys="黄任翔你好帅！".getBytes();
        //DatagramPacket​(byte[] buf, int length, InetAddress address, int port)
        // 构造一个数据包，发送长度为 length的数据包到指定主机上的指定端口号。
        DatagramPacket dp=new DatagramPacket(bys,bys.length,InetAddress.getByName("192.168.113.1"),10086);

        //void send​(DatagramPacket p) 从此套接字发送数据报包。
        ds.send(dp);

        //void close​() 关闭此数据报套接字。
        ds.close();
    }
}

