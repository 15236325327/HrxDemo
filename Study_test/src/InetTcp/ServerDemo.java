package InetTcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(10000);

        Socket s = ss.accept();

        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String s1 = new String(bys, 0, len);
        System.out.println("服务端：" + s1);
        /*while ((len = is.read(bys)) != -1) {
            String s1 = new String(bys, 0, len);
            System.out.println("服务器:" + s1);
        }*/

        //给出反馈
        OutputStream os = s.getOutputStream();
        os.write("数据已经收到".getBytes());

        ss.close();

    }
}
