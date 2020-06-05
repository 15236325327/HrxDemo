package InetUDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveDemo {

    public static void main(String[] args) throws IOException {

        DatagramSocket ds = new DatagramSocket(10086);

        while (true) {
            byte[] bys = new byte[1024];

            DatagramPacket dp = new DatagramPacket(bys, bys.length);

            ds.receive(dp);

            byte[] bys1 = dp.getData();

            int length = dp.getLength();

            String s = new String(bys1, 0, length);

            System.out.println("数据是：" + s);
        }

            //ds.close();
    }
}
