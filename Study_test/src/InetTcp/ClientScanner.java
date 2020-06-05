package InetTcp;

import java.io.*;
import java.net.Socket;

public class ClientScanner {

    public static void main(String[] args) throws IOException {

        Socket s=new Socket("192.168.113.1",10086);

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;

        while ((line=br.readLine())!=null){



            bw.write(line);
            bw.newLine();
            bw.flush();

            if ("886".equals(line)){
                break;
            }
        }

        s.close();
    }
}
