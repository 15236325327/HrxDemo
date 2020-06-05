package Inet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class receiveDemo {

    public static void main(String[] args) throws IOException {

        //DatagramSocket​(int port) 构造数据报套接字并将其绑定到本地主机上的指定端口。
        DatagramSocket ds = new DatagramSocket(10086);


        byte[] bys = new byte[1024];
        //DatagramPacket​(byte[] buf, int length) 构造一个 DatagramPacket用于接收长度为 length数据包。
        DatagramPacket dp = new DatagramPacket(bys, bys.length);

        //void receive​(DatagramPacket p) 从此套接字接收数据报包
        ds.receive(dp);

        //解析数据预包 byte[] getData​() 返回数据缓冲区
        byte[] datas = dp.getData();

        //int getLength​() 返回要发送的数据的长度或接收到的数据的长度
        int length = dp.getLength();

        //利用String的构造方法解码
        String s=new String(datas,0,length);

        System.out.println("数据是:"+s);

        ds.close();
    }
}
