package cs.s3kao.sock.udo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Server02 {
    public static void main(String[] args) throws IOException {
        //创建对象
        DatagramSocket ds =new DatagramSocket(8080);
        //创建传输
        byte[] buf=new byte[1024];
        DatagramPacket dp=new DatagramPacket(buf, buf.length);

        ds.receive(dp);
        byte[] data = dp.getData();
        InetAddress inetAddress=dp.getAddress();
        int port=dp.getPort();
        int length = dp.getLength();

        String string=new String(data,0,length);
        System.out.println(string);

    }
}
