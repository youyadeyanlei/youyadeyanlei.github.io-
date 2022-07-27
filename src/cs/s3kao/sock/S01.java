package cs.s3kao.sock;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class S01 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(8080);
        System.out.println("开启服务");
        while (true){
            Socket socket=ss.accept();
   //         new Thread(new UploadThread(socket).start());
        }

    }
}
