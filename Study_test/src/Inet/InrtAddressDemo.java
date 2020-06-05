package Inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InrtAddressDemo {

    public static void main(String[] args) throws UnknownHostException {

        InetAddress ipName = InetAddress.getByName("LAPTOP-OVRRMU7Q");
        String hostName = ipName.getHostName();
        String s = ipName.getHostAddress();
        System.out.println(hostName);
        System.out.println(s);
    }
}
