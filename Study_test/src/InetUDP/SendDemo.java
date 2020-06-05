package InetUDP;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Scanner;

public class SendDemo {

    public static void main(String[] args) throws IOException {

        DatagramSocket ds = new DatagramSocket();

        Scanner sc = new Scanner(System.in);

        /*byte[] bys=new byte[1024];
        int data;
        while (true) {
           data = sc.nextInt();
           if (data==886){
               break;
           }else{
               String s = String.valueOf(data);
               bys = s.getBytes();
           }
        }*/

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line=br.readLine())!=null){
            if ("886".equals(line)){
                break;
            }

            byte[] bys=line.getBytes();

            DatagramPacket dp=new DatagramPacket(bys,bys.length, InetAddress.getByName("192.168.113.1"),10086);

            ds.send(dp);
        }
        ds.close();
    }
}