package cs.s3kao.sock.udo;

import java.io.IOException;
import java.net.*;

public class Client02 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();

        byte[] buf="new".getBytes();
        DatagramPacket dp = new DatagramPacket(buf,buf.length, InetAddress.getByName("127.0.0.1"),8080);
        ds.send(dp);
        ds.close();
    }
}
